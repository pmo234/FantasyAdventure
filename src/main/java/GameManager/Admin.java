package GameManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;
import Weapons.Weapons;
import players.Fighters.Barbarian;
import players.Player;


public class Admin {

    public static void startGame() {
        Scanner myObj = new Scanner(System.in);
        Barbarian barbarian = new Barbarian("Steve The Barbarian", 30, 2);

        System.out.println("Hello Steve, welcome to Steve Quest");
        System.out.println("What kind of Steve are you?");
        String userName = myObj.nextLine();

        System.out.println("Hello Steve the " + userName);
        barbarian.setName("Steve the " + userName);
        choosingAWeapon();
    }

    public static void choosingAWeapon() {

        Scanner myObj = new Scanner(System.in);
        ArrayList<Weapons> allWeapons = new ArrayList<Weapons>(EnumSet.allOf(Weapons.class));
        System.out.println("What is your weapon of choice?  Sword Club Fish Axe GUNOFSOULS (careful)");
        String chosenWeapon = myObj.nextLine();
        for (Weapons weapon:allWeapons) {
            System.out.println(weapon.getName().getClass());
            System.out.println(chosenWeapon.getClass());
            System.out.println(weapon.getName());
            System.out.println(chosenWeapon);
            if (chosenWeapon.equals(weapon.getName())) {
                System.out.println(barbarian.getName() + "You have chosen " + chosenWeapon);
                break;
            }

        }
//        if(weapons.valueOf() == Weapons.getName())
//        System.out.println("You chose " + weapons.);




    }
}
