package com;

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
