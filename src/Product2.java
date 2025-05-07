import java.time.LocalDate;

public class Product2 {
    private int id;
    private String name;
    private LocalDate data;
    private String product;
    private String country;
    private double price;
    private boolean people;

    public Product2(int id,
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

    public static void main(String[] args) {
        Product2[] productsArray = new Product2[5];
        productsArray[0] = new Product2(
                1,
                "Монитор",
                LocalDate.of(2025, 05, 05),
                "Dell",
                "Китай",
                2500.0,
                false);
        productsArray[1] = new Product2(
                2,
                "Чай",
                LocalDate.of(2024, 05, 05),
                "Lauro Raatz S.A.",
                "Парагвай",
                100.0,
                true);
        productsArray[2] = new Product2(
                3,
                "Летние шины",
                LocalDate.of(2023, 05, 05),
                "Michelin",
                "Франция",
                4000.0,
                false);
        productsArray[3] = new Product2(
                4,
                "Велосипед",
                LocalDate.of(2022, 05, 05),
                "Giant",
                "Нидерланды",
                2000.0,
                true);
        productsArray[4] = new Product2(
                5,
                "Газонокосилка",
                LocalDate.of(2021, 05, 05),
                "STIHL",
                "Германия",
                1500.0,
                false);
        for (Product2 product : productsArray) {
            product.info();
            System.out.println("-------------------------");
        }
    }
}
