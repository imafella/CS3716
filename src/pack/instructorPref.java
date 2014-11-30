package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.border.EtchedBorder;

public class instructorPref {

	private JFrame frmSetInstructorPreferences;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instructorPref window = new instructorPref();
					window.frmSetInstructorPreferences.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public instructorPref() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSetInstructorPreferences = new JFrame();
		frmSetInstructorPreferences.setTitle("Set Instructor Preferences");
		frmSetInstructorPreferences.setBounds(100, 100, 320, 250);
		frmSetInstructorPreferences.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmSetInstructorPreferences.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Deadline", null, panel, null);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 25, 100, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(150, 25, 40, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(230, 25, 50, 20);
		panel.add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("Month");
		lblNewLabel.setBounds(10, 10, 80, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Day");
		lblNewLabel_1.setBounds(150, 10, 50, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Year");
		lblNewLabel_2.setBounds(230, 10, 50, 15);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Skills", null, panel_1, null);
		panel_1.setLayout(null);
		
		JList list = new JList();
		list.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		list.setBounds(10, 25, 200, 150);
		panel_1.add(list);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(215, 25, 40, 20);
		panel_1.add(spinner);
		
		JLabel lblNewLabel_3 = new JLabel("Skills");
		lblNewLabel_3.setBounds(10, 10, 60, 15);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Skill Level");
		lblNewLabel_4.setBounds(215, 10, 80, 15);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(215, 60, 80, 20);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Sort Method", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Sort Method");
		lblNewLabel_5.setBounds(10, 10, 80, 15);
		panel_2.add(lblNewLabel_5);
		
		JRadioButton rdbtnRandom = new JRadioButton("Random");
		rdbtnRandom.setBounds(10, 25, 80, 20);
		panel_2.add(rdbtnRandom);
		
		JRadioButton rdbtnEstisort = new JRadioButton("Estisort");
		rdbtnEstisort.setBounds(100, 25, 80, 20);
		panel_2.add(rdbtnEstisort);
		
		SpinnerNumberModel spinLim= new SpinnerNumberModel(1.0, 1.0, 100.0, 1.0 );
		
		ButtonGroup sortMethod = new ButtonGroup();
	}
}
