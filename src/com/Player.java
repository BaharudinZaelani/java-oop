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

class Armor{
    private String name;
    private double defense;

    Armor(String name, int defense){
        this.name = name;
        this.defense = defense;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDefense(double defense){
        this.defense = defense;
    }

    public double getDefense(){
        return this.defense;
    }

    void display(){
        System.out.println("Armor \t: " + this.name + "("+ this.defense +")");

    }
}

class Weapon{
    private String name;
    double attackPower;

    Weapon(String name, double attack){
        this.name = name;
        this.attackPower = attack;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAttackPower(double power){
        this.attackPower = power;
    }

    public double getAttackPower(){
        return this.attackPower;
    }

    void display(){
        System.out.println("Weapon \t: " + this.name + "("+ this.attackPower +")");
    }
}

class Attack{
    private Player playerZ;
    private Player attacked;
    private double stackPower;
    
    Attack(Player player, Player attackTo){
        if( player.getHealt() > 100 || player.getWeaponPower() != player.cek()){
            System.out.println("====================================");
            System.out.println("     " + player.getName() +" Terdeteksi Curang ! ");
            System.out.println("====================================");
        }else {
            this.playerZ = player;
            this.attacked = attackTo;
            System.out.println("\n============ Gelut Time");
            attackToPlayer();
            displayDamage();
        }
        
    }

    private void attackToPlayer(){
        if ( this.playerZ.getArmorDefense() < this.attacked.getWeaponPower()) {
            this.stackPower = this.attacked.getWeaponPower() - this.playerZ.getArmorDefense();
            this.playerZ.setArmorDefense(0.0f);
        }else {
            double hasilPower = this.playerZ.getArmorDefense() - this.attacked.getWeaponPower();
            this.playerZ.setArmorDefense(hasilPower);
            // this.player.healt = this.player.healt - this.attackPowerFromAttacker;
        }

        if ( this.stackPower < this.playerZ.getHealt() ) {
            double healtResult = this.playerZ.getHealt() - this.stackPower;
            this.playerZ.setHealt(healtResult);;
        }else {
            this.playerZ.setHealt(0.0f);
            System.out.println(this.playerZ.getName() + " | MATI !");
        }
    }

    private void displayDamage(){
        System.out.println(": " + this.playerZ.getName() + " Got Damage from > " + this.attacked.getName());
        System.out.println(": Sisa Defanse " + this.playerZ.getName() + " " + this.playerZ.getArmorDefense());
        System.out.println(": Sisa HP " + this.playerZ.getName() + " " + this.playerZ.getHealt());
        this.playerZ.display();
        // System.out.println(this.stackPower);
    }
}