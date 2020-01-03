package ticketing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.io.*;

abstract class function extends JFrame{ 
	public abstract void List_Asiana();
	public abstract void List_KoreaAir();
	public abstract void List_jinair();
}

class GetUserInfo{
	String[] name = new String[100];
	int[] idnum = new int[100];
}


class List extends function{

	@Override 
	public void List_Asiana() {

		JLabel AsianaIcon = new JLabel(""); 
		AsianaIcon.setIcon(new ImageIcon("src\\images\\asiana.jpg"));
		AsianaIcon.setBounds(34, 55, 219, 119); 
		StartPage.contentPane.add(AsianaIcon);
		StartPage.contentPane.setBackground(new Color(255, 250, 250));

		
		JLabel flight = new JLabel("ASIANA Airlines : OZ232"); 
		flight.setFont(new Font("Honolulu", Font.PLAIN, 20)); 
		flight.setBounds(291, 56, 400, 18);				
		StartPage.contentPane.add(flight);


		JButton box = new JButton(); 
		box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { } 
		});

		JButton buybutton1 = new JButton("From $800~"); 
		buybutton1.setBounds(889, 55, 345, 119); 
		StartPage.contentPane.add(buybutton1);

		JLabel Start = new JLabel("����� : ��õ(ICN)"); 
		Start.setFont(new Font("����", Font.PLAIN, 20)); 
		Start.setBounds(291, 86, 175, 18);
		StartPage.contentPane.add(Start);

		JLabel arrive = new JLabel("������ : ����ũ����Ʈ(FRA)"); 
		arrive.setFont(new Font("����", Font.PLAIN, 20)); 
		arrive.setBounds(291, 116, 271, 18);
		StartPage.contentPane.add(arrive);

		JLabel price = new JLabel("��� �ð� : 13 : 00"); 
		price.setFont(new Font("����", Font.PLAIN, 20));
		price.setBounds(291, 146, 175, 18);
		StartPage.contentPane.add(price);

		box.setForeground(Color.WHITE); 
		box.setEnabled(false); 
		box.setBackground(new Color(220, 220, 220));
		box.setBorderPainted(false); 
		box.setBounds(14, 42, 1234, 147); 
		StartPage.contentPane.add(box);


		buybutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buybutton1.addMouseListener(new MouseAdapter() {
			@Override 
			public void mousePressed(MouseEvent e) { 
				StartPage.contentPane.removeAll();
				StartPage.contentPane.revalidate();
				StartPage.contentPane.repaint();
				AirplaneStruct Buy = new AirplaneStruct();
				Buy.printflight("OZ232");
				Buy.buyflight();
			}
		});
	} 	
	
	public void List_KoreanAir(){
		JLabel KoreanIcon = new JLabel(""); 
		KoreanIcon.setIcon(new ImageIcon("src\\images\\koreanair.jpg"));
		KoreanIcon.setBounds(34, 240, 219, 119); 
		StartPage.contentPane.add(KoreanIcon);
		StartPage.contentPane.setBackground(new Color(255, 250, 250));

		JLabel flight = new JLabel("�װ��� �� : KE647"); 
		flight.setFont(new Font("����", Font.PLAIN, 20)); 
		flight.setBounds(291, 240, 175, 18);				
		StartPage.contentPane.add(flight);

		JButton box = new JButton(); 
		box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { } 
		});

		JButton buybutton1 = new JButton("�����ϱ�"+ " " + "���� : 1,100,000won~"); 
		buybutton1.setBounds(889, 240, 345, 119); 
		StartPage.contentPane.add(buybutton1);

		JLabel Start = new JLabel("����� : ��õ(ICN)"); 
		Start.setFont(new Font("����", Font.PLAIN, 20)); 
		Start.setBounds(291, 271, 175, 18);
		StartPage.contentPane.add(Start);

		JLabel arrive = new JLabel("������ : �̰�����(SIN)"); 
		arrive.setFont(new Font("����", Font.PLAIN, 20)); 
		arrive.setBounds(291, 300, 271, 18);
		StartPage.contentPane.add(arrive);

		JLabel price = new JLabel("��� �ð� : 23 : 30"); 
		price.setFont(new Font("����", Font.PLAIN, 20));
		price.setBounds(291, 330, 175, 18);
		StartPage.contentPane.add(price);

		box.setForeground(Color.WHITE); 
		box.setEnabled(false); 
		box.setBackground(new Color(220, 220, 220));
		box.setBorderPainted(false); 
		box.setBounds(14, 227, 1234, 147); 
		StartPage.contentPane.add(box);


		buybutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buybutton1.addMouseListener(new MouseAdapter() {
			@Override 
			public void mousePressed(MouseEvent e) { 
				StartPage.contentPane.removeAll();
				StartPage.contentPane.revalidate();
				StartPage.contentPane.repaint();
				AirplaneStruct Buy = new AirplaneStruct();
				Buy.printflight("KE647");
				Buy.buyflight();
			}
		});
	}
		
		public void List_Jinair() {
			JLabel JinIcon = new JLabel(""); 
			JinIcon.setIcon(new ImageIcon("src\\images\\jinair.jpg"));
			JinIcon.setBounds(34, 430, 219, 119); 
			StartPage.contentPane.add(JinIcon);
			StartPage.contentPane.setBackground(new Color(255, 250, 250));

			JLabel flight = new JLabel("�װ��� �� : LJ221"); 
			flight.setFont(new Font("����", Font.PLAIN, 20)); 
			flight.setBounds(291, 430, 175, 18);				
			StartPage.contentPane.add(flight);

			JButton box = new JButton(); 
			box.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { } 
			});

			JButton buybutton1 = new JButton("�����ϱ�"+ " " + "���� : 200,000won~"); 
			buybutton1.setBounds(889, 430, 345, 119); 
			StartPage.contentPane.add(buybutton1);

			JLabel Start = new JLabel("����� : ��õ(ICN)"); 
			Start.setFont(new Font("����", Font.PLAIN, 20)); 
			Start.setBounds(291, 460, 175, 18);
			StartPage.contentPane.add(Start);

			JLabel arrive = new JLabel("������ : �����ī(FUK)"); 
			arrive.setFont(new Font("����", Font.PLAIN, 20)); 
			arrive.setBounds(291, 490, 271, 18);
			StartPage.contentPane.add(arrive);

			JLabel price = new JLabel("��� �ð� : 07 : 15"); 
			price.setFont(new Font("����", Font.PLAIN, 20));
			price.setBounds(291, 520, 175, 18);
			StartPage.contentPane.add(price);

			box.setForeground(Color.WHITE); 
			box.setEnabled(false); 
			box.setBackground(new Color(220, 220, 220));
			box.setBorderPainted(false); 
			box.setBounds(14, 420, 1234, 147); 
			StartPage.contentPane.add(box);


			buybutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			buybutton1.addMouseListener(new MouseAdapter() {
				@Override 
				public void mousePressed(MouseEvent e) { 
					StartPage.contentPane.removeAll();
					StartPage.contentPane.revalidate();
					StartPage.contentPane.repaint();
					AirplaneStruct Buy = new AirplaneStruct();
					Buy.printflight("LJ221");
					Buy.buyflight();
				}
			});
		}

		@Override
		public void List_KoreaAir() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void List_jinair() {
			// TODO Auto-generated method stub
			
		}
	}

