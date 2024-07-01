package P_C;

public class Player {
    private String name;
    private Hand selfhand;
    public Player(String s){
        this.name = s;
    }
    public void setHand(Hand hand){
        this.selfhand = hand;
    }
    public Hand getHand(){
        return selfhand;
    }
}
