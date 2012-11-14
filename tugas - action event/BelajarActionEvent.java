import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class BelajarActionEvent
{
    public static void main(String[] xx)
    {
        final JButton btn = new JButton("Click Me !");
        JPanel pn  = new JPanel(new BorderLayout());
        JPanel pn1 = new JPanel();
        pn1.add(btn);
        pn.add(pn1, BorderLayout.CENTER);

        JFrame fr = new JFrame("Action Event");
        fr.getContentPane().add(pn);
        fr.setSize(300,100);
        fr.setVisible(true);
        fr.setLocation(150,150);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       class action implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
               JOptionPane.showMessageDialog(null,"You have clicked me :)");
            }
        }
        action Act = new action();
        btn.addActionListener(Act);
    }
}
