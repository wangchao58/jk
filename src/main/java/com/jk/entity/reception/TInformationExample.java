package com.jk.entity.reception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInformationExample() {
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

        public Criteria andTImgIsNull() {
            addCriterion("t_img is null");
            return (Criteria) this;
        }

        public Criteria andTImgIsNotNull() {
            addCriterion("t_img is not null");
            return (Criteria) this;
        }

        public Criteria andTImgEqualTo(String value) {
            addCriterion("t_img =", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgNotEqualTo(String value) {
            addCriterion("t_img <>", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgGreaterThan(String value) {
            addCriterion("t_img >", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgGreaterThanOrEqualTo(String value) {
            addCriterion("t_img >=", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgLessThan(String value) {
            addCriterion("t_img <", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgLessThanOrEqualTo(String value) {
            addCriterion("t_img <=", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgLike(String value) {
            addCriterion("t_img like", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgNotLike(String value) {
            addCriterion("t_img not like", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgIn(List<String> values) {
            addCriterion("t_img in", values, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgNotIn(List<String> values) {
            addCriterion("t_img not in", values, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgBetween(String value1, String value2) {
            addCriterion("t_img between", value1, value2, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgNotBetween(String value1, String value2) {
            addCriterion("t_img not between", value1, value2, "tImg");
            return (Criteria) this;
        }

        public Criteria andTCoordinateIsNull() {
            addCriterion("t_coordinate is null");
            return (Criteria) this;
        }

        public Criteria andTCoordinateIsNotNull() {
            addCriterion("t_coordinate is not null");
            return (Criteria) this;
        }

        public Criteria andTCoordinateEqualTo(String value) {
            addCriterion("t_coordinate =", value, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTCoordinateNotEqualTo(String value) {
            addCriterion("t_coordinate <>", value, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTCoordinateGreaterThan(String value) {
            addCriterion("t_coordinate >", value, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("t_coordinate >=", value, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTCoordinateLessThan(String value) {
            addCriterion("t_coordinate <", value, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTCoordinateLessThanOrEqualTo(String value) {
            addCriterion("t_coordinate <=", value, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTCoordinateLike(String value) {
            addCriterion("t_coordinate like", value, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTCoordinateNotLike(String value) {
            addCriterion("t_coordinate not like", value, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTCoordinateIn(List<String> values) {
            addCriterion("t_coordinate in", values, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTCoordinateNotIn(List<String> values) {
            addCriterion("t_coordinate not in", values, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTCoordinateBetween(String value1, String value2) {
            addCriterion("t_coordinate between", value1, value2, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTCoordinateNotBetween(String value1, String value2) {
            addCriterion("t_coordinate not between", value1, value2, "tCoordinate");
            return (Criteria) this;
        }

        public Criteria andTPraiseIsNull() {
            addCriterion("t_praise is null");
            return (Criteria) this;
        }

        public Criteria andTPraiseIsNotNull() {
            addCriterion("t_praise is not null");
            return (Criteria) this;
        }

        public Criteria andTPraiseEqualTo(Integer value) {
            addCriterion("t_praise =", value, "tPraise");
            return (Criteria) this;
        }

        public Criteria andTPraiseNotEqualTo(Integer value) {
            addCriterion("t_praise <>", value, "tPraise");
            return (Criteria) this;
        }

        public Criteria andTPraiseGreaterThan(Integer value) {
            addCriterion("t_praise >", value, "tPraise");
            return (Criteria) this;
        }

        public Criteria andTPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_praise >=", value, "tPraise");
            return (Criteria) this;
        }

        public Criteria andTPraiseLessThan(Integer value) {
            addCriterion("t_praise <", value, "tPraise");
            return (Criteria) this;
        }

        public Criteria andTPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("t_praise <=", value, "tPraise");
            return (Criteria) this;
        }

        public Criteria andTPraiseIn(List<Integer> values) {
            addCriterion("t_praise in", values, "tPraise");
            return (Criteria) this;
        }

        public Criteria andTPraiseNotIn(List<Integer> values) {
            addCriterion("t_praise not in", values, "tPraise");
            return (Criteria) this;
        }

        public Criteria andTPraiseBetween(Integer value1, Integer value2) {
            addCriterion("t_praise between", value1, value2, "tPraise");
            return (Criteria) this;
        }

        public Criteria andTPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("t_praise not between", value1, value2, "tPraise");
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

        public Criteria andTCreateTimeIsNull() {
            addCriterion("t_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIsNotNull() {
            addCriterion("t_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeEqualTo(Date value) {
            addCriterion("t_create_time =", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotEqualTo(Date value) {
            addCriterion("t_create_time <>", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThan(Date value) {
            addCriterion("t_create_time >", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_create_time >=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThan(Date value) {
            addCriterion("t_create_time <", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_create_time <=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIn(List<Date> values) {
            addCriterion("t_create_time in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotIn(List<Date> values) {
            addCriterion("t_create_time not in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeBetween(Date value1, Date value2) {
            addCriterion("t_create_time between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_create_time not between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTViewsNumIsNull() {
            addCriterion("t_views_num is null");
            return (Criteria) this;
        }

        public Criteria andTViewsNumIsNotNull() {
            addCriterion("t_views_num is not null");
            return (Criteria) this;
        }

        public Criteria andTViewsNumEqualTo(Integer value) {
            addCriterion("t_views_num =", value, "tViewsNum");
            return (Criteria) this;
        }

        public Criteria andTViewsNumNotEqualTo(Integer value) {
            addCriterion("t_views_num <>", value, "tViewsNum");
            return (Criteria) this;
        }

        public Criteria andTViewsNumGreaterThan(Integer value) {
            addCriterion("t_views_num >", value, "tViewsNum");
            return (Criteria) this;
        }

        public Criteria andTViewsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_views_num >=", value, "tViewsNum");
            return (Criteria) this;
        }

        public Criteria andTViewsNumLessThan(Integer value) {
            addCriterion("t_views_num <", value, "tViewsNum");
            return (Criteria) this;
        }

        public Criteria andTViewsNumLessThanOrEqualTo(Integer value) {
            addCriterion("t_views_num <=", value, "tViewsNum");
            return (Criteria) this;
        }

        public Criteria andTViewsNumIn(List<Integer> values) {
            addCriterion("t_views_num in", values, "tViewsNum");
            return (Criteria) this;
        }

        public Criteria andTViewsNumNotIn(List<Integer> values) {
            addCriterion("t_views_num not in", values, "tViewsNum");
            return (Criteria) this;
        }

        public Criteria andTViewsNumBetween(Integer value1, Integer value2) {
            addCriterion("t_views_num between", value1, value2, "tViewsNum");
            return (Criteria) this;
        }

        public Criteria andTViewsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("t_views_num not between", value1, value2, "tViewsNum");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumIsNull() {
            addCriterion("t_collection_num is null");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumIsNotNull() {
            addCriterion("t_collection_num is not null");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumEqualTo(Integer value) {
            addCriterion("t_collection_num =", value, "tCollectionNum");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumNotEqualTo(Integer value) {
            addCriterion("t_collection_num <>", value, "tCollectionNum");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumGreaterThan(Integer value) {
            addCriterion("t_collection_num >", value, "tCollectionNum");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_collection_num >=", value, "tCollectionNum");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumLessThan(Integer value) {
            addCriterion("t_collection_num <", value, "tCollectionNum");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumLessThanOrEqualTo(Integer value) {
            addCriterion("t_collection_num <=", value, "tCollectionNum");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumIn(List<Integer> values) {
            addCriterion("t_collection_num in", values, "tCollectionNum");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumNotIn(List<Integer> values) {
            addCriterion("t_collection_num not in", values, "tCollectionNum");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumBetween(Integer value1, Integer value2) {
            addCriterion("t_collection_num between", value1, value2, "tCollectionNum");
            return (Criteria) this;
        }

        public Criteria andTCollectionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("t_collection_num not between", value1, value2, "tCollectionNum");
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