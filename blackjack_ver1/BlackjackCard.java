public class BlackjackCard extends Card {
    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber,rankNumber);
    }
    
    public int getValue() {
        // 메소드 내부를 구현해주세요
        switch (rankNumber) {
            case 1:
                return 11;
            case 11:
            case 12:
            case 13:
                return 10;
            default:
                return rankNumber;
        }
        // return 0;
    }
    
    public boolean isAce() {
        // 메소드 내부를 구현해 주세요
        return rankNumber == 1;
    }
    
}