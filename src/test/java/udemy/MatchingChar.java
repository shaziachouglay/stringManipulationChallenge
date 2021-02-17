package udemy;

public class MatchingChar {
    public static void main(String[] args) {
        System.out.println(matchingChar(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"})); //1
    }
    public static int matchingChar(String[] a,String[] b){
        int count = 0;
        for (int i =0; i<a.length; i++){
            String str1 = a[i];
            String str2 = b[i];
            if (!str1.equals("") && !str2.equals("")){
                if (str1.charAt(0) == str2.charAt(0))
                    count++;
            }
        }
        return count;
    }
}
