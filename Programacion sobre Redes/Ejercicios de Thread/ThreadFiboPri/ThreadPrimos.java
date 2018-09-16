package threads123;

public class ThreadPrimos extends Thread {

    private int[] valores;

    public ThreadPrimos(int n) {
        this.valores = new int[n];
    }

    @Override
    public void run() {
        int j = 2;
        for (int i = 0; i < valores.length; i++) {
            if (this.esPrimo(j)) {
                this.valores[i] = j;
            }else{
                i--;
            }
            j++;
        }
    }

    private static boolean esPrimo(int n) {
        if (n == 1) {
            return false;
        }

        final double sqrt = Math.sqrt(n);

        for (int i = 2; i <= sqrt; ++i) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int[] getValores() {
        return valores;
    }
}