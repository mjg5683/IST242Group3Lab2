import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
    
    MainPanel() {
        JButton blueButton = new JButton("Blue");
        add(blueButton);
        
        JButton redButton = new JButton("Red");
        add(redButton);
        
        JButton mattsButton = new JButton("Matt");
        add(mattsButton);
        
        JButton adamsButton = new JButton("Adam Clarkson");
        add(adamsButton);
        
         JButton myButton = new JButton("Aaron");
            add(myButton);
            
        JButton dinosButton = new JButton("Adrianne Kubiak");
        add(dinosButton);
    }
}
