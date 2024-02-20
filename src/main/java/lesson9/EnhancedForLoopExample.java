package lesson9;

public class EnhancedForLoopExample {

    public static void main(String[] args) {

        String[] myWordsArray = new String[4];
        myWordsArray[0] = "Welcome ";
        myWordsArray[1] = "to ";
        myWordsArray[2] = "learning ";
        myWordsArray[3] = "Java!";

        for ( String word: myWordsArray ) {
            System.out.print( word );
        }
    }
}
