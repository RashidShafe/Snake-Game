import javax.swing.*;

public class GameFrame extends JFrame{
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        //this.setUndecorated(true);
        //this.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.red));

        this.getRootPane().setBorder(BorderFactory.createLoweredSoftBevelBorder());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
