package pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class studentPref extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentPref frame = new studentPref();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	static groupListing groupList;
	DefaultComboBoxModel comboModel1;
	DefaultComboBoxModel comboModel2;
	DefaultComboBoxModel comboModel3;
	public studentPref() {
		groupList = studentView.getGroupListing();
		
		comboModel1 = new DefaultComboBoxModel();
		comboModel2 = new DefaultComboBoxModel();
		comboModel3 = new DefaultComboBoxModel();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("Skills");
		tabbedPane.setBounds(0, 0, 434, 261);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Skills", null, panel, null);
		panel.setLayout(null);
		
		if (instructorView.getGroupListing().getPref().getSkills() != null){
			for (int i = 0; i < instructorView.getGroupListing().getPref().getSkills().length; i++){
				comboModel3.addElement(instructorView.getGroupListing().getPref().getSkills()[i]);
			}
		}
		JComboBox comboBox = new JComboBox(comboModel3);
		comboBox.setBounds(10, 25, 120, 20);
		panel.add(comboBox);
		
		SpinnerNumberModel spinLim= new SpinnerNumberModel(1.0, 1.0, 100.0, 1.0 );
		JSpinner spinner = new JSpinner(spinLim);
		spinner.setBounds(160, 25, 40, 20);
		panel.add(spinner);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(230, 25, 90, 20);
		panel.add(btnNewButton);
		
		JLabel lblSkill = new JLabel("Skill");
		lblSkill.setBounds(10, 10, 50, 15);
		panel.add(lblSkill);
		
		JLabel lblSkillLevel = new JLabel("Skill Level");
		lblSkillLevel.setBounds(160, 10, 80, 15);
		panel.add(lblSkillLevel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Group Preference", null, panel_1, null);
		panel_1.setLayout(null);
		
		for(int i = 0; i < groupList.getGroups().length; i++){
			for (int j = 0; j < groupList.getGroups()[i].getStudents().length; j++){
				comboModel1.addElement(getGroupListing().getGroups()[i].getStudents()[j].getNumber() + " " + getGroupListing().getGroups()[i].getStudents()[j].getName());
			}
		}
		JComboBox comboBox_1 = new JComboBox(comboModel1);
		comboBox_1.setBounds(10, 25, 120, 20);
		panel_1.add(comboBox_1);
		
		comboModel2.addElement("Yes");
		comboModel2.addElement("No");
		JComboBox comboBox_2 = new JComboBox(comboModel2);
		comboBox_2.setBounds(150, 25, 60, 20);
		panel_1.add(comboBox_2);
		
		JLabel lblClassmate = new JLabel("Classmate");
		lblClassmate.setBounds(10, 10, 80, 15);
		panel_1.add(lblClassmate);
		
		JLabel lblWorkWith = new JLabel("Work with?");
		lblWorkWith.setBounds(150, 10, 80, 15);
		panel_1.add(lblWorkWith);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(235, 25, 90, 20);
		panel_1.add(btnSubmit);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Schedule", null, panel_2, null);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 200, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Upload Schedule");
		btnNewButton_1.setBounds(10, 40, 150, 20);
		panel_2.add(btnNewButton_1);
		
		JButton btnFind = new JButton("Find");
		btnFind.setBounds(220, 10, 90, 20);
		panel_2.add(btnFind);
	}
	public void setGroupListing(groupListing groupList){
		this.groupList = groupList;
	}
	public static groupListing getGroupListing(){
		return groupList;
	}
}
