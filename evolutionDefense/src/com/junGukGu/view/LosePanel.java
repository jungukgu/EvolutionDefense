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

public class LosePanel extends JPanel {
	private JFrame mf;
	private JPanel losePage;

	public LosePanel(JFrame mf, JPanel gamePanel) {
		this.mf = mf;
		losePage = this;
		this.setBounds(281, 173, 415, 300);
		this.setLayout(null);
		//lose�г� ���
		JLabel losePanel = new JLabel(new ImageIcon(new ImageIcon("ev-Image/gamePage/LosePanel.PNG").getImage().getScaledInstance(415, 300, 0)));
		losePanel.setBounds(0, 0 ,415, 300);
		//lose�г� ����
		JLabel sentence = new JLabel("�ٽ� �����ϼ���!");
		sentence.setLocation(170, 107);
		sentence.setSize(250, 50);
		//lose�г� �ؽ�Ʈ����
		JTextField name = new JTextField(20);
		name.setLocation(155, 227);
		name.setSize(100, 25);
		//lose�г� ��Ϲ�ư
		JButton registration = new JButton(new ImageIcon(new ImageIcon("ev-Image/gamePage/enroll.png").getImage().getScaledInstance(98, 35, 0)));
		registration.setBounds(275, 221, 100, 37);
		registration.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "�̸� : " + name.getText() + "\n";
			}
		});
		registration.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(mf, gamePanel, new RankPage(mf));
			}
		});

		this.add(sentence);
		this.add(name);
		this.add(registration);
		this.add(losePanel);
		mf.repaint();
	}

}
