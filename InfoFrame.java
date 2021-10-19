package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;

import java.awt.BorderLayout;

import javax.imageio.ImageIO;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class InfoFrame {

	private JFrame frmSashaRudiiKb;
	private JTextArea txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoFrame window = new InfoFrame();
					window.frmSashaRudiiKb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InfoFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSashaRudiiKb = new JFrame();
		frmSashaRudiiKb.setTitle("Sasha Rudii KB-201");
		frmSashaRudiiKb.setBounds(100, 100, 444, 300);
		frmSashaRudiiKb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{340, 0};
		gridBagLayout.rowHeights = new int[]{89, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmSashaRudiiKb.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frmSashaRudiiKb.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{63, 214, 0};
		gbl_panel.rowHeights = new int[]{89, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		

		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon("E:\\youtube\\png\\\u041F\u0430\u043A \u0430\u043D\u0438\u043C\u0435\\\u041F\u0430\u043A \u0430\u043D\u0438\u043C\u0435\\\u0422\u044F\u043D\u043A\u0438 \u0430\u043D\u0438\u043C\u0435\\\u0411\u0435\u0437 \u043D\u0430\u0437\u0432\u0430\u043D\u0438\u044F (2).jpg"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		

		
		txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk = new JTextArea();
		txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk.setTabSize(50);
		txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk.setText("\u0420\u043E\u0437\u0440\u043E\u0431\u043D\u0438\u043A \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0438:\r\n\u0420\u0443\u0434\u0438\u0439 \u041E\u043B\u0435\u043A\u0441\u043D\u0434\u0440 \u0410\u043D\u0434\u0440\u0456\u0439\u043E\u0432\u0438\u0447\r\n\u0421\u0442\u0443\u0434\u0435\u043D\u0442 \u041A\u0411-201\r\nrudoisasha2@gmail.com\r\n");
		txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk.setLineWrap(true);
		txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk.setColumns(30);
		GridBagConstraints gbc_txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk = new GridBagConstraints();
		gbc_txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk.anchor = GridBagConstraints.WEST;
		gbc_txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk.gridx = 1;
		gbc_txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk.gridy = 0;
		panel.add(txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk, gbc_txtrGsdlhgdsfklhfdkjhkdfhkdkfhkdfkhdfkhkdfkhdfkhkdfkhdkfhk);
	}

	public static void setLocation(int i, int y) {
		// TODO Auto-generated method stub
		
	}

	public static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void method() {
		// TODO Auto-generated method stub
		
	}

	

		
		
		
		


}

