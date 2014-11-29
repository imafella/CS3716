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

public class InstructorPref {

	private JFrame frmSetInstructorPreferences;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InstructorPref window = new InstructorPref();
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
	public InstructorPref() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSetInstructorPreferences = new JFrame();
		frmSetInstructorPreferences.setTitle("Set Instructor Preferences");
		frmSetInstructorPreferences.setBounds(100, 100, 450, 445);
		frmSetInstructorPreferences.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSetInstructorPreferences.getContentPane().setLayout(null);
		
		JLabel lblSetDeadline = new JLabel("Set Deadline");
		lblSetDeadline.setBounds(48, 26, 71, 14);
		frmSetInstructorPreferences.getContentPane().add(lblSetDeadline);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(31, 51, 46, 14);
		frmSetInstructorPreferences.getContentPane().add(lblMonth);
		
		textField = new JTextField();
		textField.setBounds(73, 48, 37, 20);
		frmSetInstructorPreferences.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Day");
		lblNewLabel.setBounds(136, 51, 37, 14);
		frmSetInstructorPreferences.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 48, 46, 20);
		frmSetInstructorPreferences.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(239, 51, 30, 14);
		frmSetInstructorPreferences.getContentPane().add(lblTime);
		
		textField_2 = new JTextField();
		textField_2.setBounds(279, 48, 46, 20);
		frmSetInstructorPreferences.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSkills = new JLabel("Skills");
		lblSkills.setBounds(49, 90, 46, 14);
		frmSetInstructorPreferences.getContentPane().add(lblSkills);
		
		JList list = new JList();
		list.setBounds(31, 130, 1, 1);
		frmSetInstructorPreferences.getContentPane().add(list);
		
		textField_3 = new JTextField();
		textField_3.setBounds(34, 115, 302, 114);
		frmSetInstructorPreferences.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSkill = new JLabel("Skill");
		lblSkill.setBounds(41, 243, 37, 14);
		frmSetInstructorPreferences.getContentPane().add(lblSkill);
		
		textField_4 = new JTextField();
		textField_4.setBounds(79, 240, 71, 20);
		frmSetInstructorPreferences.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblScale = new JLabel("Scale");
		lblScale.setBounds(160, 243, 37, 14);
		frmSetInstructorPreferences.getContentPane().add(lblScale);
		
		SpinnerNumberModel spinLim= new SpinnerNumberModel(1.0, 1.0, 100.0, 1.0 );
		JSpinner spinner = new JSpinner(spinLim);
		spinner.setBounds(194, 240, 46, 20);
		frmSetInstructorPreferences.getContentPane().add(spinner);
		
		JButton btnAdd = new JButton("Add Skill");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setBounds(250, 240, 89, 23);
		frmSetInstructorPreferences.getContentPane().add(btnAdd);
		
		JLabel lblDistributionMethod = new JLabel("Distribution Method");
		lblDistributionMethod.setBounds(49, 281, 118, 14);
		frmSetInstructorPreferences.getContentPane().add(lblDistributionMethod);
		
		ButtonGroup sortMethod = new ButtonGroup();
		
		JRadioButton rdbtnRandom = new JRadioButton("Random");
		rdbtnRandom.setBounds(73, 302, 71, 23);
		frmSetInstructorPreferences.getContentPane().add(rdbtnRandom);
		sortMethod.add(rdbtnRandom);
		
		JRadioButton rdbtnSmartSort = new JRadioButton("Smart Sort");
		rdbtnSmartSort.setBounds(147, 302, 109, 23);
		frmSetInstructorPreferences.getContentPane().add(rdbtnSmartSort);
		sortMethod.add(rdbtnSmartSort);
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(90, 346, 71, 23);
		frmSetInstructorPreferences.getContentPane().add(btnReset);
		
		JButton btnSetPreferences = new JButton("Set Preferences");
		btnSetPreferences.setBounds(194, 346, 118, 23);
		frmSetInstructorPreferences.getContentPane().add(btnSetPreferences);
	}
}
