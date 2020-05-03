package pr2.pu2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Zoo implements Iterable {

    Map<String, HashMap> map = new HashMap<>();


    public void main(){

        ArtenGehege gehege = new ArtenGehege();
        String hase = "HasenGehege",Tier = "TierGehege";

        map.put(hase,gehege.hase);
        map.put(Tier,gehege.tier);

        //Interable-interface
        for(Map.Entry<String,HashMap>entry : map.entrySet()){
            System.out.println("Key= " + entry.getKey()+", Value =" + entry.getValue());
        }

    }

    @Override
    public Iterator<Tier> iterator(){

        return (Iterator<Tier>) Tier.create();
    }

}
