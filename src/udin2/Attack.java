package udin2;

public class Attack {
    private Player player1;
    private Player player2;
    private float stackDamage;
    Attack(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.gelutP1();
        // this.player2.setDefense(this.gelutP2());
    }

    void gelutP1(){
        float p1GotDamage = 0;
        float p2GotDamage = 0;
        float hasil = 0;
        // player 1 attack
        if ( this.player1.getDamage() < this.player2.getDefense() ){
            // masih bingung broooooooooooooooooooo
        }else {
            this.stackDamage = this.player1.getDamage() - this.player2.getDefense();
            this.player2.setDefense(0);
            if( this.stackDamage < this.player2.getHealt() ){
                this.player2.setHealt(0);
            }
        }

    }

    float gelutP2(){
        float p2GotDamage = this.player2.getHealt() - this.player1.getAttack();
        return p2GotDamage;
    }
}
