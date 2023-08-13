package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        int i, j;
        for (i = 1; i <= sideLength; i++)
        {
            for (j = 1; j <= sideLength; j++)
            {
                if (i == 1 || i == sideLength ||
                        j == 1 || j == sideLength)
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
