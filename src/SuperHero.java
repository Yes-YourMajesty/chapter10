public class SuperHero extends Hero{
    boolean flying;
    //追加の処置
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }
    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }
    public void run() {
        System.out.println(this.name + "は撤退した");
    }
    public void attack(Matango m) {
        super.attack(m);//親クラスHeroのattackメソッドを呼び出す
        if (this.flying) {
            super.attack(m);//親クラスHeroのattackメソッドを呼び出す
        }
    }
    public void test(){
        super.test();
        System.out.println("子テスト");
    }
    public SuperHero() {
        //super(); //自動で追加されている
        System.out.println("SuperHeroのコンストラクタが動作");
    }
}
