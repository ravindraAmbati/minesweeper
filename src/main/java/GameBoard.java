import com.almasb.fxgl.entity.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class GameBoard {

    private int width;
    private int height;
    private int rowCount;
    private int colCount;
    private int minesCount;
    private List<Entity> entities;
    private String mineImagePath;
}
