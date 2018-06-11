package com.zd.warehouse.business.model;

import java.util.Date;

public class Outbound {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.ref
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private String ref;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.user_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.contact
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private String contact;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.phone
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private Integer phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.dept_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.biz_user_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private Integer bizUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.biz_date
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private Date bizDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.status
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.money
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private Double money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.tax
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private Double tax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.money_with_tax
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private Double moneyWithTax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.manger_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private Integer mangerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outbound.note
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.id
     *
     * @return the value of outbound.id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.id
     *
     * @param id the value for outbound.id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.ref
     *
     * @return the value of outbound.ref
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public String getRef() {
        return ref;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.ref
     *
     * @param ref the value for outbound.ref
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.user_id
     *
     * @return the value of outbound.user_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.user_id
     *
     * @param userId the value for outbound.user_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.contact
     *
     * @return the value of outbound.contact
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public String getContact() {
        return contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.contact
     *
     * @param contact the value for outbound.contact
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.phone
     *
     * @return the value of outbound.phone
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.phone
     *
     * @param phone the value for outbound.phone
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.dept_id
     *
     * @return the value of outbound.dept_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.dept_id
     *
     * @param deptId the value for outbound.dept_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.biz_user_id
     *
     * @return the value of outbound.biz_user_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public Integer getBizUserId() {
        return bizUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.biz_user_id
     *
     * @param bizUserId the value for outbound.biz_user_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setBizUserId(Integer bizUserId) {
        this.bizUserId = bizUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.biz_date
     *
     * @return the value of outbound.biz_date
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public Date getBizDate() {
        return bizDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.biz_date
     *
     * @param bizDate the value for outbound.biz_date
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setBizDate(Date bizDate) {
        this.bizDate = bizDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.status
     *
     * @return the value of outbound.status
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.status
     *
     * @param status the value for outbound.status
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.money
     *
     * @return the value of outbound.money
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public Double getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.money
     *
     * @param money the value for outbound.money
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.tax
     *
     * @return the value of outbound.tax
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public Double getTax() {
        return tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.tax
     *
     * @param tax the value for outbound.tax
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setTax(Double tax) {
        this.tax = tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.money_with_tax
     *
     * @return the value of outbound.money_with_tax
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public Double getMoneyWithTax() {
        return moneyWithTax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.money_with_tax
     *
     * @param moneyWithTax the value for outbound.money_with_tax
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setMoneyWithTax(Double moneyWithTax) {
        this.moneyWithTax = moneyWithTax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.manger_id
     *
     * @return the value of outbound.manger_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public Integer getMangerId() {
        return mangerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.manger_id
     *
     * @param mangerId the value for outbound.manger_id
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setMangerId(Integer mangerId) {
        this.mangerId = mangerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outbound.note
     *
     * @return the value of outbound.note
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outbound.note
     *
     * @param note the value for outbound.note
     *
     * @mbggenerated Mon Jun 11 15:19:39 CST 2018
     */
    public void setNote(String note) {
        this.note = note;
    }
}