package com.qjfcc.demo001.lru;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 秦江峰
 * @AddTime 2019/10/25 20:36
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CacheNode {
    private Integer k;
    private Integer v;
}
