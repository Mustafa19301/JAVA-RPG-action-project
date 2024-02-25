/**
 * Program: NetBeans (Java)
 * Programmer: Mustafa Ahmed
 * Date: 06/06/2022
 * Description: RPG game for culminating
 */
package rpgculminating;
import java.util.*;
import java.io.*;

public class RPGCulminating {

    public static Scanner scanN = new Scanner(System.in);
    public static Scanner scanS = new Scanner(System.in);
    public static String name;
    public static int damage = 0, damage1 = 0, damage2 = 0, damage3 = 0, 
            damage4 = 0, damage5 = 0, damage6 = 0, damage7 = 0, damage8 = 0;
    public static int health = 0, health1 = 0, health2 = 0, health3 = 0, 
            health4 = 0, health5 = 0, health6 = 0, health7 = 0, health8 = 0;
    public static int mana = 0, mana1 = 0, mana2 = 0, mana3 = 0, mana4 = 0, 
            mana5 = 0, mana6 = 0, mana7 = 0, mana8 = 0;
    public static int level = 1; 
    public static Stats Statistics = new Stats();
    public static User1 Player = new User1(150, 20, 300);
    public static Enemy1 Skeleton = new Enemy1(80, 5, 100);
    public static Enemy2 InfernoDemon = new Enemy2(85, 10, 85);
    public static Enemy3 Zombie = new Enemy3(95, 14, 135);
    public static Enemy4 Archdevil = new Enemy4(100, 15, 150);
    public static Enemy5 Minotaur = new Enemy5(110, 20, 175);
    public static Boss1 Culex = new Boss1(400, 40, 200);
    public static Boss2 Dethl = new Boss2(425, 42, 250);
    public static Boss3 Kronix = new Boss3(450, 45, 225);
    public static String Foe;
    public static String Foe01;
    public static String ItemDrop;
    public static String SwordEquip;
    public static String NoName = "Empty";
    public static String badge1 = "Not owned", badge2 = "Not owned",
            badge3 = "Not owned", badge4 = "Not owned", badge5 = "Not owned",
            badge6 = "Not owned", badge7 = "Not owned", badge8 = "Not owned",
            badge9 = "Not owned";
    public static String ranking1 = "Not owned", ranking2 = "Not owned", 
            ranking3 = "Not owned", ranking4 = "Not owned", 
            ranking5 = "Not owned", ranking6 = "Not owned";
    public static ArrayList<String> InventoryBackPack = new ArrayList<>();
    public static ArrayList<String> EnemyName = new ArrayList<>(Arrays.asList(
            "Skeleton", "InfernoDemon", "Zombie", "Archdevil", "Minotaur"));
    public static ArrayList<String> BossName = new ArrayList<>(Arrays.asList(
            "Culex, the Crystal Legend", "Dethl, the Nightmare Legend",
            "Kronix, The Galactic Legend"));
    public static ArrayList<String> MineOres = new ArrayList<>(Arrays.asList(
            "Iron", "Sapphire", "Emerald", "Crystal", "Coal", "Diamond", 
            "Amethyst", "Gold", "Copper", "Zinc", "Quartz", "Jade", "Topaz"));
    public static ArrayList<String> SwordDrop = new ArrayList<>(Arrays.asList(
            "Enflared Sword", "Corrupted Sword", "DarkMoon Sword",
            "Celestial Sword", "Excalibur Sword", "Thorn Sword"));
    public static ArrayList<String> CrystalDrop = new ArrayList<>(Arrays.asList
        ("Crystalize Shard", "Reflecting Crystal", "Crystal Esscence"));
    public static ArrayList<String> CrystalItem = new ArrayList<>(Arrays.asList(
            "Chroma Crystalize Sword"));
    public static ArrayList<String> NightmareDrop = new ArrayList<>
        (Arrays.asList("Stone of Jordan", "Raven Frost", "Vampire Gaze"));
    public static ArrayList<String> NightmareItem = new ArrayList<>
        (Arrays.asList("Dark Age Sword"));
    public static ArrayList<String> GalacticDrop = new ArrayList<>(Arrays.asList
        ("Galaxy Orb", "Galaxy Shard", "Galaxy Star"));
    public static ArrayList<String> GalacticItem = new ArrayList<>(Arrays.asList
        ("Universal Galaxy Sword"));
    public static ArrayList<Integer> SearchHelp = new ArrayList<>
        (Arrays.asList(1,3,4,5,6,7,8,9,11,12,13));
    
