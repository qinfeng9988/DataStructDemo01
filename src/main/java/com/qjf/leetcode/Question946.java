package com.qjf.leetcode;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 秦江峰
 * @AddTime 2020/4/4 15:03
 */
public class Question946 {

    public static void main(String[] args) {
        int[] trees = {3,1,1, 2, 1,2,1,9};
        System.out.println(totalFruit2(trees));
    }

    static int totalFruit(int[] tree) {
        if(tree.length <2){
            return tree.length;
        }
        Temp1 temp1 = new Temp1();
        int r = 0;
        for (int i : tree) {
            temp1.add(i);
            r = Math.max(r, temp1.getLength());
        }
        temp1.outputArrays();
        return r;
    }

    static public int totalFruit2(int[] tree) {
        int res = 0, len = tree.length;
        int one = tree[0], two, begin = 0, end = 1;
        while (end < len && tree[end] == one)
            ++end;
        if (end == len) return len;
        two = tree[end++];
        for (; end < len; ++end) {
            if (one != tree[end] && two != tree[end]) {
                res = Math.max(res, end - begin);
                int near_num = tree[end - 1];
                begin = end - 1;
                while (begin > -1 && tree[begin] == near_num)
                    --begin;
                ++begin;
                one = near_num;
                two = tree[end];
            }
        }
        return Math.max(res, end - begin);
    }

    static class Temp1 {
        private List<Integer> currentNum = new ArrayList<>(2);
        private Integer lastNum;
        private int lastMaxRate = 0;
        private int typeLen = 0;
        private int countLen = 0;

        public void add(int a) {
            if (!currentNum.contains(a) && currentNum.size() >= 2) {
                if(typeLen >=2) {
                    typeLen = 2;
                    countLen = lastMaxRate ;
                    currentNum.clear();
                    currentNum.add(lastNum);
                }
            }
            if(!currentNum.contains(a)){
                currentNum.add(a);
                typeLen ++;
            }
            this.lastMaxRate = this.lastNum != null && this.lastNum == a ? this.lastMaxRate + 1 : 1;
            this.lastNum = a;
            this.countLen ++;
        }

        public int getLength() {
            return countLen;
        }

        public void outputArrays() {
            for (Integer integer : currentNum) {
                System.out.print(integer + ",");
            }
        }
    }
}
