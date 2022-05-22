package lista7;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	 JFrame frame;
	 JTextField textField;

	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
		textField.setEditable(false);
		
		
	}

	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 425, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 393, 81);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton zeroButton = new JButton("0");
		zeroButton.setBounds(10, 441, 89, 68);
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+zeroButton.getText();
				textField.setText(number);
			}
		});
		zeroButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(zeroButton);
		
		JButton commaButton = new JButton(".");
		commaButton.setBounds(109, 441, 89, 68);
		commaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+commaButton.getText();
				textField.setText(number);
			}
		});
		commaButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(commaButton);
		
		JButton oneButton = new JButton("1");
		oneButton.setBounds(10, 362, 89, 68);
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+oneButton.getText();
				textField.setText(number);
			}
		});
		oneButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(oneButton);
		
		JButton twoButton = new JButton("2");
		twoButton.setBounds(109, 362, 89, 68);
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+twoButton.getText();
				textField.setText(number);
			}
		});
		twoButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(twoButton);
		
		JButton threeButton = new JButton("3");
		threeButton.setBounds(208, 362, 89, 68);
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+threeButton.getText();
				textField.setText(number);
			}
		});
		threeButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(threeButton);
		
		JButton fourButton = new JButton("4");
		fourButton.setBounds(10, 283, 89, 68);
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+fourButton.getText();
				textField.setText(number);
			}
		});
		fourButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(fourButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.setBounds(109, 283, 89, 68);
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+fiveButton.getText();
				textField.setText(number);
			}
		});
		fiveButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.setBounds(208, 283, 89, 68);
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+sixButton.getText();
				textField.setText(number);
			}
		});
		sixButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(sixButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.setBounds(10, 205, 89, 68);
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+sevenButton.getText();
				textField.setText(number);
			}
		});
		sevenButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(sevenButton);
		
		JButton eightButton = new JButton("8");
		eightButton.setBounds(109, 205, 89, 68);
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+eightButton.getText();
				textField.setText(number);
			}
		});
		eightButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(eightButton);
		
		JButton nineButton = new JButton("9");
		nineButton.setBounds(208, 205, 89, 68);
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+nineButton.getText();
				textField.setText(number);
			}
		});
		nineButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(nineButton);
		
		
		
		JButton addButton = new JButton("+");
		addButton.setBounds(307, 362, 89, 147);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		addButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(addButton);
		
		JButton substractButton = new JButton("-");
		substractButton.setBounds(307, 283, 89, 68);
		substractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		substractButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(substractButton);
		
		JButton multiplyButton = new JButton("*");
		multiplyButton.setBounds(307, 205, 89, 68);
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		multiplyButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(multiplyButton);
		
		JButton divideButton = new JButton("/");
		divideButton.setBounds(307, 126, 89, 68);
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		divideButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(divideButton);
		
		JButton CButton = new JButton("C");
		CButton.setBounds(10, 126, 89, 68);
		CButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		CButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(CButton);
		

		JButton backButton = new JButton("<-");
		backButton.setBounds(208, 126, 89, 68);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back=null;
				if(textField.getText().length()>0)
				{
				StringBuilder str= new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				back=str.toString();
				textField.setText(back);
				}
			}
		});
		backButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(backButton);
		
		JButton equalButton = new JButton("=");
		equalButton.setBounds(208, 441, 89, 68);
		equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation== "+")
				{
					result=first+second;
					answer=String.format("%.2f",result );
					textField.setText(answer);
				}
				
				else if(operation== "-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation== "*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation== "/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
				
			}
		});
		equalButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(equalButton);
		
	}

	
}
