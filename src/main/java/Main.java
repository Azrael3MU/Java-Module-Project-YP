import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Automobile> cars = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины №" + i + ":");
            String name = scanner.nextLine();

            while (name.isEmpty()) {
                System.out.println("Вы ничего не ввели, пожалуйста, введите название машины.");
                name = scanner.nextLine();
            }

            int speed;
            while (true) {
                System.out.println("Введите скорость машины №" + i + ":");

                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    scanner.nextLine();

                    if (speed >= 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Введите скорость от 0 до 250.");
                    }
                } else {
                    System.out.println("Ошибка! Введите целое число.");
                    scanner.next();
                }
            }

            cars.add(new Automobile(name, speed));
        }

        scanner.close();
        Race.calculateDistances(cars);
    }
}
