/**
 * Created by NIKI on 9/9/2016.
 */
public class JavaCard {
    //All of there are Immutable which mean they don't change thats why we don't need a Setter.
    //Value for the cards 1, 2, 3, King etc
    private int value;
    // Which One is This is it Heart etc
    private String suit;


    //Is it Facing down, up etc
    //Mutable is the opposite means that it will change.
    private Boolean faceUp;

    public JavaCard(int value, String suit, Boolean faceUp){
        this.value = value;
        this.suit = suit;
        this.faceUp = faceUp;
    }

    public int getValue() {
        return value;
    }


    public String getSuit() {
        return suit;
    }

    public Boolean getFaceUp() {
        return faceUp;
    }

    public void setFaceUp(Boolean faceUp) {
        this.faceUp = faceUp;
    }

}
