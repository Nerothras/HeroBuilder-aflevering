package opg1;

import java.util.Arrays;

public class Main {

    //Iteration 1
    void main(){

    String name = "Nerothras";
    int maxHealth = 100;
    int currentHp = 90;
    int level = 10;
    int experiencePoints = 2000;
    int gold = 500;
    boolean isAlive = true;
    String classType = "Warrior";
    String[] inventoryItems = {"Greatsword", "Hp potion", "Cooked boar meat", "Water","Hearthstone"};

    System.out.println("Character name: " + name);
    System.out.println("Max hp: " + maxHealth);
    System.out.println("HP: " + currentHp);
    System.out.println("Your level: " + level);
    System.out.println("XP: " + experiencePoints);
    System.out.println("Gold ammount: " + gold);
    System.out.println("You are alive = " + isAlive);
    System.out.println("Class: " + classType);
    System.out.println("Inventory: " + Arrays.toString(inventoryItems));


}







}
