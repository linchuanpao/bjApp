package com.bj.service.opportunity;

import com.alibaba.fastjson.JSON;
import com.bj.dao.mapper.OpportunityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OpportunityService {
    @Resource
    private OpportunityMapper opportunityMapper;
    public String queryById(Long id) {
        return JSON.toJSONString(opportunityMapper.selectByPrimaryKey(id));
    }
}
