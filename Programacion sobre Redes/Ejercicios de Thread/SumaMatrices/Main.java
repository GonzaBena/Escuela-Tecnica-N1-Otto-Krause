package suma;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
      int[][] matriz1 = new int[][] {{1,2,3},
                                     {4,5,6},
                                     {7,8,9}};
      int[][] matriz2 = new int[][] {{1,2,3},
                                     {4,5,6},
                                     {7,8,9}};
      int[][] resultado = new int[matriz1.length][matriz2[0].length];

      Suma sum = new Suma(matriz1,matriz2,resultado,0,1);

      sum.start();
      sum.join();

      for (int i = 0; i < resultado.length; i++) {
        System.out.println(Arrays.toString(resultado[i]));
      }
    }
}
