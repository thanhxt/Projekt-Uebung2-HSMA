package pr2.pu2;

public class Tier extends Thread{
    protected int x,y, lebensenergie;


    protected Tier(int lebensenergie){
        this.lebensenergie = lebensenergie;
    }

    public void run() {
        while (lebensenergie > 0) {
            lebensenergie--;
            sleep();
        }
    }

    protected void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void main() {
        Tier tiger = new Tier(33);
        Thread t = new Thread();
        t.start();

    }

}
