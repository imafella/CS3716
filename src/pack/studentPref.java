package pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
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
	public studentPref() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 25, 120, 20);
		panel.add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(160, 25, 30, 20);
		panel.add(spinner);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(230, 25, 90, 20);
		panel.add(btnNewButton);
		
		JLabel lblSkill = new JLabel("Skill");
		lblSkill.setBounds(10, 10, 50, 15);
		panel.add(lblSkill);
		
		JLabel lblSkillLevel = new JLabel("Skill Level");
		lblSkillLevel.setBounds(160, 10, 50, 15);
		panel.add(lblSkillLevel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Group Preference", null, panel_1, null);
		panel_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 25, 120, 20);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(150, 25, 60, 20);
		panel_1.add(comboBox_2);
		
		JLabel lblClassmate = new JLabel("Classmate");
		lblClassmate.setBounds(10, 10, 60, 15);
		panel_1.add(lblClassmate);
		
		JLabel lblWorkWith = new JLabel("Work with?");
		lblWorkWith.setBounds(150, 10, 60, 14);
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
}
