import java.util.List;

public class Race {

    public static void calculateDistances(List<Automobile> cars) {

        int maxDistance = 0;
        Automobile winner = null;

        for (Automobile car : cars) {
            int distance = car.getSpeed() * 24;

            if (distance > maxDistance) {
                maxDistance = distance;
                winner = car;
            }
        }

        if (winner != null) {
            System.out.println("Победитель гонки: " + winner.getName() + " (проехал " + maxDistance + " км)");
        }
    }
}
