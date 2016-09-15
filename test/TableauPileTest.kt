import org.junit.Assert.*

/**
 * Created by NIKI on 9/13/2016.
 */
class TableauPileTest {
    @org.junit.Test
    fun addCard() {
        // arrange
        val tableauPile = TableauPile(mutableListOf(Card(12, spades)))
        val cards = mutableListOf(Card(11, hearts))
        // act
        tableauPile.addCard(cards)
        // assert
        assertEquals(2, tableauPile.cards.size)
    }

    @org.junit.Test
    fun removeCards() {
        // arrange
        val tableauPile = TableauPile(mutableListOf(Card(4, clubs), Card(3, diamonds), Card(2, spades)))
        // act
        tableauPile.removeCards(1)

        // assert
        assertEquals(mutableListOf(Card(4, clubs, true)), tableauPile.cards)
    }

}