package lesson12;

public class SwitchStatementExample {

    public static void main(String[] args) {

        String animal = "cat";

        switch (animal) {
            case "chicken":
                System.out.println("click");
                break;
            case "dog":
                System.out.println("bark");
                break;
            case "cat":
                System.out.println("meow");
                break;
            default:
                System.out.println("didnt find a match!");
        }
    }
}
