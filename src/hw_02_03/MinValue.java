package hw_02_03;
/*  Минимальное из N чисел(использовать LinkedList):
    1.Ввести с клавиатуры число N.
    2.Считать N целых чисел и заполнить ими список - метод getIntegerList.
    3.Найти минимальное число среди элементов списка - метод getMinimum.
*/
import java.util.LinkedList;
import java.util.Scanner;

public class MinValue {
    public static LinkedList<Integer> getIntegerList() {

        System.out.print("Введите целое число: ");  //это число будет определять размер списка
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        LinkedList<Integer> myList = new LinkedList<>();
        System.out.println("Введите " + size + " целых числа для заполненеия списка: ");
        for (int i = 0; i < size; i++) {
            myList.add(scanner.nextInt());  //заполняем числами список
        }
        return myList;
    }

    public static int getMinimum(LinkedList<Integer> myList) {
        int min = myList.get(0) ;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) < min) {
                min = myList.get(i);
            }
        }
        return min;  //минимальное число среди элементов списка
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = getIntegerList();
        System.out.print("Элементы списка: ");
        for (Integer myList : list) {
            System.out.print(myList + " ");
        }
        int minNum = getMinimum(list);
        System.out.println("\nMin число среди элементов списка: " + minNum);
    }
}