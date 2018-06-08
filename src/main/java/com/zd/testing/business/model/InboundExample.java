package com.zd.testing.business.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InboundExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public InboundExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andRefIsNull() {
			addCriterion("ref is null");
			return (Criteria) this;
		}

		public Criteria andRefIsNotNull() {
			addCriterion("ref is not null");
			return (Criteria) this;
		}

		public Criteria andRefEqualTo(String value) {
			addCriterion("ref =", value, "ref");
			return (Criteria) this;
		}

		public Criteria andRefNotEqualTo(String value) {
			addCriterion("ref <>", value, "ref");
			return (Criteria) this;
		}

		public Criteria andRefGreaterThan(String value) {
			addCriterion("ref >", value, "ref");
			return (Criteria) this;
		}

		public Criteria andRefGreaterThanOrEqualTo(String value) {
			addCriterion("ref >=", value, "ref");
			return (Criteria) this;
		}

		public Criteria andRefLessThan(String value) {
			addCriterion("ref <", value, "ref");
			return (Criteria) this;
		}

		public Criteria andRefLessThanOrEqualTo(String value) {
			addCriterion("ref <=", value, "ref");
			return (Criteria) this;
		}

		public Criteria andRefLike(String value) {
			addCriterion("ref like", value, "ref");
			return (Criteria) this;
		}

		public Criteria andRefNotLike(String value) {
			addCriterion("ref not like", value, "ref");
			return (Criteria) this;
		}

		public Criteria andRefIn(List<String> values) {
			addCriterion("ref in", values, "ref");
			return (Criteria) this;
		}

		public Criteria andRefNotIn(List<String> values) {
			addCriterion("ref not in", values, "ref");
			return (Criteria) this;
		}

		public Criteria andRefBetween(String value1, String value2) {
			addCriterion("ref between", value1, value2, "ref");
			return (Criteria) this;
		}

		public Criteria andRefNotBetween(String value1, String value2) {
			addCriterion("ref not between", value1, value2, "ref");
			return (Criteria) this;
		}

		public Criteria andSupplierIsNull() {
			addCriterion("supplier is null");
			return (Criteria) this;
		}

		public Criteria andSupplierIsNotNull() {
			addCriterion("supplier is not null");
			return (Criteria) this;
		}

		public Criteria andSupplierEqualTo(String value) {
			addCriterion("supplier =", value, "supplier");
			return (Criteria) this;
		}

		public Criteria andSupplierNotEqualTo(String value) {
			addCriterion("supplier <>", value, "supplier");
			return (Criteria) this;
		}

		public Criteria andSupplierGreaterThan(String value) {
			addCriterion("supplier >", value, "supplier");
			return (Criteria) this;
		}

		public Criteria andSupplierGreaterThanOrEqualTo(String value) {
			addCriterion("supplier >=", value, "supplier");
			return (Criteria) this;
		}

		public Criteria andSupplierLessThan(String value) {
			addCriterion("supplier <", value, "supplier");
			return (Criteria) this;
		}

		public Criteria andSupplierLessThanOrEqualTo(String value) {
			addCriterion("supplier <=", value, "supplier");
			return (Criteria) this;
		}

		public Criteria andSupplierLike(String value) {
			addCriterion("supplier like", value, "supplier");
			return (Criteria) this;
		}

		public Criteria andSupplierNotLike(String value) {
			addCriterion("supplier not like", value, "supplier");
			return (Criteria) this;
		}

		public Criteria andSupplierIn(List<String> values) {
			addCriterion("supplier in", values, "supplier");
			return (Criteria) this;
		}

		public Criteria andSupplierNotIn(List<String> values) {
			addCriterion("supplier not in", values, "supplier");
			return (Criteria) this;
		}

		public Criteria andSupplierBetween(String value1, String value2) {
			addCriterion("supplier between", value1, value2, "supplier");
			return (Criteria) this;
		}

		public Criteria andSupplierNotBetween(String value1, String value2) {
			addCriterion("supplier not between", value1, value2, "supplier");
			return (Criteria) this;
		}

		public Criteria andContactIsNull() {
			addCriterion("contact is null");
			return (Criteria) this;
		}

		public Criteria andContactIsNotNull() {
			addCriterion("contact is not null");
			return (Criteria) this;
		}

		public Criteria andContactEqualTo(String value) {
			addCriterion("contact =", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotEqualTo(String value) {
			addCriterion("contact <>", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactGreaterThan(String value) {
			addCriterion("contact >", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactGreaterThanOrEqualTo(String value) {
			addCriterion("contact >=", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactLessThan(String value) {
			addCriterion("contact <", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactLessThanOrEqualTo(String value) {
			addCriterion("contact <=", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactLike(String value) {
			addCriterion("contact like", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotLike(String value) {
			addCriterion("contact not like", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactIn(List<String> values) {
			addCriterion("contact in", values, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotIn(List<String> values) {
			addCriterion("contact not in", values, "contact");
			return (Criteria) this;
		}

		public Criteria andContactBetween(String value1, String value2) {
			addCriterion("contact between", value1, value2, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotBetween(String value1, String value2) {
			addCriterion("contact not between", value1, value2, "contact");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(Integer value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(Integer value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(Integer value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(Integer value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(Integer value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(Integer value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<Integer> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<Integer> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(Integer value1, Integer value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(Integer value1, Integer value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andBizUserIdIsNull() {
			addCriterion("biz_user_id is null");
			return (Criteria) this;
		}

		public Criteria andBizUserIdIsNotNull() {
			addCriterion("biz_user_id is not null");
			return (Criteria) this;
		}

		public Criteria andBizUserIdEqualTo(Integer value) {
			addCriterion("biz_user_id =", value, "bizUserId");
			return (Criteria) this;
		}

		public Criteria andBizUserIdNotEqualTo(Integer value) {
			addCriterion("biz_user_id <>", value, "bizUserId");
			return (Criteria) this;
		}

		public Criteria andBizUserIdGreaterThan(Integer value) {
			addCriterion("biz_user_id >", value, "bizUserId");
			return (Criteria) this;
		}

		public Criteria andBizUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("biz_user_id >=", value, "bizUserId");
			return (Criteria) this;
		}

		public Criteria andBizUserIdLessThan(Integer value) {
			addCriterion("biz_user_id <", value, "bizUserId");
			return (Criteria) this;
		}

		public Criteria andBizUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("biz_user_id <=", value, "bizUserId");
			return (Criteria) this;
		}

		public Criteria andBizUserIdIn(List<Integer> values) {
			addCriterion("biz_user_id in", values, "bizUserId");
			return (Criteria) this;
		}

		public Criteria andBizUserIdNotIn(List<Integer> values) {
			addCriterion("biz_user_id not in", values, "bizUserId");
			return (Criteria) this;
		}

		public Criteria andBizUserIdBetween(Integer value1, Integer value2) {
			addCriterion("biz_user_id between", value1, value2, "bizUserId");
			return (Criteria) this;
		}

		public Criteria andBizUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("biz_user_id not between", value1, value2, "bizUserId");
			return (Criteria) this;
		}

		public Criteria andInboundDateIsNull() {
			addCriterion("inbound_date is null");
			return (Criteria) this;
		}

		public Criteria andInboundDateIsNotNull() {
			addCriterion("inbound_date is not null");
			return (Criteria) this;
		}

		public Criteria andInboundDateEqualTo(Date value) {
			addCriterion("inbound_date =", value, "inboundDate");
			return (Criteria) this;
		}

		public Criteria andInboundDateNotEqualTo(Date value) {
			addCriterion("inbound_date <>", value, "inboundDate");
			return (Criteria) this;
		}

		public Criteria andInboundDateGreaterThan(Date value) {
			addCriterion("inbound_date >", value, "inboundDate");
			return (Criteria) this;
		}

		public Criteria andInboundDateGreaterThanOrEqualTo(Date value) {
			addCriterion("inbound_date >=", value, "inboundDate");
			return (Criteria) this;
		}

		public Criteria andInboundDateLessThan(Date value) {
			addCriterion("inbound_date <", value, "inboundDate");
			return (Criteria) this;
		}

		public Criteria andInboundDateLessThanOrEqualTo(Date value) {
			addCriterion("inbound_date <=", value, "inboundDate");
			return (Criteria) this;
		}

		public Criteria andInboundDateIn(List<Date> values) {
			addCriterion("inbound_date in", values, "inboundDate");
			return (Criteria) this;
		}

		public Criteria andInboundDateNotIn(List<Date> values) {
			addCriterion("inbound_date not in", values, "inboundDate");
			return (Criteria) this;
		}

		public Criteria andInboundDateBetween(Date value1, Date value2) {
			addCriterion("inbound_date between", value1, value2, "inboundDate");
			return (Criteria) this;
		}

		public Criteria andInboundDateNotBetween(Date value1, Date value2) {
			addCriterion("inbound_date not between", value1, value2,
					"inboundDate");
			return (Criteria) this;
		}

		public Criteria andManagerIdIsNull() {
			addCriterion("manager_id is null");
			return (Criteria) this;
		}

		public Criteria andManagerIdIsNotNull() {
			addCriterion("manager_id is not null");
			return (Criteria) this;
		}

		public Criteria andManagerIdEqualTo(Integer value) {
			addCriterion("manager_id =", value, "managerId");
			return (Criteria) this;
		}

		public Criteria andManagerIdNotEqualTo(Integer value) {
			addCriterion("manager_id <>", value, "managerId");
			return (Criteria) this;
		}

		public Criteria andManagerIdGreaterThan(Integer value) {
			addCriterion("manager_id >", value, "managerId");
			return (Criteria) this;
		}

		public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("manager_id >=", value, "managerId");
			return (Criteria) this;
		}

		public Criteria andManagerIdLessThan(Integer value) {
			addCriterion("manager_id <", value, "managerId");
			return (Criteria) this;
		}

		public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
			addCriterion("manager_id <=", value, "managerId");
			return (Criteria) this;
		}

		public Criteria andManagerIdIn(List<Integer> values) {
			addCriterion("manager_id in", values, "managerId");
			return (Criteria) this;
		}

		public Criteria andManagerIdNotIn(List<Integer> values) {
			addCriterion("manager_id not in", values, "managerId");
			return (Criteria) this;
		}

		public Criteria andManagerIdBetween(Integer value1, Integer value2) {
			addCriterion("manager_id between", value1, value2, "managerId");
			return (Criteria) this;
		}

		public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
			addCriterion("manager_id not between", value1, value2, "managerId");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andMoneyIsNull() {
			addCriterion("money is null");
			return (Criteria) this;
		}

		public Criteria andMoneyIsNotNull() {
			addCriterion("money is not null");
			return (Criteria) this;
		}

		public Criteria andMoneyEqualTo(Double value) {
			addCriterion("money =", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotEqualTo(Double value) {
			addCriterion("money <>", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyGreaterThan(Double value) {
			addCriterion("money >", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
			addCriterion("money >=", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyLessThan(Double value) {
			addCriterion("money <", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyLessThanOrEqualTo(Double value) {
			addCriterion("money <=", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyIn(List<Double> values) {
			addCriterion("money in", values, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotIn(List<Double> values) {
			addCriterion("money not in", values, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyBetween(Double value1, Double value2) {
			addCriterion("money between", value1, value2, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotBetween(Double value1, Double value2) {
			addCriterion("money not between", value1, value2, "money");
			return (Criteria) this;
		}

		public Criteria andTaxIsNull() {
			addCriterion("tax is null");
			return (Criteria) this;
		}

		public Criteria andTaxIsNotNull() {
			addCriterion("tax is not null");
			return (Criteria) this;
		}

		public Criteria andTaxEqualTo(Double value) {
			addCriterion("tax =", value, "tax");
			return (Criteria) this;
		}

		public Criteria andTaxNotEqualTo(Double value) {
			addCriterion("tax <>", value, "tax");
			return (Criteria) this;
		}

		public Criteria andTaxGreaterThan(Double value) {
			addCriterion("tax >", value, "tax");
			return (Criteria) this;
		}

		public Criteria andTaxGreaterThanOrEqualTo(Double value) {
			addCriterion("tax >=", value, "tax");
			return (Criteria) this;
		}

		public Criteria andTaxLessThan(Double value) {
			addCriterion("tax <", value, "tax");
			return (Criteria) this;
		}

		public Criteria andTaxLessThanOrEqualTo(Double value) {
			addCriterion("tax <=", value, "tax");
			return (Criteria) this;
		}

		public Criteria andTaxIn(List<Double> values) {
			addCriterion("tax in", values, "tax");
			return (Criteria) this;
		}

		public Criteria andTaxNotIn(List<Double> values) {
			addCriterion("tax not in", values, "tax");
			return (Criteria) this;
		}

		public Criteria andTaxBetween(Double value1, Double value2) {
			addCriterion("tax between", value1, value2, "tax");
			return (Criteria) this;
		}

		public Criteria andTaxNotBetween(Double value1, Double value2) {
			addCriterion("tax not between", value1, value2, "tax");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxIsNull() {
			addCriterion("money_with_tax is null");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxIsNotNull() {
			addCriterion("money_with_tax is not null");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxEqualTo(Double value) {
			addCriterion("money_with_tax =", value, "moneyWithTax");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxNotEqualTo(Double value) {
			addCriterion("money_with_tax <>", value, "moneyWithTax");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxGreaterThan(Double value) {
			addCriterion("money_with_tax >", value, "moneyWithTax");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxGreaterThanOrEqualTo(Double value) {
			addCriterion("money_with_tax >=", value, "moneyWithTax");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxLessThan(Double value) {
			addCriterion("money_with_tax <", value, "moneyWithTax");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxLessThanOrEqualTo(Double value) {
			addCriterion("money_with_tax <=", value, "moneyWithTax");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxIn(List<Double> values) {
			addCriterion("money_with_tax in", values, "moneyWithTax");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxNotIn(List<Double> values) {
			addCriterion("money_with_tax not in", values, "moneyWithTax");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxBetween(Double value1, Double value2) {
			addCriterion("money_with_tax between", value1, value2,
					"moneyWithTax");
			return (Criteria) this;
		}

		public Criteria andMoneyWithTaxNotBetween(Double value1, Double value2) {
			addCriterion("money_with_tax not between", value1, value2,
					"moneyWithTax");
			return (Criteria) this;
		}

		public Criteria andNoteIsNull() {
			addCriterion("note is null");
			return (Criteria) this;
		}

		public Criteria andNoteIsNotNull() {
			addCriterion("note is not null");
			return (Criteria) this;
		}

		public Criteria andNoteEqualTo(String value) {
			addCriterion("note =", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteNotEqualTo(String value) {
			addCriterion("note <>", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteGreaterThan(String value) {
			addCriterion("note >", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteGreaterThanOrEqualTo(String value) {
			addCriterion("note >=", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteLessThan(String value) {
			addCriterion("note <", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteLessThanOrEqualTo(String value) {
			addCriterion("note <=", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteLike(String value) {
			addCriterion("note like", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteNotLike(String value) {
			addCriterion("note not like", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteIn(List<String> values) {
			addCriterion("note in", values, "note");
			return (Criteria) this;
		}

		public Criteria andNoteNotIn(List<String> values) {
			addCriterion("note not in", values, "note");
			return (Criteria) this;
		}

		public Criteria andNoteBetween(String value1, String value2) {
			addCriterion("note between", value1, value2, "note");
			return (Criteria) this;
		}

		public Criteria andNoteNotBetween(String value1, String value2) {
			addCriterion("note not between", value1, value2, "note");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table inbound
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table inbound
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 07 08:22:18 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}