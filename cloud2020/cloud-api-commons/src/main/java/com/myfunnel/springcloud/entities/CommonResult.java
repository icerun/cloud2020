package com.myfunnel.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author shenshix
 * @version 1.0
 * @Date 2020/4/4 - 14:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {
    private String code;
    private String message;
    private T data;
    public CommonResult(String code,String message){
        this(code,message,null);
    }
}
