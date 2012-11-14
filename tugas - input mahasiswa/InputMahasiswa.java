import javax.swing.*;
import java.awt.*;

public class InputMahasiswa
{
	public static void main(String[] xx)
	{
		JLabel lbNim = new JLabel("NIM");
		JLabel lbNama = new JLabel("Nama");
		JLabel lbHobi = new JLabel("Hobi");
		JLabel lbJenKel = new JLabel("Jenis Kelamin");
		JLabel entry = new JLabel("ENTRY DATA");
		JTextField txNim = new JTextField(20);
		JTextField txNama = new JTextField(20);
		JButton bSimpan = new JButton("Simpan");
		JButton bBatal = new JButton("Batal");
		JCheckBox futsal = new JCheckBox("Futsal");
		JCheckBox basket = new JCheckBox("Basket Ball");
		JCheckBox singing = new JCheckBox("Singing");
		ButtonGroup buttonGroup = new ButtonGroup();
		JRadioButton lk, pr;
		lk = new JRadioButton("Laki-laki");
		buttonGroup.add(lk);
		pr = new JRadioButton("Perempuan");
		buttonGroup.add(pr);
		lk.setSelected(true);
		
		
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel pn3 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel pn4 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel pn5 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel pn6 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel pn7 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel pn8 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel pn9 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel pn10 = new JPanel(new GridLayout(4,2));
		JPanel pn11 = new JPanel();
		JPanel pn12 = new JPanel(new BorderLayout());
		
		pn10.add(pn2);
		pn10.add(pn3);
		pn10.add(pn4);
		pn10.add(pn5);
		pn10.add(pn6);
		pn10.add(pn7);
		pn10.add(pn8);
		pn10.add(pn9);
		pn12.add(pn1, BorderLayout.NORTH);
		pn12.add(pn10, BorderLayout.CENTER);
		pn12.add(pn11, BorderLayout.SOUTH);
		
		pn2.add(lbNim);
		pn3.add(txNim);
		pn4.add(lbNama);
		pn5.add(txNama);
		pn6.add(lbHobi);
		pn7.add(futsal);
		pn7.add(basket);
		pn7.add(singing);
		pn8.add(lbJenKel);
		pn9.add(lk);
		pn9.add(pr);
		pn1.add(entry);
		pn11.add(bSimpan);
		pn11.add(bBatal);
		
		JFrame fr = new JFrame("Input Mahasiswa");

        fr.getContentPane().add(pn12);
        fr.setSize(500,200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);		
	}
}