package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;

public class MainVoew {
	private JFrame frame;
	private final JTextArea textArea = new JTextArea();
	private JTextField txtPizda;
	private JTextField textField;
	private InfoFrame infoFrame= new InfoFrame();
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainVoew window = new MainVoew();
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
	public MainVoew() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 217, 153);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{201, 0};
		gridBagLayout.rowHeights = new int[]{26, 82, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.NORTH;
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		JMenu menuWood = new JMenu("Wood");
		menuBar.add(menuWood);
		
		JMenuItem mnShow = new JMenuItem("Show");
		menuWood.add(mnShow);
		
		JMenuItem mnAdd = new JMenuItem("Add");
		menuWood.add(mnAdd);
		
		JMenuItem mnDelete = new JMenuItem("Delete");
		menuWood.add(mnDelete);
		
		JMenuItem mnEdit = new JMenuItem("Edit");
		menuWood.add(mnEdit);
		
		JMenu menuProduct = new JMenu("Product");
		menuBar.add(menuProduct);
		
		JMenuItem mnShowAll = new JMenuItem("Show All");
		menuProduct.add(mnShowAll);
		
		JMenu mnNewMenu = new JMenu("Add");
		menuProduct.add(mnNewMenu);
		
		JMenuItem mnTimber = new JMenuItem("Timber");
		mnNewMenu.add(mnTimber);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Info");
		mntmNewMenuItem.setSelected(true);
		mntmNewMenuItem.addActionListener(new ButtonEventListener());
		menuBar.add(mntmNewMenuItem);
		
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);
		scrollPane.setViewportView(textArea);
		
		
		
		
	}

	class ButtonEventListener implements ActionListener {
		protected void onInfoClick() {
			
		}
		public void actionPerformed(ActionEvent e) {
			InfoFrame.setLocation(frame.getLocation().x + frame.getWidth(),
					frame.getLocation().y);
			InfoFrame.setVisible(true);
			InfoFrame infoFrame = new InfoFrame();
		    infoFrame.method();
		}
	}
}
	
	

	

