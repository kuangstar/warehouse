package com.zd.testing.business.model;

public class Branch {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column branch.id
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column branch.branch_id
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	private Integer branchId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column branch.branch_name
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	private String branchName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column branch.id
	 * @return  the value of branch.id
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column branch.id
	 * @param id  the value for branch.id
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column branch.branch_id
	 * @return  the value of branch.branch_id
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public Integer getBranchId() {
		return branchId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column branch.branch_id
	 * @param branchId  the value for branch.branch_id
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column branch.branch_name
	 * @return  the value of branch.branch_name
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column branch.branch_name
	 * @param branchName  the value for branch.branch_name
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
}