    public static void main(String[] args) throws IOException, 
            InterruptedException{
        Introduction();
        System.out.println();
        int choice;
        boolean tab = true;
        
        //Asks user for name
        System.out.println("Before we get right into the game, make a creative"
                + " username.");
        name = scanS.nextLine();
        System.out.println(name + ", please wait for a moment");
        
        System.out.println("Loading...");
        System.out.println();
        
        //Layout stats given to user
        health = Player.GetHP();
        damage = Player.GetAtk();
        mana = Player.GetMana();
        SwordEquip = "Ironsteel Sword";
        
        while(tab){
        //Level Ranking system, prior to giving rank title based on level
        if(level == 1){
            System.out.println("-----RANK TITLE: NOVICE-----");
            System.out.println("PASSIVE: Mana is flowing throughout your body,"
                    + " granting extra damage");
            
            //Provides Name if user hasn't created one changing variable
            if(NoName.equals("Empty")){
                NoName = "Stored";
                String name1 = name;
                Name01(name1);
            }
            
            //Provides Rank Achievement if not owned
            if(ranking1.equals("Not owned")){
                ranking1 = "Owned";
                String outcome1 = "Novice";
                Result01(outcome1);
            }
        }    
            
        if(level == 5){
            System.out.println("-----RANK TITLE: PATHFINDER-----");
            System.out.println("User stats is now updated");
            System.out.println("Enemies will now upgrade at a harder level");
            Player.SetHP(250);
            health = Player.GetHP();
            Skeleton.SetHP(100);
            Skeleton.SetAtk(12);
            InfernoDemon.SetHP(105);
            InfernoDemon.SetAtk(18);
            Zombie.SetHP(110);
            Zombie.SetAtk(20);
            Archdevil.SetHP(115);
            Archdevil.SetAtk(23);
            Minotaur.SetHP(130);
            Minotaur.SetAtk(30);
            
            if(ranking2.equals("Not owned")){
                ranking2 = "Owned";
                String outcome1 = "Pathfinder";
                Result01(outcome1);
            }
        }
        
        if(level == 10){
            System.out.println("-----RANK TITLE: ADVENTURER-----");
            System.out.println("User stats is now updated");
            System.out.println("Enemies will now upgrade at a harder level");
            System.out.println("Boss Command is now UNLOCKED");
            Player.SetHP(450);
            health = Player.GetHP();
            Skeleton.SetHP(120);
            Skeleton.SetAtk(15);
            InfernoDemon.SetHP(135);
            InfernoDemon.SetAtk(20);
            Zombie.SetHP(130);
            Zombie.SetAtk(22);
            Archdevil.SetHP(140);
            Archdevil.SetAtk(25);
            Minotaur.SetHP(150);
            Minotaur.SetAtk(32);
            
            if(ranking3.equals("Not owned")){
                ranking3 = "Owned";
                String outcome1 = "Adventurer";
                Result01(outcome1);
            }
        }
        
        if(level == 15){
            System.out.println("-----RANK TITLE: SLAYER-----");
            System.out.println("User stats is now updated");
            System.out.println("Enemies will now upgrade at a harder level");
            Player.SetHP(500);
            health = Player.GetHP();
            Skeleton.SetHP(130);
            Skeleton.SetAtk(20);
            InfernoDemon.SetHP(140);
            InfernoDemon.SetAtk(22);
            Zombie.SetHP(150);
            Zombie.SetAtk(28);
            Archdevil.SetHP(170);
            Archdevil.SetAtk(32);
            Minotaur.SetHP(190);
            Minotaur.SetAtk(35);
            Culex.SetHP(425);
            Culex.SetAtk(45);
            Dethl.SetHP(495);
            Dethl.SetAtk(50);
            Kronix.SetHP(525);
            Kronix.SetAtk(55);
            
            if(ranking4.equals("Not owned")){
                ranking4 = "Owned";
                String outcome1 = "Slayer";
                Result01(outcome1);
            }
        }
        
        if(level == 20){
            System.out.println("-----RANK TITLE: CONQUEROR-----");
            System.out.println("User stats is now updated");
            System.out.println("Enemies will now upgrade at a harder level");
            Player.SetHP(550);
            health = Player.GetHP();
            Skeleton.SetHP(140);
            Skeleton.SetAtk(24);
            InfernoDemon.SetHP(145);
            InfernoDemon.SetAtk(25);
            Zombie.SetHP(160);
            Zombie.SetAtk(30);
            Archdevil.SetHP(180);
            Archdevil.SetAtk(35);
            Minotaur.SetHP(200);
            Minotaur.SetAtk(40);
            Culex.SetHP(450);
            Culex.SetAtk(50);
            Dethl.SetHP(500);
            Dethl.SetAtk(55);
            Kronix.SetHP(550);
            Kronix.SetAtk(60);
            
            if(ranking5.equals("Not owned")){
                ranking5 = "Owned";
                String outcome1 = "Conqueror";
                Result01(outcome1);
            }
        }
        
        if(level == 30){
            System.out.println("-----RANK TITLE: LEGENDARY-----");
            System.out.println("User stats is now updated");
            System.out.println("Enemies will now upgrade at a harder level");
            Player.SetHP(650);
            health = Player.GetHP();
            Skeleton.SetHP(160);
            Skeleton.SetAtk(30);
            InfernoDemon.SetHP(180);
            InfernoDemon.SetAtk(32);
            Zombie.SetHP(200);
            Zombie.SetAtk(35);
            Archdevil.SetHP(220);
            Archdevil.SetAtk(40);
            Minotaur.SetHP(230);
            Minotaur.SetAtk(50);
            Culex.SetHP(500);
            Culex.SetAtk(60);
            Dethl.SetHP(550);
            Dethl.SetAtk(60);
            Kronix.SetHP(540);
            Kronix.SetAtk(60);
            
            if(ranking6.equals("Not owned")){
                ranking6 = "Owned";
                String outcome1 = "Legendary";
                Result01(outcome1);
            }
        }
        
        do{
        //Provides the Stats & Menu command given to user
        System.out.println();
        System.out.println(name + " Stats");
        System.out.println("HP: " + health);
        System.out.println("ATK: " + damage);
        System.out.println("MANA: " + mana);
        System.out.println("LEVEL: " + level);
        System.out.println("SWORD EQUIPPED: " + SwordEquip);
        System.out.println();
        System.out.println("Welcome " + name + ", What would you like to do?"
                + "\n 1. Adventure to Enemy"
                + "\n 2. Mine Ores in Cave"
                + "\n 3. Fight against Boss (REQUIRED LEVEL 10)"
                + "\n 4. Eat"
                + "\n 5. Sleep"
                + "\n 6. Inventory"
                + "\n 7. Search Information"
                + "\n 8. Exit Game");
        choice = scanN.nextInt();
        }while(choice > 8 || choice < 0);
        
        //Switch used for efficeny, each command leads to their own method
        switch (choice){
            case 1:
                FindEnemy();
                break;
                
            case 2:
                MineOres();
                break;
                
            case 3:
                Requirement();
                break;
                
            case 4:
                Eat();
                break;
                
            case 5:
                Sleep();
                break;
                
            case 6:
                System.out.println();
                System.out.println("-------------Items you own:-------------");
                Inventory();
                Thread.sleep(2000);
                System.out.println();
                
                ViewChoice();
                break;
                
            case 7:
                ViewChoice01();
                break;
                
            case 8:
                System.out.println("Shutting Down...");
                System.exit(0);
                break;
                
            default:
                System.out.println("Please input the Number listed from the "
                        + "menu.");
                break;
        }
    }
    }
    /**
     * Method Name - Introduction
     * Prints out an Introduction Statement for Player to better understand
     */
    public static void Introduction(){
        System.out.println("\tWelcome to the RPG Slayer game");
        System.out.println("User can play around with the game by adventuring"
                + " on their journey");
        System.out.println("The user will start the game with a sword and"
                + " inventory equipped");
        System.out.println("You can go out to attack enemies, sleep, eat food"
                + " and other actions too");
        System.out.println("Plan your adventure and become the GREATEST");
    }
    
    /**
     * Method Name - FindEnemy
     * Randomizes an Enemy to spawn, if statements used for any name
     * @throws InterruptedException - Pausing code for a brief time
     * @throws IOException - Printing into TextFile
     */
    public static void FindEnemy() throws InterruptedException, IOException{
        //Spawns a random Enemy Name
        Collections.shuffle(EnemyName);
        Foe = EnemyName.get(0);
        System.out.println(Foe + " has spawned to challenge you!");
        Thread.sleep(2000);
        System.out.println();
        
        //If statements used based on the given variable that equals to a name
        if(Foe.equals("Skeleton")){
            PopUpSkeleton();
        }
        
        else if (Foe.equals("InfernoDemon")){
            PopUpInfernoDemon();
        }
        
        else if (Foe.equals("Zombie")){
            PopUpZombie();
        }
        
        else if (Foe.equals("Archdevil")){
            PopUpArchdevil();
        }
        
        else if (Foe.equals("Minotaur")){
            PopUpMinotaur();
        }
    }
    
