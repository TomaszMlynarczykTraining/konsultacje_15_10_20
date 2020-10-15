package zadania;

public class DogMain {

    public static void main(String[] args) {


        Dog germanShepard = new Dog("German shepard", 12);

        germanShepard.doBark();
        germanShepard.showBreed();

        Dog york = new Dog("York", 2);

        york.doBark();
        york.showBreed();


    }
}
