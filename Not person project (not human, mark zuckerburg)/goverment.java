import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
public class goverment {
    /*
     * TYPES: 
     * 4 = Anarchy
     * 2 = Monarcy
     * 1 = Democracy
     * 3 = Dictators
     */
    int type,wealth,health,agression;
    List <goverment> enemys =  new ArrayList<goverment>();
    boolean atwar = false;
    List<human> peoples =  new ArrayList<human>();
    Scanner scan = new Scanner(System.in);
    human leader;
    String name;
    String types[] = {"Anarchy","Monarchy","Democracy","Dictatorship"};
    bird spyone = new bird();
    public void printf(Object e){
        System.out.println(e);
    }
    goverment(int type, int wealth, human leader, String name, int agression){
        this.type = type;
        this.wealth = wealth;
        this.leader = leader;
        this.name = name;
        this.agression = agression * type;
        health = 100;
        System.out.println("A new goverment has been formed with type: "+types[type]+", and with leader: "+leader.name);
    }
    public void attack(goverment enemyie){
        if(health > 0 && atwar == true){
            int number = (int)(Math.random()*100+1);
            number -= enemyie.wealth;
            if(enemyie.health > 0){
                printf(name + " has attacked " + enemyie.name + " with a "+number);
                if(number < 50){
                    printf("Attacked failed!");
                }else{
                    printf("Attack success!");
                    enemyie.health -= number;
                    printf(enemyie.name + " now has "+enemyie.health+" health left.");
                  if(enemyie.health < 0){
                    printf(enemyie.name + " has fallen!");
                  }
                }
            }else{
                printf(enemyie.name + " has fallen, yet "+name+" still tried to attack!!");
            }
        }else{
            printf(name+" has fallen!");
            atwar = false;
        }
    }
    public void update(List<goverment> goverments){
        if(health > 0){
        System.out.println(name+ ", is a goverment with type: "+types[type]+", and with leader: "+leader.name+" has peoples: ");
        int count = 0;
        for(int i = 0; i < peoples.size();i++){
            if(peoples.get(i).dead == false){
                System.out.println(count+". "+peoples.get(i).name);
                count++;
            }
        }
        Random rand = new Random();
        int spy = rand.nextInt((peoples.size() - 0) + 1) + 0;
        try{
        printf("'Bird' has spied and got : "+spyone.spy(peoples.get(spy)));
        }catch(Exception e){
            printf("Failed in spy mission. Maybe next time?");
        }
        diplomacy(goverments);
        if(atwar){
            for(int i = 0; i < enemys.size(); i++)            {
              if(enemys.get(i).health > 0 && health > 0){
                attack(enemys.get(i));
              }
            }
        }
        System.out.println("---------------------------------------------");
        String bruh = scan.nextLine();
      }
    }
    public void addPerson(human person){
        peoples.add(person);
        System.out.println(name + ", has a new member, "+person.name);
    }
    public void toWar(goverment enemy){
      if(!enemy.enemys.contains(this)){
            if(enemy.health > 0){
        enemys.add(enemy);
        System.out.println(name + " has declared war on: "+enemys.get(enemys.size()));
        atwar = true;
        
            enemys.get(enemys.size()).toWar(this);
            
        }
      }
    }
    
    public void diplomacy(List<goverment> goverments){
        for (int i = 0; i < goverments.size(); i++){
            if(goverments.get(i).name != name){
              talk(goverments.get(i));
            }
        }
    }
    public void talk(goverment other){
        Random rand = new Random();
        int agre = rand.nextInt((9*4 - 0) + 1) + 0;
        if(agre >= other.agression){
            toWar(other);
        }else{
          if(other.name != name){
            if(!atwar){
              printf("Diplomacy went well.");
            }
          }
        }
    }
}
