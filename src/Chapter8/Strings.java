package Chapter8;

public class Strings {

    public static void main(String[] args){
        countWords("Me gustan las manzanas");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Tu texto contiene %d palabras:", numberOfWords);
        System.out.println(message);

        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }

}
