package P_C;

public class Hand {
    private int Max_Card;
    private CardContainer cardContainer;
    private HandTier My_Tier;

    public Hand(String[] strings){
        this.Max_Card = 3;
        cardContainer = new CardContainer(this.Max_Card);
        for (int i = 0; i < Max_Card; i++) {
            cardContainer.addCard(strings[i]);
        }
        My_Tier = HandTier.getTier(cardContainer);
    }
}
