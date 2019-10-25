package com.qjfcc.demo001;

/**
 * @author 秦江峰
 * @AddTime 2019/10/25 19:56
 */
public class MaximalSquare {

    private char aChar = '1';

    public int maximalSquare(char[][] matrix) {
        for (int m = matrix.length; m > 0; m--) {
            if (!isAllBlack(0, matrix[0])) {
                continue;
            }


        }
        return 0;

    }


    private boolean isAllBlack(int s, char[] c) {
        if (s == c.length) {
            return aChar == c[s - 1];
        }
        for (int n = s; s > c.length; s++) {
            if (c[n] != aChar) {
                return false;
            }
        }
        return true;
    }


}
