import org.junit.Test

/**
 * Created by NIKI on 9/15/2016.
 */
class GameTest {
    @Test
    fun kingInFirstFoundationPile(){
        // arrange
        var numGames = 0
        val maxGames = 10000
        // act
        for (i in 1..10000) {
            numGames++
            GameModel.resetGame()
            for (j in 1..100) {
                GamePresenter.onDeckTap()
                GamePresenter.onWasteTap()
                GameModel.tableauPiles.forEachIndexed { index, tableauPile ->
                    GamePresenter.onTableauTap(index, tableauPile.cards.lastIndex)
                }
            }
            if(GameModel.foundationPiles[0].cards.size == 13) {
                break
            }
        }
        // assert
        GameModel.debugPrint()
        println("# Games: $numGames")
        assert(numGames < maxGames)
    }
}