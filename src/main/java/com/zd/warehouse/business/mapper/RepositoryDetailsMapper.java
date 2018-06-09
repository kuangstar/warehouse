package com.zd.warehouse.business.mapper;

import com.zd.warehouse.business.model.RepositoryDetails;
import com.zd.warehouse.business.model.RepositoryDetailsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RepositoryDetailsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository_details
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int countByExample(RepositoryDetailsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository_details
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int deleteByExample(RepositoryDetailsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository_details
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository_details
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int insert(RepositoryDetails record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository_details
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int insertSelective(RepositoryDetails record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository_details
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	List<RepositoryDetails> selectByExample(RepositoryDetailsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository_details
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	RepositoryDetails selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository_details
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByExampleSelective(@Param("record") RepositoryDetails record,
			@Param("example") RepositoryDetailsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository_details
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByExample(@Param("record") RepositoryDetails record,
			@Param("example") RepositoryDetailsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository_details
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByPrimaryKeySelective(RepositoryDetails record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repository_details
	 * @mbggenerated  Sat Jun 09 08:40:28 CST 2018
	 */
	int updateByPrimaryKey(RepositoryDetails record);
}