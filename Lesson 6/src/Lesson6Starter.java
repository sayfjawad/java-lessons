
public class Lesson6Starter {

    public static void main(String[] args) {

        Person p = new Person();

        p.name = "Jane";
        p.age = 26;
        p.occupation = "model";

        System.out.println("We have a person called: " + p.name);
        System.out.println("And is " + p.age + " years old");
        System.out.println("This person is a " + p.occupation);
    }
}

