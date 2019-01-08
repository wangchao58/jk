package com.jk.entity.reception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCarGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCarGroupExample() {
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

        public Criteria andTGroupNameIsNull() {
            addCriterion("t_group_name is null");
            return (Criteria) this;
        }

        public Criteria andTGroupNameIsNotNull() {
            addCriterion("t_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andTGroupNameEqualTo(String value) {
            addCriterion("t_group_name =", value, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTGroupNameNotEqualTo(String value) {
            addCriterion("t_group_name <>", value, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTGroupNameGreaterThan(String value) {
            addCriterion("t_group_name >", value, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_group_name >=", value, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTGroupNameLessThan(String value) {
            addCriterion("t_group_name <", value, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTGroupNameLessThanOrEqualTo(String value) {
            addCriterion("t_group_name <=", value, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTGroupNameLike(String value) {
            addCriterion("t_group_name like", value, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTGroupNameNotLike(String value) {
            addCriterion("t_group_name not like", value, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTGroupNameIn(List<String> values) {
            addCriterion("t_group_name in", values, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTGroupNameNotIn(List<String> values) {
            addCriterion("t_group_name not in", values, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTGroupNameBetween(String value1, String value2) {
            addCriterion("t_group_name between", value1, value2, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTGroupNameNotBetween(String value1, String value2) {
            addCriterion("t_group_name not between", value1, value2, "tGroupName");
            return (Criteria) this;
        }

        public Criteria andTSortIsNull() {
            addCriterion("t_sort is null");
            return (Criteria) this;
        }

        public Criteria andTSortIsNotNull() {
            addCriterion("t_sort is not null");
            return (Criteria) this;
        }

        public Criteria andTSortEqualTo(String value) {
            addCriterion("t_sort =", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortNotEqualTo(String value) {
            addCriterion("t_sort <>", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortGreaterThan(String value) {
            addCriterion("t_sort >", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortGreaterThanOrEqualTo(String value) {
            addCriterion("t_sort >=", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortLessThan(String value) {
            addCriterion("t_sort <", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortLessThanOrEqualTo(String value) {
            addCriterion("t_sort <=", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortLike(String value) {
            addCriterion("t_sort like", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortNotLike(String value) {
            addCriterion("t_sort not like", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortIn(List<String> values) {
            addCriterion("t_sort in", values, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortNotIn(List<String> values) {
            addCriterion("t_sort not in", values, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortBetween(String value1, String value2) {
            addCriterion("t_sort between", value1, value2, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortNotBetween(String value1, String value2) {
            addCriterion("t_sort not between", value1, value2, "tSort");
            return (Criteria) this;
        }

        public Criteria andTGroupLordIsNull() {
            addCriterion("t_group_lord is null");
            return (Criteria) this;
        }

        public Criteria andTGroupLordIsNotNull() {
            addCriterion("t_group_lord is not null");
            return (Criteria) this;
        }

        public Criteria andTGroupLordEqualTo(String value) {
            addCriterion("t_group_lord =", value, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupLordNotEqualTo(String value) {
            addCriterion("t_group_lord <>", value, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupLordGreaterThan(String value) {
            addCriterion("t_group_lord >", value, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupLordGreaterThanOrEqualTo(String value) {
            addCriterion("t_group_lord >=", value, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupLordLessThan(String value) {
            addCriterion("t_group_lord <", value, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupLordLessThanOrEqualTo(String value) {
            addCriterion("t_group_lord <=", value, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupLordLike(String value) {
            addCriterion("t_group_lord like", value, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupLordNotLike(String value) {
            addCriterion("t_group_lord not like", value, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupLordIn(List<String> values) {
            addCriterion("t_group_lord in", values, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupLordNotIn(List<String> values) {
            addCriterion("t_group_lord not in", values, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupLordBetween(String value1, String value2) {
            addCriterion("t_group_lord between", value1, value2, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupLordNotBetween(String value1, String value2) {
            addCriterion("t_group_lord not between", value1, value2, "tGroupLord");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeIsNull() {
            addCriterion("t_group_code is null");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeIsNotNull() {
            addCriterion("t_group_code is not null");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeEqualTo(String value) {
            addCriterion("t_group_code =", value, "tGroupCode");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeNotEqualTo(String value) {
            addCriterion("t_group_code <>", value, "tGroupCode");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeGreaterThan(String value) {
            addCriterion("t_group_code >", value, "tGroupCode");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("t_group_code >=", value, "tGroupCode");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeLessThan(String value) {
            addCriterion("t_group_code <", value, "tGroupCode");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeLessThanOrEqualTo(String value) {
            addCriterion("t_group_code <=", value, "tGroupCode");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeLike(String value) {
            addCriterion("t_group_code like", value, "tGroupCode");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeNotLike(String value) {
            addCriterion("t_group_code not like", value, "tGroupCode");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeIn(List<String> values) {
            addCriterion("t_group_code in", values, "tGroupCode");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeNotIn(List<String> values) {
            addCriterion("t_group_code not in", values, "tGroupCode");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeBetween(String value1, String value2) {
            addCriterion("t_group_code between", value1, value2, "tGroupCode");
            return (Criteria) this;
        }

        public Criteria andTGroupCodeNotBetween(String value1, String value2) {
            addCriterion("t_group_code not between", value1, value2, "tGroupCode");
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

        public Criteria andTAttributionIsNull() {
            addCriterion("t_attribution is null");
            return (Criteria) this;
        }

        public Criteria andTAttributionIsNotNull() {
            addCriterion("t_attribution is not null");
            return (Criteria) this;
        }

        public Criteria andTAttributionEqualTo(String value) {
            addCriterion("t_attribution =", value, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTAttributionNotEqualTo(String value) {
            addCriterion("t_attribution <>", value, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTAttributionGreaterThan(String value) {
            addCriterion("t_attribution >", value, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTAttributionGreaterThanOrEqualTo(String value) {
            addCriterion("t_attribution >=", value, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTAttributionLessThan(String value) {
            addCriterion("t_attribution <", value, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTAttributionLessThanOrEqualTo(String value) {
            addCriterion("t_attribution <=", value, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTAttributionLike(String value) {
            addCriterion("t_attribution like", value, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTAttributionNotLike(String value) {
            addCriterion("t_attribution not like", value, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTAttributionIn(List<String> values) {
            addCriterion("t_attribution in", values, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTAttributionNotIn(List<String> values) {
            addCriterion("t_attribution not in", values, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTAttributionBetween(String value1, String value2) {
            addCriterion("t_attribution between", value1, value2, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTAttributionNotBetween(String value1, String value2) {
            addCriterion("t_attribution not between", value1, value2, "tAttribution");
            return (Criteria) this;
        }

        public Criteria andTClaimIsNull() {
            addCriterion("t_claim is null");
            return (Criteria) this;
        }

        public Criteria andTClaimIsNotNull() {
            addCriterion("t_claim is not null");
            return (Criteria) this;
        }

        public Criteria andTClaimEqualTo(String value) {
            addCriterion("t_claim =", value, "tClaim");
            return (Criteria) this;
        }

        public Criteria andTClaimNotEqualTo(String value) {
            addCriterion("t_claim <>", value, "tClaim");
            return (Criteria) this;
        }

        public Criteria andTClaimGreaterThan(String value) {
            addCriterion("t_claim >", value, "tClaim");
            return (Criteria) this;
        }

        public Criteria andTClaimGreaterThanOrEqualTo(String value) {
            addCriterion("t_claim >=", value, "tClaim");
            return (Criteria) this;
        }

        public Criteria andTClaimLessThan(String value) {
            addCriterion("t_claim <", value, "tClaim");
            return (Criteria) this;
        }

        public Criteria andTClaimLessThanOrEqualTo(String value) {
            addCriterion("t_claim <=", value, "tClaim");
            return (Criteria) this;
        }

        public Criteria andTClaimLike(String value) {
            addCriterion("t_claim like", value, "tClaim");
            return (Criteria) this;
        }

        public Criteria andTClaimNotLike(String value) {
            addCriterion("t_claim not like", value, "tClaim");
            return (Criteria) this;
        }

        public Criteria andTClaimIn(List<String> values) {
            addCriterion("t_claim in", values, "tClaim");
            return (Criteria) this;
        }

        public Criteria andTClaimNotIn(List<String> values) {
            addCriterion("t_claim not in", values, "tClaim");
            return (Criteria) this;
        }

        public Criteria andTClaimBetween(String value1, String value2) {
            addCriterion("t_claim between", value1, value2, "tClaim");
            return (Criteria) this;
        }

        public Criteria andTClaimNotBetween(String value1, String value2) {
            addCriterion("t_claim not between", value1, value2, "tClaim");
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

        public Criteria andTExplainIsNull() {
            addCriterion("t_explain is null");
            return (Criteria) this;
        }

        public Criteria andTExplainIsNotNull() {
            addCriterion("t_explain is not null");
            return (Criteria) this;
        }

        public Criteria andTExplainEqualTo(String value) {
            addCriterion("t_explain =", value, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTExplainNotEqualTo(String value) {
            addCriterion("t_explain <>", value, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTExplainGreaterThan(String value) {
            addCriterion("t_explain >", value, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTExplainGreaterThanOrEqualTo(String value) {
            addCriterion("t_explain >=", value, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTExplainLessThan(String value) {
            addCriterion("t_explain <", value, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTExplainLessThanOrEqualTo(String value) {
            addCriterion("t_explain <=", value, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTExplainLike(String value) {
            addCriterion("t_explain like", value, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTExplainNotLike(String value) {
            addCriterion("t_explain not like", value, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTExplainIn(List<String> values) {
            addCriterion("t_explain in", values, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTExplainNotIn(List<String> values) {
            addCriterion("t_explain not in", values, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTExplainBetween(String value1, String value2) {
            addCriterion("t_explain between", value1, value2, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTExplainNotBetween(String value1, String value2) {
            addCriterion("t_explain not between", value1, value2, "tExplain");
            return (Criteria) this;
        }

        public Criteria andTPaymentIsNull() {
            addCriterion("t_payment is null");
            return (Criteria) this;
        }

        public Criteria andTPaymentIsNotNull() {
            addCriterion("t_payment is not null");
            return (Criteria) this;
        }

        public Criteria andTPaymentEqualTo(String value) {
            addCriterion("t_payment =", value, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTPaymentNotEqualTo(String value) {
            addCriterion("t_payment <>", value, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTPaymentGreaterThan(String value) {
            addCriterion("t_payment >", value, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("t_payment >=", value, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTPaymentLessThan(String value) {
            addCriterion("t_payment <", value, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTPaymentLessThanOrEqualTo(String value) {
            addCriterion("t_payment <=", value, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTPaymentLike(String value) {
            addCriterion("t_payment like", value, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTPaymentNotLike(String value) {
            addCriterion("t_payment not like", value, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTPaymentIn(List<String> values) {
            addCriterion("t_payment in", values, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTPaymentNotIn(List<String> values) {
            addCriterion("t_payment not in", values, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTPaymentBetween(String value1, String value2) {
            addCriterion("t_payment between", value1, value2, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTPaymentNotBetween(String value1, String value2) {
            addCriterion("t_payment not between", value1, value2, "tPayment");
            return (Criteria) this;
        }

        public Criteria andTMoneyIsNull() {
            addCriterion("t_money is null");
            return (Criteria) this;
        }

        public Criteria andTMoneyIsNotNull() {
            addCriterion("t_money is not null");
            return (Criteria) this;
        }

        public Criteria andTMoneyEqualTo(Float value) {
            addCriterion("t_money =", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyNotEqualTo(Float value) {
            addCriterion("t_money <>", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyGreaterThan(Float value) {
            addCriterion("t_money >", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("t_money >=", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyLessThan(Float value) {
            addCriterion("t_money <", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyLessThanOrEqualTo(Float value) {
            addCriterion("t_money <=", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyIn(List<Float> values) {
            addCriterion("t_money in", values, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyNotIn(List<Float> values) {
            addCriterion("t_money not in", values, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyBetween(Float value1, Float value2) {
            addCriterion("t_money between", value1, value2, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyNotBetween(Float value1, Float value2) {
            addCriterion("t_money not between", value1, value2, "tMoney");
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