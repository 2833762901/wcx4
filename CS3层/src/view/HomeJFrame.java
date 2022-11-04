package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class HomeJFrame extends JFrame {

	private JPanel contentPane;
	private JDesktopPane table=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeJFrame frame = new HomeJFrame();
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
	public HomeJFrame() {
		setTitle("\u901A\u8BAF\u5F55\u4E3B\u9875");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 521);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u9009\u9879");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u67E5\u8BE2\u6240\u6709\u8054\u7CFB\u4EBA");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListJFrame listJFrame=new ListJFrame();
				listJFrame.setVisible(true);
				table.add(listJFrame);
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u65B0\u589E\u8054\u7CFB\u4EBA");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddJInternalFrame addJInternalFrame=new AddJInternalFrame();
				addJInternalFrame.setVisible(true);
				table.add(addJInternalFrame);
			}
		});
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u9000\u51FA");
		menuItem_2.addActionListener(new ActionListener() {
			//退出功能
			public void actionPerformed(ActionEvent arg0) {
				int result=JOptionPane.showConfirmDialog(null, "是否退出通讯录");
				if(result==0){
					dispose();
				}
				
			}
		});
		menu.add(menuItem_2);
		
		JMenu menu_1 = new JMenu("\u5E2E\u52A9");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_3 = new JMenuItem("\u751F\u6210\u5E2E\u52A9\u6587\u6863");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				helpDoc(e);
			}
		});
		menu_1.add(menuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		table = new JDesktopPane();
		table.setBackground(SystemColor.controlHighlight);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 1907, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 971, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		this.setLocationRelativeTo(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	protected void helpDoc(ActionEvent e) {
		// TODO Auto-generated method stub
		StringBuffer sbf=new StringBuffer();
		sbf.append("---------帮助文档----------\n");
		sbf.append("1、使用通讯录前需进行注册!\n");
		sbf.append("2、联系人管理界面可以进行查询删除修改操作!\n");
		sbf.append("3、使用新增联系人界面可以新增联系人!\n");
		sbf.append("4、使用结束后请点击选项中的安全退出进行退出!\n");
		FileOutputStream fos=null;
		File file=new File("帮助文档.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
		try {
			fos=new FileOutputStream(file);
			byte[] bytes=new byte[1024];
            fos.write(String.valueOf(sbf).getBytes());
            fos.flush();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
	}
}

