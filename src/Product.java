import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private LocalDate data;
    private String product;
    private String country;
    private double price;
    private boolean people;

    public Product(int id,
                   String name,
                   LocalDate data,
                   String product,
                   String country,
                   double price,
                   boolean people) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.product = product;
        this.country = country;
        this.price = price;
        this.people = people;
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + data);
        System.out.println("Производитель: " + product);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Бронирования покупателем: " + people);
    }

    /*
    public static void main(String[] args) {
        Product product1 = new Product(
                1,
                "Монитор",
                LocalDate.of(2021, 01, 01),
                "Dell",
                "Китай",
                2500.0,
                false);
        Product product2 = new Product(
                2,
                "Чай",
                LocalDate.of(2025, 05, 05),
                "Йерба Мате \"Pajarito\"",
                "Парагвай",
                65.0,
                true);
        product1.info();
        System.out.println("-------------------------");
        product2.info();
    }
    */
}
