package GameManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;
import Weapons.Weapons;
import players.Fighters.Barbarian;
import players.Player;

import static jdk.nashorn.internal.objects.Global.exit;


public class Admin {

    public static void startGame() {
        Scanner myObj = new Scanner(System.in);
        Barbarian barbarian = Barbarian.getInstance();

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
        Barbarian barbarian = Barbarian.getInstance();
        System.out.println("What is your weapon of choice?  Sword Club Fish Axe GUNOFSOULS (careful)");
        String chosenWeapon = myObj.nextLine();
        for (Weapons weapon:allWeapons) {

            if (chosenWeapon.equals(weapon.getName())) {
                System.out.println(barbarian.getName() + " you have chosen " + chosenWeapon);
                barbarian.setWeapon(weapon);
                System.out.println(barbarian.getName());
                System.out.println(barbarian.getWeapon());
                System.exit(0);
            }
            System.out.println("You dare mock me? Pick a real choice this time");
            choosingAWeapon();
        }
//        if(weapons.valueOf() == Weapons.getName())
//        System.out.println("You chose " + weapons.);




    }
}
