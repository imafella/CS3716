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
import java.awt.Color;

import java.awt.event.*;

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
		frmInstructorView.setBounds(100, 100, 500, 300);
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
		textField_1.setBounds(10, 30, 130, 20);
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
		btnSet.setBounds(60, 80, 80, 20);
		frmInstructorView.getContentPane().add(btnSet);
		
		JList list = new JList();
		list.setBounds(220, 261, 160, -183);
		frmInstructorView.getContentPane().add(list);
		
		JButton btnGenerateGrouping = new JButton("Generate");
		btnGenerateGrouping.setForeground(new Color(0, 0, 0));
		btnGenerateGrouping.setBackground(new Color(255, 99, 71));
		btnGenerateGrouping.setBounds(25, 150, 100, 80);
		frmInstructorView.getContentPane().add(btnGenerateGrouping);
		
		JButton btnEditPreferences = new JButton("Edit Preferences");
		btnEditPreferences.setBounds(10, 110, 130, 20);
		frmInstructorView.getContentPane().add(btnEditPreferences);
		
		JList list_1 = new JList();
		list_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		list_1.setBounds(150, 10, 180, 220);
		frmInstructorView.getContentPane().add(list_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(340, 30, 120, 20);
		frmInstructorView.getContentPane().add(comboBox);
		
		JButton btnMove = new JButton("Move");
		btnMove.setBounds(360, 60, 80, 20);
		frmInstructorView.getContentPane().add(btnMove);
		
		JLabel lblNewLabel = new JLabel("Move to?");
		lblNewLabel.setBounds(340, 10, 80, 15);
		frmInstructorView.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Empty Groups");
		btnNewButton.setBounds(340, 90, 120, 20);
		frmInstructorView.getContentPane().add(btnNewButton);
	}
}
