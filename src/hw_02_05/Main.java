package hw_02_05;
/*  Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
    1.Создать список строк.
    2.Ввести строки с клавиатуры и добавить их в список.
    3.Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
    4.Вывести строки на экран, каждую с новой строки.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("one");    //создаем список строк.
        list.add("two");
        list.add("three");
        System.out.println(list);
        System.out.print("Введите строку: ");   // например: four, five и т.д.

        while (true) {
            String arg = scanner.nextLine();
            list.add(arg);  //вводим строку и добавляем в список
            String key = "end"; //ключ-значение 'end'
            if(arg.equals(key)) {
                break;
            }
            for (String line : list){
                System.out.println(line);   //выводим строки на экран
            }
        }
        System.out.println("'end' завершение программы.");
        scanner.close();
    }
}