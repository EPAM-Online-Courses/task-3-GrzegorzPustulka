package efs.task.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya",30);
        Villager akara = new ExtraordinaryVillager("Akara",40, ExtraordinaryVillager.Skill.SHELTER);
        Object objectAkara = akara;
        Villager gheed = new Villager("Gheed",50);
        Villager deckardCain = new ExtraordinaryVillager("Deckard Cain",85, ExtraordinaryVillager.Skill.IDENTIFY);
        Object objectDeckardCain = deckardCain;
        Villager warriv = new Villager("Warriv",35);
        Villager flavia = new Villager("Flawia",25);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flavia.sayHello();


        List<Villager> villagers = new ArrayList<>();
        villagers.add(kashya);
        villagers.add(akara);
        villagers.add(gheed);
        villagers.add(deckardCain);
        villagers.add(warriv);
        villagers.add(flavia);

        List<Monster> monsters = new ArrayList<>();
        monsters.add(Monsters.blacksmith);
        monsters.add(Monsters.andariel);


        while(Monsters.getMonstersHealth() > 0){
            for (Villager villager : villagers) {
                if (villager.getHealth() <= 0) {
                    continue;
                }
                for (Monster monster : monsters){
                    if (monster.getHealth()<= 0)
                    {
                        continue;
                    }
                    System.out.println("Potwory posiadaja jeszcze "+Monsters.getMonstersHealth()+" punkty zycia");
                    System.out.println("Aktualnie walczacy osadnik to "+villager.getName());
                    villager.attack(monster);
                    monster.attack(villager);
                    if (Monsters.getMonstersHealth() <= 0){
                        System.out.println("Obozowisko ocalone!");
                        deckardCain = (ExtraordinaryVillager) objectDeckardCain;
                        akara = (ExtraordinaryVillager) objectAkara;
                        break;
                    }
                }
            }
        }
    }
}