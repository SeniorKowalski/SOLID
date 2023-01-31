import java.util.HashMap;
import java.util.Map;

// Создан отдельный класс для продуктов
public class Product {
    private static Map<String, Integer> products = new HashMap<>();

    public static Map<String, Integer> getProducts() {
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
        return products;
    }
}