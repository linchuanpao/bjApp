package com.bj.controller.opportunity;

import com.bj.common.model.vo.OpportunityInfoVo;
import com.bj.service.opportunity.OpportunityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 活动类
 * @author linchuanpao
 * @date 2020/5/19
 */
@RestController()
@RequestMapping("/opportunity")
public class OpportunityController {
    @Resource
    private OpportunityService opportunityService;

    @GetMapping("/opportunities/{id}")
    public ResponseEntity<OpportunityInfoVo> getOpportunityById(@PathVariable Long id) {
        if (id == null){
            return ResponseEntity.badRequest().build();
        }

        OpportunityInfoVo opportunityInfoVo = opportunityService.queryById(id);
        return ResponseEntity.ok(opportunityInfoVo);
    }
}
