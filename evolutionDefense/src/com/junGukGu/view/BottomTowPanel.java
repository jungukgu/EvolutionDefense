package com.junGukGu.view;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BottomTowPanel extends JPanel{
	private JFrame mf;
	private JPanel towPanel;
	
	public BottomTowPanel(JFrame mf, JPanel bottomPanel) {
		this.mf = mf;
		this.towPanel = this;
		this.setLayout(null);
		this.setBounds(0, 0, 978, 129);
		
		int startHeight = 31; 
		int btnHeight = 80;
		int btnWidth = 145;

		JLabel bottomBg = new JLabel(
				new ImageIcon(
						new ImageIcon("ev-Image/gamePage/bottomTowPanel.png").getImage().getScaledInstance(978, 120, 0)));
		bottomBg.setBounds(0, 0, 978, 123);
		
		JLabel comTow1 = new JLabel(
				new ImageIcon(
						new ImageIcon("ev-Image/tower/2_tower1.gif").getImage().getScaledInstance(btnWidth/2, btnHeight, 0)));
		comTow1.setBounds(13, startHeight, btnWidth/2, btnHeight);
		
		JLabel comTow2 = new JLabel(
				new ImageIcon(
						new ImageIcon("ev-Image/tower/2_tower2.gif").getImage().getScaledInstance(btnWidth/2, btnHeight, 0)));
		comTow2.setBounds(84, startHeight, btnWidth/2, btnHeight);
		
		
		// 판매 설정 
		// 나중에 타워 가격 가져오기 
		JLabel price = new JLabel("300원");
		price.setBounds(192, startHeight, btnWidth, btnHeight);
		// 폰트 사이즈 지정
		price.setFont(new Font("Times", Font.BOLD, 40));
		
		JLabel info = new JLabel();
		// info내용 정하기 
		
		// 돌아가기 버튼
		JButton returnDef = new JButton(
				new ImageIcon(
						new ImageIcon("ev-Image/gamePage/return.png").getImage().getScaledInstance(btnWidth, btnHeight + 15, 0)));
		returnDef.setBounds(822, 12, btnWidth + 2, btnHeight + 17);
		returnDef.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(bottomPanel, towPanel, new BottomDefPanel(mf, bottomPanel));
				
			}
		});
		
		this.add(comTow1);
		this.add(comTow2);		
		this.add(price);
		this.add(info);
		this.add(returnDef);
		
		this.add(bottomBg);
	}
}
