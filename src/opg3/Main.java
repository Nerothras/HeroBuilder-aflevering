package opg3;

import java.util.Arrays;

public class Main {

    String name = "Nerothras";
    int maxHealth = 100;
    int currentHp = 90;
    int level = 10;
    int xpPoints = 0;
    double gold = 0.0;
    boolean isAlive = true;
    String classType = "Warrior";
    String[] inventoryItems = {"Greatsword", "Hp potion", "Cooked boar meat", "Water","Hearthstone"};


    void main(){

        // Printer karakterblad
        System.out.println();
        System.out.println("INVENTORY CHECK!");
        System.out.println("****************");
        printCharacterSheet();
        System.out.println("****************");
        System.out.println();

        // Printer inventory
        System.out.println("INVENTORY CHECK");
        System.out.println("****************");
        printInventory();
        System.out.println("****************");
        System.out.println();

        // Tager skade

        System.out.println("COMBAT");
        System.out.println("****************");
        takeDamage(30);
        isHealthCritical();
        getHealthPercentage();
        System.out.println("****************");
        System.out.println();

        // potion healing
        System.out.println("POTION USE");
        System.out.println("****************");;
        heal(30);
        isHealthCritical();
        getHealthPercentage();
        System.out.println("****************");
        System.out.println();

        // Tilføjer og fjerner guld
        System.out.println("USE And REMOVE GOLD");
        System.out.println("****************");
        addGold(100);
        removeGold(50);
        System.out.println("****************");
        System.out.println();

        //xp og lvl up
        System.out.println("LEVEL UP");
        System.out.println("****************");
        addXP(2000);
        levelUp();
        System.out.println("****************");
        System.out.println();

        // Endelig status
        System.out.println("FINAL STATUS");
        System.out.println("****************");
        printCharacterSheet();
        printInventory();
        System.out.println("****************");

        System.out.println("GAME OVER");


    }


   void printCharacterSheet(){

       System.out.println("Character name: " + name);
       System.out.println("Max hp: " + maxHealth);
       System.out.println("HP: " + currentHp);
       System.out.println("Your level: " + level);
       System.out.println("XP: " + xpPoints);
       System.out.println("Gold ammount: " + gold);
       System.out.println("You are alive = " + isAlive);
       System.out.println("Class: " + classType);



    }

    void takeDamage(int damage) {
        currentHp -= damage;
        if (currentHp <= 0) {
            currentHp = 0;
            isAlive = false;

        }
        System.out.println("Du tog " + damage + " damage!");
        System.out.println("HP: " + currentHp);
    }

    void heal(int amount){

        for (String item : inventoryItems) {
            if (item.equals("Hp potion")) {

                currentHp += amount;

                if (currentHp > maxHealth) {
                    currentHp = maxHealth;
                }
                isAlive = true;

                System.out.println("Nerothras uses HP potion: " + amount + " HP.");
                System.out.println("HP: " + currentHp + "/" + maxHealth);
            }
        }


    }
     void addGold(double goldcoin){
          gold += goldcoin;
         System.out.println("Mission complete!");
         System.out.println(goldcoin + " gold, has been added!");

        }




   boolean removeGold(double goldAmount){

       if (gold >= goldAmount) {
           gold -= goldAmount;
           System.out.println("You bought HP potion, it cost: " + goldAmount + " gold.");
           return true;
       } else {
           System.out.println("Ikke nok gold!");
           return false;
       }
   }


   void addXP(int xpAdd){

    xpPoints += xpAdd;



    }

    void levelUp(){

    if(xpPoints >= 1000){
        level++;
        xpPoints = 0;
        maxHealth += 20;
        currentHp = maxHealth;

        System.out.println("Congratulations! " + name + " leveled up!");
        System.out.println("New level: " + level);
        System.out.println("Max Health increased to: " + maxHealth);
        System.out.println("HP restored to: " + currentHp);
    } else {
        System.out.println("Not enough XP to level up.");

        }
    }




    boolean isHealthCritical() {
        if (currentHp < maxHealth * 0.25) {
            System.out.println("!****************!");
            System.out.println("| WARNING LOW HP |");
            System.out.println("!****************!");
            return true;
        } else {
            System.out.println("Nerothras is healthy");
            return false;
        }

    }



    boolean isalive(){

            return currentHp > 0;

    }

    double getHealthPercentage() {
        double healthInProcent = ((double) currentHp / maxHealth) * 100;
        System.out.println("You have: " + healthInProcent + "% left");
        return healthInProcent;
    }






        void printInventory() {
            System.out.println("Inventory: " + Arrays.toString(inventoryItems));
        }








}
