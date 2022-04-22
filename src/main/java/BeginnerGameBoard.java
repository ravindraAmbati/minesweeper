public class BeginnerGameBoard extends GameBoard {
    public static final int BEGINNER_BOX_WIDTH_PX = 60;
    public static final int BEGINNER_BOX_HEIGHT_PX = 60;
    public static final int BEGINNER_ROW_COUNT = 9;
    public static final int BEGINNER_COL_COUNT = 7;
    public static final int BEGINNER_MINES_COUNT = 10;

    public BeginnerGameBoard() {
        this.setWidth(BEGINNER_BOX_WIDTH_PX);
        this.setHeight(BEGINNER_BOX_HEIGHT_PX);
        this.setRowCount(BEGINNER_ROW_COUNT);
        this.setColCount(BEGINNER_COL_COUNT);
        this.setMinesCount(BEGINNER_MINES_COUNT);
        this.setMineImagePath(String.format("mine_%s_%s.png", BEGINNER_BOX_WIDTH_PX, BEGINNER_BOX_HEIGHT_PX));
    }
}
