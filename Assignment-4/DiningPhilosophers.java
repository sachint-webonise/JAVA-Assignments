
package DiningPhilosophers;

import java.io.IOException;

public class DiningPhilosophers {
 
    public static void main(String args[]) throws IOException{
        
        Philosopher philosophers[]= new Philosopher[5];
        Fork Forks[]= new Fork[5];
        String names[] = {"Prashant","Taha","Chirag","Murtaza","Palash"};
        
        for(int i=0; i<Forks.length; i++){
            Forks[i] = new Fork();
        }
        
        for(int i=0; i<philosophers.length; i++){
            philosophers[i] = new Philosopher(Forks[i], Forks[(i+1)%Forks.length],names[i]);
            Thread t = new Thread(philosophers[i]);
            t.start();
        }
        
        
    }
}
