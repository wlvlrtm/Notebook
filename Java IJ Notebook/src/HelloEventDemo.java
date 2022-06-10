import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HelloEventDemo extends JFrame {
    public HelloEventDemo() {
        setTitle("Hello Event Demo");

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        };

        JButton button = new JButton("Click");
        button.addActionListener(actionListener);
        
        add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloEventDemo();
    }
}
