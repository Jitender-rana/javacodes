import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LambdaListener {
    public static void main(String args[]){
        JFrame frame=new JFrame("lambda listner Example");
        JButton button=new JButton("Click Me!");
        //using lambda expression to implement ActionListener
        button.addActionListener((ActionEvent e)->{
            System.out.println("Button clicked!");

        });
        frame.getContentPane().add(button);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    
}
