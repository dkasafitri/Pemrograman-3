package com.artivisi.project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] xx )
    {
        JFrame fr = new JFrame();
		fr.setTitle("Halo Swing");
		JOptionPane.showMessageDialog(null, "Halo Dialog");
		fr.setSize(200,200);
		fr.setVisible(true);
		JPanel pnl = new JPanel();
		fr.add(pnl);
    }
}
