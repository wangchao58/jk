package com.jk.entity.reception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TApplyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(String value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(String value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(String value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(String value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(String value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(String value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLike(String value) {
            addCriterion("h_id like", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotLike(String value) {
            addCriterion("h_id not like", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<String> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<String> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(String value1, String value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(String value1, String value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("p_id like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("p_id not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andTTimeIsNull() {
            addCriterion("t_time is null");
            return (Criteria) this;
        }

        public Criteria andTTimeIsNotNull() {
            addCriterion("t_time is not null");
            return (Criteria) this;
        }

        public Criteria andTTimeEqualTo(Date value) {
            addCriterion("t_time =", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotEqualTo(Date value) {
            addCriterion("t_time <>", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeGreaterThan(Date value) {
            addCriterion("t_time >", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_time >=", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeLessThan(Date value) {
            addCriterion("t_time <", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_time <=", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeIn(List<Date> values) {
            addCriterion("t_time in", values, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotIn(List<Date> values) {
            addCriterion("t_time not in", values, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeBetween(Date value1, Date value2) {
            addCriterion("t_time between", value1, value2, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_time not between", value1, value2, "tTime");
            return (Criteria) this;
        }

        public Criteria andTPhoneIsNull() {
            addCriterion("t_phone is null");
            return (Criteria) this;
        }

        public Criteria andTPhoneIsNotNull() {
            addCriterion("t_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTPhoneEqualTo(String value) {
            addCriterion("t_phone =", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotEqualTo(String value) {
            addCriterion("t_phone <>", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThan(String value) {
            addCriterion("t_phone >", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_phone >=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThan(String value) {
            addCriterion("t_phone <", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThanOrEqualTo(String value) {
            addCriterion("t_phone <=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLike(String value) {
            addCriterion("t_phone like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotLike(String value) {
            addCriterion("t_phone not like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneIn(List<String> values) {
            addCriterion("t_phone in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotIn(List<String> values) {
            addCriterion("t_phone not in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneBetween(String value1, String value2) {
            addCriterion("t_phone between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotBetween(String value1, String value2) {
            addCriterion("t_phone not between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTWeixingIsNull() {
            addCriterion("t_weixing is null");
            return (Criteria) this;
        }

        public Criteria andTWeixingIsNotNull() {
            addCriterion("t_weixing is not null");
            return (Criteria) this;
        }

        public Criteria andTWeixingEqualTo(String value) {
            addCriterion("t_weixing =", value, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTWeixingNotEqualTo(String value) {
            addCriterion("t_weixing <>", value, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTWeixingGreaterThan(String value) {
            addCriterion("t_weixing >", value, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTWeixingGreaterThanOrEqualTo(String value) {
            addCriterion("t_weixing >=", value, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTWeixingLessThan(String value) {
            addCriterion("t_weixing <", value, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTWeixingLessThanOrEqualTo(String value) {
            addCriterion("t_weixing <=", value, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTWeixingLike(String value) {
            addCriterion("t_weixing like", value, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTWeixingNotLike(String value) {
            addCriterion("t_weixing not like", value, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTWeixingIn(List<String> values) {
            addCriterion("t_weixing in", values, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTWeixingNotIn(List<String> values) {
            addCriterion("t_weixing not in", values, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTWeixingBetween(String value1, String value2) {
            addCriterion("t_weixing between", value1, value2, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTWeixingNotBetween(String value1, String value2) {
            addCriterion("t_weixing not between", value1, value2, "tWeixing");
            return (Criteria) this;
        }

        public Criteria andTIntroductionIsNull() {
            addCriterion("t_introduction is null");
            return (Criteria) this;
        }

        public Criteria andTIntroductionIsNotNull() {
            addCriterion("t_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andTIntroductionEqualTo(String value) {
            addCriterion("t_introduction =", value, "tIntroduction");
            return (Criteria) this;
        }

        public Criteria andTIntroductionNotEqualTo(String value) {
            addCriterion("t_introduction <>", value, "tIntroduction");
            return (Criteria) this;
        }

        public Criteria andTIntroductionGreaterThan(String value) {
            addCriterion("t_introduction >", value, "tIntroduction");
            return (Criteria) this;
        }

        public Criteria andTIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("t_introduction >=", value, "tIntroduction");
            return (Criteria) this;
        }

        public Criteria andTIntroductionLessThan(String value) {
            addCriterion("t_introduction <", value, "tIntroduction");
            return (Criteria) this;
        }

        public Criteria andTIntroductionLessThanOrEqualTo(String value) {
            addCriterion("t_introduction <=", value, "tIntroduction");
            return (Criteria) this;
        }

        public Criteria andTIntroductionLike(String value) {
            addCriterion("t_introduction like", value, "tIntroduction");
            return (Criteria) this;
        }

        public Criteria andTIntroductionNotLike(String value) {
            addCriterion("t_introduction not like", value, "tIntroduction");
            return (Criteria) this;
        }

        public Criteria andTIntroductionIn(List<String> values) {
            addCriterion("t_introduction in", values, "tIntroduction");
            return (Criteria) this;
        }

        public Criteria andTIntroductionNotIn(List<String> values) {
            addCriterion("t_introduction not in", values, "tIntroduction");
            return (Criteria) this;
        }

        public Criteria andTIntroductionBetween(String value1, String value2) {
            addCriterion("t_introduction between", value1, value2, "tIntroduction");
            return (Criteria) this;
        }

        public Criteria andTIntroductionNotBetween(String value1, String value2) {
            addCriterion("t_introduction not between", value1, value2, "tIntroduction");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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