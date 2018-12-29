package com.qjfcc.test;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 秦江峰
 * @date 2018/12/29 13:59
 */
public class RegexTest {
    @Test
    public void test() {
        String str = "86";
        Pattern pattern = Pattern.compile("^[0-9]*$");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());

    }
}
