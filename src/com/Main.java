package com;

public class Main {
    public static void main(String[] args) {
        // GG Set
        Weapon pedang = new Weapon("Excalibur", 200);
        Armor armor = new Armor("Baju Emas", 130);

        // Player Add
        Player player1 = new Player("Udin", armor, pedang);
        Player player2 = new Player();
        Player player3 = new Player();
        
        // player2.setWeaponPower(300);

        // attack
        new Attack(player3, player2);
    }
}
