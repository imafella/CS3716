package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;

public class studentView {

	private JFrame frmStudentView;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnSubmit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentView window = new studentView();
					window.frmStudentView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public studentView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static groupListing groupList;
	DefaultListModel listModel;
	private void initialize() {
		this.groupList = studentPref.getGroupListing();
		listModel = new DefaultListModel();
		this.groupList = instructorView.getGroupListing();
		frmStudentView = new JFrame();
		frmStudentView.setTitle("Student View");
		frmStudentView.setBounds(100, 100, 400, 300);
		frmStudentView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmStudentView.getContentPane().setLayout(null);
		
		JLabel lblCourseid = new JLabel("CourseID");
		lblCourseid.setBounds(10, 10, 75, 15);
		frmStudentView.getContentPane().add(lblCourseid);
		
		textField_1 = new JTextField("3716");
		textField_1.setBounds(10, 30, 140, 20);
		textField_1.setEditable(false);
		frmStudentView.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setBounds(10, 60, 75, 15);
		frmStudentView.getContentPane().add(lblStudentId);
		
		textField_2 = new JTextField("68");
		textField_2.setBounds(10, 80, 140, 20);
		textField_2.setEditable(false);
		frmStudentView.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnEditStudentParameters = new JButton("Edit Preferences");
		btnEditStudentParameters.setBounds(10, 110, 140, 20);
		btnEditStudentParameters.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    			studentPref.main(new String []{});
	    		}
	    		
	    	
	    });
		frmStudentView.getContentPane().add(btnEditStudentParameters);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(160, 10, 200, 220);
		frmStudentView.getContentPane().add(scrollPane);
		
		JList list = new JList(listModel);
		scrollPane.setViewportView(list);
		list.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JMenuBar menuBar = new JMenuBar();
		frmStudentView.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLoadClassList = new JMenuItem("Load Class List");
		mntmLoadClassList.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for (int i = 0; i < groupList.getGroups().length; i++){
	    			for (int j = 0; j < groupList.getGroups()[i].getStudents().length; j++){
	    				listModel.addElement(getGroupListing().getGroups()[i].getStudents()[j].getName());
	    			}
	    		}
	    	}
		});
		mnFile.add(mntmLoadClassList);
		
		JMenuItem mntmLoadGroups = new JMenuItem("Load Groups");
		mnFile.add(mntmLoadGroups);
		
		JMenuItem mntmSavePreferences = new JMenuItem("Save Preferences");
		mnFile.add(mntmSavePreferences);
		
		JMenuItem mntmLoadPreferences = new JMenuItem("Load Preferences");
		mnFile.add(mntmLoadPreferences);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		
		JMenuItem mntmEstiban = new JMenuItem("Estiban");
		mnHelp.add(mntmEstiban);
		//LOL ESTIBAN
	}
	public void setGroupListing(groupListing groupList){
		this.groupList = groupList;
	}
	public static groupListing getGroupListing(){
		return groupList;
	}
}
