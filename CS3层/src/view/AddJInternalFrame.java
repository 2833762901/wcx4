package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import Service.Service;
import Service.ServiceImpl.ServiceImpl;
import demoMain.Linkman;
import demoMain.User;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddJInternalFrame extends JInternalFrame {
	private JTextField lkmName;
	private JTextField lkmMobile;
	private JTextField lkmAddr;
	private JTextField lkmGroup;
	private JTextField lkmRemark;
	private JTextField lkmEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddJInternalFrame frame = new AddJInternalFrame();
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
	public AddJInternalFrame() {
		setTitle("\u6DFB\u52A0\u8054\u7CFB\u4EBA");
		setClosable(true);
		setIconifiable(true);
		setBounds(100, 100, 713, 599);
		
		JLabel label = new JLabel("\u8054\u7CFB\u4EBA\u59D3\u540D\uFF1A");
		
		lkmName = new JTextField();
		lkmName.setColumns(10);
		
		JLabel label_1 = new JLabel("\u8054\u7CFB\u4EBA\u7535\u8BDD\uFF1A");
		
		lkmMobile = new JTextField();
		lkmMobile.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8054\u7CFB\u4EBA\u90AE\u7BB1\uFF1A");
		
		JLabel label_3 = new JLabel("\u8054\u7CFB\u4EBA\u5730\u5740\uFF1A");
		
		lkmAddr = new JTextField();
		lkmAddr.setColumns(10);
		
		JLabel label_4 = new JLabel("\u8054\u7CFB\u4EBA\u5206\u7EC4\uFF1A");
		
		lkmGroup = new JTextField();
		lkmGroup.setColumns(10);
		
		JLabel label_5 = new JLabel("\u8054\u7CFB\u4EBA\u6CE8\u5907\uFF1A");
		
		lkmRemark = new JTextField();
		lkmRemark.setColumns(10);
		
		JButton button = new JButton("\u4FDD\u5B58");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//添加联系人
				AddLinkman(e);
			}
		});
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cleanLinkman(arg0);
			}
		});
		
		lkmEmail = new JTextField();
		lkmEmail.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(105)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmGroup))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmEmail, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmName, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
					.addGap(69)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmRemark, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmMobile, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmAddr)))
					.addGap(100))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(230)
					.addComponent(button)
					.addGap(98)
					.addComponent(button_1)
					.addContainerGap(193, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(112)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(lkmName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(lkmMobile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(label_3)
						.addComponent(lkmAddr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lkmEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(lkmGroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5)
						.addComponent(lkmRemark, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(81)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(201, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

	protected void cleanLinkman(ActionEvent arg0) {
		// TODO Auto-generated method stub
		lkmName.setText("");
		lkmMobile.setText("");
		lkmEmail.setText("");
		lkmGroup.setText("");
		lkmAddr.setText("");
		lkmRemark.setText("");
		
		
	}

	protected void AddLinkman(ActionEvent e) {
		// TODO Auto-generated method stub
		String lkmname=lkmName.getText().toString();
		String lkmmobile=lkmMobile.getText().toString();
		String lkmemail=lkmEmail.getText().toString();
		String lkmgroup=lkmGroup.getText().toString();
		String lkmaddr=lkmAddr.getText().toString();
		String lkmremark=lkmRemark.getText().toString();
		if(lkmmobile==null||"".equals(lkmmobile)){
			JOptionPane.showMessageDialog(this,"联系人手机号不可以为空!");
			return; 
		}
		Linkman linkman=new Linkman(lkmname,lkmmobile,lkmemail,lkmgroup,lkmaddr,lkmremark);
		Service service=new ServiceImpl();
		if(service.addLinkman(linkman)){
			JOptionPane.showMessageDialog(this,"添加联系人成功!");
			dispose();
		}else{
			JOptionPane.showMessageDialog(this,"该联系人已存在，请勿重复添加!");
		}
	}

}

