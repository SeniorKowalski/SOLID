import java.util.HashMap;

// Создан отдельный класс для продуктов
public class Product {
    static HashMap<String, Integer> products = new HashMap<>();

    public static HashMap<String, Integer> getProducts() {
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
        return products;
    }
}