    /**
     * Method Name - PopUpSkeleton
     * Spawns Skeleton if chosen, battle with user
     * @throws InterruptedException - Brief Pause
     * @throws IOException - Badge achievement Awarded
     */
    public static void PopUpSkeleton() throws InterruptedException, IOException{
        String option1;
        int boost = 20;
        String choice1;
        boolean battle = true;

        //Updating stats for given enemy and passive for user
        System.out.println("\nMana is spread upon your sword, extra damage is"
                + " granted");
        damage += boost;
        health1 = Skeleton.GetHP();
        damage1 = Skeleton.GetAtk();
        mana1 = Skeleton.GetMana();
            
        while(battle){
        //User & Enemy Stats displayed
        System.out.println(name + " Stats:");
        System.out.println("HP: " + health);
        System.out.println("ATK: " + damage);
        System.out.println("MANA: " + mana);
        System.out.println();
        
        System.out.println(Foe + " Stats:");
        System.out.println("HP: " + health1);
        System.out.println("ATK: " + damage1);
        System.out.println("MANA: " + mana1);
        System.out.println();
        Thread.sleep(1000);
        
        //Responding system to command attack
        System.out.println("Type any to attack enemy");
        option1 = scanS.nextLine();
        
        //Action for user attack
        System.out.println("You slashed " + damage + " to " + Foe);
        health1 -= damage;
        if(health1 <= 0)
            health1 = 0;
        System.out.println(Foe + "HP: " + health1);
        Thread.sleep(1000);
        System.out.println();
        
        
        //If enemy health is 0, provide sword drop and badge achievement
        if (health1 <= 0) {
            System.out.println("You have defeated " + Foe);
            System.out.println("Mana wearing off from your sword");
            damage -= boost;
            level += 1;
            if(badge1.equals("Not owned")){
                badge1 = "Owned";
                String badge01 = "Skeleton Demolished";
                Achieve01(badge01);  
            }
            else{
                System.out.println();
            }
            
            //Random sword drop in which gives all each separate stats
            Collections.shuffle(SwordDrop);
            ItemDrop = SwordDrop.get(0);
            System.out.println(Foe + " dropped a " + ItemDrop);
            System.out.println("Would you like to equip? (Yes/No)");
            choice1 = scanS.nextLine();
            if(choice1.equalsIgnoreCase("yes")){
                System.out.println("Updating stats..");
                if(ItemDrop.equals("Enflared Sword")){
                    Player.SetAtk(25);
                    damage = Player.GetAtk();
                    SwordEquip = "Enflared Sword";
                }
                else if(ItemDrop.equals("Corrupted Sword")){
                    Player.SetAtk(32);
                    damage = Player.GetAtk();
                    SwordEquip = "Corrupted Sword";
                }
                else if(ItemDrop.equals("DarkMoon Sword")){
                    Player.SetAtk(37);
                    damage = Player.GetAtk();
                    SwordEquip = "DarkMoon Sword";
                }
                else if(ItemDrop.equals("Celestial Sword")){
                    Player.SetAtk(40);
                    damage = Player.GetAtk();
                    SwordEquip = "Celestial Sword";
                }
                else if(ItemDrop.equals("Excalibur Sword")){
                    Player.SetAtk(50);
                    damage = Player.GetAtk();
                    SwordEquip = "Excalibur Sword";
                }
                else if(ItemDrop.equals("Thorn Sword")){
                    Player.SetAtk(43);
                    damage = Player.GetAtk();
                    SwordEquip = "Thorn Sword";
                }
                } else {
                    System.out.println("Returning from adventure...");
                }
                break;
            }
        
        //Enemy action command for attack
        System.out.println(Foe + " has swinged a damage of " + damage1);
        health -= damage1;
        if(health <= 0)
            health = 0;
        System.out.println(name + "HP: " + health);
        Thread.sleep(1000);
        System.out.println();
        
        //If user health is 0, user will be sent to menu screen with low health
        if (health <= 0) {
            health = 0;
            System.out.println("You have lost, returning to lastest "
                    + "checkpoint");
            damage -= boost;
            Thread.sleep(2000);
            health = 20;
            battle = false;
            }
        }
    }
    
    /**
     * Method Name - PopUpInfernoDemon
     * Spawns InfernoDemon if chosen, battle with user
     * @throws InterruptedException - Brief Pause
     * @throws IOException - Badge Achievement awarded
     */
    public static void PopUpInfernoDemon() throws InterruptedException,
            IOException{
        String option2;
        int boost1 = 20;
        String choice2;
        boolean battle1 = true;

        //Updating stats for given enemy and passive for user
        System.out.println("\nMana is spread upon your sword, extra damage is"
                + " granted");
        damage += boost1;
        health2 = InfernoDemon.GetHP();
        damage2 = InfernoDemon.GetAtk();
        mana2 = InfernoDemon.GetMana();
            
        while(battle1){
        //User & Enemy Stats displayed
        System.out.println(name + " Stats:");
        System.out.println("HP: " + health);
        System.out.println("ATK: " + damage);
        System.out.println("MANA: " + mana);
        System.out.println();
        
        System.out.println(Foe + " Stats:");
        System.out.println("HP: " + health2);
        System.out.println("ATK: " + damage2);
        System.out.println("MANA: " + mana2);
        System.out.println();
        Thread.sleep(1000);
        
        //Responding system to command attack
        System.out.println("Type any to attack enemy");
        option2 = scanS.nextLine();
        
        //Action for user attack
        System.out.println("You slashed " + damage + " to " + Foe);
        health2 -= damage;
        if(health2 <= 0)
            health2 = 0;
        System.out.println(Foe + "HP: " + health2);
        Thread.sleep(1000);
        System.out.println();
        
        //If enemy health is 0, provide sword drop and badge achievement
        if (health2 <= 0) { 
            System.out.println("You have defeated " + Foe);
            System.out.println("Mana wearing off from your sword");
            damage -= boost1;
            level += 1;
            if(badge2.equals("Not owned")){
                badge2 = "Owned";
                String badge01 = "Inferno Off";
                Achieve01(badge01);  
            }
            else{
                System.out.println();
            }
                
            //Random sword drop in which gives all each separate stats
            Collections.shuffle(SwordDrop);
            ItemDrop = SwordDrop.get(0);
            System.out.println(Foe + " dropped a " + ItemDrop);
            System.out.println("Would you like to equip? (Yes/No)");
            choice2 = scanS.nextLine();
            if(choice2.equalsIgnoreCase("yes")){
                System.out.println("Updating stats..");
                if(ItemDrop.equals("Enflared Sword")){
                    Player.SetAtk(25);
                    damage = Player.GetAtk();
                     SwordEquip = "Enflared Sword";
                }
                else if(ItemDrop.equals("Corrupted Sword")){
                    Player.SetAtk(32);
                    damage = Player.GetAtk();
                    SwordEquip = "Corrupted Sword";
                }
                else if(ItemDrop.equals("DarkMoon Sword")){
                    Player.SetAtk(37);
                    damage = Player.GetAtk();
                    SwordEquip = "DarkMoon Sword";
                }
                else if(ItemDrop.equals("Celestial Sword")){
                    Player.SetAtk(40);
                    damage = Player.GetAtk();
                    SwordEquip = "Celestial Sword";
                }
                else if(ItemDrop.equals("Excalibur Sword")){
                    Player.SetAtk(50);
                    damage = Player.GetAtk();
                    SwordEquip = "Excalibur Sword";
                }
                else if(ItemDrop.equals("Thorn Sword")){
                    Player.SetAtk(43);
                    damage = Player.GetAtk();
                    SwordEquip = "Thorn Sword";
                }
                } else {
                    System.out.println("Returning from adventure...");
                }
                break;
            }
        
        //Enemy action command for attack
        System.out.println(Foe + " has blasted " + damage2);
        health -= damage2;
        if(health <= 0)
            health = 0;
        System.out.println(name + "HP: " + health);
        Thread.sleep(1000);
        System.out.println();
        
        //If user health is 0, user will be sent to menu screen with low health
        if (health <= 0) {
            health = 0;
            System.out.println("You have lost, returning to lastest "
                    + "checkpoint");
            damage -= boost1;
            Thread.sleep(2000);
            health = 20;
            battle1 = false;
            }
        }
    }
    
