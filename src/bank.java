import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bank extends JFrame {

	public JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public String x;public String x1;public String x2;
	public String x3;public String x4;
	private JLabel lblBankDetails;
	private JLabel lblCommisionRatesIn;
	private JLabel lblRupee;
	private JLabel lblDollar;
	private JLabel lblPounds;
	private JTextField textField_3;
	private JLabel lblYen;
	private JLabel lblEuros;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bank frame = new bank();
					frame.setVisible(true);
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bank() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1025, 757);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBankName = new JLabel("NAME OF BANK");
		lblBankName.setForeground(Color.CYAN);
		lblBankName.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblBankName.setBounds(12, 121, 202, 46);
		contentPane.add(lblBankName);
		
		textField =new JTextField();
		textField.setBounds(262, 121, 314, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(373, 268, 257, 46);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(373, 327, 257, 46);
		contentPane.add(textField_2);
		
		lblBankDetails = new JLabel("BANK DETAILS");
		lblBankDetails.setForeground(Color.ORANGE);
		lblBankDetails.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblBankDetails.setBounds(359, 13, 232, 53);
		contentPane.add(lblBankDetails);
		
		lblCommisionRatesIn = new JLabel("COMMISION RATES IN PERCENTAGE");
		lblCommisionRatesIn.setForeground(Color.ORANGE);
		lblCommisionRatesIn.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblCommisionRatesIn.setBounds(224, 174, 564, 53);
		contentPane.add(lblCommisionRatesIn);
		
		lblRupee = new JLabel("RUPEES");
		lblRupee.setForeground(Color.CYAN);
		lblRupee.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblRupee.setBounds(12, 268, 202, 46);
		contentPane.add(lblRupee);
		
		lblDollar = new JLabel("DOLLARS");
		lblDollar.setForeground(Color.CYAN);
		lblDollar.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblDollar.setBounds(12, 327, 202, 46);
		contentPane.add(lblDollar);
		
		lblPounds = new JLabel("POUNDS");
		lblPounds.setForeground(Color.CYAN);
		lblPounds.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblPounds.setBounds(12, 390, 202, 46);
		contentPane.add(lblPounds);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(373, 386, 257, 46);
		contentPane.add(textField_3);
		
		lblYen = new JLabel("YEN");
		lblYen.setForeground(Color.CYAN);
		lblYen.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblYen.setBounds(12, 449, 202, 46);
		contentPane.add(lblYen);
		
		lblEuros = new JLabel("EUROS");
		lblEuros.setForeground(Color.CYAN);
		lblEuros.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblEuros.setBounds(12, 508, 202, 46);
		contentPane.add(lblEuros);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(373, 445, 257, 46);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(373, 508, 257, 46);
		contentPane.add(textField_5);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnExit.setBounds(373, 616, 167, 45);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(581, 0, 83, 86);
		Image img2=new ImageIcon(this.getClass().getResource("/b1.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img2));
		contentPane.add(lblNewLabel);}
		public void addbank(String s)
		 {
		if(s.equalsIgnoreCase("CITI BANK"))
		{
			textField.setText("CITI BANK");
			textField_1.setText("2.5");
			x=textField_1.getText();
			textField_2.setText("3.5");
			x1=textField_2.getText();
			textField_3.setText("4.5");
			x2=textField_3.getText();
			textField_4.setText("5.5");
			x3=textField_3.getText();
			textField_5.setText("2.0");
			x4=textField_5.getText();
		}
		if(s.equalsIgnoreCase("DEUTSCHE BANK"))
		{
			textField.setText("DEUTSCHE BANK");
			textField_1.setText("5");
			x=textField_1.getText();
			textField_2.setText("4.5");
			x1=textField_2.getText();
			textField_3.setText("4.0");
			x2=textField_3.getText();
			textField_4.setText("2.75");
			x3=textField_3.getText();
			textField_5.setText("1.0");
			x4=textField_5.getText();
		}
		if(s.equalsIgnoreCase("HSBC"))
		{
			textField.setText("HSBC");
			textField_1.setText("6");
			x=textField_1.getText();
			textField_2.setText("1.25");
			x1=textField_2.getText();
			textField_3.setText("4.75");
			x2=textField_3.getText();
			textField_4.setText("4.75");
			x3=textField_3.getText();
			textField_5.setText("5");
			x4=textField_5.getText();
		}
		if(s.equalsIgnoreCase("BARCLAYS"))
		{
			textField.setText("BARCLAYS");
			textField_1.setText("3");
			x=textField_1.getText();
			textField_2.setText("2");
			x1=textField_2.getText();
			textField_3.setText("1.35");
			x2=textField_3.getText();
			textField_4.setText("2.75");
			x3=textField_3.getText();
			textField_5.setText("1");
			x4=textField_5.getText();
		}
		
}	
}	

