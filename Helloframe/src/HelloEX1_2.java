import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloEX1_2 {

    private JFrame frame;
    private JTextField text;
    private JLabel label;
    public HelloEX1_2() {
        frame = new JFrame("HelloEx1");

        buildGUI();

        frame.setSize(200,80);
        frame.setLocation(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private void buildGUI() {
        text = new JTextField();
        JButton button = new JButton("확인");
        label = new JLabel("Hello World");
        button.addActionListener(new ActionEventHandler(text, label));


        frame.add(text, BorderLayout.CENTER);
        frame.add(button, BorderLayout.EAST);
        frame.add(label,BorderLayout.SOUTH);
    }
    public static void main(String[] args){
        new HelloEx1_3();
    }
    public void actionPerformed(ActionEvent e){
        String name = text.getText();
        label.setText("Hello, " + name);
        text.setText("");
    }
}

class ActionEventHandler implements ActionListener{
    private JTextField text;
    private JLabel label;
    ActionEventHandler(JTextField text, JLabel label){
        this.text =text;
        this.label = label;
    }

    public void actionPerformed(ActionEvent e){
        String name = text.getText();
        label.setText("Hello, " + name);
        text.setText("");
    }
}