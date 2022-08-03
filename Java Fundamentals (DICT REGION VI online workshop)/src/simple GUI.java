import javax.swing.*;
public class GUI_FRAME_LABEL_BUTTON_organized {

    public static void main(String[] args)
    {
        JFrame f= new JFrame("Graphic User Interface Example");
        JButton bt1 = new JButton("Calculate");
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JLabel l1=new JLabel("First Label:");
        JLabel l2=new JLabel("Second Label:");
        bt1.setBounds(180,180, 100,50);
        l1.setBounds(50,50, 100,30);// x, y, width, height
        l2.setBounds(50,100, 100,30); //x, y, width, height
        t1.setBounds(180,50, 200,30);
        t2.setBounds(180,100, 200,30);
        f.add(bt1);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.setSize(600,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
