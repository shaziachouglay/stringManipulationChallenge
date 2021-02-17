package udemy;

public class WordsCount {
    public static void main(String[] args) {
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"},1)); // 2
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"},3)); // 1

    }
    public static int wordsCount(String[] words, int len){
     int count = 0;
     for (int i = 0; i< words.length; i++){
         if (words[i].length() == len)
             count++;
     }
     return count;
    }
}
