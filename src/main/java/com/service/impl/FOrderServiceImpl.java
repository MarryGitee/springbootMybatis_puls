package com.service.impl;

import com.dao.FOrderMapper;
import com.entity.FOrder;
import com.service.FOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class FOrderServiceImpl implements FOrderService {
    @Resource
    FOrderMapper mapper;
    @Override
    public List<FOrder> getForder(String userID, Integer pagecode, Integer pagesize) {
        if (pagecode==null&&pagesize==null){
            return mapper.getForder(userID, null, null);
        }
        return mapper.getForder(userID, (pagecode-1)*pagesize, pagesize);
    }
}