class AirplaneStruct extends GetUserInfo implements Airplane{

	public void buyflight() {
		JLabel lblNewLabel = new JLabel("\uC88C\uC11D\uD45C\r\n");
		lblNewLabel.setBounds(596, 0, 117, 56);
		StartPage.contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("����", Font.BOLD, 37));

		JButton button_1 = new JButton("�¼�");
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(14, 140, 127, 103);
		StartPage.contentPane.add(button_1);

		JButton button_2 = new JButton("�¼�");
		button_2.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(14, 140, 127, 103);
		StartPage.contentPane.add(button_1);

		button_2.setBounds(200, 140, 127, 103);
		StartPage.contentPane.add(button_2);

		JButton button_3 = new JButton("�¼�");
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(383, 140, 127, 103);
		StartPage.contentPane.add(button_3);

		JButton button_4 = new JButton("�¼�");
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(575, 140, 127, 103);
		StartPage.contentPane.add(button_4);

		JButton button_5 = new JButton("�¼�");
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setBounds(764, 140, 127, 103);
		StartPage.contentPane.add(button_5);

		JButton button_6 = new JButton("\uC88C\uC11D");
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(943, 140, 127, 103);
		StartPage.contentPane.add(button_6);

		JButton button_7 = new JButton("\uC88C\uC11D");
		button_7.setBackground(Color.LIGHT_GRAY);
		button_7.setBounds(1121, 140, 127, 103);
		StartPage.contentPane.add(button_7);

		JButton button_8 = new JButton("\uC88C\uC11D");
		button_8.setBackground(Color.LIGHT_GRAY);
		button_8.setBounds(14, 314, 127, 103);
		StartPage.contentPane.add(button_8);

		JButton button_9 = new JButton("\uC88C\uC11D");
		button_9.setBackground(Color.LIGHT_GRAY);
		button_9.setBounds(200, 314, 127, 103);
		StartPage.contentPane.add(button_9);

		JButton button_10 = new JButton("\uC88C\uC11D");
		button_10.setBackground(Color.LIGHT_GRAY);
		button_10.setBounds(383, 314, 127, 103);
		StartPage.contentPane.add(button_10);

		JButton button_11 = new JButton("\uC88C\uC11D");
		button_11.setBackground(Color.LIGHT_GRAY);
		button_11.setBounds(575, 314, 127, 103);
		StartPage.contentPane.add(button_11);

		JButton button_12 = new JButton("\uC88C\uC11D");
		button_12.setBackground(Color.LIGHT_GRAY);
		button_12.setBounds(764, 314, 127, 103);
		StartPage.contentPane.add(button_12);

