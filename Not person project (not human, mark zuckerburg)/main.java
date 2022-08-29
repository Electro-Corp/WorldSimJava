import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
public class main{ 
   public static void main(String[] args) {
        human testhuman = new human("Person Guy",104,141241,false,false,false);
        testhuman.say("Hi");
        human trevor = new human("Trevor",36,125,false,false,true);
        trevor.say("Imma start a dictatorship lamo");
        // Trevorland
        goverment trevorland = new goverment(3,20,trevor,"Trevorland",5);
        testhuman.say("I should join trevorland?");
        trevorland.addPerson(testhuman);
        testhuman.say("*insert bad joke here*");
        testhuman.die();
        
        //new human
        human logan = new human("Logan",414,1433,false,false,true);
        trevorland.addPerson(logan);
        
        //new enemy goverment
        human chinmay = new human("Chinmay Tiwari",245,142,false,false,true);
        goverment creator = new goverment(3,0,chinmay,"creator",7);
        
        List<goverment> goverments =  new ArrayList<goverment>();
        
        for (int i = 0; i < 15; i++){
            trevorland.update(goverments);
            creator.update(goverments);
        }
        
    }
    
}