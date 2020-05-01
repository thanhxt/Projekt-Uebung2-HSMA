package pr2.pu2;

public class Hase extends Tier {
    protected Hase(int lebensenergie) {
        super(lebensenergie);
    }


    @Override
    public String setName() {
        String name;
        String tier = "Hase-";
        if(anzahl<10)
            name = "00" + anzahl;
        else if(anzahl >9 && anzahl< 100)
            name = "0" +anzahl;
        else
            name = Integer.toString(anzahl);
        return tier+name;
    }

    /**
     * factory method of Hase that returns an instance of Hase with an Integer of 40
     * @return
     */
    public static Hase create(){

        anzahl++;
        return new Hase(40);
    }

}
