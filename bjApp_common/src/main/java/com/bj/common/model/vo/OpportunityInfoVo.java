package com.bj.common.model.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 数据
 */
@Data
public class OpportunityInfoVo {
    /**
    * 主键ID
    */
    private Long id;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 修改时间
    */
    private Date gmtModified;

    /**
    * 商机名称
    */
    private String opportunityName;

    /**
    * 客户/项目名称
    */
    private String projectName;

    /**
    * 商机金额(元)
    */
    private BigDecimal opportunityAmount;

    /**
    * 预计成交时间
    */
    private Date expectedCloseDate;

    /**
    * 备注
    */
    private String notes;

    /**
    * 产品
    */
    private String product;

    /**
    * 整单折扣(%)
    */
    private BigDecimal overallDiscount;

    /**
    * 定金缴纳时间
    */
    private Date depositPaymentDate;

    /**
    * 定金金额(元)
    */
    private BigDecimal depositAmount;

    /**
    * 付款方式:1-全款 2-分期 3-金融
    */
    private Boolean paymentMethod;

    /**
    * 签约金额(元)
    */
    private BigDecimal contractAmount;

    /**
    * 签约时间
    */
    private Date signingDate;

    /**
    * 销售状态
    */
    private String salesStatus;

    /**
    * 商机状态
    */
    private String opportunityStatus;

    /**
    * 发货时间
    */
    private Date deliveryDate;

    /**
    * 联调时间
    */
    private Date jointDebuggingDate;

    /**
    * 初验时间
    */
    private Date initialInspectionDate;

    /**
    * 终验时间
    */
    private Date finalInspectionDate;

    /**
    * 扩展信息(JSON格式)
    */
    private String extendedInfo;

    /**
    * 自动化用户ID
    */
    private String automateUserId;
}