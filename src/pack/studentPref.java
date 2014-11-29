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

public class studentPref extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 450, 300);
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
		comboBox.setBounds(10, 85, 137, 20);
		panel.add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(199, 85, 29, 20);
		panel.add(spinner);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(296, 84, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblSkill = new JLabel("Skill");
		lblSkill.setBounds(51, 61, 46, 14);
		panel.add(lblSkill);
		
		JLabel lblSkillLevel = new JLabel("Skill Level");
		lblSkillLevel.setBounds(189, 60, 46, 14);
		panel.add(lblSkillLevel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Group Preference", null, panel_1, null);
		panel_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(23, 93, 112, 20);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(174, 93, 60, 20);
		panel_1.add(comboBox_2);
		
		JLabel lblClassmate = new JLabel("Classmate");
		lblClassmate.setBounds(52, 68, 60, 14);
		panel_1.add(lblClassmate);
		
		JLabel lblWorkWith = new JLabel("Work with?");
		lblWorkWith.setBounds(174, 68, 60, 14);
		panel_1.add(lblWorkWith);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(274, 92, 89, 23);
		panel_1.add(btnSubmit);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Schedule", null, panel_2, null);
	}
}
