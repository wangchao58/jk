package com.jk.entity.reception;

import java.util.ArrayList;
import java.util.List;

public class TShareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TShareExample() {
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

        public Criteria andTUseridIsNull() {
            addCriterion("t_userid is null");
            return (Criteria) this;
        }

        public Criteria andTUseridIsNotNull() {
            addCriterion("t_userid is not null");
            return (Criteria) this;
        }

        public Criteria andTUseridEqualTo(String value) {
            addCriterion("t_userid =", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridNotEqualTo(String value) {
            addCriterion("t_userid <>", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridGreaterThan(String value) {
            addCriterion("t_userid >", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridGreaterThanOrEqualTo(String value) {
            addCriterion("t_userid >=", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridLessThan(String value) {
            addCriterion("t_userid <", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridLessThanOrEqualTo(String value) {
            addCriterion("t_userid <=", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridLike(String value) {
            addCriterion("t_userid like", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridNotLike(String value) {
            addCriterion("t_userid not like", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridIn(List<String> values) {
            addCriterion("t_userid in", values, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridNotIn(List<String> values) {
            addCriterion("t_userid not in", values, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridBetween(String value1, String value2) {
            addCriterion("t_userid between", value1, value2, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridNotBetween(String value1, String value2) {
            addCriterion("t_userid not between", value1, value2, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUrlIsNull() {
            addCriterion("t_url is null");
            return (Criteria) this;
        }

        public Criteria andTUrlIsNotNull() {
            addCriterion("t_url is not null");
            return (Criteria) this;
        }

        public Criteria andTUrlEqualTo(String value) {
            addCriterion("t_url =", value, "tUrl");
            return (Criteria) this;
        }

        public Criteria andTUrlNotEqualTo(String value) {
            addCriterion("t_url <>", value, "tUrl");
            return (Criteria) this;
        }

        public Criteria andTUrlGreaterThan(String value) {
            addCriterion("t_url >", value, "tUrl");
            return (Criteria) this;
        }

        public Criteria andTUrlGreaterThanOrEqualTo(String value) {
            addCriterion("t_url >=", value, "tUrl");
            return (Criteria) this;
        }

        public Criteria andTUrlLessThan(String value) {
            addCriterion("t_url <", value, "tUrl");
            return (Criteria) this;
        }

        public Criteria andTUrlLessThanOrEqualTo(String value) {
            addCriterion("t_url <=", value, "tUrl");
            return (Criteria) this;
        }

        public Criteria andTUrlLike(String value) {
            addCriterion("t_url like", value, "tUrl");
            return (Criteria) this;
        }

        public Criteria andTUrlNotLike(String value) {
            addCriterion("t_url not like", value, "tUrl");
            return (Criteria) this;
        }

        public Criteria andTUrlIn(List<String> values) {
            addCriterion("t_url in", values, "tUrl");
            return (Criteria) this;
        }

        public Criteria andTUrlNotIn(List<String> values) {
            addCriterion("t_url not in", values, "tUrl");
            return (Criteria) this;
        }

        public Criteria andTUrlBetween(String value1, String value2) {
            addCriterion("t_url between", value1, value2, "tUrl");
            return (Criteria) this;
        }

        public Criteria andTUrlNotBetween(String value1, String value2) {
            addCriterion("t_url not between", value1, value2, "tUrl");
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