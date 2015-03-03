package pack;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;






import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	static groupListing groupList;
	JList list_1;
	DefaultListModel listModel;
	SpinnerNumberModel spinLim;
	DefaultComboBoxModel comboModel;
	JComboBox comboBox;
	JRadioButton rdbtnClass;
	JRadioButton rdbtnGroup;
	private void initialize() {
		listModel = new DefaultListModel();
		spinLim = new SpinnerNumberModel(2.0, 2.0, 100.0, 1.0 );
		comboModel = new DefaultComboBoxModel();
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
	    		String[][] g1 = {{"1710", "3.5"},{"2710", "2.1"}, {"2711", "4.0"}};
	    		student a = new student("Jim", "01");
	    		a.setGrades(g1);
	    		classList.addStudent(a);
	    		
	    		String[][] g2 = {{"1710", "1.1"},{"2710", "3.4"},{"2711", "4.0"}};
	    		student b = new student("Janet", "02");
	    		b.setGrades(g2);
	    		classList.addStudent(b);
	    		
	    		String[][] g3 = {{"1710", "3.6"},{"2710", "4.0"},{"2711", "1.4"}};
	    		student c = new student("Jocelyn", "03");
	    		c.setGrades(g3);
	    		classList.addStudent(c);
	    		
	    		String[][] g4 = {{"1710", "2.0"},{"2710", "1.4"},{"2711", "1.8"}};
	    		student d = new student("Jackie", "04");
	    		d.setGrades(g4);
	    		classList.addStudent(d);
	    		
	    		String[][] g5 = {{"1710", "3.1"},{"2710", "1.9"},{"2711", "2.7"}};
	    		student es = new student("John", "05");
	    		es.setGrades(g5);
	    		classList.addStudent(es);
	    		
	    		String[][] g6 = {{"1710", "2.6"},{"2710", "1.6"},{"2711", "0.5"}};
	    		student f = new student("Jason", "06");
	    		f.setGrades(g6);
	    		classList.addStudent(f);
	    		
	    		String[][] g7 = {{"1710", "4.0"},{"2710", "4.0"},{"2711", "3.9"}};
	    		student g = new student("Jordon", "07");
	    		g.setGrades(g7);
	    		classList.addStudent(g);
	    		
	    		String[][] g8 = {{"1710", "3.3"},{"2710", "3.1"},{"2711", "2.8"}};
	    		student h = new student("Jon", "08");
	    		h.setGrades(g8);
	    		classList.addStudent(h);
	    		
	    		String[][] g9 = {{"1710", "1.9"},{"2710", "2.1"},{"2711", "2.0"}};
	    		student i = new student("Jonathan", "09");
	    		i.setGrades(g9);
	    		classList.addStudent(i);
	    		
	    		String[][] g10 = {{"1710", "2.5"},{"2710", "2.7"},{"2711", "1.5"}};
	    		student j = new student("Johnny", "10");
	    		j.setGrades(g10);
	    		classList.addStudent(j);
	    		
	    		String[][] g11 = {{"1710", "1.1"},{"2710", "1.2"},{"2711", "1.1"}};
	    		student k = new student("Jacob", "11");
	    		k.setGrades(g11);
	    		classList.addStudent(k);
	    		
	    		String[][] g12 = {{"1710", "3.5"},{"2710", "3.4"},{"2711", "2.7"}};
	    		student l = new student("Julia", "12");
	    		l.setGrades(g12);
	    		classList.addStudent(l);
	    		
	    		String[][] g13 = {{"1710", "3.7"},{"2710", "3.8"},{"2711", "3.5"}};
	    		student m = new student("Jackson", "13");
	    		m.setGrades(g13);
	    		classList.addStudent(m);
	    		
	    		String[][] g14 = {{"1710", "2.4"},{"2710", "3.4"},{"2711", "4.0"}};
	    		student n = new student("Jimbo", "14");
	    		n.setGrades(g14);
	    		classList.addStudent(n);
	    		
	    		String[][] g15 = {{"1710", "4.0"},{"2710", "3.9"},{"2711", "4.0"}};
	    		student o = new student("Jack", "15");
	    		o.setGrades(g15);
	    		classList.addStudent(o);
	    		
	    		String[][] g16 = {{"1710", "4.0"},{"2710", "4.0"},{"2711", "4.0"}};
	    		student p = new student("Jib", "16");
	    		p.setGrades(g16);
	    		classList.addStudent(p);
	    		
	    		String[][] g17 = {{"1710", "2.0"},{"2710", "1.4"},{"2711", "1.5"}};
	    		student q = new student("Jillian", "17");
	    		q.setGrades(g17);
	    		classList.addStudent(q);
	    		
	    		String[][] g18 = {{"1710", "3.0"},{"2710", "3.0"},{"2711", "3.0"}};
	    		student r = new student("Julian", "18");
	    		r.setGrades(g18);
	    		classList.addStudent(r);
	    		
	    		String[][] g19 = {{"1710", "1.0"},{"2710", "1.0"},{"2711", "1.0"}};
	    		student s = new student("Bob", "19");
	    		s.setGrades(g19);
	    		classList.addStudent(s);
	    		
	    		groupListing classProject= new groupListing(classList, fiech);
	    		setGroupListing(classProject);
	    		
	    		listModel.clear();
	    		rdbtnClass.setSelected(true);
	    		for(int t = 0; t < classList.getStudents().length; t++){
	    			listModel.addElement("#" + classList.getStudents()[t].getNumber() + " " + classList.getStudents()[t].getName());
	    		}
	    		
	    		for (int t = 0; t < 11; t++){
	    			comboModel.addElement("Group " + t);
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
		
		JSpinner spinner = new JSpinner(spinLim);
		spinner.setBounds(10, 80, 40, 20);
		frmInstructorView.getContentPane().add(spinner);
		
		JButton btnSet = new JButton("Set");
		btnSet.setBounds(60, 80, 80, 20);
		btnSet.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		double v = (double) spinLim.getValue();
	    		int intV = (int) v;
	    		groupList.clearGroups();
	    		groupListing g = getGroupListing();
	    		g.getPref().setSize(intV);
	    		g = new groupListing(getGroupListing().getClassList(), getGroupListing().getPref());
	    		setGroupListing(g);
	    		listModel.clear();
	    		rdbtnGroup.setSelected(true);
	    		for(int i = 0; i < getGroupListing().getGroups().length; i++){
	    			listModel.addElement(" ");
	    			listModel.addElement("Group: " + i);
	    			for (int j = 0; j < getGroupListing().getGroups()[i].getStudents().length; j++)
	    				listModel.addElement("#" + getGroupListing().getGroups()[i].getStudents()[j].getNumber() + " " + getGroupListing().getGroups()[i].getStudents()[j].getName());
	    		}
	    	}
		});
		frmInstructorView.getContentPane().add(btnSet);
		
		JList list = new JList();
		list.setBounds(220, 261, 160, -183);
		frmInstructorView.getContentPane().add(list);
		
		JButton btnGenerateGrouping = new JButton("Generate");
		btnGenerateGrouping.setForeground(new Color(0, 0, 0));
		btnGenerateGrouping.setBackground(new Color(255, 99, 71));
		btnGenerateGrouping.setBounds(25, 150, 100, 80);
		frmInstructorView.getContentPane().add(btnGenerateGrouping);
		btnGenerateGrouping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!listModel.isEmpty()) {
					rdbtnGroup.setSelected(true);
					if(getGroupListing().getPref().getSortMethod().equals("RANDOM"))
						getGroupListing().randomSort();
					if(getGroupListing().getPref().getSortMethod().equals("ESTESORT"))
						getGroupListing().esteSort();
					
					listModel.clear();
		    		for(int i = 0; i < getGroupListing().getGroups().length; i++){
		    			listModel.addElement(" ");
		    			listModel.addElement("Group: " + i);
		    			for (int j = 0; j < getGroupListing().getGroups()[i].getStudents().length; j++)
		    				listModel.addElement("#" + getGroupListing().getGroups()[i].getStudents()[j].getNumber() + " " + getGroupListing().getGroups()[i].getStudents()[j].getName());
		    		}
				}
				else {
					JOptionPane.showMessageDialog(null, "Please load class list");
				}
				
			}	
		});
		
		JButton btnEditPreferences = new JButton("Edit Preferences");
		btnEditPreferences.setBounds(10, 110, 130, 20);
		frmInstructorView.getContentPane().add(btnEditPreferences);
		btnEditPreferences.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!listModel.isEmpty())
					instructorPref.main(new String []{});
				else
					JOptionPane.showMessageDialog(null, "Please load class list");
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 10, 180, 200);
		frmInstructorView.getContentPane().add(scrollPane);
		
		list_1 = new JList(listModel);
		scrollPane.setViewportView(list_1);
		list_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		comboBox = new JComboBox(comboModel);
		comboBox.setBounds(340, 30, 120, 20);
		frmInstructorView.getContentPane().add(comboBox);
		
		JButton btnMove = new JButton("Move");
		btnMove.setBounds(360, 60, 80, 20);
		btnMove.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(list_1.getSelectedValue() != null){
	    			String selected = list_1.getSelectedValue().toString();
	    			if(selected.length() > 2) {
	    				String studentNumb = selected.substring(1, 3);
		    			if(!studentNumb.equals("ro")){
		    				int initialGroup = groupList.findStudent(studentNumb);
		    				int newGroup = comboBox.getSelectedIndex();
		    				groupList.moveStudent(studentNumb, initialGroup, newGroup);
		    				listModel.clear();
		    				rdbtnGroup.setSelected(true);
		    				for(int i = 0; i < getGroupListing().getGroups().length; i++){
		    					listModel.addElement(" ");
		    					listModel.addElement("Group: " + i);
		    					for (int j = 0; j < getGroupListing().getGroups()[i].getStudents().length; j++)
		    						listModel.addElement("#" + getGroupListing().getGroups()[i].getStudents()[j].getNumber() + " " + getGroupListing().getGroups()[i].getStudents()[j].getName());
		    				}
		    			}
		    			else{
			    			JOptionPane.showMessageDialog(null, "Please select a student from the list.");
		    			}
		    		}
	    			else{
		    			JOptionPane.showMessageDialog(null, "Please select a student from the list.");
	    			}
	    		}
	    		else{
	    			JOptionPane.showMessageDialog(null, "Please select a student from the list.");
	    		}
	    	}
		});
		frmInstructorView.getContentPane().add(btnMove);
		
		JLabel lblNewLabel = new JLabel("Move to?");
		lblNewLabel.setBounds(340, 10, 80, 15);
		frmInstructorView.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Empty Groups");
		btnNewButton.setBounds(340, 190, 120, 20);
		btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {

                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to empty the current group listing?","Warning",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                	groupList.clearGroups();
    	    		listModel.clear();
    	    		for(int i = 0; i < getGroupListing().getGroups().length; i++){
    	    			listModel.addElement(" ");
    	    			listModel.addElement("Group: " + i);
    	    			for (int j = 0; j < getGroupListing().getGroups()[i].getStudents().length; j++)
    	    				listModel.addElement("#" + getGroupListing().getGroups()[i].getStudents()[j].getNumber() + " " + getGroupListing().getGroups()[i].getStudents()[j].getName());
    	    		}
                }
	    	}
		});
		frmInstructorView.getContentPane().add(btnNewButton);
		
		rdbtnGroup = new JRadioButton("Group");
		rdbtnGroup.setBounds(150, 210, 80, 20);
		rdbtnGroup.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		listModel.clear();
	    		for(int i = 0; i < getGroupListing().getGroups().length; i++){
	    			listModel.addElement(" ");
	    			listModel.addElement("Group: " + i);
	    			for (int j = 0; j < getGroupListing().getGroups()[i].getStudents().length; j++)
	    				listModel.addElement("#" + getGroupListing().getGroups()[i].getStudents()[j].getNumber() + " " + getGroupListing().getGroups()[i].getStudents()[j].getName());
	    		}
	    	}
		});
		frmInstructorView.getContentPane().add(rdbtnGroup);
		
		rdbtnClass = new JRadioButton("Class");
		rdbtnClass.setSelected(true);
		rdbtnClass.setBounds(250, 210, 80, 20);
		rdbtnClass.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		listModel.clear();
	    		for(int i = 0; i < getGroupListing().getGroups().length; i++){
	    			for (int j = 0; j < getGroupListing().getGroups()[i].getStudents().length; j++)
	    				listModel.addElement("#" + getGroupListing().getGroups()[i].getStudents()[j].getNumber() + " " + getGroupListing().getGroups()[i].getStudents()[j].getName());
	    		}
	    	}
		});
		frmInstructorView.getContentPane().add(rdbtnClass);
	
		ButtonGroup viewer = new ButtonGroup();
		viewer.add(rdbtnGroup);
		viewer.add(rdbtnClass);
	}
	public void setGroupListing(groupListing groupList){
		this.groupList = groupList;
	}
	public static groupListing getGroupListing(){
		return groupList;
	}
}
