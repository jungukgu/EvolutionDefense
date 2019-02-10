package com.junGukGu.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelpPage extends JPanel {
	private JFrame mf;

	public HelpPage(JFrame mf) {
//		this.mf = mf;
		//핼프 페널
		JPanel helpPage = new JPanel();
		helpPage.setBounds(0,0,978,700);
		helpPage.setLayout(null);
		//배경
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("ev-Image/helpPage/helpScreen.PNG").getImage().getScaledInstance(978, 700, 0)));
		background.setBounds(0, 0, 978, 700);
		//나가기 버튼
		JLabel exit = new JLabel(new ImageIcon(new ImageIcon("ev-Image/helpPage/pageExit.png").getImage().getScaledInstance(170, 55, 0)));
		exit.setBounds(790, 615, 170, 55);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(mf, helpPage, new MainPage(mf));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				exit.setBounds(790, 615, 175, 60);	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 벗어났을 떄 (마우스 오버)
				exit.setBounds(790, 615, 170, 55);
			}
		});

		helpPage.add(exit);
		helpPage.add(background);
		helpPage.setComponentZOrder(background, 1);

		mf.add(helpPage);
	}
}
