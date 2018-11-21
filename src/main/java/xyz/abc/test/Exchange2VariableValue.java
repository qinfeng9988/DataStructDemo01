package xyz.abc.test;

/**
 * @author 秦江峰
 * @date 2018/11/21 11:28
 */
public class Exchange2VariableValue {

    public static void exchange(Integer a,Integer b){
        System.out.println("交换前：frist="+a+",last="+b);
        a=a+b;
        b = a -b;
        a = a-b;

        System.out.println("交换后：frist="+a+",last="+b);
    }
}
