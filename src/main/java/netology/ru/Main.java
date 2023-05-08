package netology.ru;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Products products = new Products();
        products.setProducts("Хлеб", 56);
        products.setProducts("Масло", 153);
        products.setProducts("Колбаса", 211);
        products.setProducts("Пирожок", 45);
        products.setBeanSize(products.getProducts().size());

        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Purchase purchase = new Purchase();
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase.addPurchase(product, count);
        }
        long sum = purchase.sum(products.getProducts());
        System.out.println("ИТОГО: " + sum);
    }
}