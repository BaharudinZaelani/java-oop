package udin2;

public class Attack extends Controller{
    private Player player1;
    private Player player2;

    Attack(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        System.out.println("======================\nGelut Time : ");
        boolean gelut = true;
        int i = 1;
        do{
            System.out.println("=========\nBattle ke " + i);
            this.battle();
            if ( this.player1.getHealt() <= 0 || this.player2.getHealt() <= 0 ){
                gelut = false;
            }
            this.player1.displayStat();
            this.player2.displayStat();
            i++;
        }while(gelut);

    }

    void battle(){
        float cek = 0;
        if ( this.player1.getAttack() < this.player2.getDefense() ){
            cek = this.cekArmorR(this.player2.getDefense(), this.player1.getAttack());
            this.player2.setDefense(cek);
        }else {
            cek = this.cekArmor(this.player1.getAttack(), this.player2.getDefense());
            this.player2.setDefense(0);
            this.player2.setHealt(this.player2.getHealt() - cek);
        }

        if ( this.player2.getAttack() < this.player1.getDefense() ){
            cek = this.cekArmorR(this.player1.getDefense(), this.player2.getAttack());
            this.player1.setDefense(cek);
        }else {
            cek = this.cekArmor(this.player2.getAttack(), this.player1.getDefense());
            this.player1.setDefense(0);
            this.player1.setHealt(this.player1.getHealt() - cek);
        }
    }

    @Override
    float cekArmor(float attack, float defense){
        return attack - defense;
    }

    @Override
    float cekArmorR(float defense, float attack){
        return defense - attack;
    }
}
