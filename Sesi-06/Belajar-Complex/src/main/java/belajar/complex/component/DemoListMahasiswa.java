package belajar.complex.component;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class DemoListMahasiswa
{
    private static JList listMahasiswa = new JList();
    private static final List<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();

    public static void isiCombo()
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel(daftarMahasiswa.toArray());
        listMahasiswa.setModel(model);
    }

    public static void tambahIsiList(Mahasiswa data)
    {
        daftarMahasiswa.add(data);
        isiCombo();
    }

    public static void main (String[] xx)
    {
        Mahasiswa m = new Mahasiswa();
        m.setNpm("123");
        m.setNama("Dika");
        tambahIsiList(m);

        final JTextField tfNpm = new JTextField(5);
        final JTextField tfNama = new JTextField(20);
        JButton btnTambah = new JButton("Tambah");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("NPM : "));
        panel.add(tfNpm);
        panel.add(new JLabel("Nama : "));
        panel.add(tfNama);
        panel.add(btnTambah);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(listMahasiswa);

        JPanel panel4 = new JPanel(new FlowLayout());
        panel4.add(new JLabel("Pilihan : "));
        final JTextField tfPilihan = new JTextField(20);
        tfPilihan.setEditable(false);
        panel4.add(tfPilihan);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(3,1));
        panel3.add(panel);
        panel3.add(panel2);
        panel3.add(panel4);

        JFrame fr = new JFrame("Belajar Combo");
        fr.getContentPane().add(panel3);
        fr.setSize(800,200);
        fr.setLocationRelativeTo(null);
		fr.setVisible(true);

		class TambahMahasiswaListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				String npm = tfNpm.getText();
				String nama = tfNama.getText();
				System.out.println("NPM : "+npm);
				System.out.println("Nama : "+nama);

				Mahasiswa x =new Mahasiswa();
				x.setNpm(npm);
				x.setNama(nama);
				tambahIsiList(x);

				tfNama.setText("");
				tfNpm.setText("");
				tfNpm.requestFocus();
			}
		}

		TambahMahasiswaListener l = new TambahMahasiswaListener();
		btnTambah.addActionListener(l);

		class PilihanListListener implements ListSelectionListener
		{
			public void valueChanged(ListSelectionEvent e)
			{
				JList l = (JList) e.getSource();
				int indexPilihan = l.getSelectedIndex();
				System.out.println("Pilihan : "+indexPilihan);

				if(indexPilihan < 0)
				{
				    return;
				}

				Mahasiswa x = daftarMahasiswa.get(indexPilihan);
				tfPilihan.setText(x.getNpm() + " - "+x.getNama());
			}
		}

		listMahasiswa.addListSelectionListener(new PilihanListListener());
	}
}

