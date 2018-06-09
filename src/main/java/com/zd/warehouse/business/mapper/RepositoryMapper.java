package com.zd.warehouse.business.mapper;

import com.zd.warehouse.business.model.Repository;
import com.zd.warehouse.business.model.RepositoryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RepositoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int countByExample(RepositoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int deleteByExample(RepositoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int insert(Repository record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int insertSelective(Repository record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	List<Repository> selectByExample(RepositoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	Repository selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByExampleSelective(@Param("record") Repository record,
			@Param("example") RepositoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByExample(@Param("record") Repository record,
			@Param("example") RepositoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByPrimaryKeySelective(Repository record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByPrimaryKey(Repository record);
}