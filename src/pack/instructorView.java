package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;

public class instructorView {

	private JFrame frmInstructorView;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instructorView window = new instructorView();
					window.frmInstructorView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public instructorView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInstructorView = new JFrame();
		frmInstructorView.setTitle("Instructor View");
		frmInstructorView.setBounds(100, 100, 450, 445);
		frmInstructorView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmInstructorView.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLoadClassList = new JMenuItem("Load Class List");
		mnFile.add(mntmLoadClassList);
		
		JMenuItem mntmLoadGroups = new JMenuItem("Load Groups");
		mnFile.add(mntmLoadGroups);
		
		JMenuItem mntmSaveGroups = new JMenuItem("Save Groups");
		mnFile.add(mntmSaveGroups);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmGroups = new JMenuItem("Groups");
		mnEdit.add(mntmGroups);
		
		JMenuItem mntmEmptyGroups = new JMenuItem("Empty Groups");
		mnEdit.add(mntmEmptyGroups);
		
		JMenuItem mntmAdvancedOptions = new JMenuItem("Advanced Options");
		mnEdit.add(mntmAdvancedOptions);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenuItem mntmGroups_1 = new JMenuItem("Groups");
		mnView.add(mntmGroups_1);
		
		JMenuItem mntmClass = new JMenuItem("Class");
		mnView.add(mntmClass);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmGuide = new JMenuItem("Guide");
		mnHelp.add(mntmGuide);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		frmInstructorView.getContentPane().setLayout(null);
		
		JLabel lblInstructorId = new JLabel("Instructor ID");
		lblInstructorId.setBounds(38, 26, 89, 14);
		frmInstructorView.getContentPane().add(lblInstructorId);
		
		textField = new JTextField();
		textField.setBounds(28, 55, 99, 20);
		frmInstructorView.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCourseId = new JLabel("Course ID");
		lblCourseId.setBounds(38, 90, 76, 14);
		frmInstructorView.getContentPane().add(lblCourseId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(28, 115, 99, 20);
		frmInstructorView.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGroupSize = new JLabel("Group Size");
		lblGroupSize.setBounds(38, 156, 62, 14);
		frmInstructorView.getContentPane().add(lblGroupSize);
		
		SpinnerNumberModel spinLim= new SpinnerNumberModel(2.0, 2.0, 100.0, 1.0 );
		JSpinner spinner = new JSpinner(spinLim);
		spinner.setBounds(28, 181, 41, 20);
		frmInstructorView.getContentPane().add(spinner);
		
		JButton btnSet = new JButton("Set");
		btnSet.setBounds(79, 181, 49, 23);
		frmInstructorView.getContentPane().add(btnSet);
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(279, 26, 46, 14);
		frmInstructorView.getContentPane().add(lblView);
		
		JList list = new JList();
		list.setBounds(220, 261, 160, -183);
		frmInstructorView.getContentPane().add(list);
		
		textField_2 = new JTextField();
		textField_2.setBounds(197, 55, 195, 209);
		frmInstructorView.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(64, 324, 62, 23);
		frmInstructorView.getContentPane().add(btnReset);
		
		JButton btnGenerateGrouping = new JButton("Generate Grouping ");
		btnGenerateGrouping.setBounds(147, 324, 127, 23);
		frmInstructorView.getContentPane().add(btnGenerateGrouping);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(291, 324, 76, 23);
		frmInstructorView.getContentPane().add(btnCancel);
		
		JButton btnEditPreferences = new JButton("Edit Preferences");
		btnEditPreferences.setBounds(28, 237, 119, 23);
		frmInstructorView.getContentPane().add(btnEditPreferences);
	}
}
