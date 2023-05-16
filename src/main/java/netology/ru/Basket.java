package netology.ru;

import java.util.Map;

public class Basket {

    protected Purchase[] purchases;
    protected int size;

    public Basket(int size) {
        this.size = size;
        this.purchases = new Purchase[size];
    }

    public void addProductBasket(String title, int count) {
        for (int i = 0; i < size; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
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
        for (int i = 0; i < size; i++) {
            if (purchases[i] == null) continue;
            System.out.println("\t" + purchases[i].title + " " + purchases[i].count + " шт. в сумме " + (purchases[i].count * prices.get(purchases[i].title)) + " руб.");
            sum += purchases[i].count * prices.get(purchases[i].title);
        }
        return sum;
    }
}