		JButton button_13 = new JButton("\uC88C\uC11D");
		button_13.setBackground(Color.LIGHT_GRAY);
		button_13.setBounds(943, 314, 127, 103);
		StartPage.contentPane.add(button_13);

		JButton button_14 = new JButton("\uC88C\uC11D");
		button_14.setBackground(Color.LIGHT_GRAY);
		button_14.setBounds(1121, 314, 127, 103);
		StartPage.contentPane.add(button_14);

		JButton button_15 = new JButton("\uC88C\uC11D");
		button_15.setBackground(Color.LIGHT_GRAY);
		button_15.setBounds(14, 498, 127, 103);
		StartPage.contentPane.add(button_15);

		JButton button_16 = new JButton("\uC88C\uC11D");
		button_16.setBackground(Color.LIGHT_GRAY);
		button_16.setBounds(200, 498, 127, 103);
		StartPage.contentPane.add(button_16);

		JButton button_17 = new JButton("\uC88C\uC11D");
		button_17.setBackground(Color.LIGHT_GRAY);
		button_17.setBounds(383, 498, 127, 103);
		StartPage.contentPane.add(button_17);

		JButton button_18 = new JButton("\uC88C\uC11D");
		button_18.setBackground(Color.LIGHT_GRAY);
		button_18.setBounds(575, 498, 127, 103);
		StartPage.contentPane.add(button_18);

		JButton button_19 = new JButton("\uC88C\uC11D");
		button_19.setBackground(Color.LIGHT_GRAY);
		button_19.setBounds(764, 498, 127, 103);
		StartPage.contentPane.add(button_19);

		JButton button_20 = new JButton("\uC88C\uC11D");
		button_20.setBackground(Color.LIGHT_GRAY);
		button_20.setBounds(943, 498, 127, 103);
		StartPage.contentPane.add(button_20);

		JButton button_21 = new JButton("\uC88C\uC11D");
		button_21.setBackground(Color.LIGHT_GRAY);
		button_21.setBounds(1121, 498, 127, 103);
		StartPage.contentPane.add(button_21);
		
		

		button_1.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_1.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_1.setBackground(Color.LIGHT_GRAY);
			}
		});

		button_2.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_2.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_2.setBackground(Color.LIGHT_GRAY);
			}
		});

		button_3.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_3.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_3.setBackground(Color.LIGHT_GRAY);
			}
		});

		button_7.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_7.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_7.setBackground(Color.LIGHT_GRAY);
			}
		});


		button_5.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_5.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_5.setBackground(Color.LIGHT_GRAY);
			}
		});


		button_6.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_6.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_6.setBackground(Color.LIGHT_GRAY);
			}
		});


		button_7.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_7.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_7.setBackground(Color.LIGHT_GRAY);
			}
		});

		button_8.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_8.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_8.setBackground(Color.LIGHT_GRAY);
			}
		});

		button_9.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_9.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_9.setBackground(Color.LIGHT_GRAY);
			}
		});

		button_10.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_10.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_10.setBackground(Color.LIGHT_GRAY);
			}
		});

		button_11.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_11.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_11.setBackground(Color.LIGHT_GRAY);
			}
		});

		button_12.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_12.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_12.setBackground(Color.LIGHT_GRAY);
			}
		});

		button_13.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_13.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_13.setBackground(Color.LIGHT_GRAY);
			}
		});

		button_14.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_14.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_14.setBackground(Color.LIGHT_GRAY);
			}
		});
		
		button_15.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_15.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_15.setBackground(Color.LIGHT_GRAY);
			}
		});
		
		button_16.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_16.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_16.setBackground(Color.LIGHT_GRAY);
			}
		});
		
		button_17.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_17.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_17.setBackground(Color.LIGHT_GRAY);
			}
		});
		
		button_18.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {

				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_18.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_18.setBackground(Color.LIGHT_GRAY);
			}
		});
		
		button_19.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_19.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_19.setBackground(Color.LIGHT_GRAY);
			}
		});
		
		button_20.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				button_20.setBackground(Color.yellow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_20.setBackground(Color.LIGHT_GRAY);
			}
		});
		
		button_21.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mouseEntered(MouseEvent e){
				button_21.setBackground(Color.yellow);
			}
			public void mousePressed(MouseEvent e) {
				getinfo();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_21.setBackground(Color.LIGHT_GRAY);
			}
		});
		
	}



	public void printflight(String FlightNum) {
		System.out.println("�װ��� :" + FlightNum);
	}
	
	public void getinfo(){
		GetUserInfo flight = new GetUserInfo();
		int i =0;
		System.out.print("�̸� : ");
		Scanner name = new Scanner(System.in);
		flight.name[i]= name.next();
		System.out.print("�ֹι�ȣ���ڸ� : ");
		Scanner id = new Scanner(System.in);
		while (!id.hasNextInt()) {
            id.next(); 
            System.err.print("����! ���ڰ� �ƴմϴ�. \n�� �Է� : ");
		}
		flight.idnum[i] = id.nextInt();
		++i;
		System.out.println("���� �Ϸ�");
	}
}