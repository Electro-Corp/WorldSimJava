public class goverment {
    /*
     * TYPES: 
     * 0 = Anarchy
     * 1 = Monarcy
     * 2 = Democracy
     * 3 = Dictators
     */
    int type,wealth;
    human peoples[];
    human leader;
    String types[] = {"Anarchy","Monarchy","Democracy","Dictatorship"};
    goverment(int type, int wealth, human leader){
        this.type = type;
        this.wealth = wealth;
        this.leader = leader;
        System.out.println("A new goverment has been formed with type: "+types[type]+", and with leader: "+leader.name);
    }
    
}