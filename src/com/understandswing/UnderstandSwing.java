package com.understandswing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UnderstandSwing {

	public static void main(String[] args) {
		//�������������ò���
		JFrame	frm = new JFrame("���Swing");	//����������JFrame
		frm.setLayout(new BorderLayout());
		
		//�������������ӵ�������
		JButton myBtn = new JButton("��ť"); 	//�����������JButton
		frm.add(myBtn);		//����ͨ������add()�����������ӵ�������
		
		//���ýṹ��JFrame����λ�����С����ʾ
		frm.setBounds(400, 200, 400, 200);	//setBounds(x, y, width, height);
		frm.setVisible(true);
	}

}
