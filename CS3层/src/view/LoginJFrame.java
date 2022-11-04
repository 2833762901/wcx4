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
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField userPhone;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginJFrame frame = new LoginJFrame();
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
	public LoginJFrame() {
		setTitle("\u767B\u5F55\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("\u767B\u5F55\u754C\u9762");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("\u901A\u8BAF\u5F55\u7528\u6237\u767B\u5F55\u7BA1\u7406\u7CFB\u7EDF");
		
		JLabel label_1 = new JLabel("\u624B\u673A\u53F7:");
		
		JLabel label_2 = new JLabel("\u5BC6  \u7801\uFF1A");
		
		userPhone = new JTextField();
		userPhone.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		this.setLocationRelativeTo(null);
		
		JButton button = new JButton("\u767B  \u5F55");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//登录事件处理
				loginAction(arg0);
			}
		});
		
		JButton button_1 = new JButton("\u6CE8  \u518C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new RegisterJFrame().setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(148, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(109))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(89)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addComponent(label_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(password)
						.addComponent(userPhone, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
					.addContainerGap(90, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(100)
					.addComponent(button)
					.addGap(65)
					.addComponent(button_1)
					.addContainerGap(99, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addComponent(label)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(userPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void loginAction(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String userphone=userPhone.getText().toString();
		String userword=password.getText().toString();
		System.out.println(userphone);
		System.out.println(userword);
		if(userphone==null||"".equals(userphone)){
			JOptionPane.showMessageDialog(this,"手机号不能为空!");
			return; 
		}
		if(userword==null||"".equals(userword)){
			JOptionPane.showMessageDialog(this,"密码不能为空!");
			return; 
		}
		User user=new User(userphone,userword);
		Service service=new ServiceImpl();
		if(service.selectUser(user)){
			service.baocun(user);
			dispose();
			new HomeJFrame().setVisible(true);
		}else{
			JOptionPane.showMessageDialog(this,"您输入的手机号或者密码有误!");
			return;
		}
	}
}

