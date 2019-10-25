package com.qjfcc.demo001.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 秦江峰
 * @AddTime 2019/10/14 17:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    @JsonProperty(value = "id")
    private Integer userId;
    private String name;
    private Integer age;
    private String content;
}
