package com.xiasuhuei321.studyforskill;

/**
 * Created by Luo on 2016/11/24.
 * desc:
 */
public class BaseResponse {
    int code;
    String message;

    @Override
    public String toString() {
        return "the code is:" + code + "\n" +
                "the message is:" + message;
    }
}
