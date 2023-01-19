class Fighther{
    String name;
    int damage;
    int health;
    int weight;

    int dodgeChance;
    int firstChance;

    Fighther(String name, int damage, int health, int weight, int dodgeChance, int firstChance){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.firstChance = firstChance;
        if (dodgeChance >= 0 && dodgeChance <= 100){
            this.dodgeChance = dodgeChance;
        }else {
            this.dodgeChance = 0;
        }
    }
    int hit(Fighther foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name + " hasarı engelledi.");
            System.out.println("----------------------");
            return foe.health;
        }
        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isFirst(){
        double firstHit = Math.random()*100;
        return firstHit <= this.firstChance;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodgeChance;
    }
}