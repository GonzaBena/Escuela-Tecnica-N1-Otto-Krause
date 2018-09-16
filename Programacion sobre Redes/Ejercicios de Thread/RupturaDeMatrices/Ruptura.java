package pepe;

public class Ruptura extends Thread{
  
  private int[] array;
  private int rupt = 0;
  private int index = 0;
  private int count = 0;

  public Ruptura(int[] array) {
    this.array = array;
  }

  public int getRupt() {
    return rept;
  }

  @Override
  public void run() {
    for (int i = this.index; i < this.count-1 ; i++) {
      if (!array[i]< array[i+1])) {
        this.rupt++;
      }
    }
  }
}
