package com.jtxy.result;



/**
 * @author ysj
 * @date 2021/4/25 16:50
 */

public enum ResponseEnum {
    //成功返回
    SUCCESS(0,"成功"),
    //服务器内部异常
    ERROR(-1,"服务器内部错误"),
    //-1xx 服务器错误
    BAD_SQL_GRAMMAR_ERROR(-101, "sql语法错误"),
    SERVLET_ERROR(-102, "servlet请求异常"),
    UPLOAD_ERROR(-103, "文件上传错误"),
    EXPORT_DATA_ERROR(104, "数据导出失败");
    /**
     * TODO 需要其他返回结果可以在此添加
     */
    /**
     * 返回状态码
      */
    private Integer code;
    /**
     * 返回信息
     */
    private String msg;


    ResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
