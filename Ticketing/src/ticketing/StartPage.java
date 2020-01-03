package ticketing;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import javax.swing.border.*;
	
	interface Airplane {
		public void buyflight();
	}
	
	public class StartPage extends JFrame {
	
		public static JPanel contentPane;
	
		public StartPage() {
			List li = new List();
			
			setTitle("Win Scanner Ltd");
	
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
	
			JButton startbtn = new JButton("Buy Now");
			startbtn.setFont(new Font("Buy Now", Font.PLAIN, 36));
			startbtn.setBounds(551, 481, 138, 80);
			contentPane.add(startbtn);
	
			JLabel label = new JLabel("Win Ticket Market");
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Buy Now", Font.PLAIN, 50));
			label.setBounds(399, 142, 491, 80);
			contentPane.add(label);
	
			JLabel background = new JLabel("");
			background.setIcon(new ImageIcon("src\\images\\airport.jpg"));
			background.setBounds(0, 0, 1262, 673);
			contentPane.add(background);
	
			setVisible(true);
	
			startbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			startbtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					contentPane.removeAll();
					contentPane.revalidate();
					contentPane.repaint();
					li.List_Asiana();
					li.List_KoreanAir();
					li.List_Jinair();
				}
			});
		}
	}