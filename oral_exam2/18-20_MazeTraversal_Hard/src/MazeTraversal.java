import java.util.Scanner;

public class MazeTraversal {

    private static final int DOWN = 0;
    private static final int RIGHT = 1;
    private static final int UP = 2;
    private static final int LEFT = 3;
    private static final int startRow = 2;
    private static final int startColumn = 0;
    private static int moves = 0;
    private static char maze[][] = { {'#','#','#','#','#','#','#','#','#','#','#','#'},
            {'#','.','.','.','#','.','.','.','.','.','.','#'},
            {'.','.','#','.','#','.','#','#','#','#','.','#'},
            {'#','#','#','.','#','.','.','.','.','#','.','#'},
            {'#','.','.','.','.','#','#','#','.','#','.','.'},
            {'#','#','#','#','.','#','.','#','.','#','.','#'},
            {'#','.','.','#','.','#','.','#','.','#','.','#'},
            {'#','#','.','#','.','#','.','#','.','#','.','#'},
            {'#','.','.','.','.','.','.','.','.','#','.','#'},
            {'#','#','#','#','#','#','.','#','#','#','.','#'},
            {'#','.','.','.','.','.','.','#','.','.','.','#'},
            {'#','#','#','#','#','#','#','#','#','#','#','#'} };
    public Scanner input = new Scanner(System.in);

    public void traverse() {
        boolean result = mazeTraversal(maze, startRow, startColumn);
        if (!result)
            System.out.println("Maze has no solution");
    }

    private boolean mazeTraversal(char maze[][], int x, int y) {
        maze[x][y] = 'X';
        moves++;
        printMaze();
        if(( x == startRow) && (y == startColumn) && (moves > 1))   {
            System.out.print("Returned to starting location!");
            return false;
        }
        else if( mazeExited(x,y) && (moves > 1)) {
            System.out.println("Maze successfully exited");
            return true;
        }
        else    {
            System.out.print( "Enter 'y' to continue 'n' to exit: ");
            char response = input.nextLine().charAt(0);
            if(response == 'n')
                System.exit(0);

            for(int count = 0; count < 4; count++)  {
                switch(count)   {
                    case DOWN:
                        if(validMove(x+1,y))    {
                            if(mazeTraversal(maze,x+1,y))
                                return true;
                        }
                        break;
                    case RIGHT:
                        if(validMove(x,y+1))    {
                            if(mazeTraversal(maze,x+1,y))
                                return true;
                        }
                        break;
                    case UP:
                        if(validMove(x-1,y))    {
                            if(mazeTraversal(maze,x+1,y))
                                return true;
                        }
                        break;
                    case LEFT:
                        if(validMove(x,y-1))    {
                            if(mazeTraversal(maze,x+1,y))
                                return true;
                        }
                }
            }
            maze[x][y] = '0';
            return false;
        }
    }

    private boolean validMove(int row, int col) {
        return ( (row >= 0) && (row <= 11) && (col >= 0) && (col <= 11) && (maze[row][col] == '.') );
    }

    private boolean mazeExited(int row, int col) {
        return ( (row == 11) || (col == 11) );
    }

    private void printMaze() {
        int x = 5;
        int y = 30;

        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                if (maze[row][col] == '0')
                    System.out.print(".");
                else
                    System.out.print(" " + maze[row][col]);
            }
            y += 10;
            x = 5;
            System.out.println();
        }
        System.out.println();
    }

}
