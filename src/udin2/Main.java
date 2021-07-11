package udin2;

public class Main {
    public static void main(String[] args) {
        Weapon weaponUdin = new Weapon("Pedang Excalibur", 500);
        Armor armorUdin = new Armor("Baju Besi", 250);
        Player udin = new Player("Udin", weaponUdin, armorUdin);
        udin.displayStat();

        Player player1 = new Player();
        player1.displayStat();
    }
}
