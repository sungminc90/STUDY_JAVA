public class Main {
    public static void main(String[] args) {
        
        // Card card1 = new Card(1, 1);
        // Card card2 = new Card(2, 6);
        // Card card3 = new Card(4, 12);
        // System.out.println(card1.getSuit());
        // System.out.println(card2.getSuit());
        // System.out.println(card3.getSuit());
        // System.out.println(card1.getRank());
        // System.out.println(card2.getRank());
        // System.out.println(card3.getRank());
        // System.out.println(card1.toString());
        // System.out.println(card2.toString());
        // System.out.println(card3.toString());
        
        
        // 52장 스탠다드 카드 덱 생성
        Deck standardDeck = new Deck();

        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                Card newCard = new Card(suit, rank);
                
                // System.out.println(newCard.toString()); //Debug

                standardDeck.addCard(newCard);
            }
        }
        // standardDeck.print(); //Debug
        // System.out.println("\n====================shuffle===================\n"); //Debug
        // standardDeck.shuffle(); //Debug
        // standardDeck.print(); //Debug

        // 카드 셔플
        standardDeck.shuffle();
        // standardDeck.print(); //Debug
        // System.out.println("\n=======================================\n"); //Debug
        // 딜링
        Deck hand1 = standardDeck.deal(5);
        Deck hand2 = standardDeck.deal(5);

        // 각 핸드 출력
        hand1.print();
        System.out.println("----------");
        hand2.print();
    }
}