import java.util.Arrays;

public class Arrays_2D {
    public static void main(String[] args) {
        int[][] arr_2d={   {1,2,3}, {4,5,6}, {7,8,9}   };
        for (int row = 0; row < 3 /*row.length */; row++) {
                for (int col = 0; col < 3 /*col.length*/; col++)
                    System.out.println(arr_2d[row] [col]+ "  ");
                    System.out.println();
            }
           
        }
    }

