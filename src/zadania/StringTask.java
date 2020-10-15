package zadania;


/*
Stwórz implementację, która będzie przyjmować dwa parametry typu String, zamieniać
        je na duże litery, łączyć i wyświetlać na konsoli,
*/

public class StringTask {

    public static void main(String[] args) {
        String firstString = "jabłko";
        String secondString = "gruszka";

        String resultString = firstString.toUpperCase() + secondString.toUpperCase();

        //tak nie porownujemy
        System.out.println(firstString==secondString);

        //tak porownujemy obiekty
        System.out.println(firstString.equals(secondString));

        System.out.println(resultString);
    }
}
