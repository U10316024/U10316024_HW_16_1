//洗牌後發四張牌
public class DeckOfCards {	

	int[] deal() {

		//Create a card array
		int[] card1 = new int[4];

		//Create a deck array
		int[] deck = new int[52];

		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
		// Initialize cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;
    
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index]; 
			deck[index] = temp;
		}
	
		// Display the first four cards
		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];

			//Print result
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);

			//把deck陣列的0~3號卡片存入card1陣列
			card1[i] = deck[i];
			
		}
		System.out.println("--------------------------------");
		
		//回傳card1陣列裡的值到int[] deal裡面
		return card1;
	}
}
