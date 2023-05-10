package netology.ru;

public class Purchase {
    protected String title;
    protected int count;
    Purchase purchase;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(String product, int value) {
        this.purchase = new Purchase(product, value);
    }
}
