/**
 * Created by NIKI on 9/15/2016.
 */
class GamePresenter {
    //Add the check for null ? to the property Kotlin Checks for null and save the NullPointerException
    //You can use !! points to promise Kotlin that what ever is next is not going to be null
    var view: GameView? = null

    fun setGameView(gameView: GameView) {
        view = gameView
    }

    fun onDeckTap() {
        GameModel.onDeckTap()
        view?.update()
    }

    fun onWasteTap() {
        GameModel.onWasteTap()
        view?.update()
    }

    fun onTableauTap(tableauIndex: Int, cardIndex: Int) {
        GameModel.onTableauTap(tableauIndex, cardIndex)
        view?.update()
    }

    fun onFoundationTap(foundationIndex: Int) {
        GameModel.onFoundationTap(foundationIndex)
        view?.update()
    }
}