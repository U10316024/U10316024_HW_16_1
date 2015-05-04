import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class FourCards extends JFrame {

	//建立52張牌的圖片
	private ImageIcon card1 = new ImageIcon("card/1.png");
	private ImageIcon card2 = new ImageIcon("card/2.png");
	private ImageIcon card3 = new ImageIcon("card/3.png");
	private ImageIcon card4 = new ImageIcon("card/4.png");
	private ImageIcon card5 = new ImageIcon("card/5.png");
	private ImageIcon card6 = new ImageIcon("card/6.png");
	private ImageIcon card7 = new ImageIcon("card/7.png");
	private ImageIcon card8 = new ImageIcon("card/8.png");
	private ImageIcon card9 = new ImageIcon("card/9.png");
	private ImageIcon card10 = new ImageIcon("card/10.png");
	private ImageIcon card11 = new ImageIcon("card/11.png");
	private ImageIcon card12 = new ImageIcon("card/12.png");
	private ImageIcon card13 = new ImageIcon("card/13.png");
	private ImageIcon card14 = new ImageIcon("card/14.png");
	private ImageIcon card15 = new ImageIcon("card/15.png");
	private ImageIcon card16 = new ImageIcon("card/16.png");
	private ImageIcon card17 = new ImageIcon("card/17.png");
	private ImageIcon card18 = new ImageIcon("card/18.png");
	private ImageIcon card19 = new ImageIcon("card/19.png");
	private ImageIcon card20 = new ImageIcon("card/20.png");
	private ImageIcon card21 = new ImageIcon("card/21.png");
	private ImageIcon card22 = new ImageIcon("card/22.png");
	private ImageIcon card23 = new ImageIcon("card/23.png");
	private ImageIcon card24 = new ImageIcon("card/24.png");
	private ImageIcon card25 = new ImageIcon("card/25.png");
	private ImageIcon card26 = new ImageIcon("card/26.png");
	private ImageIcon card27 = new ImageIcon("card/27.png");
	private ImageIcon card28 = new ImageIcon("card/28.png");
	private ImageIcon card29 = new ImageIcon("card/29.png");
	private ImageIcon card30 = new ImageIcon("card/30.png");
	private ImageIcon card31 = new ImageIcon("card/31.png");
	private ImageIcon card32 = new ImageIcon("card/32.png");
	private ImageIcon card33 = new ImageIcon("card/33.png");
	private ImageIcon card34 = new ImageIcon("card/34.png");
	private ImageIcon card35 = new ImageIcon("card/35.png");
	private ImageIcon card36 = new ImageIcon("card/36.png");
	private ImageIcon card37 = new ImageIcon("card/37.png");
	private ImageIcon card38 = new ImageIcon("card/38.png");
	private ImageIcon card39 = new ImageIcon("card/39.png");
	private ImageIcon card40 = new ImageIcon("card/40.png");
	private ImageIcon card41 = new ImageIcon("card/41.png");
	private ImageIcon card42 = new ImageIcon("card/42.png");
	private ImageIcon card43 = new ImageIcon("card/43.png");
	private ImageIcon card44 = new ImageIcon("card/44.png");
	private ImageIcon card45 = new ImageIcon("card/45.png");
	private ImageIcon card46 = new ImageIcon("card/46.png");
	private ImageIcon card47 = new ImageIcon("card/47.png");
	private ImageIcon card48 = new ImageIcon("card/48.png");
	private ImageIcon card49 = new ImageIcon("card/49.png");
	private ImageIcon card50 = new ImageIcon("card/50.png");
	private ImageIcon card51 = new ImageIcon("card/51.png");
	private ImageIcon card52 = new ImageIcon("card/52.png");

	//Create an ArrayList is named list
	ArrayList<ImageIcon> list = new ArrayList<ImageIcon>(); 

	//Create a button
	private JButton jbt1;

	//invoke constructor of class DeckOfCards
	DeckOfCards card = new DeckOfCards();

	//Create four labels
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;

	public FourCards() {

		//呼叫52張牌
		list.add(card1);
		list.add(card2);
		list.add(card3);
		list.add(card4);
		list.add(card5);
		list.add(card6);
		list.add(card7);
		list.add(card8);
		list.add(card9);
		list.add(card10);
		list.add(card11);
		list.add(card12);
		list.add(card13);
		list.add(card14);
		list.add(card15);
		list.add(card16);
		list.add(card17);
		list.add(card18);
		list.add(card19);
		list.add(card20);
		list.add(card21);
		list.add(card22);
		list.add(card23);
		list.add(card24);
		list.add(card25);
		list.add(card26);
		list.add(card27);
		list.add(card28);
		list.add(card29);
		list.add(card30);
		list.add(card31);
		list.add(card32);
		list.add(card33);
		list.add(card34);
		list.add(card35);
		list.add(card36);
		list.add(card37);
		list.add(card38);
		list.add(card39);
		list.add(card40);
		list.add(card41);
		list.add(card42);
		list.add(card43);
		list.add(card44);
		list.add(card45);
		list.add(card46);
		list.add(card47);
		list.add(card48);
		list.add(card49);
		list.add(card50);
		list.add(card51);
		list.add(card52);

		//Create JPanel of p2
		JPanel p2 = new JPanel();

		//呼叫deal method
		int[] card2 = card.deal();

		//使用GridLayout 劃分p2的介面
		setLayout(new GridLayout(1,4,5,5));
		label1 = new JLabel(list.get(card2[0]));
		label2 = new JLabel(list.get(card2[1]));
		label3 = new JLabel(list.get(card2[2]));
		label4 = new JLabel(list.get(card2[3]));
		
		p2.add(label1);
		p2.add(label2);
		p2.add(label3);
		p2.add(label4);

		//Create JPanel of p1
		JPanel p1 = new JPanel();

		//使用BorderLayout 劃分p1的介面
		setLayout(new BorderLayout());

		//命名jbt1為Refresh
		jbt1 = new JButton("Refresh");

		//將按鈕放置在p2介面的中心
		p1.add(jbt1,BorderLayout.CENTER);

		//將p1介面放在整個GUI介面的南方
		add(p1,BorderLayout.SOUTH);

		//將p2介面放在整個GUI介面的北方
		add(p2,BorderLayout.NORTH);

		//invoke addActionListener method
		jbt1.addActionListener(new Listener());
		
	}

	//動作監聽 點擊按鈕即可觸發事件
	class Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			int[] card2 = card.deal();
			label1.setIcon(list.get(card2[0]));
			label2.setIcon(list.get(card2[1]));
			label3.setIcon(list.get(card2[2]));
			label4.setIcon(list.get(card2[3]));
		}
	}

	//Main method
	//建立GUI介面
	public static void main(String[] args) {
		
		FourCards frame = new FourCards();
		frame.setTitle("TestImageIcon");
		frame.setSize(400,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
