package udemy;

public class RepeatChar {
    public static void main(String[] args) {
//        System.out.println(repeatChar("AAb")); // TThhee
//        System.out.println(starKill("ab**cd"));//ad
        System.out.println(starKill("wacy*xko")); // wacko
//        System.out.println(starKill("cd*za")); // ca
    }
    public static String repeatChar(String str){
        String result = "";

        for (int i =0;i<str.length(); i++){
            char aChar = str.charAt(i);
            result = result + aChar + aChar;
        }
        return result;
    }

    public static String starKill(String str){
        String result = "";
        for (int i =0; i < str.length(); i++){
            if (i == 0 && str.charAt(i) != '*')
              result = result + str.charAt(i);
              if ( i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*' )
                  result = result +str.charAt(i);
              if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1)!= '*')
                  result = result.substring(0,result.length()-1);

        }
        return result;
    }
}
