package hw_02_02;
/* Используя коллекцию удвойте слово:
   1. Введите с клавиатуры 5 слов в список строк.
   2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
   3. Используя цикл for выведите результат на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < 10; i += 2) {    //Удваиваем слова
            list.add(i, list.get(i));
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println("Введите пять слов: ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String temp = scanner.nextLine();
            list.add(temp); //Создаем список строк
        }
        System.out.println(list + " ");

        System.out.println("-----------------------");

        ArrayList<String> result = doubleValues(list);
        for (int i = 0; i < 10; i++) {
            System.out.println(result.get(i) + " ");    //вывод на экран, каждое значение с новой строки
        }
    }

}
