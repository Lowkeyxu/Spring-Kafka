/*
 * @(#) OrderVo.java 2018/11/1
 *
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.lowkey.kafka.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author xuwc
 * @version 1.0
 * @since 2018/11/1
 */
@Data
public class OrderVo implements Serializable {

    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 订单编号
     */
    private String orderNumber;
    /**
     * 订单日期
     */
    private Date date;
    /**
     * 订单信息
     */
    private List<String> desc;

}
