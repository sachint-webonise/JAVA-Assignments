
package DiningPhilosophers;

public class Philosopher implements Runnable {
    
    private Fork left;
    private Fork right;
    private String name;
    
    public Philosopher(Fork left, Fork right,String name){
        this.left= left;
        this.right= right;
        this.name= name;
    }
    
    public void think() throws InterruptedException{
        Thread.sleep((int)Math.random()*5000);
    }
    
    public void eat() throws InterruptedException{
    	Thread.sleep((int)Math.random()*8000);
    }
    
    public void run(){
        try{
            while(true){
                System.out.println(this.name+ " is thinking");
                think();
                System.out.println(this.name+ " picks right Fork");
                right.hold();
                System.out.println(this.name+ " picks left Fork");
                left.hold();
                System.out.println(this.name+ " is eating spaghetti");
                eat();
                System.out.println(this.name+ " leaves right Fork");
                right.free();
                System.out.println(this.name+ " leaves left Fork");
                left.free();
            }
        }
        
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
