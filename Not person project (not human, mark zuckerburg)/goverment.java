import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
public class goverment {
    /*
     * TYPES: 
     * 0 = Anarchy
     * 1 = Monarcy
     * 2 = Democracy
     * 3 = Dictators
     */
    int type,wealth,health;
    goverment enemy;
    List<human> peoples =  new ArrayList<human>();
    human leader;
    String name;
    String types[] = {"Anarchy","Monarchy","Democracy","Dictatorship"};
    public void printf(Object e){
        System.out.println(e);
    }
    goverment(int type, int wealth, human leader, String name){
        this.type = type;
        this.wealth = wealth;
        this.leader = leader;
        this.name = name;
        health = 100;
        System.out.println("A new goverment has been formed with type: "+types[type]+", and with leader: "+leader.name);
    }
    public void update(){
        System.out.println(name+ ", is a goverment with type: "+types[type]+", and with leader: "+leader.name+" has peoples: ");
        int count = 0;
        for(int i = 0; i < peoples.size();i++){
            if(peoples.get(i).dead == false){
                System.out.println(count+". "+peoples.get(i).name);
                count++;
            }
        }
        System.out.println("---------------------------------------------");
    }
    public void addPerson(human person){
        peoples.add(person);
        System.out.println(name + ", has a new member, "+person.name);
        this.update();
    }
    public void toWar(goverment enemy){
        this.enemy = enemy;
        System.out.println(name + " has declared war on: "+enemy.name);
        if(enemy.enemy != this){
            enemy.toWar(this);
        }
    }
    public void attack(){
        if(health > 0){
            int number = (int)(Math.random()*100+1);
            number -= enemy.wealth;
            printf(name + " has attacked " + enemy.name + " with a "+number+"% chance of hitting");
            if(number < 50){
                printf("FAILED!");
            }else{
                printf("HIT! XD LAMO!");
                enemy.health -= number;
                printf(enemy.name + " now has "+enemy.health+" health left.");
            }
        }else{
            
        }
    }
}