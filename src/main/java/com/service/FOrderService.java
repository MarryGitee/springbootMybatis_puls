package com.service;

import com.entity.FOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FOrderService {
    List<FOrder> getForder(@Param("userID") String userID, @Param("pagecode") Integer pagecode, @Param("pagesize") Integer pagesize);
}
