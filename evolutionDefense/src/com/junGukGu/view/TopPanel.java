package com.junGukGu.view;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel{
	private JFrame mf;
	private JPanel topPanel;
	
	public TopPanel(JFrame mf){
		this.mf = mf;
		topPanel = this;
		this.setBounds(0, 0, 978, 68);
//		this.setSize(978, 68);
		this.setLayout(null);
		//상단바 배경
		JLabel top = new JLabel(new ImageIcon(new ImageIcon("ev-Image/gamePage/topPanel.png").getImage().getScaledInstance(978, 67, 0)));
		top.setBounds(0, 0, 978, 68);
		
		JLabel life = new JLabel(" 777");
		life.setFont(new Font("Sanscerif", Font.BOLD, 20));
		life.setBounds(50,18,100,30);
		JLabel money = new JLabel(" 888");
		money.setFont(new Font("Sanscerif", Font.BOLD, 20));
		money.setBounds(212,18,100,30);
		JLabel cash = new JLabel(" 999");
		cash.setFont(new Font("Sanscerif", Font.BOLD, 20));
		cash.setBounds(383,18,100,30);
		JLabel score = new JLabel(" 9999");
		score.setFont(new Font("Sanscerif", Font.BOLD, 20));
		score.setBounds(550,18,100,30);
		JLabel stage = new JLabel("  10");
		stage.setFont(new Font("Sanscerif", Font.BOLD, 20));
		stage.setBounds(710,18,100,30);
		
		this.add(top);
		this.add(life);
		this.add(money);
		this.add(cash);
		this.add(score);
		this.add(stage);
		this.setComponentZOrder(top, 5);
		
//		mf.add(topPanel);
	}
}
