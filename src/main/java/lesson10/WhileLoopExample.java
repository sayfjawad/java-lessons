package lesson10;

public class WhileLoopExample {

    public static void main(String[] args) {

        int counter = 0;

        while (counter < 5) {
            // print current value
            System.out.println(counter);
            // increment value by 1
            counter++;
        }
        System.out.println("Outside of the while loop the counter equals:" + counter);
    }
}
