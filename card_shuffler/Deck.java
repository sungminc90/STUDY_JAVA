import java.util.ArrayList;
import java.util.Random;
public class Deck {
    private ArrayList<Card> cards = new ArrayList<>(); // 덱에 있는 카드를 보관하는 ArrayList입니다.
    
    public ArrayList<Card> getCards(){
        // 카드 목록을 리턴해줍니다.
        return cards;
    } 
    
    public void addCard(Card card){
        //파라미터로 card를 받고 cards에 추가해줍니다.
        cards.add(card);
    }
    
    public void print(){
        //카드 목록에 있는 모든 카드를 출력합니다. 출력할 때는 카드 인스턴스의 toString 메소드를 사용하세요.
        for (Card card : cards){
            System.out.println(card.toString());
        }
    }
    
    public void shuffle(){
        //cards의 순서를 뒤죽박죽 섞습니다. Random 클래스를 이용해서 완전히 랜덤하게 섞어주세요!
        // ArrayList<Integer> cardsIndex = new ArrayList<>();
        // Random randGenerator = new Random();
        // for (int i = 0; i < cards.size(); i++){
        //     int index = randGenerator.nextInt(cards.size());
        //     // System.out.println("index: "+index);
        //     // System.out.println("cardsIndex.size(): "+cardsIndex.size());
        //     if(!cardsIndex.contains(index)){
        //         cardsIndex.add(index);
        //     } else{
        //         i--;
        //     }
        // }
        // // System.out.println(cardsIndex);
        // // System.out.println(cardsIndex.size());
        
        // for (int j = 0; j < cardsIndex.size(); j++){
        //     System.out.println(cards.get(cardsIndex.get(j)));
        // }
        
        // ver 2=================================================
        Random randGenerator = new Random();
        int originSize = cards.size();
        cards.clear();
        for (int i = 0; i < originSize; i++){
            int suitNum = randGenerator.nextInt(4)+1;
            int rankNum = randGenerator.nextInt(13)+1;
            Card newCard = new Card(suitNum, rankNum);
            // System.out.println("newCard.toString(): "+newCard.toString());
            // for (int j = 0; j < cards.size(); j ++){
            //     System.out.println("cards.get(j): "+cards.get(j));
            //     if (cards.get(j).toString().equals(newCard.toString())){
            //         System.out.println("중복");
            //         i--;
            //         break;
            //     }
            // }
            if ( cards.toString().contains(newCard.toString()) ){
                // System.out.println("중복");
                i--;
            }else {
                addCard(newCard);
            }
        }
        // System.out.println(cards);
    }
    
    public Deck deal(int count){
        // 먼저 hand라는 새로운 Deck 인스턴스를 만드세요.
        Deck hand = new Deck();
        // count가 5면 현재 덱의 cards의 마지막 다섯 장을 빼고,
        // ArrayList<Card> handCards = new ArrayList<>();
        for (int i = count; i > 0; i--){
            // System.out.println("debug#1: "+cards.get(cards.size()-(count-i+1)));
            // cards.get(cards.size()-(count-i+1))
            
            // handCards.add(cards.get(cards.size()-(count-i+1)));
            hand.addCard(cards.get(cards.size()-(count-i+1)));
            // cards.remove(cards.get(cards.size()-(count-i+1)));
        }
        for (int j = 0; j < count; j++){
            cards.remove(hand.cards.get(j));
        }
        // for (Deck deck : hand){
        //     System.out.println("debug#2: "+deck);
        //     cards.remove(card);
        // }
        // System.out.println("getCards(): "+hand.getCards());
        // print();
        
        return hand;
    }
    
}