    /**
     * Method Name - PopUpZombie
     * Spawns Zombie if chosen, battle with user
     * @throws InterruptedException - Brief Pause
     * @throws IOException - Badge Achievement Awarded
     */
    public static void PopUpZombie() throws InterruptedException, IOException{
        String option3;
        int boost2 = 20;
        String choice3;
        boolean battle2 = true;

        //Updating stats for given enemy and passive for user
        System.out.println("\nMana is flowing upon your sword, extra damage is"
                + " granted");
        damage += boost2;
        health3 = Zombie.GetHP();
        damage3 = Zombie.GetAtk();
        mana3 = Zombie.GetMana();
            
        while(battle2){
        //User & Enemy Stats displayed
        System.out.println(name + " Stats:");
        System.out.println("HP: " + health);
        System.out.println("ATK: " + damage);
        System.out.println("MANA: " + mana);
        System.out.println();
        
        System.out.println(Foe + " Stats:");
        System.out.println("HP: " + health3);
        System.out.println("ATK: " + damage3);
        System.out.println("MANA: " + mana3);
        System.out.println();
        Thread.sleep(1300);
        
        //Responding system to command attack
        System.out.println("Type any to attack enemy");
        option3 = scanS.nextLine();
        
        //Action for user attack
        System.out.println("You slashed " + damage + " to " + Foe);
        health3 -= damage;
        if(health3 <= 0)
            health3 = 0;
        System.out.println(Foe + "HP: " + health3);
        Thread.sleep(1000);
        System.out.println();
        
        //If enemy health is 0, provide sword drop and badge achievement
        if (health3 <= 0) { 
            System.out.println("You have defeated " + Foe);
            System.out.println("Mana wearing off from your sword");
            damage -= boost2;
            level += 1;
            if(badge3.equals("Not owned")){
                badge3 = "Owned";
                String badge01 = "Zombie Slayer";
                Achieve01(badge01);  
            }
            else{
                System.out.println();
            }
            
            //Random sword drop in which gives all each separate stats
            Collections.shuffle(SwordDrop);
            ItemDrop = SwordDrop.get(0);
            System.out.println(Foe + " dropped a " + ItemDrop);
            System.out.println("Would you like to equip? (Yes/No)");
            choice3 = scanS.nextLine();
            if(choice3.equalsIgnoreCase("yes")){
                System.out.println("Updating stats..");
                if(ItemDrop.equals("Enflared Sword")){
                    Player.SetAtk(25);
                    damage = Player.GetAtk();
                    SwordEquip = "Enflared Sword";
                }
                else if(ItemDrop.equals("Corrupted Sword")){
                    Player.SetAtk(32);
                    damage = Player.GetAtk();
                    SwordEquip = "Corrupted Sword";
                }
                else if(ItemDrop.equals("DarkMoon Sword")){
                    Player.SetAtk(37);
                    damage = Player.GetAtk();
                    SwordEquip = "DarkMoon Sword";
                }
                else if(ItemDrop.equals("Celestial Sword")){
                    Player.SetAtk(40);
                    damage = Player.GetAtk();
                    SwordEquip = "Celestial Sword";
                }
                else if(ItemDrop.equals("Excalibur Sword")){
                    Player.SetAtk(50);
                    damage = Player.GetAtk();
                    SwordEquip = "Excalibur Sword";
                }
                else if(ItemDrop.equals("Thorn Sword")){
                    Player.SetAtk(43);
                    damage = Player.GetAtk();
                    SwordEquip = "Thorn Sword";
                }
            } else {
                System.out.println("Returning from adventure...");
            }
                break;
            }
        
        //Enemy action command for attack
        System.out.println(Foe + " has scratch " + damage3);
        health -= damage3;
        if(health <= 0)
            health = 0;
        System.out.println(name + "HP: " + health);
        Thread.sleep(1000);
        System.out.println();
        
        //If user health is 0, user will be sent to menu screen with low health
        if (health <= 0) {
            health = 0;
            System.out.println("You have lost, returning to lastest "
                    + "checkpoint");
            damage -= boost2;
            Thread.sleep(2000);
            health = 20;
            battle2 = false;
            }
        }
    }
    
    /**
     * Method Name - PopUpArchdevil
     * Spawns Archdevil if chosen, battle with user
     * @throws InterruptedException - Brief Pause
     * @throws IOException - Badge Achievement Awarded
     */
    public static void PopUpArchdevil() throws InterruptedException, 
            IOException{
        String option4;
        int boost3 = 20;
        String choice4;
        boolean battle3 = true;

        //Updating stats for given enemy and passive for user
        System.out.println("\nMana is flowing upon your sword, extra damage is"
                + " granted");
        damage += boost3;
        health4 = Archdevil.GetHP();
        damage4 = Archdevil.GetAtk();
        mana4 = Archdevil.GetMana();
            
        while(battle3){
        //User & Enemy Stats displayed
        System.out.println(name + " Stats:");
        System.out.println("HP: " + health);
        System.out.println("ATK: " + damage);
        System.out.println("MANA: " + mana);
        System.out.println();
        
        System.out.println(Foe + " Stats:");
        System.out.println("HP: " + health4);
        System.out.println("ATK: " + damage4);
        System.out.println("MANA: " + mana4);
        System.out.println();
        Thread.sleep(1000);
        
        //Responding system to command attack
        System.out.println("Type any to attack enemy");
        option4 = scanS.nextLine();
        
        //Action for user attack
        System.out.println("You slashed " + damage + " to " + Foe);
        health4 -= damage;
        if(health4 <= 0)
            health4 = 0;
        System.out.println(Foe + "HP: " + health4);
        System.out.println();
        Thread.sleep(1000);
        
        //If enemy health is 0, provide sword drop and badge achievement
        if (health4 <= 0) {
            System.out.println("You have defeated " + Foe);
            System.out.println("Mana wearing off from your sword");
            damage -= boost3;
            level += 1;
            if(badge4.equals("Not owned")){
                badge4 = "Owned";
                String badge01 = "Archdevil not so looking good";
                Achieve01(badge01);  
            }
            else{
                System.out.println();
            }
              
            //Random sword drop in which gives all each separate stats
            Collections.shuffle(SwordDrop);
            ItemDrop = SwordDrop.get(0);
            System.out.println(Foe + " dropped a " + ItemDrop);
            System.out.println("Would you like to equip? (Yes/No)");
            choice4 = scanS.nextLine();
            if(choice4.equalsIgnoreCase("yes")){
                System.out.println("Updating stats..");
                if(ItemDrop.equals("Enflared Sword")){
                    Player.SetAtk(25);
                    damage = Player.GetAtk();
                    SwordEquip = "Enflared Sword";
                }
                else if(ItemDrop.equals("Corrupted Sword")){
                    Player.SetAtk(32);
                    damage = Player.GetAtk();
                    SwordEquip = "Corrupted Sword";
                }
                else if(ItemDrop.equals("DarkMoon Sword")){
                    Player.SetAtk(37);
                    damage = Player.GetAtk();
                    SwordEquip = "DarkMoon Sword";
                }
                else if(ItemDrop.equals("Celestial Sword")){
                    Player.SetAtk(40);
                    damage = Player.GetAtk();
                    SwordEquip = "Celestial Sword";
                }
                else if(ItemDrop.equals("Excalibur Sword")){
                    Player.SetAtk(50);
                    damage = Player.GetAtk();
                    SwordEquip = "Excalibur Sword";
                }
            
                else if(ItemDrop.equals("Thorn Sword")){
                    Player.SetAtk(45);
                    damage = Player.GetAtk();
                    SwordEquip = "Thorn Sword";
                }
            } else {
                System.out.println("Returning from adventure...");
                }
                break;
            }
        
        //Enemy action command for attack
        System.out.println(Foe + " has dealt " + damage4);
        health -= damage4;
        if(health <= 0)
            health = 0;
        System.out.println(name + "HP: " + health);
        Thread.sleep(1000);
        System.out.println();
        
        //If user health is 0, user will be sent to menu screen with low health
        if (health <= 0) {
            health = 0;
            System.out.println("You have lost, returning to lastest "
                  + "checkpoint");
            damage -= boost3;
            Thread.sleep(2000);
            health = 20;
            battle3 = false;
            }
        }
    }
    
