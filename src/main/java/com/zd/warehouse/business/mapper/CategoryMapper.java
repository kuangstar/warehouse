package com.zd.warehouse.business.mapper;

import com.zd.warehouse.business.model.Category;
import com.zd.warehouse.business.model.CategoryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int countByExample(CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int deleteByExample(CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int insert(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int insertSelective(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	List<Category> selectByExample(CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	Category selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByExampleSelective(@Param("record") Category record,
			@Param("example") CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByExample(@Param("record") Category record,
			@Param("example") CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByPrimaryKeySelective(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByPrimaryKey(Category record);
}