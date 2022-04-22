public class GameBoardFactory {

    public GameBoard getGameBoard(GameLevelEnum gameLevelEnum) {
        switch (gameLevelEnum) {
            case ADVANCED:
                return new AdvancedGameBoard();
            case EXPERT:
                return new ExpertGameBoard();
            case BEGINNER:
            default:
                return new BeginnerGameBoard();
        }
    }
}
