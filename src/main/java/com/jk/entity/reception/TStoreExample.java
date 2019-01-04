package com.jk.entity.reception;

import java.util.ArrayList;
import java.util.List;

public class TStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStoreExample() {
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

        public Criteria andTStoreNameIsNull() {
            addCriterion("t_store_name is null");
            return (Criteria) this;
        }

        public Criteria andTStoreNameIsNotNull() {
            addCriterion("t_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andTStoreNameEqualTo(String value) {
            addCriterion("t_store_name =", value, "tStoreName");
            return (Criteria) this;
        }

        public Criteria andTStoreNameNotEqualTo(String value) {
            addCriterion("t_store_name <>", value, "tStoreName");
            return (Criteria) this;
        }

        public Criteria andTStoreNameGreaterThan(String value) {
            addCriterion("t_store_name >", value, "tStoreName");
            return (Criteria) this;
        }

        public Criteria andTStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_store_name >=", value, "tStoreName");
            return (Criteria) this;
        }

        public Criteria andTStoreNameLessThan(String value) {
            addCriterion("t_store_name <", value, "tStoreName");
            return (Criteria) this;
        }

        public Criteria andTStoreNameLessThanOrEqualTo(String value) {
            addCriterion("t_store_name <=", value, "tStoreName");
            return (Criteria) this;
        }

        public Criteria andTStoreNameLike(String value) {
            addCriterion("t_store_name like", value, "tStoreName");
            return (Criteria) this;
        }

        public Criteria andTStoreNameNotLike(String value) {
            addCriterion("t_store_name not like", value, "tStoreName");
            return (Criteria) this;
        }

        public Criteria andTStoreNameIn(List<String> values) {
            addCriterion("t_store_name in", values, "tStoreName");
            return (Criteria) this;
        }

        public Criteria andTStoreNameNotIn(List<String> values) {
            addCriterion("t_store_name not in", values, "tStoreName");
            return (Criteria) this;
        }

        public Criteria andTStoreNameBetween(String value1, String value2) {
            addCriterion("t_store_name between", value1, value2, "tStoreName");
            return (Criteria) this;
        }

