package opg4;

public class Main {

    public static void main(){

        // Hero
        Character hero = new Character("Nerothras", "Warrior", "Human", 10, 50, 50, 50);

        Items item1 = new Items("GreatSword", "Weapon", 20);
        Items item2 = new Items("Health potion", "Consumable", 25);
        Items item3 = new Items("Gold pouch", "Bag", 0);
        Items item4 = new Items("Water", "Consumable", 5);


        hero.printCharacterSheet();
        System.out.println();
        hero.addItemToInventory(item1);
        hero.addItemToInventory(item2);
        hero.addItemToInventory(item3);
        hero.addItemToInventory(item4);
        hero.showInventory();
        System.out.println();

        // Enemy
        Character enemy = new Character("Hogger", "Fighter", "Gnoll", 10, 80, 80, 0);

        Items loot1 = new Items("Short Sword", "Weapon", 10);
        Items loot2 = new Items("Metal scrap", "Trash", 0);
        Items loot3 = new Items("Gold bar", "Quest item", 0);

        enemy.printCharacterSheet();
        System.out.println();
        enemy.addItemToInventory(loot1);
        enemy.addItemToInventory(loot2);
        enemy.addItemToInventory(loot3);
        enemy.showInventory();
        System.out.println();

        //combat and looting
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        hero.battle(enemy);
        System.out.println();
        hero.heal(hero.currentHp);
        hero.loot(enemy);
        System.out.println();
        System.out.println("--------------------------");
        hero.addXp(1000);
        hero.levelUp();
        System.out.println("Mission complete");
        System.out.println();
        System.out.println("---------------------------");
        hero.printCharacterSheet();
        hero.showInventory();





    }
}

//reflektion - generelt føler jeg mig stadig ny til mange af metoderne og de argumenter man bruger og hvordan de skal bruges
// jeg brugte mange timer på at for hvordan man angriber samt giver et inventory til en anden efter karakteren dør og bliver lootet.
// syntax og hvordan skal jeg nu gøre det her er mit store problem, men kommer nok, med tiden
// generelt giver metoder obejkter kontrolstrukture god mening og gør alt mere overskueligt når man laver koden og isært i det her lille spil:
// hvis jeg skulle tilføje noget, vil listen blive for lang. vil gerne have en Scanner med så man kan som spiller sige om man
// vil i kamp, eller loot efter et kill. vælge missioner der åbner for nye enemies osv.
// der til andre metoder som tilføjer random damage så eks et sværd giver mellem 5-10 damage og hvis man er heldig 2x damage.
