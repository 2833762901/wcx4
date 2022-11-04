package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Service.Service;
import Service.ServiceImpl.ServiceImpl;
import demoMain.User;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JTextField userPhone;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterJFrame frame = new RegisterJFrame();
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
	public RegisterJFrame() {
		setDefaultCloseOperation(RegisterJFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("\u7528\u6237\u6CE8\u518C");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		
		JLabel label_2 = new JLabel("\u624B\u673A\u53F7\uFF1A");
		
		JLabel label_3 = new JLabel("\u5BC6  \u7801\uFF1A");
		
		
		userName = new JTextField();
		userName.setColumns(10);
		
		userPhone = new JTextField();
		userPhone.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		this.setLocationRelativeTo(null);
		
		JButton button = new JButton("\u6CE8\u518C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enroll(e);
			}
		});
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new LoginJFrame().setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(192, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(181))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(134)
					.addComponent(button)
					.addGap(83)
					.addComponent(button_1)
					.addContainerGap(143, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(86, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_1)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_2)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(87)
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(password, Alignment.LEADING)
						.addComponent(userName)
						.addComponent(userPhone, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
					.addGap(142))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addComponent(label_1)
							.addGap(21)
							.addComponent(label_2)
							.addGap(16)
							.addComponent(label_3))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(userName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(userPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(48)
							.addComponent(button_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(50)
							.addComponent(button)))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void enroll(ActionEvent e) {
		// TODO Auto-generated method stub
		String username=userName.getText().toString();
		String userphone=userPhone.getText().toString();
		String userword=password.getText().toString();
		User user=new User(username,userphone,userword);
		Service service=new ServiceImpl();
		if(service.addUser(user)){
			JOptionPane.showMessageDialog(this,"×¢²á³É¹¦!");
			dispose();
			new LoginJFrame().setVisible(true);
		}else{
			JOptionPane.showMessageDialog(this,"ÄúÒÑ×¢²á!");
			return;
		}
		
		
		
		
	}

}
