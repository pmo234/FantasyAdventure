package Weapons;

public enum Weapons {
    SWORD("Sword",1.5),
    CLUB("Club",1),
    FISH("FISH",0.2),
    AXE("Axe",1.6),
    GUNOFSOULS("Gun Of Souls",2);
    private final String name;
    private final double power;

    Weapons(String name, double power) {
        this.name = name;
        this.power = power;
    }

}
