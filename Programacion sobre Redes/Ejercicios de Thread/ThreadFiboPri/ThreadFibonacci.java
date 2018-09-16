package threads123;

public class ThreadFibonacci extends Thread {

    private int[] fibonacci;
    private boolean esSecuenciaFibonacci;

    public ThreadFibonacci(int m) {
        this.fibonacci = new int[m];
        this.esSecuenciaFibonacci = false;
    }

    public boolean esSecuenciaFibonacci() {
        return this.esSecuenciaFibonacci;
    }

    public int[] getFibonacci() {
        return fibonacci;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.fibonacci.length; ++i) {
            if (i == 0 || i == 1)
                this.fibonacci[i] = 1;
            else
                this.fibonacci[i] = (this.fibonacci[i - 1] + this.fibonacci[i - 2]);
            
        }
    }

}