        public Criteria andTStoreNameNotBetween(String value1, String value2) {
            addCriterion("t_store_name not between", value1, value2, "tStoreName");
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

        public Criteria andTQrCodeIsNull() {
            addCriterion("t_qr_code is null");
            return (Criteria) this;
        }

        public Criteria andTQrCodeIsNotNull() {
            addCriterion("t_qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andTQrCodeEqualTo(String value) {
            addCriterion("t_qr_code =", value, "tQrCode");
            return (Criteria) this;
        }

        public Criteria andTQrCodeNotEqualTo(String value) {
            addCriterion("t_qr_code <>", value, "tQrCode");
            return (Criteria) this;
        }

        public Criteria andTQrCodeGreaterThan(String value) {
            addCriterion("t_qr_code >", value, "tQrCode");
            return (Criteria) this;
        }

        public Criteria andTQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("t_qr_code >=", value, "tQrCode");
            return (Criteria) this;
        }

        public Criteria andTQrCodeLessThan(String value) {
            addCriterion("t_qr_code <", value, "tQrCode");
            return (Criteria) this;
        }

        public Criteria andTQrCodeLessThanOrEqualTo(String value) {
            addCriterion("t_qr_code <=", value, "tQrCode");
            return (Criteria) this;
        }

        public Criteria andTQrCodeLike(String value) {
            addCriterion("t_qr_code like", value, "tQrCode");
            return (Criteria) this;
        }

        public Criteria andTQrCodeNotLike(String value) {
            addCriterion("t_qr_code not like", value, "tQrCode");
            return (Criteria) this;
        }

        public Criteria andTQrCodeIn(List<String> values) {
            addCriterion("t_qr_code in", values, "tQrCode");
            return (Criteria) this;
        }

        public Criteria andTQrCodeNotIn(List<String> values) {
            addCriterion("t_qr_code not in", values, "tQrCode");
            return (Criteria) this;
        }

        public Criteria andTQrCodeBetween(String value1, String value2) {
            addCriterion("t_qr_code between", value1, value2, "tQrCode");
            return (Criteria) this;
        }

        public Criteria andTQrCodeNotBetween(String value1, String value2) {
            addCriterion("t_qr_code not between", value1, value2, "tQrCode");
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

        public Criteria andTCreateTimeEqualTo(String value) {
            addCriterion("t_create_time =", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotEqualTo(String value) {
            addCriterion("t_create_time <>", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThan(String value) {
            addCriterion("t_create_time >", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("t_create_time >=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThan(String value) {
            addCriterion("t_create_time <", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("t_create_time <=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLike(String value) {
            addCriterion("t_create_time like", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotLike(String value) {
            addCriterion("t_create_time not like", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIn(List<String> values) {
            addCriterion("t_create_time in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotIn(List<String> values) {
            addCriterion("t_create_time not in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeBetween(String value1, String value2) {
            addCriterion("t_create_time between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotBetween(String value1, String value2) {
            addCriterion("t_create_time not between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeIsNull() {
            addCriterion("t_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTEndTimeIsNotNull() {
            addCriterion("t_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTEndTimeEqualTo(String value) {
            addCriterion("t_end_time =", value, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeNotEqualTo(String value) {
            addCriterion("t_end_time <>", value, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeGreaterThan(String value) {
            addCriterion("t_end_time >", value, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("t_end_time >=", value, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeLessThan(String value) {
            addCriterion("t_end_time <", value, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeLessThanOrEqualTo(String value) {
            addCriterion("t_end_time <=", value, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeLike(String value) {
            addCriterion("t_end_time like", value, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeNotLike(String value) {
            addCriterion("t_end_time not like", value, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeIn(List<String> values) {
            addCriterion("t_end_time in", values, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeNotIn(List<String> values) {
            addCriterion("t_end_time not in", values, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeBetween(String value1, String value2) {
            addCriterion("t_end_time between", value1, value2, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTEndTimeNotBetween(String value1, String value2) {
            addCriterion("t_end_time not between", value1, value2, "tEndTime");
            return (Criteria) this;
        }

        public Criteria andTStatesIsNull() {
            addCriterion("t_states is null");
            return (Criteria) this;
        }

        public Criteria andTStatesIsNotNull() {
            addCriterion("t_states is not null");
            return (Criteria) this;
        }

        public Criteria andTStatesEqualTo(String value) {
            addCriterion("t_states =", value, "tStates");
            return (Criteria) this;
        }

        public Criteria andTStatesNotEqualTo(String value) {
            addCriterion("t_states <>", value, "tStates");
            return (Criteria) this;
        }

        public Criteria andTStatesGreaterThan(String value) {
            addCriterion("t_states >", value, "tStates");
            return (Criteria) this;
        }

        public Criteria andTStatesGreaterThanOrEqualTo(String value) {
            addCriterion("t_states >=", value, "tStates");
            return (Criteria) this;
        }

        public Criteria andTStatesLessThan(String value) {
            addCriterion("t_states <", value, "tStates");
            return (Criteria) this;
        }

        public Criteria andTStatesLessThanOrEqualTo(String value) {
            addCriterion("t_states <=", value, "tStates");
            return (Criteria) this;
        }

        public Criteria andTStatesLike(String value) {
            addCriterion("t_states like", value, "tStates");
            return (Criteria) this;
        }

        public Criteria andTStatesNotLike(String value) {
            addCriterion("t_states not like", value, "tStates");
            return (Criteria) this;
        }

        public Criteria andTStatesIn(List<String> values) {
            addCriterion("t_states in", values, "tStates");
            return (Criteria) this;
        }

        public Criteria andTStatesNotIn(List<String> values) {
            addCriterion("t_states not in", values, "tStates");
            return (Criteria) this;
        }

        public Criteria andTStatesBetween(String value1, String value2) {
            addCriterion("t_states between", value1, value2, "tStates");
            return (Criteria) this;
        }

        public Criteria andTStatesNotBetween(String value1, String value2) {
            addCriterion("t_states not between", value1, value2, "tStates");
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

        public Criteria andTIssuerIsNull() {
            addCriterion("t_issuer is null");
            return (Criteria) this;
        }

        public Criteria andTIssuerIsNotNull() {
            addCriterion("t_issuer is not null");
            return (Criteria) this;
        }

        public Criteria andTIssuerEqualTo(String value) {
            addCriterion("t_issuer =", value, "tIssuer");
            return (Criteria) this;
        }

        public Criteria andTIssuerNotEqualTo(String value) {
            addCriterion("t_issuer <>", value, "tIssuer");
            return (Criteria) this;
        }

        public Criteria andTIssuerGreaterThan(String value) {
            addCriterion("t_issuer >", value, "tIssuer");
            return (Criteria) this;
        }

        public Criteria andTIssuerGreaterThanOrEqualTo(String value) {
            addCriterion("t_issuer >=", value, "tIssuer");
            return (Criteria) this;
        }

        public Criteria andTIssuerLessThan(String value) {
            addCriterion("t_issuer <", value, "tIssuer");
            return (Criteria) this;
        }

        public Criteria andTIssuerLessThanOrEqualTo(String value) {
            addCriterion("t_issuer <=", value, "tIssuer");
            return (Criteria) this;
        }

        public Criteria andTIssuerLike(String value) {
            addCriterion("t_issuer like", value, "tIssuer");
            return (Criteria) this;
        }

        public Criteria andTIssuerNotLike(String value) {
            addCriterion("t_issuer not like", value, "tIssuer");
            return (Criteria) this;
        }

        public Criteria andTIssuerIn(List<String> values) {
            addCriterion("t_issuer in", values, "tIssuer");
            return (Criteria) this;
        }

        public Criteria andTIssuerNotIn(List<String> values) {
            addCriterion("t_issuer not in", values, "tIssuer");
            return (Criteria) this;
        }

        public Criteria andTIssuerBetween(String value1, String value2) {
            addCriterion("t_issuer between", value1, value2, "tIssuer");
            return (Criteria) this;
        }

        public Criteria andTIssuerNotBetween(String value1, String value2) {
            addCriterion("t_issuer not between", value1, value2, "tIssuer");
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

        public Criteria andTMoneyEqualTo(String value) {
            addCriterion("t_money =", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyNotEqualTo(String value) {
            addCriterion("t_money <>", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyGreaterThan(String value) {
            addCriterion("t_money >", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("t_money >=", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyLessThan(String value) {
            addCriterion("t_money <", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyLessThanOrEqualTo(String value) {
            addCriterion("t_money <=", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyLike(String value) {
            addCriterion("t_money like", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyNotLike(String value) {
            addCriterion("t_money not like", value, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyIn(List<String> values) {
            addCriterion("t_money in", values, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyNotIn(List<String> values) {
            addCriterion("t_money not in", values, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyBetween(String value1, String value2) {
            addCriterion("t_money between", value1, value2, "tMoney");
            return (Criteria) this;
        }

        public Criteria andTMoneyNotBetween(String value1, String value2) {
            addCriterion("t_money not between", value1, value2, "tMoney");
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