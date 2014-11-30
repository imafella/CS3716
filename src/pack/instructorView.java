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
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;

public class instructorView {

	private JFrame frmInstructorView;
	private JTextField textField_1;

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
		frmInstructorView.setBounds(100, 100, 400, 320);
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
		
		JMenuItem mntmEstiban = new JMenuItem("Estiban");
		mnHelp.add(mntmEstiban);
		frmInstructorView.getContentPane().setLayout(null);
		
		JLabel lblCourseId = new JLabel("Course ID");
		lblCourseId.setBounds(10, 10, 75, 15);
		frmInstructorView.getContentPane().add(lblCourseId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 30, 100, 20);
		frmInstructorView.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGroupSize = new JLabel("Group Size");
		lblGroupSize.setBounds(10, 60, 75, 15);
		frmInstructorView.getContentPane().add(lblGroupSize);
		
		SpinnerNumberModel spinLim= new SpinnerNumberModel(2.0, 2.0, 100.0, 1.0 );
		JSpinner spinner = new JSpinner(spinLim);
		spinner.setBounds(10, 80, 40, 20);
		frmInstructorView.getContentPane().add(spinner);
		
		JButton btnSet = new JButton("Set");
		btnSet.setBounds(60, 80, 90, 20);
		frmInstructorView.getContentPane().add(btnSet);
		
		JList list = new JList();
		list.setBounds(220, 261, 160, -183);
		frmInstructorView.getContentPane().add(list);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(10, 230, 100, 20);
		frmInstructorView.getContentPane().add(btnReset);
		
		JButton btnGenerateGrouping = new JButton("Generate");
		btnGenerateGrouping.setBounds(10, 200, 140, 20);
		frmInstructorView.getContentPane().add(btnGenerateGrouping);
		
		JButton btnEditPreferences = new JButton("Edit Preferences");
		btnEditPreferences.setBounds(10, 110, 140, 20);
		frmInstructorView.getContentPane().add(btnEditPreferences);
		
		JRadioButton rdbtnGroup = new JRadioButton("Group");
		rdbtnGroup.setBounds(160, 230, 80, 20);
		frmInstructorView.getContentPane().add(rdbtnGroup);
		
		JRadioButton rdbtnClass = new JRadioButton("Class");
		rdbtnClass.setBounds(260, 230, 80, 20);
		frmInstructorView.getContentPane().add(rdbtnClass);
		
		JList list_1 = new JList();
		list_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		list_1.setBounds(160, 20, 200, 200);
		frmInstructorView.getContentPane().add(list_1);
	}
}