    /**
     * Method Name - PopUpMinotaur
     * Spawns Minotaur if chosen, battle with user
     * @throws InterruptedException - Brief Pause
     * @throws IOException - Badge Achievement Awarded
     */
    public static void PopUpMinotaur() throws InterruptedException, IOException{
        String option5;
        int boost4 = 20;
        String choice5;
        boolean battle4 = true;

        //Updating stats for given enemy and passive for user
        System.out.println("\nMana is flowing upon your sword, extra damage is"
                + " granted");
        damage += boost4;
        health5 = Minotaur.GetHP();
        damage5 = Minotaur.GetAtk();
        mana5 = Minotaur.GetMana();
            
        while(battle4){
        //User & Enemy Stats displayed
        System.out.println(name + " Stats:");
        System.out.println("HP: " + health);
        System.out.println("ATK: " + damage);
        System.out.println("MANA: " + mana);
        System.out.println();
        
        System.out.println(Foe + " Stats:");
        System.out.println("HP: " + health5);
        System.out.println("ATK: " + damage5);
        System.out.println("MANA: " + mana5);
        System.out.println();
        Thread.sleep(1000);
        
        //Responding system to command attack
        System.out.println("Type any to attack enemy");
        option5 = scanS.nextLine();
        
        //Action for user attack
        System.out.println("You slashed " + damage + " to " + Foe);
        health5 -= damage;
        if(health5 <= 0)
            health5 = 0;
        System.out.println(Foe + "HP: " + health5);
        Thread.sleep(1000);
        System.out.println();
        
        //If enemy health is 0, provide sword drop and badge achievement
        if (health5 <= 0) { 
            System.out.println("You have defeated " + Foe);
            System.out.println("Mana wearing off from your sword");
            damage -= boost4;
            level += 1;
            if(badge5.equals("Not owned")){
                badge5 = "Owned";
                String badge01 = "Minotaur is a miniboss?";
                Achieve01(badge01);  
            }
            else{
               System.out.println();
            }
              
            //Random sword drop in which gives all each separate stats
            Collections.shuffle(SwordDrop);
            ItemDrop = SwordDrop.get(0);
            System.out.println(Foe + " dropped a " + ItemDrop);
            System.out.println("Would you like to equip? (Yes/No)");
            choice5 = scanS.nextLine();
            if(choice5.equalsIgnoreCase("yes")){
                System.out.println("Updating stats..");
                if(ItemDrop.equals("Enflared Sword")){
                    Player.SetAtk(25);
                    damage = Player.GetAtk();
                    SwordEquip = "Enflared Sword";
                }
                else if(ItemDrop.equals("Corrupted Sword")){
                    Player.SetAtk(32);
                    damage = Player.GetAtk();
                    SwordEquip = "Corrupted Sword";
                }
                else if(ItemDrop.equals("DarkMoon Sword")){
                    Player.SetAtk(37);
                    damage = Player.GetAtk();
                    SwordEquip = "DarkMoon Sword";
                }
                else if(ItemDrop.equals("Celestial Sword")){
                    Player.SetAtk(40);
                    damage = Player.GetAtk();
                    SwordEquip = "Celestial Sword";
                }
                else if(ItemDrop.equals("Excalibur Sword")){
                    Player.SetAtk(50);
                    damage = Player.GetAtk();
                    SwordEquip = "Excalibur Sword";
                }
                else if(ItemDrop.equals("Thorn Sword")){
                    Player.SetAtk(43);
                    damage = Player.GetAtk();
                    SwordEquip = "Thorn Sword";
                }
                } else {
                    System.out.println("Returning from adventure...");
                }
                break;
            }
        
        //Enemy action command for attack
        System.out.println(Foe + " has dealt " + damage5);
        health -= damage5;
        if(health <= 0)
            health = 0;
        System.out.println(name + "HP: " + health);
        Thread.sleep(1000);
        System.out.println();
        
        //If user health is 0, user will be sent to menu screen with low health
        if (health <= 0) {
            health = 0;
            System.out.println("You have lost, returning to lastest "
                  + "checkpoint");
            damage -= boost4;
            Thread.sleep(2000);
            health = 20;
            battle4 = false;
            }
        }
    }
    
    /**
     * Method Name - Requirement
     * A command in which is locked until the User reach lvl 10 in order to use
     * @throws InterruptedException - Within code has a brief pause
     * @throws IOException - Within code has a TextFile
     */
    public static void Requirement() throws InterruptedException, IOException{
        //Required to be level 10 in order to use command
        if(level < 10){
            System.out.println("You do not meet the requirment for the"
                    + " level, MUST BE LVL 10");   
        } 
        //Else the user is above level 10, command unlocked
        else{
            FindBoss();
        }
    }
    
    /**
     * Method Name - Find Boss
     * Generates a Boss Name to spawn in which is the correct if statement
     * @throws InterruptedException - Within code has a brief pause
     * @throws IOException - Within code has a TextFile
     */
    public static void FindBoss() throws InterruptedException, IOException{
        //Spawns a random Boss Name
        Collections.shuffle(BossName);
        Foe01 = BossName.get(0);
        System.out.println(Foe01 + " has been summoned. Be prepared for a"
                + " tough battle!");
        Thread.sleep(2000);
        System.out.println();
        
        //Depending on Boss Name, one of these will spawn
        if(Foe01.equals("Culex, the Crystal Legend")){
            System.out.println("You have been surrouned by Crystals Shard");
            PopUpCulex();
        }
        
        else if (Foe01.equals("Dethl, the Nightmare Legend")){
            System.out.println("You have been surrounded by a black sphere"
                    + " empty void, encountering numerous of Nightmares");
            PopUpDethl();
        }
        
        else if (Foe01.equals("Kronix, The Galactic Legend")){
            System.out.println("You have been surrounded by a galaxy void");
            PopUpKronix();
        }
    }
    
