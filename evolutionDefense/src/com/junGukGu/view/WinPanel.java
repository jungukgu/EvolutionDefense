package com.junGukGu.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WinPanel extends JPanel {
			private JFrame mf;
			private JPanel winPanel;
			
		public WinPanel(JFrame mf, JPanel gamePanel) {
			this.mf = mf;
			winPanel = this;
			this.setBounds(281, 173, 415, 300);
			this.setLayout(null);
		
			JLabel winPage = new JLabel(new ImageIcon(new ImageIcon("ev-Image/gamePage/winPanel.PNG").getImage().getScaledInstance(415, 300, 0)));
			winPage.setBounds(0, 0 ,415, 300);
			
			JLabel sentence = new JLabel("축하합니다. 자바를 정복했습니다!");
			sentence.setLocation(120, 107);
			sentence.setSize(250, 50);
			
			
			JTextField name = new JTextField(20);
			name.setLocation(155, 227);
			name.setSize(100, 25);
			
			JButton registration = new JButton(new ImageIcon(new ImageIcon("ev-Image/gamePage/enroll.png").getImage().getScaledInstance(98, 35, 0)));
			registration.setBounds(275, 221, 100, 37);
			registration.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = "이름 : " + name.getText() + "\n";
				}
			});
			registration.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					ChangePanel.changePanel(mf, gamePanel, new RankPage(mf));
					mf.repaint();
				}
			});
			
			
			
			
			this.add(sentence);
			this.add(name);
			this.add(registration);
			this.add(winPage);
			mf.repaint();
		}
		
	

}
