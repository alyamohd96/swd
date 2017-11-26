public class MazeTraversal {

    private static final int DOWN = 0;
    private static final int RIGHT = 1;
    private static final int UP = 2;
    private static final int LEFT = 3;
    private static final int startRow = 2;
    private static final int startColumn = 0;
    private static int moves = 0;
    private static char maze[][] = {{'#','#','#'}}

    public void traverse()  {
        boolean result = mazeTraversal(maze, startRow, startColumn);
        if(!result)
            System.out.println("Maze has no solution");
    }

    private boolean mazeTraversal(char maze[][], int x, int y)   {
        maze[x][y] = 'X';
        moves++;
        printMaze();

    }

    private boolean validMove(int row, int col)  {
        return ((row >= 0) && (row <= 11) && (col >= 0) && (col <= 11) && maze([row][col] == '.'));
    }

    private boolean mazeExited() {

    }

    private void printMaze()    {
        int x = 5;
        int y = 30;

    }

}
