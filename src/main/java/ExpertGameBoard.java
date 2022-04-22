public class ExpertGameBoard extends GameBoard {

    public static final int EXPERT_BOX_WIDTH_PX = 25;
    public static final int EXPERT_BOX_HEIGHT_PX = 25;
    public static final int EXPERT_ROW_COUNT = 25;
    public static final int EXPERT_COL_COUNT = 22;
    public static final int EXPERT_MINES_COUNT = 91;

    public ExpertGameBoard() {
        this.setWidth(EXPERT_BOX_WIDTH_PX);
        this.setHeight(EXPERT_BOX_HEIGHT_PX);
        this.setRowCount(EXPERT_ROW_COUNT);
        this.setColCount(EXPERT_COL_COUNT);
        this.setMinesCount(EXPERT_MINES_COUNT);
        this.setMineImagePath(String.format("mine_%s_%s.png", EXPERT_BOX_WIDTH_PX, EXPERT_BOX_HEIGHT_PX));
    }
}
