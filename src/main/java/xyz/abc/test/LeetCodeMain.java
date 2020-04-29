package xyz.abc.test;

/**
 * @author 秦江峰
 * @AddTime 2020/3/23 14:36
 */
public class LeetCodeMain {

    static class Parent {

        static {
            A = 2;
        }

        public static int A = 1;
    }

    static class Sub extends Parent {
        public static int B = A;
    }


    public static void main(String[] args) {

        System.out.println(Sub.A);

//        int[][] integers = new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
//        corpFlightBookings(
//                integers, 5
//
//        );

    }

    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] r = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            int start = bookings[i][0];
            int end = bookings[i][1];
            int num = bookings[i][2];
            for (int j = start; j <= end; j++) {
                r[j - 1] += num;
            }
        }
        return r;
    }


}
