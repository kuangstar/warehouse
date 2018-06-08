package com.zd.testing.business.mapper;

import com.zd.testing.business.model.Category;
import com.zd.testing.business.model.CategotyExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CategotyMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categoty
	 * @mbggenerated  Thu Jun 07 09:28:26 CST 2018
	 */
	int countByExample(CategotyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categoty
	 * @mbggenerated  Thu Jun 07 09:28:26 CST 2018
	 */
	int deleteByExample(CategotyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categoty
	 * @mbggenerated  Thu Jun 07 09:28:26 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categoty
	 * @mbggenerated  Thu Jun 07 09:28:26 CST 2018
	 */
	int insert(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categoty
	 * @mbggenerated  Thu Jun 07 09:28:26 CST 2018
	 */
	int insertSelective(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categoty
	 * @mbggenerated  Thu Jun 07 09:28:26 CST 2018
	 */
	List<Category> selectByExample(CategotyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categoty
	 * @mbggenerated  Thu Jun 07 09:28:26 CST 2018
	 */
	Category selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categoty
	 * @mbggenerated  Thu Jun 07 09:28:26 CST 2018
	 */
	int updateByExampleSelective(@Param("record") Category record,
			@Param("example") CategotyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categoty
	 * @mbggenerated  Thu Jun 07 09:28:26 CST 2018
	 */
	int updateByExample(@Param("record") Category record,
			@Param("example") CategotyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categoty
	 * @mbggenerated  Thu Jun 07 09:28:26 CST 2018
	 */
	int updateByPrimaryKeySelective(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table categoty
	 * @mbggenerated  Thu Jun 07 09:28:26 CST 2018
	 */
	int updateByPrimaryKey(Category record);
}