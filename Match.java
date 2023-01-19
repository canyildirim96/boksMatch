class Match{
    Fighther f1;
    Fighther f2;
    int minWeight;
    int maxWeight;

    Match(Fighther f1, Fighther f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void start(){
        if (isCheck()){
        while (this.f1.health >0 && this.f2.health > 0){
            System.out.println("======== Yeni Round! ========");
            if (f1.isFirst()){
                this.f2.health = this.f1.hit(f2);
                if(isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                if (isWin()){
                    break;
                }

            }else {
                this.f1.health = this.f2.hit(f1);
                if (isWin()){
                    break;
                }
                this.f2.health = this.f1.hit(f2);
                if (isWin()){
                    break;
                }
            }

            System.out.println();
            System.out.println(this.f1.name + " kalan sağlığı: " + this.f1.health);
            System.out.println(this.f2.name + " kalan sağlığı: " + this.f2.health);

        }
        }else{
            System.out.println("Sporcuların ağırsikletleri uyuşmuyor!");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı!!!");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı!!!");
            return true;
        }
        return false;
    }
}