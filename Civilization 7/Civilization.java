public class Civilization{
    /*
     * TYPE SHEET:
     * STARTING VALUES:
     *  THE STATES:
     *      1. WEALTH = 300
     *      2. AGRESSION = 5 / 10;
     *      3. TROOPS = 50;
     *  Bri'ish:
     *      1. WEALTH = 500
     *      2. AGRESSION = 7 /10;
     *      3. TROOPS = 100
     *  RUSSIA:
     *      1. WEALTH = 130
     *      2. AGRESSION = 9 / 10;
     *      3. TROOPS = 85
     *  
     */
    public void printf(Object s){
        System.out.println(s);
    }
    
    int wealth, type, agression, troops;
    Infantry main;
    Civilization(int type, int agression){
        this.type = type;
        this.agression = agression;
        
        if(type == 0){
            printf("THE STATES");
            wealth = 300;
            agression = 5;
            troops = 50;
        }
        
    }
}