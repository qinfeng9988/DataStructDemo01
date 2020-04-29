package com.qjfcc.test;

import org.junit.Test;
import xyz.abc.test.LinkTable.ResponseDto;

import java.util.Collections;
import java.util.Optional;

/**
 * @author 秦江峰
 * @date 2018/12/29 13:37
 */
public class OptionalTest {

    @Test
    public void testOfNullable(){
        String appId = "aaaa";
        ResponseDto responseDto = new ResponseDto();
        responseDto.setData(Collections.singletonList(appId));
        Optional t = Optional.ofNullable(responseDto).map(ResponseDto::getData).orElse(Collections.emptyList())
                .stream().filter(a -> a.equals(appId)).findFirst();
        System.out.println(String.format("result:%s",t.orElse("")));
        System.out.println("======================================");
    }

    @Test
    public void testOf(){
        String s = null;
        String s2 = Optional.of(s).map(r->"http://xx?requestId="+r).orElse("http://xxx");

        System.out.println(s2);
    }
}
