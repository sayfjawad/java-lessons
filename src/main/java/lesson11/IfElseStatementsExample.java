package lesson11;

public class IfElseStatementsExample {

    public static void main(String[] args) {

        String[] animals = new String[6];
        animals[0] = "Dog";
        animals[1] = "Cat";
        animals[2] = "Dolphin";
        animals[3] = "Wolf";
        animals[4] = "Baboos";
        animals[5] = "Blieblablue";

        String animal = animals[3];

            if ("Dog".equals(animal)) {
                System.out.println("bark");
            } else if ("Cat".equals(animal)) {
                System.out.println("meow");
            } else if ("Dolphin".equals(animal)) {
                System.out.println("click");
            } else if ("Wolf".equals(animal)) {
                System.out.println("cry");
            } else {
                System.out.println("what!");
            }
    }
}
