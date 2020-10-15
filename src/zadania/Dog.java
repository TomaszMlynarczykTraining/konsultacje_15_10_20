package zadania;

public class Dog {

    private String breed;
    private int age;


    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }


    public void doBark(){
        System.out.println("Woof!");
    }

    public void showBreed(){
        System.out.println(breed);
    }
}
