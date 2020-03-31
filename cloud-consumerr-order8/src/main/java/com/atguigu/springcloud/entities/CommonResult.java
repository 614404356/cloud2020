package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangqi
 * @Date 2020/3/31 0031 15:13
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer id;
    private String  msg;
    private T      data;

    public CommonResult(Integer id, String msg){
        this.id = id;
        this.msg = msg;
    }
}
