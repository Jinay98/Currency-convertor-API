import java.awt.EventQueue;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import org.json.JSONException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Curr {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	String s1,s2,s3;double ans;double prev;double ans1;
	private JTextField textField_4;
	ConvertResponseDemo cd=new ConvertResponseDemo();
	private JTextField textField_3;
	private JTextField textField_5;
	String msgs[]= {"","INR=RUPEE","USD=DOLLAR","GBP=POUND","JPY=YEN","EUR=EURO"};
	String msgs1[]= {"","INR=RUPEE","USD=DOLLAR","GBP=POUND","JPY=YEN","EUR=EURO"};
	String bank[]= {"CHOOSE YOUR BANK","CITI BANK","DEUTSCHE BANK","HSBC","BARCLAYS"};
	String ms1,ms2;
	 JLabel lblNewLabel_6 ;
	 JLabel lblNewLabel_7 ;
	 String ban;double ans2;
	 String q;bank obj1;double co;
	 private JTextField textField_6;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Curr window = new Curr();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Curr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.setBounds(100, 100, 1071, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("CURRENCY CONVERTER");
		lblNewLabel.setBounds(199, 13, 457, 74);
		Image img1=new ImageIcon(this.getClass().getResource("/euro.png")).getImage();
		frame.getContentPane().setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(150, 13, 48, 74);
		Image img2=new ImageIcon(this.getClass().getResource("/doll.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(648, 13, 53, 74);
		Image img3=new ImageIcon(this.getClass().getResource("/pes.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img3));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(696, 13, 48, 74);
		Image img4=new ImageIcon(this.getClass().getResource("/yen.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img4));
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(394, 110, 102, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheCurrency = new JLabel("Enter the currency you want to convert");
		lblEnterTheCurrency.setBounds(27, 110, 324, 55);
		lblEnterTheCurrency.setForeground(Color.CYAN);
		lblEnterTheCurrency.setToolTipText("SELECT FROM THE COMBO BOX");
		lblEnterTheCurrency.setFont(new Font("Times New Roman", Font.BOLD, 19));
		frame.getContentPane().add(lblEnterTheCurrency);
		
		textField_1 = new JTextField();
		textField_1.setBounds(394, 185, 102, 55);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		JLabel lblEnterTheDesired = new JLabel("Enter the desired Currency");
		lblEnterTheDesired.setBounds(27, 183, 324, 55);
		lblEnterTheDesired.setForeground(Color.CYAN);
		lblEnterTheDesired.setToolTipText("SELECT FROM THE COMBO BOX");
		lblEnterTheDesired.setFont(new Font("Times New Roman", Font.BOLD, 19));
		frame.getContentPane().add(lblEnterTheDesired);
		
		JButton btnNewButton = new JButton("CONVERT");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setToolTipText("PRESS TO GIVE LIVE EXCHANGE RATE");
			}
		});
		btnNewButton.setBounds(815, 139, 206, 74);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_6.setIcon(null);
				lblNewLabel_7.setIcon(null);
				s1=textField.getText();
				s1=s1.substring(0,3);
				//System.out.println(s1);
				s2=textField_1.getText();
				s2=s2.substring(0,3);
				//System.out.println(s2);
				s3=textField_3.getText();
				prev=Double.parseDouble(s3);
				ans=ConvertResponseDemo.sendConvertRequest(s1,s2);
				ans1=prev*ans;
				btnNewButton.setToolTipText("To display the exchange rates of the entered currencies");
				textField_2.setText(Double.toString(ans));
				//System.out.println(s1);
				textField_5.setText(Double.toString(ans1));
				//System.out.println(s2);
				if(s2.equalsIgnoreCase("INR"))
				{
					co=Double.parseDouble(obj1.x);
					ans2=ans1-((co/100)*ans1);
					textField_6.setText(Double.toString(ans2));
				}
				if(s2.equalsIgnoreCase("USD"))
				{
					co=Double.parseDouble(obj1.x1);
					ans2=ans1-((co/100)*ans1);
					textField_6.setText(Double.toString(ans2));
				}
				if(s2.equalsIgnoreCase("GBP"))
				{
					co=Double.parseDouble(obj1.x2);
					ans2=ans1-((co/100)*ans1);
					textField_6.setText(Double.toString(ans2));
				}
				if(s2.equalsIgnoreCase("JPY"))
				{
					co=Double.parseDouble(obj1.x3);
					ans2=ans1-((co/100)*ans1);
					textField_6.setText(Double.toString(ans2));
				}
				if(s2.equalsIgnoreCase("EUR"))
				{
					co=Double.parseDouble(obj1.x4);
					ans2=ans1-((co/100)*ans1);
					textField_6.setText(Double.toString(ans2));
				}
				//System.out.println(s3);
				textField_4.setText(s1.toUpperCase()+" TO "+s2.toUpperCase()+" SUCCESSFULLY ");
				}
		});
		Image img5=new ImageIcon(this.getClass().getResource("/ref.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img5));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 23));
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblExchangeRate = new JLabel("LIVE EXCHANGE RATE");
		lblExchangeRate.setBounds(27, 255, 324, 55);
		lblExchangeRate.setForeground(Color.CYAN);
		lblExchangeRate.setFont(new Font("Times New Roman", Font.BOLD, 22));
		frame.getContentPane().add(lblExchangeRate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(394, 253, 184, 55);
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		JLabel lblEnableCurrencyTrading = new JLabel("ENABLE GRAPHS");
		lblEnableCurrencyTrading.setBounds(27, 555, 324, 40);
		lblEnableCurrencyTrading.setForeground(Color.CYAN);
		lblEnableCurrencyTrading.setFont(new Font("Times New Roman", Font.BOLD, 24));
		frame.getContentPane().add(lblEnableCurrencyTrading);
		
		JButton btnYes = new JButton("YES");
		btnYes.setForeground(Color.RED);
		btnYes.setBounds(408, 555, 113, 40);
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CurrTrade obj=new CurrTrade();
				obj.setVisible(true);
			}
		});
		btnYes.setFont(new Font("Times New Roman", Font.BOLD, 21));
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("NO");
		btnNo.setForeground(Color.RED);
		btnNo.setBounds(690, 555, 113, 40);
		btnNo.setFont(new Font("Times New Roman", Font.BOLD, 21));
		frame.getContentPane().add(btnNo);
		
		JLabel lblYouAreConverting = new JLabel("YOU HAVE CONVERTED");
		lblYouAreConverting.setBounds(27, 389, 324, 58);
		lblYouAreConverting.setForeground(Color.CYAN);
		lblYouAreConverting.setFont(new Font("Times New Roman", Font.BOLD, 23));
		frame.getContentPane().add(lblYouAreConverting);
		
		textField_4 = new JTextField();
		textField_4.setBounds(394, 400, 324, 43);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("ENTER THE AMOUNT YOU WANT TO CONVERT");
		lblNewLabel_4.setBounds(12, 341, 412, 35);
		lblNewLabel_4.setForeground(Color.CYAN);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setToolTipText("DON'T LEAVE THIS FIELD EMPTY!");
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(469, 342, 121, 35);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("AMOUNT IS:");
		lblNewLabel_5.setBounds(27, 471, 145, 35);
		lblNewLabel_5.setForeground(Color.CYAN);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 21));
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(218, 471, 161, 40);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox(msgs);
		comboBox.setBounds(590, 110, 196, 55);
		
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 18));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(e.getSource()==comboBox)	
			{
				@SuppressWarnings("unchecked")
				JComboBox<String[]> source = (JComboBox<String[]>)e.getSource();
				JComboBox<String[]> cb =source;
				ms1=(String)cb.getSelectedItem();
				//System.out.println("hi"+ms1);
				textField.setText(ms1);
				
				
				
				
				lblNewLabel_6 = new JLabel("");
				ms1=textField.getText();
				ms1=ms1.substring(0,3);
				
				
				if(ms1.equalsIgnoreCase("INR"))
				{
					//System.out.println("hi");
				Image img6=new ImageIcon(this.getClass().getResource("/ind.png")).getImage();
				lblNewLabel_6.setIcon(new ImageIcon(img6));
				lblNewLabel_6.setBounds(522, 110, 56, 55);
				frame.getContentPane().add(lblNewLabel_6);
				}
				else if(ms1.equalsIgnoreCase("USD"))
				{
					
				//System.out.println("HIOU");
				Image img7=new ImageIcon(this.getClass().getResource("/usa.png")).getImage();
				lblNewLabel_6.setIcon(new ImageIcon(img7));
				lblNewLabel_6.setBounds(522, 110, 56, 55);
				frame.getContentPane().add(lblNewLabel_6);
				}
				else if(ms1.equalsIgnoreCase("GBP")) {
					//System.out.println("hte");
					Image img8=new ImageIcon(this.getClass().getResource("/uk.png")).getImage();
					lblNewLabel_6.setIcon(new ImageIcon(img8));
					lblNewLabel_6.setBounds(522, 110, 56, 55);
					frame.getContentPane().add(lblNewLabel_6);
				}
				else if(ms1.equalsIgnoreCase("JPY")) {
					//System.out.println("hte");
					Image img9=new ImageIcon(this.getClass().getResource("/jpn.png")).getImage();
					lblNewLabel_6.setIcon(new ImageIcon(img9));
					lblNewLabel_6.setBounds(522, 110, 56, 55);
					frame.getContentPane().add(lblNewLabel_6);
				}
				else if(ms1.equalsIgnoreCase("EUR")) {
					//System.out.println("hte");
					Image img10=new ImageIcon(this.getClass().getResource("/ger.png")).getImage();
					lblNewLabel_6.setIcon(new ImageIcon(img10));
					lblNewLabel_6.setBounds(522, 110, 56, 55);
					frame.getContentPane().add(lblNewLabel_6);
				}
				}}
		});
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(msgs1);
		comboBox_1.setBounds(590, 185, 196, 55);
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==comboBox_1)	
				{
					JComboBox<String> cb =(JComboBox<String>)e.getSource();
					ms2=(String)cb.getSelectedItem();
					//System.out.println("hi"+ms2);
					textField_1.setText(ms2);
					
					
					lblNewLabel_7 = new JLabel("");
					ms2=textField_1.getText();
					ms2=ms2.substring(0,3);
					if(ms2.equalsIgnoreCase("INR"))
					{
						//System.out.println("hi");
					Image img6=new ImageIcon(this.getClass().getResource("/ind.png")).getImage();
					lblNewLabel_7.setIcon(new ImageIcon(img6));
					lblNewLabel_7.setBounds(511, 185, 67, 55);
					frame.getContentPane().add(lblNewLabel_7);
					}
					else if(ms2.equalsIgnoreCase("USD"))
					{
					//System.out.println("HIOU");
					Image img7=new ImageIcon(this.getClass().getResource("/usa.png")).getImage();
					lblNewLabel_7.setIcon(new ImageIcon(img7));
					lblNewLabel_7.setBounds(511, 185, 67, 55);
					frame.getContentPane().add(lblNewLabel_7);
					}
					else if(ms2.equalsIgnoreCase("GBP")) {
						//System.out.println("hte");
						Image img8=new ImageIcon(this.getClass().getResource("/uk.png")).getImage();
						lblNewLabel_7.setIcon(new ImageIcon(img8));
						lblNewLabel_7.setBounds(511, 185, 67, 55);
						frame.getContentPane().add(lblNewLabel_7);
					}
					else if(ms2.equalsIgnoreCase("JPY")) {
						//System.out.println("hte");
						Image img9=new ImageIcon(this.getClass().getResource("/jpn.png")).getImage();
						lblNewLabel_7.setIcon(new ImageIcon(img9));
						lblNewLabel_7.setBounds(511, 185, 67, 55);
						frame.getContentPane().add(lblNewLabel_7);
					}
					else if(ms2.equalsIgnoreCase("EUR")) {
						//System.out.println("hte");
						Image img10=new ImageIcon(this.getClass().getResource("/ger.png")).getImage();
						lblNewLabel_7.setIcon(new ImageIcon(img10));
						lblNewLabel_7.setBounds(511, 185, 67, 55);
						frame.getContentPane().add(lblNewLabel_7);
					}
					}
			}
		});
		frame.getContentPane().add(comboBox_1);
		
		JLabel label = new JLabel("");
		label.setBounds(791, 424, 56, 16);
		frame.getContentPane().add(label);
		
		JComboBox comboBox_2 = new JComboBox(bank);
		comboBox_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		comboBox_2.setBounds(590, 255, 196, 55);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblFinalAmountAfter = new JLabel("FINAL AMOUNT AFTER COMMISSION");
		lblFinalAmountAfter.setForeground(Color.CYAN);
		lblFinalAmountAfter.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblFinalAmountAfter.setBounds(394, 471, 392, 35);
		frame.getContentPane().add(lblFinalAmountAfter);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(791, 471, 161, 40);
		frame.getContentPane().add(textField_6);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==comboBox_2)	
				{
					JComboBox<String> cb10 =(JComboBox<String>)e.getSource();
					ban=(String)cb10.getSelectedItem();
					//System.out.println(ban+"hihiii");
					obj1=new bank();
					obj1.setVisible(true);
					obj1.addbank(ban);
					//=obj1.textField_2.getText();
					System.out.println(obj1.x+"eieuttgeiuf");
					
					
		
		
		
		
			}
}});
	}	
}

