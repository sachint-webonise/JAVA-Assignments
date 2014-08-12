
package DiningPhilosophers;


public class Fork{
    
    public boolean busy= false;
    
    public synchronized void hold() throws InterruptedException{
        while(busy){
            wait();
        }
        busy = true;
    }
    
    public synchronized void free(){
        busy = false;
        notifyAll();
    }
}
