package zadania;


import java.util.Scanner;

/*Pobierz z konsoli wartość od 0 do 9. Na podstawie otrzymanej wartości wyświetl
        dowolny znak. Na przykład dla numeru 0 wyświetl „*”, dla 1 wyświetl „$” (lub dowolny
        inny).*/
public class IfTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        // Zaznaczyc linijke w debugu, prawym, Evaluate Expression i mozna podejrzec operacje
        if(value==0){
            System.out.println("!");
        } else if (value==1){
            System.out.println("@");
        }else if (value==2){
            System.out.println("#");
        }else {
            System.out.println("Znak nieobslugiwany");
        }

        // warunek zawsze spelniony
        if(true){
            System.out.println("Coś");
        }
    }
}
