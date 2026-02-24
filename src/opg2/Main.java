package opg2;

public class Main {

    void main() {

        String name = "Nerothras";
        int maxHealth = 100;
        int currentHp = 90;
        int level = 10;
        int experiencePoints = 2000;
        int gold = 500;
        boolean isAlive = true;
        String classType = "Warrior";
        String[] inventoryItems = {"Greatsword", "Hp potion", "Cooked boar meat", "Water", "Hearthstone" };


        // ready to level up?

        if(experiencePoints >= 1500 && isAlive) {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("You are ready to Level up!");
            System.out.println("+++++++++++++++++++++++++++++");
        }else{
            System.out.println("you are not ready to level up yet");
        }



        // taking damage and check if you are alive
        System.out.println();
        System.out.println("------------------");
        System.out.println("Nerothras takes 40 damage!");

        int damage = 4;
        currentHp -= damage;
        System.out.println("HP: " + currentHp);
        int Hp = currentHp;


        System.out.println("Nerothras takes 100 damage!");
        currentHp -= 10;
        System.out.println("HP: " + currentHp);


        // lav hp test!
        if (currentHp < maxHealth * 0.25) {
            System.out.println("!****************!");
            System.out.println("| WARNING LOW HP |");
            System.out.println("!****************!");
        } else {
            System.out.println("!****************!");
            System.out.println("|You are healthy|");
            System.out.println("!****************!");
        }

        if (currentHp <= 0) {
            System.out.println("You are dead!");
            System.out.println("Status alive = " + !isAlive);


        } else {
            System.out.println("Yor are still alive!");
            System.out.println("Status alive = " + isAlive);

        }


    }


}







