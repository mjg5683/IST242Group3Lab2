import javax.swing.JFrame;

public class MainFrame extends JFrame {
    
    MainFrame() {
        super("A simple paint program");
        MainPanel mPanel = new MainPanel();
        getContentPane().add(mPanel);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
