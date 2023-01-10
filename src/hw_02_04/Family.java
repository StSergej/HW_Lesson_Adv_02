package hw_02_04;
/* Программа определяет, какая семья (фамилия) живёт в городе:
 * Москва - Ивановы, Киев - Петровы, Лондон - Абрамовичи.
 * Пример ввода: Лондон - Пример вывода: Абрамовичи
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Family {
    public static void main(String[] args) throws IOException {
        Map<String, String> myMap = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название города, затем фамилию: ");
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String name = reader.readLine();
            myMap.put(city, name);
        }
        for (Map.Entry<String, String> arg : myMap.entrySet()) {
            System.out.println(arg);
        }

        System.out.println("-----------------------");

        System.out.println("Введите название города: ");
        String parCity = reader.readLine();

        for (Map.Entry<String, String> duet : myMap.entrySet()) {
            String town = duet.getKey();
            if (parCity.equals(town)) {
                String family = duet.getValue();
                System.out.print(" - " + family);
            }
        }
    }
}

