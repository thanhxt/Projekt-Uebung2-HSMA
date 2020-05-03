package pr2.pu2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ArtenGehege {

    HashMap<String,Integer> tier = new HashMap<String,Integer>();
    HashMap<String,Integer> hase = new HashMap<String,Integer>();
    public String hasen = "Hasen", tieren = "Tieren";

    public ArtenGehege(){

    }
    /**
     * Das Tier wird in das entsprechende Hashmap/Gehege eingefügt
     * und wird ausgegeben.
     * @param t
     */
    public void einsperren(Tier t){


        if(t instanceof Hase){
            hase.put(t.name,t.lebensenergie);
          //  System.out.println(hase);
        }
        else {
            tier.put(t.name, t.lebensenergie);
          //  System.out.println(tier);
        }

        t.start();
    }

    public void main(){
        einsperren(Hase.create());
        einsperren(Hase.create());
        einsperren(Hase.create());
        einsperren(Tier.create());

    }

}
