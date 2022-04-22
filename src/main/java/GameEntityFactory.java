import com.almasb.fxgl.animation.AnimatedPath;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GameEntityFactory implements EntityFactory {

    GameBoardFactory gameBoardFactory = new GameBoardFactory();
    GameBoard gameBoard = gameBoardFactory.getGameBoard(GameLevelEnum.EXPERT);
    int widthPx = gameBoard.getWidth();
    int heightPx = gameBoard.getHeight();

    @Spawns(GameConstants.MASKED_MINE)
    public Entity getMaskedMine(SpawnData spawnData) {
        return FXGL.entityBuilder(spawnData)
                .view(new Rectangle(widthPx, heightPx, Color.DARKGREY))
                .onClick(entity -> {
                    Point2D point2D = entity.getPosition();
                    FXGL.spawn(GameConstants.MINE, point2D.getX(), point2D.getY());
                })
                .build();
    }

    @Spawns(GameConstants.MINE)
    public Entity getMine(SpawnData spawnData) {
        return FXGL.entityBuilder(spawnData)
//                .view(new Rectangle(widthPx, heightPx, Color.ORANGERED))
                .view(gameBoard.getMineImagePath())
                .build();
    }

    @Spawns(GameConstants.MASKED_NO_MINE)
    public Entity getMaskedNoMine(SpawnData spawnData) {
        return FXGL.entityBuilder(spawnData)
                .view(new Rectangle(widthPx, heightPx, Color.DARKGREY))
                .onClick(entity -> {
                    Point2D point2D = entity.getPosition();
                    FXGL.spawn(GameConstants.UNMASKED_MINE, point2D.getX(), point2D.getY());
                })
                .build();
    }

    @Spawns(GameConstants.UNMASKED_MINE)
    public Entity getUnmaskedMine(SpawnData spawnData) {
        return FXGL.entityBuilder(spawnData)
                .view(new Rectangle(widthPx, heightPx, Color.WHITE))
                .build();
    }
}
