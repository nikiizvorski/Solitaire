/**
 * Created by NIKI on 9/13/2016.
 */
class GameModel {
    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles = arrayOf(FoundationPile(clubs),
            FoundationPile(diamonds), FoundationPile(hearts), FoundationPile(spades))
}