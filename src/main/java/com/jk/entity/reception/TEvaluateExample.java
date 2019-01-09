package com.jk.entity.reception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TEvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEvaluateExample() {
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

        public Criteria andTOtherIdIsNull() {
            addCriterion("t_other_id is null");
            return (Criteria) this;
        }

        public Criteria andTOtherIdIsNotNull() {
            addCriterion("t_other_id is not null");
            return (Criteria) this;
        }

        public Criteria andTOtherIdEqualTo(String value) {
            addCriterion("t_other_id =", value, "tOtherId");
            return (Criteria) this;
        }

        public Criteria andTOtherIdNotEqualTo(String value) {
            addCriterion("t_other_id <>", value, "tOtherId");
            return (Criteria) this;
        }

        public Criteria andTOtherIdGreaterThan(String value) {
            addCriterion("t_other_id >", value, "tOtherId");
            return (Criteria) this;
        }

        public Criteria andTOtherIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_other_id >=", value, "tOtherId");
            return (Criteria) this;
        }

        public Criteria andTOtherIdLessThan(String value) {
            addCriterion("t_other_id <", value, "tOtherId");
            return (Criteria) this;
        }

        public Criteria andTOtherIdLessThanOrEqualTo(String value) {
            addCriterion("t_other_id <=", value, "tOtherId");
            return (Criteria) this;
        }

        public Criteria andTOtherIdLike(String value) {
            addCriterion("t_other_id like", value, "tOtherId");
            return (Criteria) this;
        }

        public Criteria andTOtherIdNotLike(String value) {
            addCriterion("t_other_id not like", value, "tOtherId");
            return (Criteria) this;
        }

        public Criteria andTOtherIdIn(List<String> values) {
            addCriterion("t_other_id in", values, "tOtherId");
            return (Criteria) this;
        }

        public Criteria andTOtherIdNotIn(List<String> values) {
            addCriterion("t_other_id not in", values, "tOtherId");
            return (Criteria) this;
        }

        public Criteria andTOtherIdBetween(String value1, String value2) {
            addCriterion("t_other_id between", value1, value2, "tOtherId");
            return (Criteria) this;
        }

        public Criteria andTOtherIdNotBetween(String value1, String value2) {
            addCriterion("t_other_id not between", value1, value2, "tOtherId");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTPictureIsNull() {
            addCriterion("t_picture is null");
            return (Criteria) this;
        }

        public Criteria andTPictureIsNotNull() {
            addCriterion("t_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTPictureEqualTo(String value) {
            addCriterion("t_picture =", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureNotEqualTo(String value) {
            addCriterion("t_picture <>", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureGreaterThan(String value) {
            addCriterion("t_picture >", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureGreaterThanOrEqualTo(String value) {
            addCriterion("t_picture >=", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureLessThan(String value) {
            addCriterion("t_picture <", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureLessThanOrEqualTo(String value) {
            addCriterion("t_picture <=", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureLike(String value) {
            addCriterion("t_picture like", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureNotLike(String value) {
            addCriterion("t_picture not like", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureIn(List<String> values) {
            addCriterion("t_picture in", values, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureNotIn(List<String> values) {
            addCriterion("t_picture not in", values, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureBetween(String value1, String value2) {
            addCriterion("t_picture between", value1, value2, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureNotBetween(String value1, String value2) {
            addCriterion("t_picture not between", value1, value2, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTAnonymityIsNull() {
            addCriterion("t_anonymity is null");
            return (Criteria) this;
        }

        public Criteria andTAnonymityIsNotNull() {
            addCriterion("t_anonymity is not null");
            return (Criteria) this;
        }

        public Criteria andTAnonymityEqualTo(String value) {
            addCriterion("t_anonymity =", value, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTAnonymityNotEqualTo(String value) {
            addCriterion("t_anonymity <>", value, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTAnonymityGreaterThan(String value) {
            addCriterion("t_anonymity >", value, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTAnonymityGreaterThanOrEqualTo(String value) {
            addCriterion("t_anonymity >=", value, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTAnonymityLessThan(String value) {
            addCriterion("t_anonymity <", value, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTAnonymityLessThanOrEqualTo(String value) {
            addCriterion("t_anonymity <=", value, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTAnonymityLike(String value) {
            addCriterion("t_anonymity like", value, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTAnonymityNotLike(String value) {
            addCriterion("t_anonymity not like", value, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTAnonymityIn(List<String> values) {
            addCriterion("t_anonymity in", values, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTAnonymityNotIn(List<String> values) {
            addCriterion("t_anonymity not in", values, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTAnonymityBetween(String value1, String value2) {
            addCriterion("t_anonymity between", value1, value2, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTAnonymityNotBetween(String value1, String value2) {
            addCriterion("t_anonymity not between", value1, value2, "tAnonymity");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNull() {
            addCriterion("t_type is null");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNotNull() {
            addCriterion("t_type is not null");
            return (Criteria) this;
        }

        public Criteria andTTypeEqualTo(String value) {
            addCriterion("t_type =", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotEqualTo(String value) {
            addCriterion("t_type <>", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThan(String value) {
            addCriterion("t_type >", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThanOrEqualTo(String value) {
            addCriterion("t_type >=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThan(String value) {
            addCriterion("t_type <", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThanOrEqualTo(String value) {
            addCriterion("t_type <=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLike(String value) {
            addCriterion("t_type like", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotLike(String value) {
            addCriterion("t_type not like", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeIn(List<String> values) {
            addCriterion("t_type in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotIn(List<String> values) {
            addCriterion("t_type not in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeBetween(String value1, String value2) {
            addCriterion("t_type between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotBetween(String value1, String value2) {
            addCriterion("t_type not between", value1, value2, "tType");
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