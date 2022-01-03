package com.dao;

import com.entity.FOrder;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FOrderMapper {
    List<FOrder> getForder(@Param("userID") String userID, @Param("pagecode") Integer pagecode, @Param("pagesize") Integer pagesize);

    Integer SetOrder(FOrder fOrder);

    @Delete("delete from mall.f_order where id=#{id}")
    Integer dropOrder(Integer id);

    /**
     * 收货
     *
     * @param id 3
     * @return
     */
    @Update("update mall.f_order set state = 3 where  id=#{id}")
    Integer updateorderTrue(Integer id);

    /**
     * 发货
     *
     * @param id 1
     * @return
     */
    @Update("update mall.f_order set state = 1 where  id=#{id}")
    Integer updateorderSet(Integer id);
}
