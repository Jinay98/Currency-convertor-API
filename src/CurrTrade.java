import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CurrTrade extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrTrade frame = new CurrTrade();
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
	public CurrTrade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCurrencyTrading = new JLabel("GRAPHS");
		lblCurrencyTrading.setForeground(Color.ORANGE);
		lblCurrencyTrading.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblCurrencyTrading.setBounds(304, 13, 127, 53);
		contentPane.add(lblCurrencyTrading);
		
		JButton btnShowGraph = new JButton("INDIAN RUPEE");
		btnShowGraph.setForeground(Color.RED);
		btnShowGraph.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnShowGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultCategoryDataset dcd=new DefaultCategoryDataset();
				dcd.setValue(65.55, "CURRENCIES","2011");
				dcd.setValue(68.55, "CURRENCIES","2012");
				dcd.setValue(63.55, "CURRENCIES","2013");
				dcd.setValue(60.55, "CURRENCIES","2014");
				dcd.setValue(70.55, "CURRENCIES","2015");
				JFreeChart jchart=ChartFactory.createBarChart3D("GRAPH OF RUPEE","YEARS","RATES",dcd,PlotOrientation.VERTICAL,true,true,false);
				CategoryPlot plot =jchart.getCategoryPlot();
				plot.setRangeGridlinePaint(Color.black);
				ChartFrame chartfrm=new ChartFrame("GRAPH OF INR",jchart,true);
				chartfrm.setVisible(true);
				chartfrm.setSize(500, 400);
				
				
			}
		});
		btnShowGraph.setBounds(109, 133, 167, 45);
		contentPane.add(btnShowGraph);
		
		
		JLabel lblNewLabel = new JLabel("");
		
		Image img10=new ImageIcon(this.getClass().getResource("/bar.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img10));
		lblNewLabel.setBounds(456, 13, 76, 66);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		Image img11=new ImageIcon(this.getClass().getResource("/bar1.png")).getImage();
		label.setIcon(new ImageIcon(img11));
		label.setBounds(200, 13, 76, 66);
		contentPane.add(label);
		
		JButton btnBritishDollar = new JButton("BRITISH POUND");
		btnBritishDollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultCategoryDataset dcd=new DefaultCategoryDataset();
				dcd.setValue(0.6434, "CURRENCIES","2011");
				dcd.setValue(0.6395, "CURRENCIES","2012");
				dcd.setValue(0.625, "CURRENCIES","2013");
				dcd.setValue(0.6060, "CURRENCIES","2014");
				dcd.setValue(0.6576, "CURRENCIES","2015");
				JFreeChart jchart=ChartFactory.createBarChart3D("GRAPH OF POUND","YEARS","RATES",dcd,PlotOrientation.VERTICAL,true,true,false);
				CategoryPlot plot =jchart.getCategoryPlot();
				plot.setRangeGridlinePaint(Color.black);
				ChartFrame chartfrm=new ChartFrame("GRAPH OF POUND",jchart,true);
				chartfrm.setVisible(true);
				chartfrm.setSize(500, 400);
			}
		});
		btnBritishDollar.setForeground(Color.RED);
		btnBritishDollar.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnBritishDollar.setBounds(469, 133, 186, 45);
		contentPane.add(btnBritishDollar);
		
		JButton btnGermanEuro = new JButton("GERMAN EURO");
		btnGermanEuro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultCategoryDataset dcd=new DefaultCategoryDataset();
				dcd.setValue(0.7215, "CURRENCIES","2011");
				dcd.setValue(0.7570, "CURRENCIES","2012");
				dcd.setValue(0.7255, "CURRENCIES","2013");
				dcd.setValue(0.8227, "CURRENCIES","2014");
				dcd.setValue(0.8738, "CURRENCIES","2015");
				JFreeChart jchart=ChartFactory.createBarChart3D("GRAPH OF EURO","YEARS","RATES",dcd,PlotOrientation.VERTICAL,true,true,false);
				CategoryPlot plot =jchart.getCategoryPlot();
				plot.setRangeGridlinePaint(Color.black);
				ChartFrame chartfrm=new ChartFrame("GRAPH OF EURO",jchart,true);
				chartfrm.setVisible(true);
				chartfrm.setSize(500, 400);
			}
		});
		btnGermanEuro.setForeground(Color.RED);
		btnGermanEuro.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnGermanEuro.setBounds(109, 245, 167, 45);
		contentPane.add(btnGermanEuro);
		
		JButton btnJapaneseYen = new JButton("JAPANESE YEN");
		btnJapaneseYen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultCategoryDataset dcd=new DefaultCategoryDataset();
				dcd.setValue(76.915, "CURRENCIES","2011");
				dcd.setValue(86.6474, "CURRENCIES","2012");
				dcd.setValue(105.2417, "CURRENCIES","2013");
				dcd.setValue(119.86, "CURRENCIES","2014");
				dcd.setValue(120.31, "CURRENCIES","2015");
				JFreeChart jchart=ChartFactory.createBarChart3D("GRAPH OF YEN","YEARS","RATES",dcd,PlotOrientation.VERTICAL,true,true,false);
				CategoryPlot plot =jchart.getCategoryPlot();
				plot.setRangeGridlinePaint(Color.black);
				ChartFrame chartfrm=new ChartFrame("GRAPH OF YEN",jchart,true);
				chartfrm.setVisible(true);
				chartfrm.setSize(500, 400);
			}
		});
		btnJapaneseYen.setForeground(Color.RED);
		btnJapaneseYen.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnJapaneseYen.setBounds(469, 245, 186, 45);
		contentPane.add(btnJapaneseYen);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnExit.setBounds(293, 338, 167, 45);
		contentPane.add(btnExit);
		
		
	}
}