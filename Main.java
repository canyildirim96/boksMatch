class Main{
    public static void main(String[] args){
        Fighther f1 = new Fighther("Ali baba", 15 , 100,120,20,50);
        Fighther f2 = new Fighther("Kırk Haramiler", 20,85,90,25,50);

        Match m1 = new Match(f1,f2,90,120);
        m1.start();
    }
}