import javax.swing.JFrame;

public class Game {
    private Board layout;

    //set up
    public static final int width = 50;
    public static final int height = 80;
    public static final int X = 5;
    public static final int Y = 5;
    JFrame window;

    //game attributes
    public static int points=0;
    public static final int king =1;
    public static final int one =7;
    public static final int two =4;
    public static final int three =5;
    public static final int four =5;
    public static final int five =3;
    private int scoreBoardWidth = 100;
    
    public Game(){
        window = new JFrame();
        layout = new Board();
        window.setTitle("Catch The King");
        window.setSize(X*width, Y*height);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
