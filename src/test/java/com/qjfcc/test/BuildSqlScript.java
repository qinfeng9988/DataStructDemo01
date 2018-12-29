package com.qjfcc.test;

import org.junit.Test;

/**
 * @author 秦江峰
 * @date 2018/12/29 13:58
 */
public class BuildSqlScript {
    @Test
    public void tableIndexTest(){
        for (int j = 0; j < 64; j++) {
            System.out.println(String.format("ALTER TABLE Reg_VisitorInfo_%s MODIFY BusinessDomain varchar(30) COMMENT '应用域';\n", j));
        }
        System.out.println("======================================");
    }
}
