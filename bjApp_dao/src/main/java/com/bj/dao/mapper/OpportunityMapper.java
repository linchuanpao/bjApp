package com.bj.dao.mapper;


import com.bj.dao.bean.OpportunityDo;

public interface OpportunityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OpportunityDo opportunityDo);

    int insertSelective(OpportunityDo opportunityDo);

    OpportunityDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OpportunityDo opportunityDo);

    int updateByPrimaryKey(OpportunityDo opportunityDo);
}