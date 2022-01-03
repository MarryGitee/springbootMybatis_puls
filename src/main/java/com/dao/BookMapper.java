package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookMapper extends BaseMapper<Book> {
    /**
     * 带条件的多表分页查询：（类型，品牌，状态）
     * 添加
     * 上架
     * 下架
     * 修改
     */
    List<Book> getBook(@Param("type") String type,@Param("brand") String brand,@Param("state") String state);
    Integer SetBook(Book book);
    @Update("update mall.book set  state=1  where id=#{id};")
    Integer updateState(Integer id);
    @Update("update mall.book set  state =0 where id=#{id}")
    Integer updateStateTwo(Integer id);

}
