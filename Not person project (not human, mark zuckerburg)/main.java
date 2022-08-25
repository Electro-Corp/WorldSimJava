public class main{ 
   public static void main(String[] args) {
        human testhuman = new human("Person Guy",104,141241,false,false,false);
        testhuman.say("Hi");
        human trevor = new human("Trevor",36,125,false,false,true);
        trevor.say("Imma start a dictatorship lamo");
        goverment trevorland = new goverment(3,0,trevor);
    }
    
}