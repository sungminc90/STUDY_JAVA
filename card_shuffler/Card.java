public class Card {
    public final int suitNumber; //1, 2, 3, 4로 표현되는 '클로버(Clubs)', '하트(Hearts)', '다이아몬드(Diamonds)', '스페이드(Spades)'
    public final int rankNumber; // 1, 11, 12, 13은 각각 'Ace', 'Jack', 'Queen', 'King'
    
    public Card(int suitNumber, int rankNumber){
        this.suitNumber = suitNumber; // 1 <= suit <= 4
        this.rankNumber = rankNumber; // 1 <= rank <= 13
    }
    
    //변수 suit의 숫자 값에 해당하는 슈트(suit)를 리턴해줍니다.
    public String getSuit(){
        String suit = "";
        switch (suitNumber){
            case 1: suit = "Clubs";
            break;
            case 2: suit = "Hearts";
            break;
            case 3: suit = "Diamonds";
            break;
            case 4: suit = "Spades";
            break;
            default: suit = "Error";
        }
        return suit;
    }
    
    //변수 number의 숫자 값에 해당하는 카드 랭크를 리턴해줍니다.
    public String getRank(){
        String rank = "";
        switch (rankNumber){
            case 1: rank = "Ace";
            break;
            case 11: rank = "Jack";
            break;
            case 12: rank = "Queen";
            break;
            case 13: rank = "King";
            break;
            default: rank = Integer.toString(rankNumber);
        }
        return rank;
    }
    
    // 카드를 "{랭크} of {슈트}" 방식으로 예쁘게 요약해줍니다.
    public String toString(){
        return getRank()+" of "+getSuit();
    }
    
}