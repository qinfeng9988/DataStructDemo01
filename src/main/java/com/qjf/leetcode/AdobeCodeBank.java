package com.qjf.leetcode;

/**
 * @author 秦江峰
 * @AddTime 2020/4/10 18:41
 */
public class AdobeCodeBank {

    public void findString(String s,String t) {

        for(int i = 0;i<t.length();i++){
            String c = t.substring(i,1);

            String[] s1 = s.split(c);
            if(s1.length == 0){
                System.out.println("不包含");
            }

        }
    }

    public static void main(String[] args) {
        AdobeCodeBank adobeCodeBank = new AdobeCodeBank();
        adobeCodeBank.findString("ADOBECODEBANC","ABC");


    }
}
