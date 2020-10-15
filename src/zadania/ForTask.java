package zadania;

import java.util.Scanner;

public class ForTask {
/*    Stwórz pętle for, która wykona 5 iteracji.
     Wewnątrz pętli pobieraj z konsoli dowolną wartość typu int. Po
    wyjściu z pętli zwróć sumę tych wartości.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int result=0;

        for (int i = 0; i <5 ; i++) {
            int value = scanner.nextInt();
            result = result + value;
        }

        System.out.println(result);

    }
}
