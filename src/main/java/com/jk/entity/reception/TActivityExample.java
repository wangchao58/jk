package com.jk.entity.reception;

import java.util.ArrayList;
import java.util.List;

public class TActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TActivityExample() {
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

        public Criteria andTHeadlineIsNull() {
            addCriterion("t_headline is null");
            return (Criteria) this;
        }

        public Criteria andTHeadlineIsNotNull() {
            addCriterion("t_headline is not null");
            return (Criteria) this;
        }

        public Criteria andTHeadlineEqualTo(String value) {
            addCriterion("t_headline =", value, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTHeadlineNotEqualTo(String value) {
            addCriterion("t_headline <>", value, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTHeadlineGreaterThan(String value) {
            addCriterion("t_headline >", value, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTHeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("t_headline >=", value, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTHeadlineLessThan(String value) {
            addCriterion("t_headline <", value, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTHeadlineLessThanOrEqualTo(String value) {
            addCriterion("t_headline <=", value, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTHeadlineLike(String value) {
            addCriterion("t_headline like", value, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTHeadlineNotLike(String value) {
            addCriterion("t_headline not like", value, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTHeadlineIn(List<String> values) {
            addCriterion("t_headline in", values, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTHeadlineNotIn(List<String> values) {
            addCriterion("t_headline not in", values, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTHeadlineBetween(String value1, String value2) {
            addCriterion("t_headline between", value1, value2, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTHeadlineNotBetween(String value1, String value2) {
            addCriterion("t_headline not between", value1, value2, "tHeadline");
            return (Criteria) this;
        }

        public Criteria andTContentIsNull() {
            addCriterion("t_content is null");
            return (Criteria) this;
        }

        public Criteria andTContentIsNotNull() {
            addCriterion("t_content is not null");
            return (Criteria) this;
        }

        public Criteria andTContentEqualTo(String value) {
            addCriterion("t_content =", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotEqualTo(String value) {
            addCriterion("t_content <>", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentGreaterThan(String value) {
            addCriterion("t_content >", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentGreaterThanOrEqualTo(String value) {
            addCriterion("t_content >=", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentLessThan(String value) {
            addCriterion("t_content <", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentLessThanOrEqualTo(String value) {
            addCriterion("t_content <=", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentLike(String value) {
            addCriterion("t_content like", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotLike(String value) {
            addCriterion("t_content not like", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentIn(List<String> values) {
            addCriterion("t_content in", values, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotIn(List<String> values) {
            addCriterion("t_content not in", values, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentBetween(String value1, String value2) {
            addCriterion("t_content between", value1, value2, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotBetween(String value1, String value2) {
            addCriterion("t_content not between", value1, value2, "tContent");
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

        public Criteria andTTimeEqualTo(String value) {
            addCriterion("t_time =", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotEqualTo(String value) {
            addCriterion("t_time <>", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeGreaterThan(String value) {
            addCriterion("t_time >", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeGreaterThanOrEqualTo(String value) {
            addCriterion("t_time >=", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeLessThan(String value) {
            addCriterion("t_time <", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeLessThanOrEqualTo(String value) {
            addCriterion("t_time <=", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeLike(String value) {
            addCriterion("t_time like", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotLike(String value) {
            addCriterion("t_time not like", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeIn(List<String> values) {
            addCriterion("t_time in", values, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotIn(List<String> values) {
            addCriterion("t_time not in", values, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeBetween(String value1, String value2) {
            addCriterion("t_time between", value1, value2, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotBetween(String value1, String value2) {
            addCriterion("t_time not between", value1, value2, "tTime");
            return (Criteria) this;
        }

        public Criteria andTSiteIsNull() {
            addCriterion("t_site is null");
            return (Criteria) this;
        }

        public Criteria andTSiteIsNotNull() {
            addCriterion("t_site is not null");
            return (Criteria) this;
        }

        public Criteria andTSiteEqualTo(String value) {
            addCriterion("t_site =", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteNotEqualTo(String value) {
            addCriterion("t_site <>", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteGreaterThan(String value) {
            addCriterion("t_site >", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteGreaterThanOrEqualTo(String value) {
            addCriterion("t_site >=", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteLessThan(String value) {
            addCriterion("t_site <", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteLessThanOrEqualTo(String value) {
            addCriterion("t_site <=", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteLike(String value) {
            addCriterion("t_site like", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteNotLike(String value) {
            addCriterion("t_site not like", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteIn(List<String> values) {
            addCriterion("t_site in", values, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteNotIn(List<String> values) {
            addCriterion("t_site not in", values, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteBetween(String value1, String value2) {
            addCriterion("t_site between", value1, value2, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteNotBetween(String value1, String value2) {
            addCriterion("t_site not between", value1, value2, "tSite");
            return (Criteria) this;
        }

        public Criteria andTChargeIsNull() {
            addCriterion("t_charge is null");
            return (Criteria) this;
        }

        public Criteria andTChargeIsNotNull() {
            addCriterion("t_charge is not null");
            return (Criteria) this;
        }

        public Criteria andTChargeEqualTo(String value) {
            addCriterion("t_charge =", value, "tCharge");
            return (Criteria) this;
        }

        public Criteria andTChargeNotEqualTo(String value) {
            addCriterion("t_charge <>", value, "tCharge");
            return (Criteria) this;
        }

        public Criteria andTChargeGreaterThan(String value) {
            addCriterion("t_charge >", value, "tCharge");
            return (Criteria) this;
        }

        public Criteria andTChargeGreaterThanOrEqualTo(String value) {
            addCriterion("t_charge >=", value, "tCharge");
            return (Criteria) this;
        }

        public Criteria andTChargeLessThan(String value) {
            addCriterion("t_charge <", value, "tCharge");
            return (Criteria) this;
        }

        public Criteria andTChargeLessThanOrEqualTo(String value) {
            addCriterion("t_charge <=", value, "tCharge");
            return (Criteria) this;
        }

        public Criteria andTChargeLike(String value) {
            addCriterion("t_charge like", value, "tCharge");
            return (Criteria) this;
        }

        public Criteria andTChargeNotLike(String value) {
            addCriterion("t_charge not like", value, "tCharge");
            return (Criteria) this;
        }

        public Criteria andTChargeIn(List<String> values) {
            addCriterion("t_charge in", values, "tCharge");
            return (Criteria) this;
        }

        public Criteria andTChargeNotIn(List<String> values) {
            addCriterion("t_charge not in", values, "tCharge");
            return (Criteria) this;
        }

        public Criteria andTChargeBetween(String value1, String value2) {
            addCriterion("t_charge between", value1, value2, "tCharge");
            return (Criteria) this;
        }

        public Criteria andTChargeNotBetween(String value1, String value2) {
            addCriterion("t_charge not between", value1, value2, "tCharge");
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