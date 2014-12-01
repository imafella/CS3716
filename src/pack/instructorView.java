package pack;

import java.awt.EventQueue;
import javax.swing.DefaultListModel;






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
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

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
	DefaultListModel listModel;
	private void initialize() {
		listModel = new DefaultListModel();
		frmInstructorView = new JFrame();
		frmInstructorView.setTitle("Instructor View");
		frmInstructorView.setBounds(100, 100, 500, 300);
		frmInstructorView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmInstructorView.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLoadClassList = new JMenuItem("Load Class List");
		mntmLoadClassList.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textField_1.setText("COMP 3716");
	    		preferences fiech= new preferences();
	    		
	    		studentArray classList = new studentArray();
	    		String[][] grades = {{"1710", "3.5"},{"2710", "2.1"}, {"2711", "4.0"}};
	    		student a = new student("Jim", "001", grades);		
	    		classList.addStudent(a);
	    		
	    		grades[0][1]="1.1"; grades[1][1]="3.4"; grades[2][1]="4.0";
	    		student b = new student("Janet", "02", grades);
	    		classList.addStudent(b);
	    		
	    		grades[0][1]="3.6"; grades[1][1]="4.0"; grades[2][1]="1.4";
	    		student c = new student("Jocelyn", "03", grades);
	    		classList.addStudent(c);
	    		
	    		grades[0][1]="2.0"; grades[1][1]="1.4"; grades[2][1]="1.8";
	    		student d = new student("Jackie", "04", grades);
	    		classList.addStudent(d);
	    		
	    		grades[0][1]="3.1"; grades[1][1]="1.9"; grades[2][1]="2.7";
	    		student es = new student("John", "05", grades);
	    		classList.addStudent(es);
	    		
	    		grades[0][1]="2.6"; grades[1][1]="1.6"; grades[2][1]="0.5";
	    		student f = new student("Jason", "06", grades);
	    		classList.addStudent(f);
	    		
	    		grades[0][1]="4.0"; grades[1][1]="4.0"; grades[2][1]="3.9";
	    		student g = new student("Jordon", "07", grades);
	    		classList.addStudent(g);
	    		
	    		grades[0][1]="3.3"; grades[1][1]="3.1"; grades[2][1]="2.8";
	    		student h = new student("Jon", "08", grades);
	    		classList.addStudent(h);
	    		
	    		grades[0][1]="1.9"; grades[1][1]="2.1"; grades[2][1]="2.0";
	    		student i = new student("Jonathan", "09", grades);
	    		classList.addStudent(i);
	    		
	    		grades[0][1]="2.5"; grades[1][1]="2.7"; grades[2][1]="1.5";
	    		student j = new student("Johnny", "10", grades);
	    		classList.addStudent(j);
	    		
	    		grades[0][1]="1.1"; grades[1][1]="1.2"; grades[2][1]="1.1";
	    		student k = new student("Jacob", "11", grades);
	    		classList.addStudent(k);
	    		
	    		grades[0][1]="3.5"; grades[1][1]="3.4"; grades[2][1]="2.7";
	    		student l = new student("Julia", "12", grades);
	    		classList.addStudent(l);
	    		
	    		grades[0][1]="3.7"; grades[1][1]="3.8"; grades[2][1]="3.5";
	    		student m = new student("Jackson", "13", grades);
	    		classList.addStudent(m);
	    		
	    		grades[0][1]="2.4"; grades[1][1]="3.4"; grades[2][1]="4.0";
	    		student n = new student("Jimbo", "14", grades);
	    		classList.addStudent(n);
	    		
	    		grades[0][1]="4.0"; grades[1][1]="3.9"; grades[2][1]="4.0";
	    		student o = new student("Jack", "15", grades);
	    		classList.addStudent(o);
	    		
	    		grades[0][1]="4.0"; grades[1][1]="4.0"; grades[2][1]="4.0";
	    		student p = new student("Jesus", "16", grades);
	    		classList.addStudent(p);
	    		
	    		grades[0][1]="2.0"; grades[1][1]="1.4"; grades[2][1]="1.5";
	    		student q = new student("Jillian", "17", grades);
	    		classList.addStudent(q);
	    		
	    		grades[0][1]="3.0"; grades[1][1]="3.0"; grades[2][1]="3.0";
	    		student r = new student("Julian", "18", grades);
	    		classList.addStudent(r);
	    		
	    		grades[0][1]="1.0"; grades[1][1]="1.0"; grades[2][1]="1.0";
	    		student s = new student("Bob", "68", grades);
	    		classList.addStudent(s);
	    		
	    		groupListing classProject= new groupListing(classList, fiech);
	    		
	    		for(int t = 0; t < classList.getStudents().length; t++){
	    			listModel.addElement(classList.getStudents()[t].getName());
	    		}
	    	}
	    });
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
		textField_1.setEditable(false);
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
		btnEditPreferences.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instructorPref.main(new String []{});
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 10, 180, 220);
		frmInstructorView.getContentPane().add(scrollPane);
		JList list_1 = new JList(listModel);
		scrollPane.setViewportView(list_1);
		list_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
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