    /**
     * Method Name - PopUpCulex
     * Spawns Culex if chosen, battle with user
     * @throws InterruptedException - Brief pause
     * @throws IOException - Taking item into TextFile
     */
    public static void PopUpCulex() throws InterruptedException, IOException{
        String option6;
        int boost5 = 20;
        String choice6;
        boolean battle5 = true;

        //Updating stats for given Boss and passive for user
        System.out.println("\nMana is flowing upon your sword, extra damage is"
                + " granted");
        damage += boost5;
        health6 = Culex.GetHP();
        damage6 = Culex.GetAtk();
        mana6 = Culex.GetMana();
            
        while(battle5){
        //User & Boss Stats displayed
        System.out.println(name + " Stats:");
        System.out.println("HP: " + health);
        System.out.println("ATK: " + damage);
        System.out.println("MANA: " + mana);
        System.out.println();
        
        System.out.println(Foe01 + " Stats:");
        System.out.println("HP: " + health6);
        System.out.println("ATK: " + damage6);
        System.out.println("MANA: " + mana6);
        System.out.println();
        Thread.sleep(1000);
        
        //Responding system to command attack
        System.out.println("Type any to attack enemy");
        option6 = scanS.nextLine();
        
        //Action for user attack
        System.out.println("You slashed " + damage + " to " + Foe01);
        health6 -= damage;
        if(health6 <= 0)
           health6 = 0;
        System.out.println(Foe01 + "HP: " + health6);
        System.out.println();
        Thread.sleep(1000);
        
        //If Boss health is 0, provide badge achievement
        if (health6 <= 0) { 
            System.out.println("You have defeated " + Foe01);
            System.out.println("Mana wearing off from your sword");
            damage -= boost5;
            level += 1;
            if(badge6.equals("Not owned")){
                badge6 = "Owned";
                String badge01 = "Culex's Respect";
                Achieve01(badge01);  
            }
            else{
               System.out.println();
            }
                
            //Special sword drop that is a 50% chance of obtaining it
            if (Math.random()*(100) <= 50){
                String ItemSpecial = CrystalItem.get(0);
                System.out.println(Foe01 + " dropped a SPECIAL "
                        + "SWORD: " + ItemSpecial);
                System.out.println("Would you like to equip? (Yes/No)");
                choice6 = scanS.nextLine();
                if(choice6.equalsIgnoreCase("yes")){
                    Player.SetAtk(100);
                    damage = Player.GetAtk();
                    SwordEquip = "Chroma Crystalize Sword";
                }
            }
            
            //Random boss drop in which is given to inventory
            Collections.shuffle(CrystalDrop);
            String DropSpecial = CrystalDrop.get(0);
            System.out.println(Foe01 + " Dropped a " + DropSpecial + 
                    ", A Special Item");
            System.out.println("Adding into Inventory...");
            Thread.sleep(3000);
            InputInventory02(DropSpecial);
            break;
            }
        
        //Boss action command for attack
        System.out.println(Foe01 + " has shot crystals, dealing " + damage6);
        health -= damage6;
        if(health <= 0)
            health = 0;
        System.out.println(name + "HP: " + health);
        System.out.println();
        Thread.sleep(1000);
        
        //If user health is 0, user will be sent to menu screen with low health
        if (health <= 0) {
            health = 0;
            System.out.println("You have lost, returning to lastest "
                   + "checkpoint");
            damage -= boost5;
            Thread.sleep(2000);
            health = 20;
            battle5 = false;
            }
        }
    }
    
    /**
     * Method Name - PopUpDethl
     * Spawns Dethl if chosen, battle with user
     * @throws InterruptedException - Brief pause
     * @throws IOException - Takes item into TextFile
     */
    public static void PopUpDethl() throws InterruptedException, IOException{
        String option7;
        int boost6 = 20;
        String choice7;
        boolean battle6 = true;

        //Updating stats for given Boss and passive for user
        System.out.println("\nMana is flowing upon your sword, extra damage is"
                + " granted");
        damage += boost6;
        health7 = Dethl.GetHP();
        damage7 = Dethl.GetAtk();
        mana7 = Dethl.GetMana();
            
        while(battle6){
        //User & Boss Stats displayed
        System.out.println(name + " Stats:");
        System.out.println("HP: " + health);
        System.out.println("ATK: " + damage);
        System.out.println("MANA: " + mana);
        System.out.println();
        
        System.out.println(Foe01 + " Stats:");
        System.out.println("HP: " + health7);
        System.out.println("ATK: " + damage7);
        System.out.println("MANA: " + mana7);
        System.out.println();
        Thread.sleep(1000);
        
        //Responding system to command attack
        System.out.println("Type any to attack enemy");
        option7 = scanS.nextLine();
        
        //Action for user attack
        System.out.println("You slashed " + damage + " to " + Foe01);
        health7 -= damage;
        if(health7 <= 0)
            health7 = 0;
        System.out.println(Foe01 + "HP: " + health7);
        System.out.println();
        Thread.sleep(1000);
        
        //If Boss health is 0, provide badge achievement
        if (health7 <= 0) { 
            System.out.println("You have defeated " + Foe01);
            System.out.println("Mana wearing off from your sword");
            damage -= boost6;
            level += 1;
            if(badge7.equals("Not owned")){
                badge7 = "Owned";
                String badge01 = "Dethl Nightmare Escaped to Reality";
                Achieve01(badge01);  
            }
            else{
                System.out.println();
            }
              
            //Special sword drop that is a 50% chance of obtaining it
            if (Math.random()*(100) <= 50){
                String ItemSpecial01 = NightmareItem.get(0);
                System.out.println(Foe01 + " dropped a SPECIAL "
                        + "SWORD: " + ItemSpecial01);
                System.out.println("Would you like to equip? (Yes/No)");
                choice7 = scanS.nextLine();
                if(choice7.equalsIgnoreCase("yes")){
                    Player.SetAtk(102);
                    damage = Player.GetAtk();
                    SwordEquip = "Dark Age Sword";
                }
            }
            
            //Random boss drop in which is given to inventory
            Collections.shuffle(NightmareDrop);
            String DropSpecial01 = NightmareDrop.get(0);
            System.out.println(Foe01 + " Dropped a " + DropSpecial01 + 
                    ", A Special Item");
            System.out.println("Adding into Inventory...");
            Thread.sleep(3000);
            InputInventory03(DropSpecial01);
            break;
            }
        
        //Boss action command for attack
        System.out.println(Foe01 + " used Nightmare Slash, dealing " + damage7);
        health -= damage7;
        if(health <= 0)
            health = 0;
        System.out.println(name + "HP: " + health);
        System.out.println();
        Thread.sleep(1000);
        
        //If user health is 0, user will be sent to menu screen with low health
        if (health <= 0) {
            health = 0;
            System.out.println("You have lost, returning to lastest "
                    + "checkpoint");
            damage -= boost6;
            Thread.sleep(2000);
            health = 20;
            battle6 = false;
            }
        }
    }
    
    /**
     * Method Name - PopUpKronix
     * Spawns Kronix if chosen, battle with user
     * @throws InterruptedException - Brief pause
     * @throws IOException - Takes item into TextFile
     */
    public static void PopUpKronix() throws InterruptedException, IOException{
        String option8;
        int boost7 = 20;
        String choice8;
        boolean battle7 = true;
        
        //Updating stats for given Boss and passive for user
        System.out.println("\nMana is flowing upon your sword, extra damage is"
                + " granted");
        damage += boost7;
        health8 = Kronix.GetHP();
        damage8 = Kronix.GetAtk();
        mana8 = Kronix.GetMana();
            
        while(battle7){
        //User & Boss Stats displayed
        System.out.println(name + " Stats:");
        System.out.println("HP: " + health);
        System.out.println("ATK: " + damage);
        System.out.println("MANA: " + mana);
        System.out.println();
        
        System.out.println(Foe01 + " Stats:");
        System.out.println("HP: " + health8);
        System.out.println("ATK: " + damage8);
        System.out.println("MANA: " + mana8);
        System.out.println();
        Thread.sleep(1000);
        
        //Responding system to command attack
        System.out.println("Type any to attack enemy");
        option8 = scanS.nextLine();
        
        //Action for user attack
        System.out.println("You slashed " + damage + " to " + Foe01);
        health8 -= damage;
        if(health8 <= 0)
            health8 = 0;
        System.out.println(Foe01 + "HP: " + health8);
        System.out.println();
        Thread.sleep(1000);
        
        //If Boss health is 0, provide badge achievement
        if (health8 <= 0) { 
            System.out.println("You have defeated " + Foe01);
            System.out.println("Mana wearing off from your sword");
            damage -= boost7;
            level += 1;
            if(badge8.equals("Not owned")){
                badge8 = "Owned";
                String badge01 = "Kronix Offering, Ruler of Galaxy";
                Achieve01(badge01);  
            }
            else{
                System.out.println();
            }
              
            //Special sword drop that is a 50% chance of obtaining it
            if (Math.random()*(100) <= 50){
                String ItemSpecial02 = GalacticItem.get(0);
                System.out.println(Foe01 + " dropped a SPECIAL "
                        + "SWORD: " + ItemSpecial02);
                System.out.println("Would you like to equip? (Yes/No)");
                choice8 = scanS.nextLine();
                if(choice8.equalsIgnoreCase("yes")){
                    Player.SetAtk(110);
                    damage = Player.GetAtk();
                    SwordEquip = "Universal Galactic Sword";
                    }
                }
            
                
            //Random boss drop in which is given to inventory
            Collections.shuffle(GalacticDrop);
            String DropSpecial02 = GalacticDrop.get(0);
            System.out.println(Foe01 + " Dropped a " + DropSpecial02 + 
                    ", A Special Item");
            System.out.println("Adding into Inventory...");
            Thread.sleep(3000);
            InputInventory03(DropSpecial02);
            break;
            }
        
        //Boss action command for attack
        System.out.println(Foe01 + " ripped a Galactic hole, "
                + "dealing a slash damage of " + damage8);
        health -= damage8;
        if(health <= 0)
            health = 0;
        System.out.println(name + "HP: " + health);
        System.out.println();
        Thread.sleep(1000);
        
        //If user health is 0, user will be sent to menu screen with low health
        if (health <= 0) {
            health = 0;
            System.out.println("You have lost, returning to lastest "
                    + "checkpoint");
            damage -= boost7;
            Thread.sleep(2000);
            health = 20;
            battle7 = false;
            }
        }
    }
    
