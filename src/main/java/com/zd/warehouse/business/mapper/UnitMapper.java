package com.zd.warehouse.business.mapper;

import java.util.List;

import com.zd.warehouse.business.model.Unit;

public interface UnitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unit
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unit
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    int insert(Unit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unit
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    int insertSelective(Unit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unit
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    Unit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unit
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    int updateByPrimaryKeySelective(Unit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unit
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    int updateByPrimaryKey(Unit record);
    /**
     * 查询所有单位
     */
    List<Unit> queryAllUnit();
}