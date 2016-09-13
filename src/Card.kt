/**
 * Created by NIKI on 9/9/2016.
 */
class Card(val value: Int, val suit: String, var faceUp: Boolean = false){
    companion object {
        val clubs = "Clubs"
        val diamonds = "Diamonds"
        val hearts = "Hearts"
        val spades = "Spades"
    }
}