package zadania;

public class ForEachTask {
/*    Napisz implemetację, która wypisze w konsoli elementy tablicy intów, zadeklarowanej
    wcześniej,*/
    public static void main(String[] args) {

        int [] luckyNumbers = {13,7,666};

        for (int number : luckyNumbers) {
            System.out.println("Lucky number is " + number);
        }
    }
}
