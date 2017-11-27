/**
 * http://www.octopusfunda.com/2015/05/maze-traversal-using-recursive.html
 */

public final class MazeTraversal {

    private static int moves = 0;

    /**
     *
     */
    private MazeTraversal() {

    }

    /**
     *
     * @param maze
     */
    public static void traverse(char maze[][], int startRow, int startColumn) {
        mazeTraversal(maze, startRow, startColumn);
    }

    /**
     *
     * @param maze
     */
    public static void printMaze(char maze[][]) {
        System.out.println("Move Number-" + moves);
        for (int k = 0; k < 12; k++) {

            for (int l = 0; l < 12; l++) {
                System.out.print(maze[k][l] + "  ");
            }
            System.out.println();

        }
    }

    /**
     *
     * @param maze
     * @param i
     * @param j
     */
    private static void mazeTraversal(char maze[][], int i, int j) {
        moves++;

        //LEFT move
        if (j > 0 && maze[i][j - 1] == '.') {

            maze[i][j] = 'X';
            mazeTraversal(maze,i, j - 1);

        }
        ////RIGHT move
        else if (j < 11 && maze[i][j + 1] == '.') {

            maze[i][j] = 'X';
            mazeTraversal(maze,i, j + 1);

        }
        ////UP move
        else if (i > 0 && maze[i - 1][j] == '.') {

            maze[i][j] = 'X';

            mazeTraversal(maze,i - 1, j);

        }
        ////DOWN move
        else if (i < 11 && maze[i + 1][j] == '.') {

            maze[i][j] = 'X';

            mazeTraversal(maze,i + 1, j);

        } else if (i == 0 || j == 0 || i == 11 || j == 11) {

            maze[i][j] = 'X';

        } else {

            maze[i][j] = '0';//Wrong Path

            /////////////////////////TRACING BACK//////////////////////

            if (j > 0 && maze[i][j - 1] == 'X') {//LEFT

                maze[i][j] = '0';

                mazeTraversal(maze, i, j - 1);

            } else if (j < 11 && maze[i][j + 1] == 'X') {//RIGHT

                maze[i][j] = '0';

                mazeTraversal(maze, i, j + 1);

            } else if (i > 0 && maze[i - 1][j] == 'X') {//UP

                maze[i][j] = '0';

                mazeTraversal(maze, i - 1, j);

            } else if (i < 11 && maze[i + 1][j] == 'X') {//DOWN

                maze[i][j] = '0';

                mazeTraversal(maze, i + 1, j);

            }
        }
    }

}
