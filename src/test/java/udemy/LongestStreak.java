package udemy;

public class LongestStreak {
    public static void main(String[] args) {
        System.out.println(longestStreak("hayyeu")); // 2
    }
    public static int longestStreak(String str){
        int max = 0;
        for (int i =0; i<str.length(); i++){
            int count = 0;
            for (int j = i;j<str.length(); j++){
                if (str.charAt(i) == str.charAt(j))
                    count++;
                else break;
            }
            if (count > max)
                max = count;
        }
        return max;

    }
}
