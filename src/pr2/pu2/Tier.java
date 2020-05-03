package pr2.pu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tier extends Thread{
    protected String name;
    protected int x,y, lebensenergie;



    static int anzahl = 0;

    /**
     * contructor of Tier
     * @param lebensenergie health energy
     */
    protected Tier(int lebensenergie){
        this.lebensenergie = lebensenergie;
        name = setName();
    }

    /**
     * run method that we are using for our incidentality
     * we are using the existing method and
     * rewriting it
     */
    @Override
    public void run() {
        for(;lebensenergie>0;lebensenergie--){
            System.out.println(name + " "+lebensenergie + " Leben");
            move();
            System.out.println("Position ("+x+"|"+y+")");
            sleep();
            System.out.println("Schlaf");
        }
    }

    /**
     * a sleep method that that waits 100ms
     */
    protected void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * main method that creates one Tier with 33 health energy
     * @throws InterruptedException
     */
    public static void main() throws InterruptedException {
        Tier tiger = new Tier(33);
        tiger.start();

    }

    /**
     * Method that sets our AnimalName
     * @return
     */
    public String setName(){
        String name;
        String tier = "Tier-";
        if(anzahl<10)
            name = "00" + anzahl;
        else if(anzahl >9 && anzahl< 100)
            name = "0" +anzahl;
        else
            name = Integer.toString(anzahl);
        return tier+name;
    }

    /**
     * Aufg 3
     * factory Method that returns an instance of Tier with a random Integer
     */
    public static Tier create(){

        Random rnd = new Random();
        int i = 1 + rnd.nextInt(99);
        anzahl++;


        return new Tier(i);
    }

    /**
     * move method
     * Tier is moving up, down, left, right or is staying still
     * depends on integer i
     */
    public void move(){
        Random rnd = new Random();

        int i=  rnd.nextInt(4);

        if(i==1)
            x++;
        else if(i==2)
            x--;
        else if(i==3)
            y++;
        else if(i==4)
            y--;

    }

    /**
     * Aufgabe 6
     *
     * Eine Liste wird benutzt, da wir in der Liste duplikate zulässig sind
     * und eine geordnete Darstellung der Tieren angezeigt wird.
     */
    public void gehege(String tier){
        List <String> list = new ArrayList<>();
        list.add(tier);
        for(String element : list){
            System.out.println(element);
        }
    }


}
