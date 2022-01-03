package com.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class dataMsg {
    Integer code;
    String msg;
    Object data;

    public static dataMsg setMsg(Object e) {
        if (e!=null){
            return  new dataMsg(200,"认证成功！",e);
        }
        return  new dataMsg(403,"认证失败！",e);
    }
}