    /**
     * Method Name - MineOres
     * User can go mining but an if statement possible chance of enemy counter
     * @throws InterruptedException - Brief pause
     * @throws IOException - Mining Ores are sent to TextFile, read & write
     */
    public static void MineOres() throws InterruptedException, IOException{
        System.out.println("You set on a bizzare journey to the mining "
                + "cave...");
        Thread.sleep(2000);
        System.out.println();
        
        System.out.println("Be careful, some enemy could've been here before");
        
        //A 25% chance a random enemy will ambush, not allowing you to mine
        if (Math.random()*(100) <= 25) {
            Thread.sleep(1000);
            FindEnemy();
             
            
        }
        //Else if 25% chance is not active, proceed user to mining
        else {
            Thread.sleep(1000);
            System.out.println("No enemy spotted");
            Thread.sleep(1000);
            System.out.println();
            if(badge9.equals("Not owned")){
                badge9 = "Owned";
                String badge01 = "Miner Expertise";
                Achieve01(badge01);  
            }
             else{
                    System.out.println();
                }
            System.out.println("Moving into position, mining ores..");
            System.out.println("Will take about 5-7 seconds");
            Thread.sleep(5000);
            System.out.println();
            
            //3 Random Ores will be sent to inventory using TextFile
            Collections.shuffle(MineOres);
            String item1 = MineOres.get(0);
            Collections.shuffle(MineOres);
            String item2 = MineOres.get(0);
            Collections.shuffle(MineOres);
            String item3 = MineOres.get(0);
            
            System.out.println("Look at that!, You got a " + item1 + ", " + 
                    item2 + " & " + item3);
            System.out.println("Taking them into Inventory");
            Thread.sleep(2000);
            InputInventory(item1, item2, item3);
        }
        
    }
    
    /**
     * Method Name - Eat
     * User can eat food as this will regain Health for user
     * @throws InterruptedException - Brief pause
     */
    public static void Eat() throws InterruptedException{
        System.out.println("You set out to go eat some food to regain health");
        System.out.println("Cooking food in process...");
        Thread.sleep(4000);
        
        //User health will be added to given health system
        health = Player.GetHP();
        System.out.println();
        level += 1;
        System.out.println("Health is regained, ready to adventure!");
    }
    
    /**
     * Method Name - Sleep
     * User can sleep for the whole day
     * @throws InterruptedException - Brief pause
     */
    public static void Sleep() throws InterruptedException{
        System.out.println("You decide to sleep for the day");
        System.out.println("Sleeping in process...");
        Thread.sleep(4000);
        System.out.println();
        level += 1;
        System.out.println("Fully awake, Ready to Adventure!");
    }
    
    /**
     * Method Name - ViewChoice
     * User can view inventory, as well given the option to sort items
     * @throws InterruptedException - Brief Pause
     */
    public static void ViewChoice() throws InterruptedException{
        String CanChose;
        
        System.out.println("Would like to Sort items? (Yes/No)");
        CanChose = scanS.nextLine();
        
        //User will be sent to selection sort
        if(CanChose.equalsIgnoreCase("yes")){
            System.out.println("Sorting...");
            Thread.sleep(2000);
            SelectionSort();
            
        } 
        //Will return to menu screen if not to sort items
        else {
            System.out.println("Returning to main menu");
        }
    }
    
    /**
     * Method Name - ViewChoice01
     * User can use System to Verify a certain Rarity if it is decent or not
     * @throws InterruptedException 
     */
    public static void ViewChoice01() throws InterruptedException{
        String CanChose1;
        
        //User will be sent to search a value within the system
        System.out.println("Would you like to Search anything? (Yes/No)");
        CanChose1 = scanS.nextLine();
        
        if(CanChose1.equalsIgnoreCase("yes")){
            BeforeSearch();
            System.out.println();
            
        }
        //Will return to menu screen if not to search
        else {
            System.out.println("Returning to main menu");
        }
    }
    
    /**
     * Method Name - SelectionSort
     * Selects all the items within inventory & sorts them alphabetically
     */
    public static void SelectionSort(){
        String minValue;
        int minIndex;
        
        //Prints the unsorted list
        System.out.println();
        System.out.println("Unsorted Inventory:");
        for (String element: InventoryBackPack)
            System.out.print(element + " ");
        System.out.println();
        
        for (int i = 0; i < InventoryBackPack.size(); i++)
        {
            minValue = InventoryBackPack.get(i);
            minIndex = i;
            
            for (int j = i + 1; j < InventoryBackPack.size(); j++)
            {
                if (InventoryBackPack.get(j).compareToIgnoreCase(minValue) < 0)
                {
                    minValue = InventoryBackPack.get(j);
                    minIndex = j;
                }
            }
            InventoryBackPack.set(minIndex, InventoryBackPack.get(i));
            InventoryBackPack.set(i, minValue);
            
        }
        
        //Prints the sorted list in a effcient list
        System.out.println("-------Sorted Inventory-------");
        for (String element: InventoryBackPack)
            System.out.println(element + " ");
    }
    
