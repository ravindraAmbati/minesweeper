public class AdvancedGameBoard extends GameBoard {
    public static final int ADVANCED_BOX_WIDTH_PX = 40;
    public static final int ADVANCED_BOX_HEIGHT_PX = 40;
    public static final int ADVANCED_ROW_COUNT = 18;
    public static final int ADVANCED_COL_COUNT = 13;
    public static final int ADVANCED_MINES_COUNT = 35;

    public AdvancedGameBoard() {
        this.setWidth(ADVANCED_BOX_WIDTH_PX);
        this.setHeight(ADVANCED_BOX_HEIGHT_PX);
        this.setRowCount(ADVANCED_ROW_COUNT);
        this.setColCount(ADVANCED_COL_COUNT);
        this.setMinesCount(ADVANCED_MINES_COUNT);
        this.setMineImagePath(String.format("mine_%s_%s.png", ADVANCED_BOX_WIDTH_PX, ADVANCED_BOX_HEIGHT_PX));
    }
}
