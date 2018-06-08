package com.zd.testing.business.model;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public GoodsExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Fri Jun 08 15:35:41 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table goods
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

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("code like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("code not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andSpecIsNull() {
			addCriterion("spec is null");
			return (Criteria) this;
		}

		public Criteria andSpecIsNotNull() {
			addCriterion("spec is not null");
			return (Criteria) this;
		}

		public Criteria andSpecEqualTo(String value) {
			addCriterion("spec =", value, "spec");
			return (Criteria) this;
		}

		public Criteria andSpecNotEqualTo(String value) {
			addCriterion("spec <>", value, "spec");
			return (Criteria) this;
		}

		public Criteria andSpecGreaterThan(String value) {
			addCriterion("spec >", value, "spec");
			return (Criteria) this;
		}

		public Criteria andSpecGreaterThanOrEqualTo(String value) {
			addCriterion("spec >=", value, "spec");
			return (Criteria) this;
		}

		public Criteria andSpecLessThan(String value) {
			addCriterion("spec <", value, "spec");
			return (Criteria) this;
		}

		public Criteria andSpecLessThanOrEqualTo(String value) {
			addCriterion("spec <=", value, "spec");
			return (Criteria) this;
		}

		public Criteria andSpecLike(String value) {
			addCriterion("spec like", value, "spec");
			return (Criteria) this;
		}

		public Criteria andSpecNotLike(String value) {
			addCriterion("spec not like", value, "spec");
			return (Criteria) this;
		}

		public Criteria andSpecIn(List<String> values) {
			addCriterion("spec in", values, "spec");
			return (Criteria) this;
		}

		public Criteria andSpecNotIn(List<String> values) {
			addCriterion("spec not in", values, "spec");
			return (Criteria) this;
		}

		public Criteria andSpecBetween(String value1, String value2) {
			addCriterion("spec between", value1, value2, "spec");
			return (Criteria) this;
		}

		public Criteria andSpecNotBetween(String value1, String value2) {
			addCriterion("spec not between", value1, value2, "spec");
			return (Criteria) this;
		}

		public Criteria andCategoryIsNull() {
			addCriterion("category is null");
			return (Criteria) this;
		}

		public Criteria andCategoryIsNotNull() {
			addCriterion("category is not null");
			return (Criteria) this;
		}

		public Criteria andCategoryEqualTo(Integer value) {
			addCriterion("category =", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotEqualTo(Integer value) {
			addCriterion("category <>", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryGreaterThan(Integer value) {
			addCriterion("category >", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
			addCriterion("category >=", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryLessThan(Integer value) {
			addCriterion("category <", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryLessThanOrEqualTo(Integer value) {
			addCriterion("category <=", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryIn(List<Integer> values) {
			addCriterion("category in", values, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotIn(List<Integer> values) {
			addCriterion("category not in", values, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryBetween(Integer value1, Integer value2) {
			addCriterion("category between", value1, value2, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
			addCriterion("category not between", value1, value2, "category");
			return (Criteria) this;
		}

		public Criteria andUnitIdIsNull() {
			addCriterion("unit_id is null");
			return (Criteria) this;
		}

		public Criteria andUnitIdIsNotNull() {
			addCriterion("unit_id is not null");
			return (Criteria) this;
		}

		public Criteria andUnitIdEqualTo(Integer value) {
			addCriterion("unit_id =", value, "unitId");
			return (Criteria) this;
		}

		public Criteria andUnitIdNotEqualTo(Integer value) {
			addCriterion("unit_id <>", value, "unitId");
			return (Criteria) this;
		}

		public Criteria andUnitIdGreaterThan(Integer value) {
			addCriterion("unit_id >", value, "unitId");
			return (Criteria) this;
		}

		public Criteria andUnitIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("unit_id >=", value, "unitId");
			return (Criteria) this;
		}

		public Criteria andUnitIdLessThan(Integer value) {
			addCriterion("unit_id <", value, "unitId");
			return (Criteria) this;
		}

		public Criteria andUnitIdLessThanOrEqualTo(Integer value) {
			addCriterion("unit_id <=", value, "unitId");
			return (Criteria) this;
		}

		public Criteria andUnitIdIn(List<Integer> values) {
			addCriterion("unit_id in", values, "unitId");
			return (Criteria) this;
		}

		public Criteria andUnitIdNotIn(List<Integer> values) {
			addCriterion("unit_id not in", values, "unitId");
			return (Criteria) this;
		}

		public Criteria andUnitIdBetween(Integer value1, Integer value2) {
			addCriterion("unit_id between", value1, value2, "unitId");
			return (Criteria) this;
		}

		public Criteria andUnitIdNotBetween(Integer value1, Integer value2) {
			addCriterion("unit_id not between", value1, value2, "unitId");
			return (Criteria) this;
		}

		public Criteria andBranchIdIsNull() {
			addCriterion("branch_id is null");
			return (Criteria) this;
		}

		public Criteria andBranchIdIsNotNull() {
			addCriterion("branch_id is not null");
			return (Criteria) this;
		}

		public Criteria andBranchIdEqualTo(Integer value) {
			addCriterion("branch_id =", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdNotEqualTo(Integer value) {
			addCriterion("branch_id <>", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdGreaterThan(Integer value) {
			addCriterion("branch_id >", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("branch_id >=", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdLessThan(Integer value) {
			addCriterion("branch_id <", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdLessThanOrEqualTo(Integer value) {
			addCriterion("branch_id <=", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdIn(List<Integer> values) {
			addCriterion("branch_id in", values, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdNotIn(List<Integer> values) {
			addCriterion("branch_id not in", values, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdBetween(Integer value1, Integer value2) {
			addCriterion("branch_id between", value1, value2, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdNotBetween(Integer value1, Integer value2) {
			addCriterion("branch_id not between", value1, value2, "branchId");
			return (Criteria) this;
		}

		public Criteria andIsspecificIsNull() {
			addCriterion("isspecific is null");
			return (Criteria) this;
		}

		public Criteria andIsspecificIsNotNull() {
			addCriterion("isspecific is not null");
			return (Criteria) this;
		}

		public Criteria andIsspecificEqualTo(Integer value) {
			addCriterion("isspecific =", value, "isspecific");
			return (Criteria) this;
		}

		public Criteria andIsspecificNotEqualTo(Integer value) {
			addCriterion("isspecific <>", value, "isspecific");
			return (Criteria) this;
		}

		public Criteria andIsspecificGreaterThan(Integer value) {
			addCriterion("isspecific >", value, "isspecific");
			return (Criteria) this;
		}

		public Criteria andIsspecificGreaterThanOrEqualTo(Integer value) {
			addCriterion("isspecific >=", value, "isspecific");
			return (Criteria) this;
		}

		public Criteria andIsspecificLessThan(Integer value) {
			addCriterion("isspecific <", value, "isspecific");
			return (Criteria) this;
		}

		public Criteria andIsspecificLessThanOrEqualTo(Integer value) {
			addCriterion("isspecific <=", value, "isspecific");
			return (Criteria) this;
		}

		public Criteria andIsspecificIn(List<Integer> values) {
			addCriterion("isspecific in", values, "isspecific");
			return (Criteria) this;
		}

		public Criteria andIsspecificNotIn(List<Integer> values) {
			addCriterion("isspecific not in", values, "isspecific");
			return (Criteria) this;
		}

		public Criteria andIsspecificBetween(Integer value1, Integer value2) {
			addCriterion("isspecific between", value1, value2, "isspecific");
			return (Criteria) this;
		}

		public Criteria andIsspecificNotBetween(Integer value1, Integer value2) {
			addCriterion("isspecific not between", value1, value2, "isspecific");
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

		public Criteria andPhotoIsNull() {
			addCriterion("photo is null");
			return (Criteria) this;
		}

		public Criteria andPhotoIsNotNull() {
			addCriterion("photo is not null");
			return (Criteria) this;
		}

		public Criteria andPhotoEqualTo(String value) {
			addCriterion("photo =", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotEqualTo(String value) {
			addCriterion("photo <>", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoGreaterThan(String value) {
			addCriterion("photo >", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoGreaterThanOrEqualTo(String value) {
			addCriterion("photo >=", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoLessThan(String value) {
			addCriterion("photo <", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoLessThanOrEqualTo(String value) {
			addCriterion("photo <=", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoLike(String value) {
			addCriterion("photo like", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotLike(String value) {
			addCriterion("photo not like", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoIn(List<String> values) {
			addCriterion("photo in", values, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotIn(List<String> values) {
			addCriterion("photo not in", values, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoBetween(String value1, String value2) {
			addCriterion("photo between", value1, value2, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotBetween(String value1, String value2) {
			addCriterion("photo not between", value1, value2, "photo");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table goods
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
     * This class corresponds to the database table goods
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 07 08:22:18 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}