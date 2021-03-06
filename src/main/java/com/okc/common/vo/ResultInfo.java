package com.okc.common.vo;

import com.okc.common.constants.SystemErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultInfo<T> {

    private Integer code;
    private String message;
    private T data;

    public ResultInfo(T data) {
        this.code = 200;
        this.message = "请求成功";
        this.data = data;
    }

    public ResultInfo(String message) {
        this.code = 500;
        this.message = message;
        this.data = null;
    }

    public ResultInfo(T data, String message) {
        this.code = 500;
        this.message = message;
        this.data = data;
    }

    public ResultInfo(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public ResultInfo(SystemErrorCode systemErrorCode) {
        this.code = systemErrorCode.getCode();
        this.message = systemErrorCode.getMsg();
        this.data = null;
    }
}
