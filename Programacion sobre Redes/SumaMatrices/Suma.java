package suma;


public class Suma extends Thread{

  private int[][] matriz1;
  private int[][] matriz2;
  private int[][] matrizResultado;
  private int index;
  private int Final;
  public Suma(int[][] matriz1, int[][] matriz2,int[][] resultado, int index, int Final){
    this.matriz1 = matriz1;
    this.matriz2 = matriz2;
    this.matrizResultado = resultado;
    this.index = index;
    this.Final = Final;
    if (this.matriz1.length != this.matriz2.length || this.matriz1[0].length != this.matriz2[0].length) {
      throw new IllegalArgumentException("Las matrices son incompatibles");
    }
  }

  @Override
  public void run() {
    for (int i = this.index; i < this.Final; i++) {
      for (int j = 0; j < matriz1[0].length; j++) {
        this.matrizResultado[i][j] = this.matriz1[i][j] + this.matriz2[i][j];
      }
    }
  }

}