package netology.ru;

import java.util.Map;

public class ProductBasket {

    protected String title;
    protected int count;
    protected ProductBasket[] productBaskets;
    protected int size;
    Purchase purchase;

    public ProductBasket(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public ProductBasket(int size) {
        this.size = size;
        this.productBaskets = new ProductBasket[size];
    }

    public void addProductBasket(String title, int count) {
        for (int i = 0; i < productBaskets.length; i++) {
            if (productBaskets[i] == null) {
                productBaskets[i] = new ProductBasket(title, count);
                return;
            }
            if (productBaskets[i].title.equals(title)) {
                productBaskets[i].count += count;
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < productBaskets.length; i++) {
            ProductBasket productBasket = productBaskets[i];
            if (productBasket == null) continue;
            System.out.println("\t" + productBasket.title + " " + productBasket.count + " шт. в сумме " + (productBasket.count * prices.get(productBasket.title)) + " руб.");
            sum += productBasket.count * prices.get(productBasket.title);
        }
        return sum;
    }
}
