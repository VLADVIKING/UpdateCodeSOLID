package netology.ru;

import java.util.Map;

public class Basket {

    protected String title;
    protected int count;
    protected Basket[] purchases;
    protected int size;

    public Basket(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Basket(int size) {
        this.size = size;
        this.purchases = new Basket[size];
    }

    public void addProductBasket(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Basket(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Basket basket = purchases[i];
            if (basket == null) continue;
            System.out.println("\t" + basket.title + " " + basket.count + " шт. в сумме " + (basket.count * prices.get(basket.title)) + " руб.");
            sum += basket.count * prices.get(basket.title);
        }
        return sum;
    }
}
