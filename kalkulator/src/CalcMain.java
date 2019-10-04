
	import java.awt.Container;//untuk menambahkan warna.
	import javax.swing.JFrame;//untuk fungsi gui dalam bentuk frame.
	import javax.swing.JPanel;//untuk menambahkan objek pada jframe nya.

	import calculator.calcpanel;

	public class CalcMain {

		public static void main(String[] args) {
			JFrame theGUI = new JFrame();
			theGUI.setTitle("Calculator");//nama judul
			theGUI.setSize(258,340);//ukuran frame nya 257px lebarnya 340px panjangnya.
			theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//jframe untuk menampilkan exit/on/close
			
			Container pane = theGUI.getContentPane();//sebagai wadahnya
			JPanel myPanel = new calcpanel();
			pane.add(myPanel);
			
			theGUI.setVisible(true);//menampilkan jika benar
			
			
		}

	}

