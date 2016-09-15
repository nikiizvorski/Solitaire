import java.util.*

/**
 * Created by NIKI on 9/9/2016.
 */
class Deck {
    //Using Lambda Expression Syntax and if you use it Kotlin will automatically generate the property
    val cards = Array(52, { Card(it % 13, getSuit(it)) })
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsInDeck.removeAt(0)

    fun reset() {
        cardsInDeck = cards.toMutableList()
        cardsInDeck.forEach { it.faceUp = false }
        Collections.shuffle(cardsInDeck)
    }



    private fun  getSuit(i: Int) = when(i / 13) {
        0 -> clubs
        1 -> diamonds
        2 -> hearts
        else -> spades
    }
}