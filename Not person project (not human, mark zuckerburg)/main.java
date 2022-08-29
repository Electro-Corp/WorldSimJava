public class main{ 
   public static void main(String[] args) {
        human testhuman = new human("Person Guy",104,141241,false,false,false);
        testhuman.say("Hi");
        human trevor = new human("Trevor",36,125,false,false,true);
        trevor.say("Imma start a dictatorship lamo");
        // Trevorland
        goverment trevorland = new goverment(3,20,trevor,"Trevorland");
        testhuman.say("I should join trevorland?");
        trevorland.addPerson(testhuman);
        testhuman.say("*insert bad joke here*");
        testhuman.die();
        
        //new human
        human logan = new human("Logan",414,1433,false,false,true);
        trevorland.addPerson(logan);
        
        //new enemy goverment
        human chinmay = new human("Chinmay Tiwari",245,142,false,false,true);
        goverment creator = new goverment(3,0,chinmay,"creator");
        
        for (int i = 0; i < 200; i++){
            trevorland.update();
            creator.update();
        }
        
    }
    
}