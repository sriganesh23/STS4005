public class Maze{
    public static void main(String[] args){
        int[][] maze={
            {1,0,0,0},
            {1,1,1,1},
            {1,0,1,0},
            {0,1,1,1}
        };
        int r=maze.length;
        int c=maze[0].length;
        int[][] sol=new int[r][c];
        if (solveMaze(maze,r,c,sol,0,0)){
            for (int i[]:sol){
                for (int j:i){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("No solution exist.");
        }
    }
    static boolean solveMaze(int[][] maze, int r, int c, int[][] sol, int i, int j){
        if (i==r-1 && j==c-1){
            sol[i][j]=1;
            return true;
        }
        if (isValid(maze, i,j,r,c)){
            if (sol[i][j]==1)
                return false;
            sol[i][j]=1;
            if (solveMaze(maze, r, c, sol, i, j+1)||solveMaze(maze,r,c,sol,i+1,j)||solveMaze(maze, r,c, sol, i, j-1)||solveMaze(maze,r,c,sol,i-1,j))
                return true;
            sol[i][j]=0;
            return false;
        }
        return false;
    }
    static boolean isValid(int[][] maze, int i, int j, int r, int c){
        return i>=0 && i<r && j>=0 && j<c && maze[i][j]==1;
    }

}