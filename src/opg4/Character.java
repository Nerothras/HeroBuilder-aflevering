package opg4;

import java.util.ArrayList;

public class Character {

    String name;
    String heroClass;
    String race;
    int level;
    int maxHealth;
    int currentHealth;
    int gold;

    ArrayList<Character> inventory = new ArrayList<Character>();


    public Character(String name, String heroClass, String race, int level, int maxHealth, int currentHealth, int gold) {
        this.name = name;
        this.race = race;
        this.heroClass = heroClass;
        this.level = level;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.gold = gold;
        this.inventory = new ArrayList<>();
    }

    public void addItemtoInventory(Character item){
        inventory.add(item);
    }

    public void showInventory() {
        System.out.println("Inventory for " + name + ":");
        for (Character items : inventory) {
            System.out.println("- " + items);
        }
    }

}




