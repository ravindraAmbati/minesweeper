import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.time.Timer;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Random;

public class Minesweeper extends GameApplication {

    private final GameBoardFactory gameBoardFactory = new GameBoardFactory();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    protected void initSettings(GameSettings gameSettings) {
    }

    @Override
    protected void initGame() {
        FXGL.getGameWorld().addEntityFactory(new GameEntityFactory());
        Timer timer = new Timer();
        timer.runAtInterval( () -> {}, Duration.seconds(120));
        GameBoard gameBoard = gameBoardFactory.getGameBoard(GameLevelEnum.EXPERT);
        layoutMaskedMines(gameBoard);
        plantMines(gameBoard);
    }

    private void layoutMaskedMines(GameBoard gameBoard) {
        List<Entity> entities = new ArrayList<>();
        int widthPx = gameBoard.getWidth() * gameBoard.getRowCount();
        int heightPx = gameBoard.getHeight() * gameBoard.getColCount();
        for (int i = 0; i < widthPx; i++) {
            for (int j = 0; j < heightPx; j++) {
                entities.add(FXGL.spawn(GameConstants.MASKED_NO_MINE, i, j));
                j = j + gameBoard.getHeight();
            }
            i = i + gameBoard.getWidth();
        }
        gameBoard.setEntities(entities);
    }

    private void plantMines(GameBoard gameBoard) {
        int minesCount = gameBoard.getMinesCount();
        List<Entity> entities = gameBoard.getEntities();
        Random random = new Random();
        PrimitiveIterator.OfInt iterator = random.ints(minesCount, 0, entities.size()).iterator();
        while (iterator.hasNext()) {
            Integer randomPosition = iterator.next();
            Entity entity = entities.get(randomPosition);
            FXGL.spawn(GameConstants.MASKED_MINE, entity.getX(), entity.getY());
        }
    }
}
