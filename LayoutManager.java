package Review;

import javax.swing.*;
import java.awt.FlowLayout;

public class LayoutManager extends JFrame {
    JButton btnok= new JButton("OK");
    JLabel lbName= new JLabel("Name");
    JTextField tfName= new JTextField(8);

    public LayoutManager(){

        JPanel panel=new JPanel(new FlowLayout());
        panel.add(lbName); panel.add(tfName); panel.add(btnok); // add All J in panel

        add(panel);  // add panel into JFram
        setVisible(true);
        setSize(300,250);
        setLocation(200,300);
    }
    public static void main(String a[]){

        new LayoutManager();
    }
}
