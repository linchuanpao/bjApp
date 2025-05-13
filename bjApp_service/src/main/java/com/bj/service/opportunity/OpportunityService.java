package com.bj.service.opportunity;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.alibaba.fastjson.JSON;
import com.bj.common.model.vo.OpportunityInfoVo;
import com.bj.dao.bean.OpportunityDo;
import com.bj.dao.mapper.OpportunityMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OpportunityService {
    @Resource
    private OpportunityMapper opportunityMapper;
    public OpportunityInfoVo queryById(Long id) {
        OpportunityDo opportunityDo = opportunityMapper.selectByPrimaryKey(id);
        OpportunityInfoVo opportunityInfoVo = new OpportunityInfoVo();
        BeanUtils.copyProperties(opportunityDo, opportunityInfoVo);
        return opportunityInfoVo;
    }
}
