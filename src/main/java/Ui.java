import java.util.Scanner;

// Пользовательский интерфейс перенесён в отдельный класс из класса Main
public class Ui {

    static void purchaseUi() {
        Scanner scanner = new Scanner(System.in);
        Purchase purchase = new Purchase();
        while (true) {
            System.out.println();
            System.out.println("Введите два слова: название товара и количество. Или end");
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase.addPurchase(product, count);
            System.out.println("Вы добавили в корзину: " + product + " " + count + " шт.");
        }
        long sum = purchase.sum(Product.getProducts());
        System.out.println("ИТОГО: " + sum);
    }

    static void showAllProducts() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        Product.getProducts().forEach((key, value) -> System.out.println(key + " за " + value + " руб./шт."));
    }
}