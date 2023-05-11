package netology.ru;

public class Purchase {
    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public static Purchase getPurchase(String product, int value) {
        return new Purchase(product, value);
    }
}
