package com.artivisi.project;

import javax.swing.*;
import java.awt.BorderLayout;

public class DemoBorderLayout 
{
    public static void main( String[] xx )
    {
		// beberapa button untuk demo
		JButton btn1 = new JButton("Tombol 1");
		JButton btn2 = new JButton("#2");
		JButton btn3 = new JButton("Tombol tiga");
		JButton btn4 = new JButton("Tombol 4 : Panjang");
		JButton btn5 = new JButton("Btn 5");
		JButton btn6 = new JButton("No. 6");
    
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(btn1, BorderLayout.NORTH);
		panel.add(btn2, BorderLayout.SOUTH);
		panel.add(btn3, BorderLayout.WEST);
		panel.add(btn4, BorderLayout.EAST);
		panel.add(btn5, BorderLayout.CENTER);
	
		//menginstankan frame
		JFrame fr = new JFrame("Belajar Layout");
		
		fr.getContentPane().add(panel);
		
		//ukuran frame
		fr.setSize(800,400);
		
		//posisi ditengah
		fr.setLocationRelativeTo(null);
		
		//tampilkan
		fr.setVisible(true);
	
	}
}
