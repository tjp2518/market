package cn.tjp.infrastructure.persistent.dao;

import cn.tjp.infrastructure.persistent.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description 奖品持久化接口
 * @version 1.0
 * @date 2024/11/8 15:00
 *
 */

@Mapper
public interface IStrategyAwardDao {
    List<StrategyAward> queryStrategyAwardList();
}
