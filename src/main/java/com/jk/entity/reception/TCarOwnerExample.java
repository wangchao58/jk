package com.jk.entity.reception;

import java.util.ArrayList;
import java.util.List;

public class TCarOwnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCarOwnerExample() {
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

        public Criteria andTLinkmanIsNull() {
            addCriterion("t_linkman is null");
            return (Criteria) this;
        }

        public Criteria andTLinkmanIsNotNull() {
            addCriterion("t_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andTLinkmanEqualTo(String value) {
            addCriterion("t_linkman =", value, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTLinkmanNotEqualTo(String value) {
            addCriterion("t_linkman <>", value, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTLinkmanGreaterThan(String value) {
            addCriterion("t_linkman >", value, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("t_linkman >=", value, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTLinkmanLessThan(String value) {
            addCriterion("t_linkman <", value, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTLinkmanLessThanOrEqualTo(String value) {
            addCriterion("t_linkman <=", value, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTLinkmanLike(String value) {
            addCriterion("t_linkman like", value, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTLinkmanNotLike(String value) {
            addCriterion("t_linkman not like", value, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTLinkmanIn(List<String> values) {
            addCriterion("t_linkman in", values, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTLinkmanNotIn(List<String> values) {
            addCriterion("t_linkman not in", values, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTLinkmanBetween(String value1, String value2) {
            addCriterion("t_linkman between", value1, value2, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTLinkmanNotBetween(String value1, String value2) {
            addCriterion("t_linkman not between", value1, value2, "tLinkman");
            return (Criteria) this;
        }

        public Criteria andTSexIsNull() {
            addCriterion("t_sex is null");
            return (Criteria) this;
        }

        public Criteria andTSexIsNotNull() {
            addCriterion("t_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTSexEqualTo(String value) {
            addCriterion("t_sex =", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotEqualTo(String value) {
            addCriterion("t_sex <>", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThan(String value) {
            addCriterion("t_sex >", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThanOrEqualTo(String value) {
            addCriterion("t_sex >=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThan(String value) {
            addCriterion("t_sex <", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThanOrEqualTo(String value) {
            addCriterion("t_sex <=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLike(String value) {
            addCriterion("t_sex like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotLike(String value) {
            addCriterion("t_sex not like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexIn(List<String> values) {
            addCriterion("t_sex in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotIn(List<String> values) {
            addCriterion("t_sex not in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexBetween(String value1, String value2) {
            addCriterion("t_sex between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotBetween(String value1, String value2) {
            addCriterion("t_sex not between", value1, value2, "tSex");
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

        public Criteria andTIdNumberIsNull() {
            addCriterion("t_id_number is null");
            return (Criteria) this;
        }

        public Criteria andTIdNumberIsNotNull() {
            addCriterion("t_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andTIdNumberEqualTo(String value) {
            addCriterion("t_id_number =", value, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTIdNumberNotEqualTo(String value) {
            addCriterion("t_id_number <>", value, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTIdNumberGreaterThan(String value) {
            addCriterion("t_id_number >", value, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("t_id_number >=", value, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTIdNumberLessThan(String value) {
            addCriterion("t_id_number <", value, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTIdNumberLessThanOrEqualTo(String value) {
            addCriterion("t_id_number <=", value, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTIdNumberLike(String value) {
            addCriterion("t_id_number like", value, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTIdNumberNotLike(String value) {
            addCriterion("t_id_number not like", value, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTIdNumberIn(List<String> values) {
            addCriterion("t_id_number in", values, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTIdNumberNotIn(List<String> values) {
            addCriterion("t_id_number not in", values, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTIdNumberBetween(String value1, String value2) {
            addCriterion("t_id_number between", value1, value2, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTIdNumberNotBetween(String value1, String value2) {
            addCriterion("t_id_number not between", value1, value2, "tIdNumber");
            return (Criteria) this;
        }

        public Criteria andTPointIsNull() {
            addCriterion("t_point is null");
            return (Criteria) this;
        }

        public Criteria andTPointIsNotNull() {
            addCriterion("t_point is not null");
            return (Criteria) this;
        }

        public Criteria andTPointEqualTo(String value) {
            addCriterion("t_point =", value, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTPointNotEqualTo(String value) {
            addCriterion("t_point <>", value, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTPointGreaterThan(String value) {
            addCriterion("t_point >", value, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTPointGreaterThanOrEqualTo(String value) {
            addCriterion("t_point >=", value, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTPointLessThan(String value) {
            addCriterion("t_point <", value, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTPointLessThanOrEqualTo(String value) {
            addCriterion("t_point <=", value, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTPointLike(String value) {
            addCriterion("t_point like", value, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTPointNotLike(String value) {
            addCriterion("t_point not like", value, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTPointIn(List<String> values) {
            addCriterion("t_point in", values, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTPointNotIn(List<String> values) {
            addCriterion("t_point not in", values, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTPointBetween(String value1, String value2) {
            addCriterion("t_point between", value1, value2, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTPointNotBetween(String value1, String value2) {
            addCriterion("t_point not between", value1, value2, "tPoint");
            return (Criteria) this;
        }

        public Criteria andTDestinationIsNull() {
            addCriterion("t_destination is null");
            return (Criteria) this;
        }

        public Criteria andTDestinationIsNotNull() {
            addCriterion("t_destination is not null");
            return (Criteria) this;
        }

        public Criteria andTDestinationEqualTo(String value) {
            addCriterion("t_destination =", value, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTDestinationNotEqualTo(String value) {
            addCriterion("t_destination <>", value, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTDestinationGreaterThan(String value) {
            addCriterion("t_destination >", value, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("t_destination >=", value, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTDestinationLessThan(String value) {
            addCriterion("t_destination <", value, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTDestinationLessThanOrEqualTo(String value) {
            addCriterion("t_destination <=", value, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTDestinationLike(String value) {
            addCriterion("t_destination like", value, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTDestinationNotLike(String value) {
            addCriterion("t_destination not like", value, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTDestinationIn(List<String> values) {
            addCriterion("t_destination in", values, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTDestinationNotIn(List<String> values) {
            addCriterion("t_destination not in", values, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTDestinationBetween(String value1, String value2) {
            addCriterion("t_destination between", value1, value2, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTDestinationNotBetween(String value1, String value2) {
            addCriterion("t_destination not between", value1, value2, "tDestination");
            return (Criteria) this;
        }

        public Criteria andTWayIsNull() {
            addCriterion("t_way is null");
            return (Criteria) this;
        }

        public Criteria andTWayIsNotNull() {
            addCriterion("t_way is not null");
            return (Criteria) this;
        }

        public Criteria andTWayEqualTo(String value) {
            addCriterion("t_way =", value, "tWay");
            return (Criteria) this;
        }

        public Criteria andTWayNotEqualTo(String value) {
            addCriterion("t_way <>", value, "tWay");
            return (Criteria) this;
        }

        public Criteria andTWayGreaterThan(String value) {
            addCriterion("t_way >", value, "tWay");
            return (Criteria) this;
        }

        public Criteria andTWayGreaterThanOrEqualTo(String value) {
            addCriterion("t_way >=", value, "tWay");
            return (Criteria) this;
        }

        public Criteria andTWayLessThan(String value) {
            addCriterion("t_way <", value, "tWay");
            return (Criteria) this;
        }

        public Criteria andTWayLessThanOrEqualTo(String value) {
            addCriterion("t_way <=", value, "tWay");
            return (Criteria) this;
        }

        public Criteria andTWayLike(String value) {
            addCriterion("t_way like", value, "tWay");
            return (Criteria) this;
        }

        public Criteria andTWayNotLike(String value) {
            addCriterion("t_way not like", value, "tWay");
            return (Criteria) this;
        }

        public Criteria andTWayIn(List<String> values) {
            addCriterion("t_way in", values, "tWay");
            return (Criteria) this;
        }

        public Criteria andTWayNotIn(List<String> values) {
            addCriterion("t_way not in", values, "tWay");
            return (Criteria) this;
        }

        public Criteria andTWayBetween(String value1, String value2) {
            addCriterion("t_way between", value1, value2, "tWay");
            return (Criteria) this;
        }

        public Criteria andTWayNotBetween(String value1, String value2) {
            addCriterion("t_way not between", value1, value2, "tWay");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatIsNull() {
            addCriterion("t_vacant_seat is null");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatIsNotNull() {
            addCriterion("t_vacant_seat is not null");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatEqualTo(String value) {
            addCriterion("t_vacant_seat =", value, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatNotEqualTo(String value) {
            addCriterion("t_vacant_seat <>", value, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatGreaterThan(String value) {
            addCriterion("t_vacant_seat >", value, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatGreaterThanOrEqualTo(String value) {
            addCriterion("t_vacant_seat >=", value, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatLessThan(String value) {
            addCriterion("t_vacant_seat <", value, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatLessThanOrEqualTo(String value) {
            addCriterion("t_vacant_seat <=", value, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatLike(String value) {
            addCriterion("t_vacant_seat like", value, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatNotLike(String value) {
            addCriterion("t_vacant_seat not like", value, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatIn(List<String> values) {
            addCriterion("t_vacant_seat in", values, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatNotIn(List<String> values) {
            addCriterion("t_vacant_seat not in", values, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatBetween(String value1, String value2) {
            addCriterion("t_vacant_seat between", value1, value2, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTVacantSeatNotBetween(String value1, String value2) {
            addCriterion("t_vacant_seat not between", value1, value2, "tVacantSeat");
            return (Criteria) this;
        }

        public Criteria andTCarTypeIsNull() {
            addCriterion("t_car_type is null");
            return (Criteria) this;
        }

        public Criteria andTCarTypeIsNotNull() {
            addCriterion("t_car_type is not null");
            return (Criteria) this;
        }

        public Criteria andTCarTypeEqualTo(String value) {
            addCriterion("t_car_type =", value, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTCarTypeNotEqualTo(String value) {
            addCriterion("t_car_type <>", value, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTCarTypeGreaterThan(String value) {
            addCriterion("t_car_type >", value, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("t_car_type >=", value, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTCarTypeLessThan(String value) {
            addCriterion("t_car_type <", value, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTCarTypeLessThanOrEqualTo(String value) {
            addCriterion("t_car_type <=", value, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTCarTypeLike(String value) {
            addCriterion("t_car_type like", value, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTCarTypeNotLike(String value) {
            addCriterion("t_car_type not like", value, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTCarTypeIn(List<String> values) {
            addCriterion("t_car_type in", values, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTCarTypeNotIn(List<String> values) {
            addCriterion("t_car_type not in", values, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTCarTypeBetween(String value1, String value2) {
            addCriterion("t_car_type between", value1, value2, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTCarTypeNotBetween(String value1, String value2) {
            addCriterion("t_car_type not between", value1, value2, "tCarType");
            return (Criteria) this;
        }

        public Criteria andTFareIsNull() {
            addCriterion("t_fare is null");
            return (Criteria) this;
        }

        public Criteria andTFareIsNotNull() {
            addCriterion("t_fare is not null");
            return (Criteria) this;
        }

        public Criteria andTFareEqualTo(String value) {
            addCriterion("t_fare =", value, "tFare");
            return (Criteria) this;
        }

        public Criteria andTFareNotEqualTo(String value) {
            addCriterion("t_fare <>", value, "tFare");
            return (Criteria) this;
        }

        public Criteria andTFareGreaterThan(String value) {
            addCriterion("t_fare >", value, "tFare");
            return (Criteria) this;
        }

        public Criteria andTFareGreaterThanOrEqualTo(String value) {
            addCriterion("t_fare >=", value, "tFare");
            return (Criteria) this;
        }

        public Criteria andTFareLessThan(String value) {
            addCriterion("t_fare <", value, "tFare");
            return (Criteria) this;
        }

        public Criteria andTFareLessThanOrEqualTo(String value) {
            addCriterion("t_fare <=", value, "tFare");
            return (Criteria) this;
        }

        public Criteria andTFareLike(String value) {
            addCriterion("t_fare like", value, "tFare");
            return (Criteria) this;
        }

        public Criteria andTFareNotLike(String value) {
            addCriterion("t_fare not like", value, "tFare");
            return (Criteria) this;
        }

        public Criteria andTFareIn(List<String> values) {
            addCriterion("t_fare in", values, "tFare");
            return (Criteria) this;
        }

        public Criteria andTFareNotIn(List<String> values) {
            addCriterion("t_fare not in", values, "tFare");
            return (Criteria) this;
        }

        public Criteria andTFareBetween(String value1, String value2) {
            addCriterion("t_fare between", value1, value2, "tFare");
            return (Criteria) this;
        }

        public Criteria andTFareNotBetween(String value1, String value2) {
            addCriterion("t_fare not between", value1, value2, "tFare");
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