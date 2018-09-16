package threads123;

import java.util.Arrays;

public class Threads123 {

    public static void main(String[] args) throws InterruptedException {

        ThreadFibonacci tf = new ThreadFibonacci(10);
        ThreadPrimos tp = new ThreadPrimos(10);

        tf.start();
        tp.start();

        tf.join();
        tp.join();

        System.out.println("Fibonacci: " + Arrays.toString(tf.getFibonacci()));
        System.out.println("Los primos:" + Arrays.toString(tp.getValores()));
    }

}

//TODO: hacer un programa que utilize 2 o + threads para determinar si una matriz es simetrica