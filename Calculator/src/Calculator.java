import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.ColorUIResource;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton zeroButton;
	JButton pointButton;
	JButton divisionButton;
	JButton multiButton;
	JButton subsButton;
	JButton addButton;
	JButton equalsButton;
	JButton clearbutton;
	JButton closeButton;
	boolean oc=false;
	String oldvalue;
	boolean isdivision=false;
	boolean isaddition=false;
	boolean ismulti=false;
	boolean issubs=false;
	float result;
	
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(500,120);
		displayLabel=new JLabel();
		displayLabel.setBounds(20,30,545,80);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 140, 80, 80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(140, 140, 80, 80);
		eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(250, 140, 80, 80);
		nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 250, 80, 80);
		fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(140, 250, 80, 80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(250, 250, 80, 80);
		sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 360, 80, 80);
		oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		oneButton.addActionListener(this);
		
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(140, 360, 80, 80);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(250, 360, 80, 80);
		threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(30, 470, 190, 80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		pointButton=new JButton(".");
		pointButton.setBounds(250, 470, 80, 80);
		pointButton.setFont(new Font("Arial",Font.PLAIN,40));
		pointButton.addActionListener(this);
		jf.add(pointButton);
		
		divisionButton=new JButton("/");
		divisionButton.setBounds(360, 140, 40, 80);
		divisionButton.setFont(new Font("Arial",Font.PLAIN,24));
		divisionButton.addActionListener(this);
		jf.add(divisionButton);
		
		multiButton=new JButton("X");
		multiButton.setBounds(405, 140, 60, 80);
		multiButton.setFont(new Font("Arial",Font.PLAIN,25));
		multiButton.addActionListener(this);
		jf.add(multiButton);
		
		subsButton=new JButton("-");
		subsButton.setBounds(360, 250, 90, 94);
		subsButton.setFont(new Font("Arial",Font.PLAIN,40));
		subsButton.addActionListener(this);
		jf.add(subsButton);
		
		addButton=new JButton("+");
		addButton.setBounds(360, 346, 90, 94);
		addButton.setFont(new Font("Arial",Font.PLAIN,40));
		addButton.addActionListener(this);
		jf.add(addButton);
		
		equalsButton=new JButton("=");
		equalsButton.setBounds(360, 470, 90, 80);
		equalsButton.setFont(new Font("Arial",Font.PLAIN,40));
		equalsButton.addActionListener(this);
		jf.add(equalsButton);
		
		clearbutton=new JButton("C");
		clearbutton.setBounds(480, 250, 90, 300);
		clearbutton.setFont(new Font("Arial",Font.PLAIN,40));
		clearbutton.addActionListener(this);
		jf.add(clearbutton);
		
		closeButton=new JButton("close");
		closeButton.setBounds(480, 140, 90, 80);
		closeButton.setFont(new Font("Arial",Font.PLAIN,25));
		closeButton.addActionListener(this);
		jf.add(closeButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Calculator();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenButton) {
			if (oc) {
				displayLabel.setText("7");
				oc=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
				displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
			}
			
		
		}else if(e.getSource()==eightButton) {
			if (oc) {
				displayLabel.setText("8");
				oc=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
				displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
			}
			
		}else if(e.getSource()==nineButton) {
			if (oc) {
				displayLabel.setText("9");
				oc=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
				displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
			}
		}else if(e.getSource()==fourButton) {
			if (oc) {
				displayLabel.setText("4");
				oc=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
				displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
			}
		}else if(e.getSource()==fiveButton) {
			if (oc) {
				displayLabel.setText("5");
				oc=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
				displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
			}
		}else if(e.getSource()==sixButton) {
			if (oc) {
				displayLabel.setText("6");
				oc=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
				displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
			}
		}else if(e.getSource()==oneButton) {
			if (oc) {
				displayLabel.setText("1");
				oc=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
				displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
			}
		}else if(e.getSource()==twoButton) {
			if (oc) {
				displayLabel.setText("2");
				oc=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
				displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
			}
		}else if(e.getSource()==threeButton) {
			if (oc) {
				displayLabel.setText("3");
				oc=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
				displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
			}
		}else if(e.getSource()==divisionButton) {
			oc=true;
			isdivision=true;
			oldvalue=displayLabel.getText();
		}else if(e.getSource()==multiButton) {
			oc=true;
			ismulti=true;
			oldvalue=displayLabel.getText();
		}else if(e.getSource()==subsButton) {
			oc=true;
			issubs=true;
			oldvalue=displayLabel.getText();
		}else if(e.getSource()==addButton) {
			oc=true;
			isaddition=true;
			oldvalue=displayLabel.getText();
		}else if(e.getSource()==clearbutton) {
			displayLabel.setText("");
			displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
		}else if(e.getSource()==zeroButton) {
			displayLabel.setText(displayLabel.getText()+"0");
			displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
		}else if(e.getSource()==pointButton) {
			displayLabel.setText(displayLabel.getText()+".");
			displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
		}else if(e.getSource()==equalsButton) {
			String newvalue= displayLabel.getText();
			
			float oldvaluef=Float.parseFloat(oldvalue);
			float newvaluef=Float.parseFloat(newvalue);
			
			if (isdivision) {
				result=oldvaluef/newvaluef;
				displayLabel.setText(result+"");
			}else if(isaddition) {
				result=oldvaluef+newvaluef;
				displayLabel.setText(result+"");
			}else if(ismulti) {
				result=oldvaluef*newvaluef;
				displayLabel.setText(result+"");
			}else if(issubs) {
				result=oldvaluef-newvaluef;
				displayLabel.setText(result+"");
			}
			
		}else if(e.getSource()==closeButton) {
			jf.setVisible(false);
			System.exit(0);
			
		}
		
	}
	
}