    /**
     * Method name - BeforeSearch
     * User is asked to input a value that can be used for verification
     * @throws InterruptedException 
     */
    public static void BeforeSearch() throws InterruptedException{
        int value;
        do{
        System.out.println("Please input any value to begin search"
                + "(Select from 1-13)"
                + "\nNOTICE: Do not that some files are corrupted so they do"
                + " not exist within the system");
        value = scanN.nextInt();
        }while(value > 13 || value < 0);
        
        System.out.println("Searching...");
        Thread.sleep(2000);
        
        /*
        Given the value that the user intends to search for, there are specific
        value within the Arraylist that will work and give piece of information
        regarding to the game. In case a value is inputted that is NOT from the
        Arraylist, It will bring a false message stating that the file is
        corrupted meaning it is no where to be found in the system
        */
        if(value == 1){
            BinarySearch(SearchHelp, value);
            System.out.println("#" + value + ": Common ore like Iron, Coal"
                    + ", Gold, Quartz & Topaz can be obtained from Mining");
        }
        else if(value == 3){
            BinarySearch(SearchHelp, value);
            System.out.println("#" + value + ": Rare ore like Crystal, Jade"
                    + ", Copper & Zinc can be obtained from Mining");
        }
        else if(value == 4){
            BinarySearch(SearchHelp, value);
            System.out.println("#" + value + ": Legendary ore like Diamond,"
                    + " Emerald, Sapphire & Amethyst can be obtained from "
                    + "Mining");
        }
        
        else if(value == 6){
            BinarySearch(SearchHelp, value);
            System.out.println("#" + value + ": Common sword like "
                    + "Enflared Sword, Corrupted Sword & DarkMoon Sword can be"
                    + " obtained from Enemy");
        }
        
        else if(value == 7){
            BinarySearch(SearchHelp, value);
            System.out.println("#" + value + ": Rare Sword like Celestial "
                    + "Sword & Thorn Sword can be obtained from Enemy");
        }
        
        else if(value == 8){
            BinarySearch(SearchHelp, value);
            System.out.println("#" + value + ": Legendary Sword like"
                    + " Excalibur Sword can be obtained from Enemy");
        }
        
        else if(value == 9){
            BinarySearch(SearchHelp, value);
            System.out.println("#" + value + ": Mythical Sword like"
                    + " Chroma Crystalize Sword, Dark Age Sword & Universal"
                    + " Galactic Sword can be obtained from Specific Boss");
        }
        
        else if(value == 11){
            BinarySearch(SearchHelp, value);
            System.out.println("#" + value + ": Special Item like Crystalize "
                    + "Shard, Reflecting Crystal & Crystal Esscence can be "
                    + "obtained from Culex, the Crystal Legend");
        }
        
        else if(value == 12){
            BinarySearch(SearchHelp, value);
            System.out.println("#" + value + ": Speical Item like Stone of "
                    + "Jordan, Raven Frost & Vampire Gaze can be obtained from"
                    + " Dethl, the Nightmare Legend");
        }
        
        else if(value == 13){
            BinarySearch(SearchHelp, value);
            System.out.println("#" + value + ": Special Item like Galaxy Orb,"
                    + " Galaxy Shard & Galaxy Star can be obtained from Kronix,"
                    + " the Galactic Legend");
        }
        
        else{
            System.out.println("#" + value + " is corrupted, not in system");
        }
    }
    
    /**
     * Method name - BinarySearch
     * Searches through the granted value inputted from the user to verify
     * @param SearchHelp - ArrayList of Integer consisting of numbers
     * @param value - User inputted answer to search
     * @return - returns value back to user to see if it is true or false
     */
    public static boolean BinarySearch(ArrayList<Integer> SearchHelp,int value){
        int first = 0; 
            int last = SearchHelp.size() - 1; 
            int middle; 
            boolean found = false;
            
            while (!found && first <= last)
            {
                middle = (first + last) / 2;
                
                //If array is found at Midpoint...
                if (SearchHelp.get(middle) == value)
                {
                    found = true;
                }
                
                //Else if value is in lower half...
                else if (SearchHelp.get(middle) > value)
                {
                    last = middle - 1; 
                    /*
                    Move the boundary of our search to exclude everything from
                    the middle higher
                    */
                }
                
                //Else if the value is in the upper half...
                else if (SearchHelp.get(middle) < value)
                {
                    first = middle + 1;
                    /*
                    Move the boundary of our search to exclude everything from
                    the middle lower
                    */
                }
            }
            return found;
    }
    
    /**
     * Method Name - Inventory
     * User can view Inventory from Output & writes it all in a TextFile
     * @throws IOException 
     */
    public static void Inventory() throws IOException{
        String line;
        
        File myFile = new File("Inventory.txt");
        Scanner readFile = new Scanner(myFile);
        
        while(readFile.hasNext()){ 
             line = readFile.nextLine();
             String[] tokens = line.split(", "); 
           
             for (int i = 0; i < tokens.length; i++){
                 InventoryBackPack.add(tokens[i]);   
                 System.out.println(tokens[i]);
             }
        }
    }
    
    /**
     * Method Name - InputInventory
     * Takes from MineOres Method and inputs the item into a TextFile Inventory
     * @param item1 - Mining ore
     * @param item2 - Mining ore
     * @param item3 - Mining ore
     * @throws IOException - TextFile grant access
     */
    public static void InputInventory(String item1, String item2, 
            String item3) throws IOException{
        FileWriter fWrite = new FileWriter("Inventory.txt", true);
        PrintWriter outFile = new PrintWriter(fWrite);
        
        outFile.print("\n" + item1 + ", " + item2 + ", " + item3);
        outFile.close();
    }
    
    /**
     * Method Name - InputInventory02
     * Takes special item dropped from a specific boss and input to inventory
     * @param DropSpecial - Item from Boss
     * @throws IOException - TextFile grant access
     */
    public static void InputInventory02(String DropSpecial) throws IOException{
        FileWriter fWrite = new FileWriter("Inventory.txt", true);
        PrintWriter outFile = new PrintWriter(fWrite);
        
        outFile.print("\n" + DropSpecial);
        outFile.close();
    }
    
    /**
     * Method Name - InputInventory03
     * Takes special item dropped from a specific boss and input to inventory
     * @param DropSpecial01 - Item from Boss
     * @throws IOException - TextFile grant access
     */
    public static void InputInventory03(String DropSpecial01) throws IOException{
        FileWriter fWrite = new FileWriter("Inventory.txt", true);
        PrintWriter outFile = new PrintWriter(fWrite);
        
        outFile.print("\n" + DropSpecial01);
        outFile.close();
    }
    
    /**
     * Method Name - InputInventory04
     * Takes special item dropped from a specific boss and input to inventory
     * @param DropSpecial02 - Item from Boss
     * @throws IOException - TextFile grant access
     */
    public static void InputInventory04(String DropSpecial02) throws IOException{
        FileWriter fWrite = new FileWriter("Inventory.txt", true);
        PrintWriter outFile = new PrintWriter(fWrite);
        
        outFile.print("\n" + DropSpecial02);
        outFile.close();
    }
    
    /**
     * Method Name - Name01
     * Takes in the User's input name and writes it onto a TextFile
     * @param name1 - granted by User input
     * @throws IOException - TextFile grant access
     */
    public static void Name01(String name1) throws IOException{
        FileWriter fWrite = new FileWriter("Result.txt", true);
        PrintWriter outFile = new PrintWriter(fWrite);
        
        outFile.print("NAME: " + name1);
        outFile.println();
        outFile.close();
    }
    
    /**
     * Method name - Result01
     * Takes the rank achievement into result end
     * @param outcome1 - Any rank associated with it
     * @throws IOException - TextFile grant access
     */
    public static void Result01(String outcome1) throws IOException{
        FileWriter fWrite = new FileWriter("Result.txt", true);
        PrintWriter outFile = new PrintWriter(fWrite);
        
        outFile.println("RANK ACHIEVED: " + outcome1);
        outFile.println();
        outFile.close();
    }
    
    /**
     * Method name - Achieve01
     * Takes in any badge achievement awarded by the system fro User's action
     * @param badge01 - Any badge associated with it
     * @throws IOException - TextFile grant access
     */
    public static void Achieve01(String badge01) throws IOException{
        FileWriter fWrite = new FileWriter("Result.txt", true);
        PrintWriter outFile = new PrintWriter(fWrite);
        
        outFile.println("BADGE ACHIEVED: " + badge01);
        outFile.println();
        outFile.close();
    }
}