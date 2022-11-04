package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Service.Service;
import Service.ServiceImpl.ServiceImpl;
import demoMain.Linkman;

import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JList;

public class ListJFrame extends JInternalFrame {
	private JTextField name;
	private JTable listTable;
	private JTextField lkmName;
	private JTextField lkmMobile;
	private JTextField lkmEmail;
	private JTextField lkmAddr;
	private JTextField lkmGroup;
	private JTextField lkmRemark;
	private JTextField lkmId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListJFrame frame = new ListJFrame();
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
	public ListJFrame() {
		setTitle("\u8054\u7CFB\u4EBA\u7BA1\u7406\u754C\u9762");
		setClosable(true);
		setIconifiable(true);
		setBounds(100, 100, 852, 864);
		
		JLabel label = new JLabel("\u8054\u7CFB\u4EBA\u67E5\u8BE2\uFF1A");
		
		name = new JTextField();
		name.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obscureLinkman(e);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton button_1 = new JButton("\u4FEE\u6539");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateLinkman(e);
			}
		});
		
		JButton button_2 = new JButton("\u5220\u9664");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteLinkman(e);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u8054\u7CFB\u4EBA\u8BE6\u7EC6\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(286)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(name, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(button)
					.addContainerGap(236, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(102, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 637, GroupLayout.PREFERRED_SIZE))
					.addGap(79))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(286)
					.addComponent(button_1)
					.addGap(170)
					.addComponent(button_2)
					.addContainerGap(254, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1)
						.addComponent(button_2))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		
		JLabel label_1 = new JLabel("\u8054\u7CFB\u4EBA\u59D3\u540D\uFF1A");
		
		lkmName = new JTextField();
		lkmName.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8054\u7CFB\u4EBA\u7535\u8BDD\uFF1A");
		
		lkmMobile = new JTextField();
		lkmMobile.setColumns(10);
		
		JLabel label_3 = new JLabel("\u8054\u7CFB\u4EBA\u90AE\u7BB1\uFF1A");
		
		lkmEmail = new JTextField();
		lkmEmail.setColumns(10);
		
		JLabel label_4 = new JLabel("\u8054\u7CFB\u4EBA\u5730\u5740\uFF1A");
		
		lkmAddr = new JTextField();
		lkmAddr.setColumns(10);
		
		JLabel label_5 = new JLabel("\u8054\u7CFB\u4EBA\u5206\u7EC4\uFF1A");
		
		lkmGroup = new JTextField();
		lkmGroup.setColumns(10);
		
		JLabel label_6 = new JLabel("\u8054\u7CFB\u4EBA\u6CE8\u5907\uFF1A");
		
		lkmRemark = new JTextField();
		lkmRemark.setColumns(10);
		
		JLabel label_7 = new JLabel("\u7F16\u53F7\uFF1A");
		
		lkmId = new JTextField();
		lkmId.setEnabled(false);
		lkmId.setEditable(false);
		lkmId.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(58)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmGroup))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmEmail))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(label_7)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lkmId, 0, 0, Short.MAX_VALUE))
								.addComponent(label_1, Alignment.LEADING))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmName, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
					.addGap(80)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmMobile, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmAddr))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_6)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lkmRemark)))
					.addContainerGap(99, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_7)
						.addComponent(lkmId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(lkmName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(lkmMobile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(lkmEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4)
						.addComponent(lkmAddr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(lkmGroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6)
						.addComponent(lkmRemark, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		listTable = new JTable();
		listTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				SelectLinkman(arg0);
				
			}
		});
		listTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7F16\u53F7", "\u59D3\u540D", "\u7535\u8BDD", "\u90AE\u7BB1", "\u5730\u5740", "\u5206\u7EC4", "\u6CE8\u5907"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(listTable);
		getContentPane().setLayout(groupLayout);
		this.fillTable(new Linkman());

	}

	protected void deleteLinkman(ActionEvent e) {
		// TODO Auto-generated method stub
		String lkmid=lkmId.getText();
		Linkman linkman=new Linkman(Integer.parseInt(lkmid));
		int result=JOptionPane.showConfirmDialog(null, "是否删除该联系人？");
		Service service=new ServiceImpl();
		if(result==0){
			if(service.deleteLinkman(linkman)){
				JOptionPane.showMessageDialog(this,"删除成功!");
			}else{
				JOptionPane.showMessageDialog(this,"删除失败!");
			}
			this.fillTable(new Linkman());
		}
	}

	protected void updateLinkman(ActionEvent e) {
		// TODO Auto-generated method stub
		String lkmid=lkmId.getText();
		String lkmname=lkmName.getText();
		String lkmmobile=lkmMobile.getText();
		String lkmemail=lkmEmail.getText();
		String lkmaddr=lkmAddr.getText();
		String lkmgroup=lkmGroup.getText();
		String lkmremark=lkmRemark.getText();
		Linkman linkman=new Linkman(Integer.parseInt(lkmid),lkmname,lkmmobile,lkmemail,lkmaddr,lkmgroup,lkmremark);
		Service service=new ServiceImpl();
		if(service.updateLinkman(linkman)){
			JOptionPane.showMessageDialog(this,"修改成功!");
		}else{
			JOptionPane.showMessageDialog(this,"修改失败!");
		}
		this.fillTable(new Linkman());
	}

	protected void SelectLinkman(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int tableRow=listTable.getSelectedRow();
		lkmId.setText(""+listTable.getValueAt(tableRow, 0));
		lkmName.setText((String)listTable.getValueAt(tableRow, 1));
		lkmMobile.setText((String)listTable.getValueAt(tableRow, 2));
		lkmEmail.setText((String)listTable.getValueAt(tableRow, 3));
		lkmAddr	.setText((String)listTable.getValueAt(tableRow, 4));
		lkmGroup.setText((String)listTable.getValueAt(tableRow, 5));
		lkmRemark.setText((String)listTable.getValueAt(tableRow, 6));
	}

	protected void obscureLinkman(ActionEvent e) {
		// TODO Auto-generated method stub
		String lkmname=this.name.getText();
		this.fillTable(new Linkman(lkmname));
		
	}
	private void fillTable(Linkman linkman){
		DefaultTableModel dtm=(DefaultTableModel)listTable.getModel();
		dtm.setRowCount(0);
		Service service=new ServiceImpl();
		List<Linkman> listlkm=service.listLinkmans(linkman);
		if(listlkm!=null){
			for(int i=0;i<listlkm.size();i++){
				Vector<Comparable> v=new Vector();
				v.add(listlkm.get(i).getLkmId());
				v.add(listlkm.get(i).getLkmName());
				v.add(listlkm.get(i).getLkmMobile());
				v.add(listlkm.get(i).getLkmEmail());
				v.add(listlkm.get(i).getLkmAddr());
				v.add(listlkm.get(i).getLkmGroup());
				v.add(listlkm.get(i).getLkmRemark());
				dtm.addRow(v);
			}
		}
	}
}

