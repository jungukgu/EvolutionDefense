package com.junGukGu.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiddlePanel extends JPanel{
	private JFrame mf;
	private JPanel middlePanel;
	
	public MiddlePanel(JFrame mf) {
		this.mf = mf;
		middlePanel = this;

		this.setBounds(0, 68, 978, 509);
		this.setLayout(null);

		
		
		//�ߴ� ȭ��
		JLabel middle = new JLabel(new ImageIcon(
				new ImageIcon("ev-Image/gamePage/middlePanel.png").
				getImage().getScaledInstance(978, 509, 0)));
		middle.setBounds(0,0, 978, 509);
//		this.add(middle);
		
		//�׸��� ������ ���� ��ư���� �ϰڴ� �̸��̾�
		for(int i = 1; i < 10; i++) {
			
			for(int j = 0; j < 25; j++) {
				
				JButton btn = new JButton();
				btn.setBounds(39*j,40+(40*i), 39, 38);
				//��ư �׵θ� �����ϰ� �ϱ�
				btn.setBorderPainted(true);
				//��ư �����ϰ� �ϱ�
				btn.setContentAreaFilled(false);
				btn.setOpaque(false);
				btn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println(getX() + " " + getY());
					
						JButton btn2 = new JButton(new ImageIcon
								( new ImageIcon("ev-Image/tower/1_tower1.gif").
										getImage().getScaledInstance(80, 80, 0)));
						btn2.setBounds(39,40+(40),80,80);
						middlePanel.add(btn2);
//						btn.setOpaque(true);
						
					}
					
					public void mouseClicked() {
						
					}
				});
				this.add(btn);
			}
			
		}//
		this.add(middle);
	}
	
}












