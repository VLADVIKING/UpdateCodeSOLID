package netology.ru;

import java.util.HashMap;
import java.util.Map;

public class Products {

    HashMap<String, Integer> products = new HashMap<>();
    protected static int beanSize;

    public HashMap<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(String title, int count) {
        products.put(title, count);
    }

    public static int getBeanSize() {
        return beanSize;
    }

    public void setBeanSize(int beanSize) {
        this.beanSize = beanSize;
    }

    public Iterable<? extends Map.Entry<String, Integer>> entrySet() {
        return products.entrySet();
    }
}
