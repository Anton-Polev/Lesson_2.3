import java.time.LocalDate;
import java.time.LocalTime;

public class Park {

    public class Attraction {
        private String name;
        private LocalTime open;
        private LocalTime close;
        private double price;

        public Attraction(
                String name,
                LocalTime open,
                LocalTime close,
                double price) {
            this.name = name;
            this.open = open;
            this.close = close;
            this.price = price;
        }

        public void info() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время открытия: " + open);
            System.out.println("Время закрытия: " + close);
            System.out.println("Стоимость билета: " + price);
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        Attraction[] attractionArray = new Attraction[5];

        attractionArray[0] = park.new Attraction(
                "Колесо обозрения",
                LocalTime.of(8, 10),
                LocalTime.of(00, 50),
                10);

        attractionArray[1] = park.new Attraction(
                "Комната смеха",
                LocalTime.of(9, 20),
                LocalTime.of(23, 40),
                15);

        attractionArray[2] = park.new Attraction(
                "Детский поезд",
                LocalTime.of(10, 30),
                LocalTime.of(22, 30),
                20);

        attractionArray[3] = park.new Attraction(
                "Сюрприз",
                LocalTime.of(11, 40),
                LocalTime.of(21, 20),
                25);

        attractionArray[4] = park.new Attraction(
                "Ракушки",
                LocalTime.of(12, 50),
                LocalTime.of(20, 10),
                30);

        for (Attraction attraction : attractionArray) {
            attraction.info();
            System.out.println("-------------------------");
        }
    }
}





