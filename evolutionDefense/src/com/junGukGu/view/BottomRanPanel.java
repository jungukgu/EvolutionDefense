package com.junGukGu.view;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BottomRanPanel extends JPanel{
	private MainFrame mf;
	private BottomRanPanel ranPanel;
	
	
	public BottomRanPanel(JFrame mf, JPanel bottomPanel) {
		this.ranPanel = this;
		
		int startHeight = 31; 
		int btnHeight = 80;
		int btnWidth = 200;
		
		this.setBounds(0, 0, 978, 129);
		this.setLayout(null);
		
		/*JLabel ranBottom = new JLabel (new ImageIcon("ev-image/gamepage/bottomRanPanel.png"))/getScaledInstance(978, 123, 0));*/
		JLabel ranBottom = new JLabel(new ImageIcon(new ImageIcon("ev-Image/gamePage/bottomRanPanel.png").getImage().getScaledInstance(978, 123, 0)));
		ranBottom.setBounds(0, 0, 978, 123);	
		
		
		JButton jb1 = new JButton(new ImageIcon(new ImageIcon("ev-Image/randomBox/box_1.gif").getImage().getScaledInstance(btnWidth/2, btnHeight, 0)));
		jb1.setBounds(12, startHeight, btnWidth + 51, btnHeight + 5);
		
		
		JButton jb2 = new JButton(new ImageIcon(new ImageIcon("ev-Image/randomBox/box_2.gif").getImage().getScaledInstance(btnWidth/2, btnHeight, 0)));
		jb2.setBounds(283, startHeight, btnWidth + 51, btnHeight + 5);
		
		JButton jb3 = new JButton(new ImageIcon(new ImageIcon("ev-Image/randomBox/box_3.gif").getImage().getScaledInstance(btnWidth/2, btnHeight, 0)));
		jb3.setBounds(552, startHeight, btnWidth + 52, btnHeight + 5);
		

		JButton returnDef = new JButton(new ImageIcon(new ImageIcon("ev-Image/gamePage/return.png").getImage().getScaledInstance(btnWidth-55, btnHeight+15, 0)));
		returnDef.setBounds(821, startHeight -18, btnWidth -53, btnHeight + 17);
		returnDef.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(bottomPanel, ranPanel, new BottomDefPanel(mf, bottomPanel));
				
			}
		});
	
		this.add(jb1);
		this.add(jb2);
		
		this.add(jb3);
		this.add(returnDef);
		this.add(ranBottom);
	}


}









