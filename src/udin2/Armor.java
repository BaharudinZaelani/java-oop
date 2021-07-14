package udin2;

public class Armor extends Item {
    private float defense;
    
    Armor(String name, float defense){
        this.name = name;
        this.defense = defense;
    }

    float getDefense(){
        return this.defense;
    }

    void setDefense(float defense){
        this.defense = defense;
    }

}
