package com;

public class Player {
    private String name;
    private static double healt;
    private static int stackPlayer;
    private Armor armor;
    private Weapon weapon;
    private double cekWeaponPower;

    Player( String name, Armor armor, Weapon weapon ){
        this.stackPlayer ++;
        this.name = name;
        this.armor = armor;
        this.weapon = weapon;
        this.healt = 100f;
        this.cekWeaponPower = this.weapon.getAttackPower();
        display();
    }
    
    Player() {
        this.stackPlayer++;
        this.name = "Player" + this.stackPlayer;
        this.healt = 100f;
        this.armor = new Armor("Baju Kulit", 15);
        this.weapon = new Weapon("Pedang Basic", 20);
        this.cekWeaponPower = this.weapon.getAttackPower();
        display();
    }

    public double cek(){
        return this.cekWeaponPower;        
    }

    // Set Nama
    public void setName(String name){
        this.name = name;
    }

    // Get Nama
    public String getName(){
        return this.name;
    }

    // Set Helat
    public void setHealt(double healt){
        this.healt = healt;
    }

    // Get Healt
    public double getHealt(){
        return this.healt;
    }

    // Set Armor Defense
    public void setArmorDefense(double defense){
        this.armor.setDefense(defense);
    }

    // Get Armor Defense
    public double getArmorDefense(){
        return this.armor.getDefense();
    }

    // Set Armore name
    public void setArmorName(String name){
        this.armor.setName(name);
    }

    // get Armor name
    public String getArmorName(){
        return this.armor.getName();
    }

    // set Weapon name
    public void setWeaponName(String name){
        this.weapon.setName(name);
    }

    // get Weapon name
    public String getWeaponName(){
        return this.weapon.getName();
    }

    // set weapon power 
    public void setWeaponPower(double power){
        this.weapon.setAttackPower(power);
    }

    // get Weapon Power
    public double getWeaponPower(){
        return this.weapon.getAttackPower();
    }

    void display(){
        System.err.println("\n============ Player Stats");
        System.out.println("Name\t: " + this.name);
        System.out.println("HP\t: " + this.healt);
        this.weapon.display();
        this.armor.display();    
    }
}

