package udin2;

public class Player{
    private String name;
    private float health;
    private static int playerStack;
    private Armor armor;
    private Weapon weapon;

    Player(String name, Weapon weapon, Armor armor){
        this.playerStack++;
        this.name = name;
        this.health = 100;
        this.armor = armor;
        this.weapon = weapon;

    }

    Player (){
        this.playerStack++;
        this.name = "Player" + this.playerStack;
        this.health = 100;
        this.armor = new Armor("baju kaos", 50);
        this.weapon = new Weapon("pedang basic", 100);
    }

    String getName(){
        return this.name;
    }

    float getHealt(){
        return this.health;
    }

    void setDefense(float def) {
        this.armor.setDefense(def);
    }

    void setHealt(float hp){
        this.health = hp;
    }

    float getDefense(){
        return this.armor.getDefense();
    }

    float getAttack(){
        return this.weapon.getDamage();
    }

    public void displayStat(){
        if ( this.health <= 0 ){
            System.out.println("================================");
            System.out.println("   " + this.name + " MATI !");
            System.out.println("================================");
        }else {
            System.out.println("\t" + this.name + " Stats");
            System.out.println("Nama \t\t: " + this.name);
            System.out.println("Health \t\t: " + this.health);
            System.out.println("Armor Name \t: " + this.armor.getName());
            System.out.println("Armor def \t: " + this.armor.getDefense());
            System.out.println("Weapon Name \t: " + this.weapon.getName());
            System.out.println("Weapon Damage \t: " + this.weapon.getDamage());
        }
    }
}
