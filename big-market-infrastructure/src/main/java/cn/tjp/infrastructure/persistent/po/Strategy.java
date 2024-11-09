package cn.tjp.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;


/**
 * @author tjp
 * @version 1.0
 * @description 抽奖策略实体类
 * @date 2024/11/8 15:00
 */

@Data
public class Strategy {

    /** 自增ID*/
    private Long id;

    /** 抽奖策略ID*/
    private Long strategyId;

    /** 抽奖策略名称*/
    private String strategyDesc;

    /** 抽奖策略类型*/
    private Date createTime;

    /** 抽奖策略状态*/
    private Date updateTime;

}
