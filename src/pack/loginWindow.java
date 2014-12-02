package pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.event.*;

public class loginWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginWindow frame = new loginWindow();
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
	ButtonGroup btnGroup;
	
	public loginWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BRAT");
		lblNewLabel.setFont(new Font("MV Boli", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 10, 100, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SORTER");
		lblNewLabel_1.setFont(new Font("MV Boli", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(50, 40, 140, 40);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnInstructor = new JRadioButton("Instructor");
		rdbtnInstructor.setSelected(true);
		rdbtnInstructor.setBounds(10, 80, 100, 20);
		rdbtnInstructor.setActionCommand("Instructor");
		contentPane.add(rdbtnInstructor);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.setBounds(10, 100, 100, 20);
		rdbtnStudent.setActionCommand("Student");
		contentPane.add(rdbtnStudent);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(80, 130, 100, 20);
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (getBtnGroup().getSelection().getActionCommand().equals("Instructor")){
	    			instructorView.main(new String []{});
	    		}
	    		else{
	    			if(instructorView.getGroupListing() != null)
	    				studentView.main(new String []{});
	    			else
	    				JOptionPane.showMessageDialog(null, "No available projects.");
	    		}
	    	}
	    });
		contentPane.add(btnNewButton);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnInstructor);
		btnGroup.add(rdbtnStudent);
	}
	public ButtonGroup getBtnGroup(){
		return btnGroup;
	}
}
