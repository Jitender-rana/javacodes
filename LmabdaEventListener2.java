import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LmabdaEventListener2 {
    public static void main(String args[]){
        JTextField tf=new JTextField();
        tf.setBounds(70,70,250,50);
        JButton b=new JButton("Give Task");
        b.setBounds(90,120,90,50);
        b.addActionListener(e->{tf.setText("Complete unit-4 till 24-April");});
        JFrame f=new JFrame();
        f.add(tf);f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300,200);
        f.setVisible(true);
    }
    
}
