package com.junGukGu.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RankPage extends JPanel{
	private JFrame mf;
	
	public RankPage(JFrame mf) {
		//��ũ�г�
		JPanel rankPage = new JPanel();
		rankPage.setBounds(0,0,978,700);
		rankPage.setLayout(null);
		//���
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("ev-Image/rankPage/rankScreen.PNG").getImage().getScaledInstance(978, 700, 0)));
		background.setBounds(0, 0, 978, 700);
		//������ ��ư
		JLabel exit = new JLabel(new ImageIcon(new ImageIcon("ev-Image/helpPage/pageExit.png").getImage().getScaledInstance(170, 55, 0)));
		exit.setBounds(790, 615, 170, 55);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(mf, rankPage, new MainPage(mf));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				exit.setBounds(790, 615, 175, 60);	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// ���콺�� ����� �� (���콺 ����)
				exit.setBounds(790, 615, 170, 55);
			}
		});
		
		rankPage.add(background);
		rankPage.add(exit);
		rankPage.setComponentZOrder(background, 1);
		
		mf.add(rankPage);
	}
}
