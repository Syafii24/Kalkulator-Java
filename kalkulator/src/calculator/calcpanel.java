package calculator;
	import javax.swing.JButton;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import java.awt.event.*;

	import java.awt.Color;

	public class calcpanel extends JPanel implements ActionListener{//kelas calcpanel adalah subclass dari calcmain sebagai superclass nya
		
		String num1="";
		String num2="";
		boolean usingFirst=true;
		JTextField display;
		JButton b1;
		JButton b2;
		JButton b3;
		JButton b4;
		JButton b5;
		JButton b6;
		JButton b7;
		JButton b8;
		JButton b9;
		JButton b0;
		JButton bdec;
		JButton bclear;
		JButton bplus;
		JButton bequals;
		JButton bminus;
		JButton bkali;
		JButton bbagi;
		JButton bsqrt;
		JButton bsin;
		JButton bexp;

		boolean plus = false;
		boolean minus = false;
		boolean kali = false;
		boolean bagi = false;
		

		
		public calcpanel()
		{
			this.setBackground(Color.yellow);
			setLayout(null);
			display=new JTextField();
			b1=new JButton("1");
			b2=new JButton("2");
			b3=new JButton("3");
			b4=new JButton("4");
			b5=new JButton("5");
			b6=new JButton("6");
			b7=new JButton("7");
			b8=new JButton("8");
			b9=new JButton("9");
			b0=new JButton("0");
			bdec=new JButton(".");
			bclear=new JButton("C");
			bplus=new JButton("+");
			bminus=new JButton("-");
			bkali=new JButton("x");
			bbagi=new JButton("/");
			bsqrt=new JButton("sqrt");
			bsin=new JButton("sin");
			bexp=new JButton("exp");
			bequals=new JButton("=");
			
			display.setBounds(1,1,241,49);
			
			b1.setBounds(1,200,60,49);
			b2.setBounds(61,200,60,49);
			b3.setBounds(121,200,59,49);
			bplus.setBounds(181,200,60,50);
			
			b4.setBounds(1,150,60,50);
			b5.setBounds(61,150,60,50);
			b6.setBounds(121,150,59,50);
			bminus.setBounds(181,150,60,50);
			
			b7.setBounds(1,102,60,50);
			b8.setBounds(61,102,60,50);
			b9.setBounds(121,102,59,50);
			bbagi.setBounds(181,100,60,50);
			
			bdec.setBounds(1,250,60,50);
			b0.setBounds(62,250,58,50);
			bclear.setBounds(121,250,60,50);
			bequals.setBounds(181,250,60,50);
			
			bsqrt.setBounds(1,51,60,50);
			bsin.setBounds(61,51,60,50);
			bexp.setBounds(121,51,60,50);
			bkali.setBounds(181,51,60,50);
			
			add(b1);
			add(b2);
			add(b3);
			
			add(b4);
			add(b5);
			add(b6);
			
			add(b7);
			add(b8);
			add(b9);
			
			add(display);
			add(bequals);
			add(bdec);
			add(bclear);
			add(bplus);
			add(bminus);
			add(bbagi);
			add(b0);
			add(bkali);
			add(bsqrt);
			add(bsin);
			add(bexp);

			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			b0.addActionListener(this);
			bdec.addActionListener(this);
			bequals.addActionListener(this);
			bclear.addActionListener(this);
			bplus.addActionListener(this);
			bminus.addActionListener(this);
			bbagi.addActionListener(this);
			bkali.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e){
			String s=e.getActionCommand();
			if(s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9")||s.equals("0")||s.equals("."))
			{
				if(usingFirst)
				{	num1=num1+s;
					display.setText(num1);
				}
				else
				{
					num2=num2+s;
					display.setText(num2);
				}
			}
			if(s.equals("+"))
			{
				usingFirst=false;
				plus = true;
			}
			if(s.equals("-"))
			{
				usingFirst=false;
				minus = true;
			}
			if(s.equals("x"))
			{
			usingFirst=false;
			kali = true; 
			}
			if(s.equals("/"))
			{
			
			usingFirst=false;
			bagi = true;
			}
			if(s.equals("="))
			{
				if (plus) {
					double total = Double.parseDouble(num1)+Double.parseDouble(num2);
					display.setText(""+total);
					plus = false;
				}
				
					if (minus) {
						double total = Double.parseDouble(num1)-Double.parseDouble(num2);
						display.setText(""+total);
						minus = false;
				}
				
					if (bagi) {
					double total = Double.parseDouble(num1)/Double.parseDouble(num2);
					display.setText(""+total);
					bagi = false;
				}
				
					if (kali) {
					double total = Double.parseDouble(num1)*Double.parseDouble(num2);
					display.setText(""+total);
					kali = false;
					}
					
					
				}

			if(s.equals("C"))
			{
				display.setText("");
				usingFirst=true;
				num1="";
				num2="";
		}
		}
	}