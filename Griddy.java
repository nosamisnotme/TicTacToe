public class Griddy {
    public Griddy(){

    }
    public String[][] xPlace(int x, int y, String[][] grid){
        grid[x][y] = "X";
        return grid;
    }
    public String[][] oPlace(int x, int y, String[][] grid){
        grid[x][y] = "O";
        return grid;
    }
    public void printGrid(String[][] grid){
        System.out.println(grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2] + "\n" + 
                           "— — —" + "\n" +
                           grid[1][0] + "|" + grid[1][1] + "|" + grid[1][2] + "\n" +
                           "— — —" + "\n" +
                           grid[2][0] + "|" + grid[2][1] + "|" + grid[2][2]);
    }
    public String[][] clearGrid(String[][] gridL){
        gridL[0][0] = " ";
        gridL[0][1] = " ";
        gridL[0][2] = " ";
        gridL[1][0] = " ";
        gridL[1][1] = " ";
        gridL[1][2] = " ";
        gridL[2][0] = " ";
        gridL[2][1] = " ";
        gridL[2][2] = " ";
        return gridL;
    }
}
