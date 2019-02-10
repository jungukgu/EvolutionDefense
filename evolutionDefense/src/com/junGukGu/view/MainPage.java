package com.junGukGu.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage extends JPanel{
	private JFrame mf;
	private JPanel mainPage;

	public MainPage(JFrame mf) {
		this.mf = mf;
		mainPage = this;

		this.setBounds(0,0,978,700);
		this.setLayout(null);

		//배경
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("ev-Image/mainPage/mainScreen.PNG").getImage().getScaledInstance(978, 700, 0)));
		background.setBounds(0, 0, 978, 700);

		//배경 아이콘
		JLabel hi = new JLabel(new ImageIcon(new ImageIcon("ev-Image/mainPage/hi.gif").getImage().getScaledInstance(300, 300, 0)));
		hi.setBounds(338, 220, 300, 300);
		JLabel hi1 = new JLabel(new ImageIcon(new ImageIcon("ev-Image/tower/1_tower1.gif").getImage().getScaledInstance(220, 220, 0)));
		hi1.setBounds(53, 290, 220, 220);
		JLabel hi2 = new JLabel(new ImageIcon(new ImageIcon("ev-Image/tower/1_tower2.gif").getImage().getScaledInstance(220, 220, 0)));
		hi2.setBounds(705, 290, 220, 220);


		//랭킹 버튼
		JLabel ranking = new JLabel(new ImageIcon(new ImageIcon("ev-Image/mainPage/rank.png").getImage().getScaledInstance(215, 70, 0)));
		ranking.setBounds(54, 567, 215, 70);
		ranking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(mf, mainPage, new RankPage(mf));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				ranking.setBounds(54, 567, 220, 75);
				//						ranking.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 벗어났을 떄 (마우스 오버)
				ranking.setBounds(54, 567, 215, 70);
				//						ranking.repaint();
			}
		});
		//스타트 버튼
		JLabel start = new JLabel(new ImageIcon(new ImageIcon("ev-Image/mainPage/gameStart.png").getImage().getScaledInstance(215, 70, 0)));
		start.setBounds(381, 567, 215, 70);
		start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(mf, mainPage, new GamePage(mf));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				start.setBounds(381, 567, 220, 75);
				//						start.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 벗어났을 떄 (마우스 오버)
				start.setBounds(381, 567, 215, 70);
				//						start.repaint();
			}
		});


		//도움말 버튼
		JLabel helf = new JLabel(new ImageIcon(new ImageIcon("ev-Image/mainPage/help.png").getImage().getScaledInstance(215, 70, 0)));
		helf.setBounds(706, 567, 215, 70);	
		helf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(mf, mainPage, new HelpPage(mf));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				helf.setBounds(706, 567, 220, 75);	
				//						helf.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 벗어났을 떄 (마우스 오버)
				helf.setBounds(706, 567, 215, 70);
				//						helf.repaint();
			}
		});

		this.add(background);
		this.add(hi);
		this.add(hi1);
		this.add(hi2);
		this.add(ranking);
		this.add(start);
		this.add(helf);
		this.setComponentZOrder(background, 6);
	}
}
