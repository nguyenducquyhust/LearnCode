import javax.swing.*;

public class GameFram extends JFrame{
    public GameFram(){
        this.add(new GamePannel());
        this.setTitle("GAME RAN CUA TOPLANEKING");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


}
