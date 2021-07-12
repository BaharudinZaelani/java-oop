package udin2;

public class Weapon extends Item{
    private float damage;
    Weapon( String name, float damage ){
        this.name = name;
        this.damage = damage;
    }

    float getDamage(){
        return this.damage;
    }

    void setDamage(float damage){
        this.damage = damage;
    }
}
