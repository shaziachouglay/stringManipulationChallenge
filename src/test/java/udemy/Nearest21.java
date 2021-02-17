package udemy;

public class Nearest21 {
    public static void main(String[] args) {
        System.out.println(nearesttwentyOne(19,21));
        System.out.println(nearesttwentyOne(21,19));
        System.out.println(nearesttwentyOne(19,22));
        System.out.println(nearesttwentyOne(32,22));
    }
    public static int nearesttwentyOne(int a, int b){
        if (a > 21 && b > 21) return 0;
        if (a > 21 && b <= 21) return b; // a is disqualified
        if (a <= 21 && b > 21) return a; // b is disqualified
        if (a > b) return a;
        else return b;
    }
    public static int partialSum(int a, int b,int c){
        if (a == 13) return 0;
        if (b == 13) return a;
        if (c == 13) return a+b;
        return a+b+c;
    }

}
