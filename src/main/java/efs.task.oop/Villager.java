package efs.task.oop;

public class Villager implements Fighter {
    private final String  name;
    private final int age;
    private  int health;
    public Villager(String name, int age){
        this.name = name;
        this.age = age;
        this.health =100;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void sayHello(){
        System.out.println("Greetings traveler... I'm "+this.name+" and I'm "+this.age+" years old");
    }
    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int) ((health - age * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage) {
        health-= damage;
    }
}

