package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class studentView {

	private JFrame frmStudentView;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnSubmit;
	private JButton btnReset;
	private JButton btnCancel;

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
	private void initialize() {
		frmStudentView = new JFrame();
		frmStudentView.setTitle("Student View");
		frmStudentView.setBounds(100, 100, 450, 445);
		frmStudentView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentView.getContentPane().setLayout(null);
		
		JLabel lblInstructorId = new JLabel("Instructor ID");
		lblInstructorId.setBounds(53, 61, 71, 14);
		frmStudentView.getContentPane().add(lblInstructorId);
		
		textField = new JTextField();
		textField.setBounds(38, 86, 99, 20);
		frmStudentView.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCourseid = new JLabel("CourseID");
		lblCourseid.setBounds(53, 133, 55, 14);
		frmStudentView.getContentPane().add(lblCourseid);
		
		textField_1 = new JTextField();
		textField_1.setBounds(38, 168, 99, 20);
		frmStudentView.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setBounds(53, 219, 71, 14);
		frmStudentView.getContentPane().add(lblStudentId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(38, 244, 99, 20);
		frmStudentView.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGrouping = new JLabel("Grouping");
		lblGrouping.setBounds(278, 61, 46, 14);
		frmStudentView.getContentPane().add(lblGrouping);
		
		textField_3 = new JTextField();
		textField_3.setBounds(209, 86, 196, 226);
		frmStudentView.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnEditStudentParameters = new JButton("Edit Student Parameters");
		btnEditStudentParameters.setBounds(20, 289, 166, 23);
		frmStudentView.getContentPane().add(btnEditStudentParameters);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(173, 344, 89, 23);
		frmStudentView.getContentPane().add(btnSubmit);
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(60, 344, 89, 23);
		frmStudentView.getContentPane().add(btnReset);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(294, 344, 89, 23);
		frmStudentView.getContentPane().add(btnCancel);
	}

}
