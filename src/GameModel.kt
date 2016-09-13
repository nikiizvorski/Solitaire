/**
 * Created by NIKI on 9/13/2016.
 */
class GameModel {
    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles = arrayOf(FoundationPile(Card.clubs),
            FoundationPile(Card.diamonds), FoundationPile(Card.hearts), FoundationPile(Card.spades))
}