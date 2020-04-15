package xyz.abc.test.LinkTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 秦江峰
 * @date 2018/12/26 18:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    private String name;
    private Integer code;
    private List<String> data;

}