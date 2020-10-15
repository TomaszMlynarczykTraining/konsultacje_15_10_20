package zadania;


/*    Utwórz klasę Calculator, która posiada jedną metodę ,
w której jedyną implementacją będzie wyświetlenie
tekstu : „Initializing calculator…”*/

import java.util.Scanner;

public class Calculator {
    //Ctrl + shift + / - komentarz po zaznaczeniu
    public static void main(String[] args) {
        System.out.println("Initializing calculator…");

        Scanner scanner = new Scanner(System.in);

        int firstArgument = scanner.nextInt();
        int secondArgument = scanner.nextInt();

        System.out.println(sumTwoIntegers(firstArgument,secondArgument));
    }


/*    Przerób metodę w klasie kalkulator tak, by przyjmowała
dwie liczby z poziomu konsoli i wyświetlała je
    użytkownikowi.*/


    public static int sumTwoIntegers( int x, int y){
       int result= x + y;
       return result;
    }

}
