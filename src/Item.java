public class Item {
    String name;
    int price;

    // 引数1つのコンストラクタ
    public Item(String name) {
        this.name = name;
        this.price = 0;
    }

    // 引数2つのコンストラクタ
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}