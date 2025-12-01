package blind75;

public class ClimbingStairs {

    public static void main(String[] args) {
        int num = 3;
        System.out.println(climbStairs(num));
    }

    public static int climbStairs(int n) {

        int one = 1;
        int two = 2;

        for (int i = 3; i <= n; i++) {
            int total = one + two;
            one = two;
            two = total;
        }
        return two;
    }
}
