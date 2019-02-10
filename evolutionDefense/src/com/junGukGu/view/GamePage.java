package com.junGukGu.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePage extends JPanel {
	private JFrame mf;
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel bottomPanel;
	private JPanel resultPanel;

	public GamePage(JFrame mf) {
		JPanel gamePanel = new JPanel();
		gamePanel.setBounds(0,0,978,700);
		gamePanel.setLayout(null);

		//exit
		JButton exit = new JButton(new ImageIcon(new ImageIcon("ev-Image/gamePage/exit.png").getImage().getScaledInstance(150, 50, 0)));
		exit.setBounds(820, 7, 152, 52);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(mf, gamePanel, new MainPage(mf));
			}
		});

		//win 임시 버튼
		JLabel win = new JLabel("WIN");
		win.setBounds(400,300,100,50);
		win.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultPanel = new WinPanel(mf, gamePanel);
				gamePanel.add(resultPanel);
				gamePanel.setComponentZOrder(resultPanel, 1);
				mf.repaint();
			}
		});
		//lose 임시 버튼
		JLabel lose = new JLabel("Lose");
		lose.setBounds(400,350,100,50);
		lose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultPanel = new LosePanel(mf, gamePanel);
				gamePanel.add(resultPanel);
				gamePanel.setComponentZOrder(resultPanel, 1);
				mf.repaint();
			}
		});

		gamePanel.add(exit);
		gamePanel.add(win);
		gamePanel.add(lose);

		topPanel = new TopPanel(mf);
		middlePanel = new MiddlePanel(mf);
		bottomPanel = new BottomPanel(mf);

		gamePanel.add(topPanel);
		gamePanel.add(middlePanel);
		gamePanel.add(bottomPanel);
		gamePanel.setComponentZOrder(topPanel, 1);
		gamePanel.setComponentZOrder(middlePanel, 4);
		gamePanel.setComponentZOrder(bottomPanel, 3);
		System.out.println("bottonPanel x: " + bottomPanel.getX());
		System.out.println("bottonPanel y: " + bottomPanel.getY());


		mf.add(gamePanel);
		mf.setVisible(true);

	}

}
