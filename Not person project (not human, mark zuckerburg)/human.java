class human{
    //global var lamo (real)
    String name;
    int age,weight;
    boolean dead, criminal, hasjob;
    //constructer thing
    public human(String name, int age, int weight, boolean dead, boolean criminal, boolean hasjob){
        this.name = name;
        this.age = age;
        this.dead = dead;
        this.criminal = criminal;
        this.hasjob = hasjob;
    }
    //ok and?
    public void say(Object s){
        if(dead == false){
            System.out.println(name + " says: "+s);
        }else{
            System.out.println(name + " is trying to say something, but they cant talk because they are dead!");
        }
    }
    public void die(){
        System.out.println(name + " is dead");
        dead = true;
    }
}