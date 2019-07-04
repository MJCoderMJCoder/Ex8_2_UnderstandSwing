package com.understandswing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UnderstandSwing {

	public static void main(String[] args) {
		//创建容器和设置布局
		JFrame	frm = new JFrame("理解Swing");	//顶层容器：JFrame
		frm.setLayout(new BorderLayout());
		
		//创建组件，并添加到容器中
		JButton myBtn = new JButton("按钮"); 	//轻量级组件：JButton
		frm.add(myBtn);		//容器通过调用add()方法将组件添加到容器中
		
		//设置结构（JFrame）的位置与大小并显示
		frm.setBounds(400, 200, 400, 200);	//setBounds(x, y, width, height);
		frm.setVisible(true);
	}

}
