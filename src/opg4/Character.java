package opg4;

import java.util.ArrayList;


import java.util.ArrayList;

public class Character {

    String name;
    String heroClass;
    String race;
    int level;
    int maxHealth;
    int currentHp;
    int gold;
    int xpPoints;
    ArrayList<Items> inventory;



    public Character(String name, String heroClass, String race,
                     int level, int maxHealth, int currentHp, int gold) {

        this.name = name;
        this.heroClass = heroClass;
        this.race = race;
        this.level = level;
        this.maxHealth = maxHealth;
        this.currentHp = currentHp;
        this.gold = gold;
        this.xpPoints = 0;
        this.inventory = new ArrayList<>();

    }

//------------------------------------------------------------------------------//
    //inventory der henter item fra Items klassen  tog mig 2 timer at finde ud af.....
    public void addItemToInventory(Items item) {
        inventory.add(item);
    }

    public void showInventory() {
        System.out.println("Inventory for " + name + ":");
        for (Items item : inventory) {
            System.out.println("- " + item);
        }
    }

//---------------------------------------------------------------------------------------------//
    //Damage og giv damage metoder

    void takeDamage(int damage) {
        currentHp -= damage;

        if (currentHp <= 0) {
            currentHp = 0;
            System.out.println(name + " has died!");
        }

        System.out.println("Du tog " + damage + " damage!");
        System.out.println("HP: " + currentHp + "/" + maxHealth);
    }
        // attack tog lang tid også at finde ud af og forstå ca 1 time.. //

    void attack(Character target) {

        int damage = 1; // default damage hvis ingen weapon
        for (Items item : inventory) {
            if (item.itemType.equals("Weapon")) {
                damage = item.damageValue;
                break;
            }
        }

        System.out.println(name + " attacks " + target.name + " for " + damage + " damage!");
        target.takeDamage(damage);

    }

    public void battle(Character opponent) {
        System.out.println("BATTLE START");
        System.out.println();

        while (this.isAlive() && opponent.isAlive()) {


            this.attack(opponent);


            if (opponent.isAlive()) {
                opponent.attack(this);
            }

            System.out.println("--------------------");
        }

        System.out.println("Battle is over!");

        if (this.isAlive()) {
            System.out.println(this.name + " won!");
        } else {
            System.out.println(opponent.name + " won!");
        }
    }
//----------------------------------------------------------------------------------------------------//
    //heal metode
    void heal(int amount) {
        currentHp += amount;

        if (currentHp > maxHealth) {
            currentHp = maxHealth;
        }

        System.out.println(name + " uses health potion - " + amount + " HP.");
        System.out.println("HP: " + currentHp + "/" + maxHealth);
    }

//--------------------------------------------------------------------------------------------//
    //giv og modtag penge og loot items

    void addGold(int goldCoin) {
        gold += goldCoin;
        System.out.println(goldCoin + " gold added!");
    }

    boolean removeGold(int goldAmount) {
        if (gold >= goldAmount) {
            gold -= goldAmount;
            System.out.println("You spent " + goldAmount + " gold.");
            return true;
        } else {
            System.out.println("Ikke nok gold!");
            return false;
        }
    }

    public void loot(Character enemy) {
        if (!enemy.isAlive()) {
            System.out.println(this.name + " is looting " + enemy.name + "'s inventory:");

            for (Items item : enemy.inventory) {
                this.addItemToInventory(item);
                System.out.println("- " + item + " added to " + this.name + "'s inventory");
            }

            enemy.inventory.clear(); // fjern alle items fra enemy
        } else {
            System.out.println(enemy.name + " is still alive! Cannot loot.");
        }
    }

//-------------------------------------------------------------------------------------------//
    //få xp og level up metoder//

    void addXp(int xpAdd) {
        xpPoints += xpAdd;
        System.out.println("Experince points added: " + xpPoints);
    }

    void levelUp() {
        if (xpPoints >= 1000) {
            level++;
            xpPoints = 0;
            maxHealth += 20;
            currentHp = maxHealth;

            System.out.println(name + " leveled up!");
            System.out.println("New level: " + level);
        } else {
            System.out.println("Not enough XP to level up.");
        }
    }
    //----------------------------------------------------------------------//
    // er man i live og advarsel om lav liv mertoder //

    boolean isHealthCritical() {
        if (currentHp < maxHealth * 0.25) {
            System.out.println("!****************!");
            System.out.println("| WARNING LOW HP |");
            System.out.println("!****************!");
            return true;
        }
        return false;
    }

    boolean isAlive() {
        return currentHp > 0;
    }

    double getHealthPercentage() {
        double healthInPercent = ((double) currentHp / maxHealth) * 100;
        System.out.println("You have: " + healthInPercent + "% HP left");
        return healthInPercent;
    }

    //-------------------------------------------------------------------------//

    // print din karakter metode - nok den nemmeste af alle metoder. //

    void printCharacterSheet() {
        System.out.println("*-----------------------------*");
        System.out.println("Character name: " + name);
        System.out.println("Class: " + heroClass);
        System.out.println("*-----------------------------*");
        System.out.println("Max hp: " + maxHealth);
        System.out.println("Current HP: " + currentHp);
        System.out.println("*-----------------------------*");
        System.out.println("Your level: " + level);
        System.out.println("XP: " + xpPoints);
        System.out.println("*-----------------------------*");
        System.out.println("Gold ammount: " + gold);
        System.out.println("*-----------------------------*");


    }
}




