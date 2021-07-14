package udin2;

public class Main {
    public static void main(String[] args) {
        Weapon weaponUdin = new Weapon("Pedang Excalibur", 135);
        Armor armorUdin = new Armor("Baju Besi", 400);
        Player udin = new Player("Udin", weaponUdin, armorUdin);
        udin.displayStat();

        Weapon weaponZamrud = new Weapon("Panah Berkualitas", 100);
        Armor armorZamrud = new Armor("Baju Besi", 100);
        Player zamrud = new Player("zamrud", weaponZamrud, armorZamrud);
        zamrud.displayStat(); 
        
        Attack atk1 = new Attack(zamrud, udin);
    }
}
