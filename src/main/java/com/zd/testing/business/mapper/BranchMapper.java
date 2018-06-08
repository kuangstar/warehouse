package com.zd.testing.business.mapper;

import com.zd.testing.business.model.Branch;
import com.zd.testing.business.model.BranchExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BranchMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table branch
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	int countByExample(BranchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table branch
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	int deleteByExample(BranchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table branch
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table branch
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	int insert(Branch record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table branch
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	int insertSelective(Branch record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table branch
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	List<Branch> selectByExample(BranchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table branch
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	Branch selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table branch
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	int updateByExampleSelective(@Param("record") Branch record,
			@Param("example") BranchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table branch
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	int updateByExample(@Param("record") Branch record,
			@Param("example") BranchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table branch
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	int updateByPrimaryKeySelective(Branch record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table branch
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	int updateByPrimaryKey(Branch record);
}