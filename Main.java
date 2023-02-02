import java.util.*;

public class Main {
    public static void main(String[] args){
        Griddy g = new Griddy();
        Scanner sc = new Scanner(System.in);
        String[][] grid = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        String[][] gridL = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        int x;
        int y;
        int i = 0;
        while (i == 0){
            i = ((int) Math.round(((Math.random() * 2) - 1)));
        }
        while (true){
            g.printGrid(gridL);
            gridL = g.clearGrid(gridL);
            System.out.println("--------------------------");
            if (i == 1){
                System.out.println("X:\nWhat column? ");
                x = Integer.parseInt(sc.nextLine());
                System.out.println("X:\nWhat row? ");
                y = Integer.parseInt(sc.nextLine());
                if (grid[y-1][x-1].equals(" ")){
                    grid = g.xPlace(y-1, x-1, grid);
                    gridL = g.xPlace(y-1, x-1, gridL);
                    i *= -1;
                }
            }
            else if (i == -1){
                System.out.println("O:\nWhat column? ");
                x = Integer.parseInt(sc.nextLine());
                System.out.println("O:\nWhat row? ");
                y = Integer.parseInt(sc.nextLine());
                if (grid[y-1][x-1].equals(" ")){
                    grid = g.oPlace(y-1, x-1, grid);
                    gridL = g.oPlace(y-1, x-1, gridL);
                    i *= -1;
                }
            }
            System.out.print("\033[H\033[2J"); 
            if ((!grid[0][0].equals(" ")&&grid[0][0].equals(grid[1][1])&&grid[1][1].equals(grid[2][2]))||(!grid[0][2].equals(" ")&&grid[0][2].equals(grid[1][1])&&grid[1][1].equals(grid[2][0]))||(!grid[0][0].equals(" ")&&grid[0][0].equals(grid[1][0])&&grid[1][0].equals(grid[2][0]))||(!grid[0][1].equals(" ")&&grid[0][1].equals(grid[1][1])&&grid[1][1].equals(grid[2][1]))||(!grid[0][2].equals(" ")&&grid[0][2].equals(grid[1][2])&&grid[1][2].equals(grid[2][2]))||(!grid[0][0].equals(" ")&&grid[0][0].equals(grid[0][1])&&grid[0][1].equals(grid[0][2]))||(!grid[1][0].equals(" ")&&grid[1][0].equals(grid[1][1])&&grid[1][1].equals(grid[1][2]))||(!grid[2][0].equals(" ")&&grid[2][0].equals(grid[2][1])&&grid[2][1].equals(grid[2][2]))){
                g.printGrid(grid);
                System.out.println("--------------------------");
                if (i == 1){
                    System.out.println("O Won!");
                }
                if (i == -1){
                    System.out.println("X Won!");
                }
                break;
            }
        }
    }
}
