package com.junGukGu.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		//프레임 크기,위치
//		this.setBounds(100, 100, 978, 751);
		this.setBounds(100, 100, 985, 730);
		//사이즈 고정
		
		this.setResizable(false);
		//프레임 제목
		this.setTitle("EvolutionDefense");
		//프레임 상단 아이콘
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
