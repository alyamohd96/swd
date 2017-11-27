/**
 * This is a final class that traverses through a maze of char array. It contains one class variable, one constructor,
 * and three methods. It is meant to be used as a utility class
 * Credit: http://www.octopusfunda.com/2015/05/maze-traversal-using-recursive.html
 */

// WHY FINAL?
// Correct way to define utility class is to make it final so that no other class can extend it and to have
// private no-args constructor so that no one can create an instance of the class so you won't be able to create
// instance of class any how.

public final class MazeTraversal {

    private static int moves = 0;

    /**
     * This constructor is private so that no user can create an instance of this class as this class is meant
     * to be used a utility class.
     */
    private MazeTraversal() {

    }

    /**
     * This is a method that traverse through the maze by calling the static mazeTraversal method. It has
     * @param maze the maze in char array
     * @param startRow the row of where to start
     * @param startColumn the column of where to start
     */
    public static void traverse(char maze[][], int startRow, int startColumn) {
        mazeTraversal(maze, startRow, startColumn);
    }

    /**
     * This class prints the maze given the maze in char array
     * @param maze maze
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
     * This static method traverses through the maze by going to the direction whenever there's a path available.
     * It applies recursive backtracking
     * @param maze maze
     * @param i the row of the X
     * @param j the column of the X
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
        }
        //If reached end of maze
        else if (i == 0 || j == 0 || i == 11 || j == 11) {
            maze[i][j] = 'X';
        }
        //Wrong Path
        else {
            maze[i][j] = '0';

            //Tracing back the path

            //LEFT
            if (j > 0 && maze[i][j - 1] == 'X') {
                maze[i][j] = '0';
                mazeTraversal(maze, i, j - 1);
            }
            //RIGHT
            else if (j < 11 && maze[i][j + 1] == 'X') {
                maze[i][j] = '0';
                mazeTraversal(maze, i, j + 1);
            }
            //UP
            else if (i > 0 && maze[i - 1][j] == 'X') {
                maze[i][j] = '0';
                mazeTraversal(maze, i - 1, j);
            }
            //DOWN
            else if (i < 11 && maze[i + 1][j] == 'X') {
                maze[i][j] = '0';
                mazeTraversal(maze, i + 1, j);
            }
        }
    }

}
