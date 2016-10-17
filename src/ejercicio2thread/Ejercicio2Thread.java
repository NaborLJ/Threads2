package ejercicio2thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio2Thread extends Thread {

    public Ejercicio2Thread(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i + " " + getName());
                System.out.println("Termina el thread : " + getName());
                Ejercicio2Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio2Thread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        new Ejercicio2Thread("Thread1").start();
        new Ejercicio2Thread("Thread2").start();
        new Ejercicio2Thread("Thread3").start();
        new Ejercicio2Thread("Thread3").start();
        new Ejercicio2Thread("Thread4").start();
    }

}
