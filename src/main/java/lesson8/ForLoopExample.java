package lesson8;

public class ForLoopExample {

    public static void main(String[] args) {

        String[] myWordsArray = new String[5];
        myWordsArray[0] = "Welcome ";
        myWordsArray[1] = "to ";
        myWordsArray[2] = "learning ";
        myWordsArray[3] = "wonderful ";
        myWordsArray[4] = "Java!";

        for ( int i=0; i<5; i=i+1 ) {
            System.out.print( myWordsArray[i] );
        }
    }
}
