package pepe;
public class Main {

  public static void main(String[] args) {
    
    int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};

		Ruptura rup1 = new Ruptura(array, 0, array.length/2);
		Ruptura rup2 = new Ruptura(array, array.length/2, array.length);

		rup1.start();
		rup2.start();

		rup1.join();
		rup2.join();

		int total = rup1.getRupt() + rup2.getRupt();
		int mitad = (int)(Math.floor(array.length/2));

		if(mitad> mitad+1){
			total++;
		}

		System.out.println("La cantidad de rupturas es: " + total);
    

  }
}
