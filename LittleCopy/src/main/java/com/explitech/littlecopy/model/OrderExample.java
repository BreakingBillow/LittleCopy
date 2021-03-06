package com.explitech.littlecopy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateIsNull() {
            addCriterion("order_start_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateIsNotNull() {
            addCriterion("order_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateEqualTo(Date value) {
            addCriterion("order_start_date =", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateNotEqualTo(Date value) {
            addCriterion("order_start_date <>", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateGreaterThan(Date value) {
            addCriterion("order_start_date >", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_start_date >=", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateLessThan(Date value) {
            addCriterion("order_start_date <", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateLessThanOrEqualTo(Date value) {
            addCriterion("order_start_date <=", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateIn(List<Date> values) {
            addCriterion("order_start_date in", values, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateNotIn(List<Date> values) {
            addCriterion("order_start_date not in", values, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateBetween(Date value1, Date value2) {
            addCriterion("order_start_date between", value1, value2, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateNotBetween(Date value1, Date value2) {
            addCriterion("order_start_date not between", value1, value2, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateIsNull() {
            addCriterion("order_end_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateIsNotNull() {
            addCriterion("order_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateEqualTo(Date value) {
            addCriterion("order_end_date =", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateNotEqualTo(Date value) {
            addCriterion("order_end_date <>", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateGreaterThan(Date value) {
            addCriterion("order_end_date >", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_end_date >=", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateLessThan(Date value) {
            addCriterion("order_end_date <", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateLessThanOrEqualTo(Date value) {
            addCriterion("order_end_date <=", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateIn(List<Date> values) {
            addCriterion("order_end_date in", values, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateNotIn(List<Date> values) {
            addCriterion("order_end_date not in", values, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateBetween(Date value1, Date value2) {
            addCriterion("order_end_date between", value1, value2, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateNotBetween(Date value1, Date value2) {
            addCriterion("order_end_date not between", value1, value2, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdIsNull() {
            addCriterion("contract_type_id is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdIsNotNull() {
            addCriterion("contract_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdEqualTo(Integer value) {
            addCriterion("contract_type_id =", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdNotEqualTo(Integer value) {
            addCriterion("contract_type_id <>", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdGreaterThan(Integer value) {
            addCriterion("contract_type_id >", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_type_id >=", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdLessThan(Integer value) {
            addCriterion("contract_type_id <", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("contract_type_id <=", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdIn(List<Integer> values) {
            addCriterion("contract_type_id in", values, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdNotIn(List<Integer> values) {
            addCriterion("contract_type_id not in", values, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("contract_type_id between", value1, value2, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_type_id not between", value1, value2, "contractTypeId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 23 17:19:09 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order
     *
     * @mbggenerated Wed Mar 23 17:19:09 CST 2016
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
}