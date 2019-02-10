package com.junGukGu.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		//������ ũ��,��ġ
//		this.setBounds(100, 100, 978, 751);
		this.setBounds(100, 100, 985, 730);
		//������ ����
		
		this.setResizable(false);
		//������ ����
		this.setTitle("EvolutionDefense");
		//������ ��� ������
		try {
			this.setIconImage(ImageIO.read(new File("ev-Image/mainPage/hi.gif")));
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		add(new MainPage(this));

		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
