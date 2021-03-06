package com.gec.djexam.domain;

import java.util.ArrayList;
import java.util.List;

public class ExamRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamRoomExample() {
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

        public Criteria andExamRoomNumIsNull() {
            addCriterion("exam_room_num is null");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumIsNotNull() {
            addCriterion("exam_room_num is not null");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumEqualTo(String value) {
            addCriterion("exam_room_num =", value, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumNotEqualTo(String value) {
            addCriterion("exam_room_num <>", value, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumGreaterThan(String value) {
            addCriterion("exam_room_num >", value, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumGreaterThanOrEqualTo(String value) {
            addCriterion("exam_room_num >=", value, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumLessThan(String value) {
            addCriterion("exam_room_num <", value, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumLessThanOrEqualTo(String value) {
            addCriterion("exam_room_num <=", value, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumLike(String value) {
            addCriterion("exam_room_num like", value, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumNotLike(String value) {
            addCriterion("exam_room_num not like", value, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumIn(List<String> values) {
            addCriterion("exam_room_num in", values, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumNotIn(List<String> values) {
            addCriterion("exam_room_num not in", values, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumBetween(String value1, String value2) {
            addCriterion("exam_room_num between", value1, value2, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomNumNotBetween(String value1, String value2) {
            addCriterion("exam_room_num not between", value1, value2, "examRoomNum");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceIsNull() {
            addCriterion("exam_room_place is null");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceIsNotNull() {
            addCriterion("exam_room_place is not null");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceEqualTo(String value) {
            addCriterion("exam_room_place =", value, "examRoomPlace");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceNotEqualTo(String value) {
            addCriterion("exam_room_place <>", value, "examRoomPlace");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceGreaterThan(String value) {
            addCriterion("exam_room_place >", value, "examRoomPlace");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("exam_room_place >=", value, "examRoomPlace");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceLessThan(String value) {
            addCriterion("exam_room_place <", value, "examRoomPlace");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceLessThanOrEqualTo(String value) {
            addCriterion("exam_room_place <=", value, "examRoomPlace");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceLike(String value) {
            addCriterion("exam_room_place like", value, "examRoomPlace");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceNotLike(String value) {
            addCriterion("exam_room_place not like", value, "examRoomPlace");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceIn(List<String> values) {
            addCriterion("exam_room_place in", values, "examRoomPlace");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceNotIn(List<String> values) {
            addCriterion("exam_room_place not in", values, "examRoomPlace");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceBetween(String value1, String value2) {
            addCriterion("exam_room_place between", value1, value2, "examRoomPlace");
            return (Criteria) this;
        }

        public Criteria andExamRoomPlaceNotBetween(String value1, String value2) {
            addCriterion("exam_room_place not between", value1, value2, "examRoomPlace");
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