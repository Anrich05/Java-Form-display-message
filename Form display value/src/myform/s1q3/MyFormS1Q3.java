
package myform.s1q3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyFormS1Q3 {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JTextField text;
    private JButton button;
    
    public MyFormS1Q3(){
        
        frame = new JFrame("MyForm");
        frame.setLocation(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        
        panel = new JPanel();
        panel.setSize(400,400);
        
        label = new JLabel("Please insert a value");
        panel.add(label);
        
        text = new JTextField();
        text.setSize(200,200);
        panel.add(text);
        
        button = new JButton("OK");
        panel.add(button);
        frame.setLayout(new FlowLayout());
        panel.setLayout(new GridLayout(3,1));
        frame.add(panel);
        frame.setVisible(true);
        
        button.addActionListener((ActionEvent ae) -> {
            
            String input = text.getText();
            
            if (text.getText().isEmpty()) {
         JOptionPane.showMessageDialog(frame, "You have not entered anything");
        }else 
            JOptionPane.showMessageDialog(frame, input);
            
        });
        
        
        
    }
    
    
    public static void main(String[] args) {
        
        new MyFormS1Q3();
        
    }
    
}
