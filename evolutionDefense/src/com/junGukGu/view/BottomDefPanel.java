package com.junGukGu.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Panel 생성만한다.
public class BottomDefPanel extends JPanel{	
	private JFrame mf;
	private JPanel defPanel;

	public BottomDefPanel() {}

	public BottomDefPanel(JFrame mf, JPanel bottomPanel) {
		this.defPanel = this;
		this.mf = mf;
		this.setBounds(0, 0, 978, 123);
		this.setLayout(null);


		int startHeight = 31; 
		int btnHeight = 80;
		int btnWidth = 145;

		// 배경이미지 삽입
		JLabel bottomBg = new JLabel(new ImageIcon(new ImageIcon("ev-Image/gamePage/bottomDefPanel.png").getImage().getScaledInstance(978, 120, 0)));
		bottomBg.setBounds(0, 0, 978, 120);


		// 버튼 랜덤타워 생성
		JButton createTow = new JButton(new ImageIcon(new ImageIcon("ev-Image/tower/tower.gif").getImage().getScaledInstance(btnWidth, btnHeight, 0)));
		createTow.setBounds(11, startHeight, btnWidth, btnHeight);
		createTow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 랜덤패널로 바꾸기 
				ChangePanel.changePanel(bottomPanel, defPanel, new BottomTowPanel(mf, bottomPanel));
			}
		});
		

		// 보스 생성버튼 
		JButton boss1 = new JButton(new ImageIcon(new ImageIcon("ev-Image/boss/boss_1.gif").getImage().getScaledInstance(btnWidth, btnHeight, 0)));
		boss1.setBounds(172, startHeight , btnWidth, btnHeight);

		JButton boss2 = new JButton(new ImageIcon(new ImageIcon("ev-Image/boss/boss_2.gif").getImage().getScaledInstance(btnWidth - 10, btnHeight - 10, 0)));
		boss2.setBounds(335, startHeight, btnWidth, btnHeight);

		JButton boss3 = new JButton(new ImageIcon(new ImageIcon("ev-Image/boss/boss_3.gif").getImage().getScaledInstance(btnWidth + 50, btnHeight + 50, 0)));
		//	                   new ImageIcon("ev-Image/boss/boss_3.gif").getImage().getScaledInstance(btnWidth, btnHeight, 0)));
		boss3.setBounds(497, startHeight, btnWidth, btnHeight);

		// 랜덤박스 버튼
		JButton box = new JButton(new ImageIcon(new ImageIcon("ev-Image/randomBox/box_1.gif").getImage().getScaledInstance(btnHeight, btnHeight - 10, 0)));
		box.setBounds(660, startHeight, btnWidth, btnHeight);
		box.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 랜덤패널로 바꾸기 
				ChangePanel.changePanel(bottomPanel, defPanel, new BottomRanPanel(mf, bottomPanel));
			}
		});

		
		// start버튼
		JButton startBtn = new JButton(new ImageIcon(new ImageIcon("ev-Image/gamePage/startPlay.png")
						.getImage().getScaledInstance(btnWidth, btnHeight + 15, 0)));
		startBtn.setBounds(822, 12, btnWidth+2, btnHeight + 17);


		this.add(createTow);
		this.add(boss1);
		this.add(boss2);
		this.add(boss3);
		this.add(box);
		this.add(startBtn);
		this.add(bottomBg);
	}
}
