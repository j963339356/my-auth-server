package com.auth.demo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MapRoleresourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MapRoleresourceExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("role_id like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("role_id not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(String value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(String value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(String value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(String value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(String value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLike(String value) {
            addCriterion("resource_id like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotLike(String value) {
            addCriterion("resource_id not like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<String> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<String> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(String value1, String value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(String value1, String value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andSysDelIsNull() {
            addCriterion("sys_del is null");
            return (Criteria) this;
        }

        public Criteria andSysDelIsNotNull() {
            addCriterion("sys_del is not null");
            return (Criteria) this;
        }

        public Criteria andSysDelEqualTo(Integer value) {
            addCriterion("sys_del =", value, "sysDel");
            return (Criteria) this;
        }

        public Criteria andSysDelNotEqualTo(Integer value) {
            addCriterion("sys_del <>", value, "sysDel");
            return (Criteria) this;
        }

        public Criteria andSysDelGreaterThan(Integer value) {
            addCriterion("sys_del >", value, "sysDel");
            return (Criteria) this;
        }

        public Criteria andSysDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_del >=", value, "sysDel");
            return (Criteria) this;
        }

        public Criteria andSysDelLessThan(Integer value) {
            addCriterion("sys_del <", value, "sysDel");
            return (Criteria) this;
        }

        public Criteria andSysDelLessThanOrEqualTo(Integer value) {
            addCriterion("sys_del <=", value, "sysDel");
            return (Criteria) this;
        }

        public Criteria andSysDelIn(List<Integer> values) {
            addCriterion("sys_del in", values, "sysDel");
            return (Criteria) this;
        }

        public Criteria andSysDelNotIn(List<Integer> values) {
            addCriterion("sys_del not in", values, "sysDel");
            return (Criteria) this;
        }

        public Criteria andSysDelBetween(Integer value1, Integer value2) {
            addCriterion("sys_del between", value1, value2, "sysDel");
            return (Criteria) this;
        }

        public Criteria andSysDelNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_del not between", value1, value2, "sysDel");
            return (Criteria) this;
        }

        public Criteria andSysCjrIsNull() {
            addCriterion("sys_cjr is null");
            return (Criteria) this;
        }

        public Criteria andSysCjrIsNotNull() {
            addCriterion("sys_cjr is not null");
            return (Criteria) this;
        }

        public Criteria andSysCjrEqualTo(String value) {
            addCriterion("sys_cjr =", value, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjrNotEqualTo(String value) {
            addCriterion("sys_cjr <>", value, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjrGreaterThan(String value) {
            addCriterion("sys_cjr >", value, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjrGreaterThanOrEqualTo(String value) {
            addCriterion("sys_cjr >=", value, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjrLessThan(String value) {
            addCriterion("sys_cjr <", value, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjrLessThanOrEqualTo(String value) {
            addCriterion("sys_cjr <=", value, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjrLike(String value) {
            addCriterion("sys_cjr like", value, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjrNotLike(String value) {
            addCriterion("sys_cjr not like", value, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjrIn(List<String> values) {
            addCriterion("sys_cjr in", values, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjrNotIn(List<String> values) {
            addCriterion("sys_cjr not in", values, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjrBetween(String value1, String value2) {
            addCriterion("sys_cjr between", value1, value2, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjrNotBetween(String value1, String value2) {
            addCriterion("sys_cjr not between", value1, value2, "sysCjr");
            return (Criteria) this;
        }

        public Criteria andSysCjsjIsNull() {
            addCriterion("sys_cjsj is null");
            return (Criteria) this;
        }

        public Criteria andSysCjsjIsNotNull() {
            addCriterion("sys_cjsj is not null");
            return (Criteria) this;
        }

        public Criteria andSysCjsjEqualTo(Date value) {
            addCriterion("sys_cjsj =", value, "sysCjsj");
            return (Criteria) this;
        }

        public Criteria andSysCjsjNotEqualTo(Date value) {
            addCriterion("sys_cjsj <>", value, "sysCjsj");
            return (Criteria) this;
        }

        public Criteria andSysCjsjGreaterThan(Date value) {
            addCriterion("sys_cjsj >", value, "sysCjsj");
            return (Criteria) this;
        }

        public Criteria andSysCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_cjsj >=", value, "sysCjsj");
            return (Criteria) this;
        }

        public Criteria andSysCjsjLessThan(Date value) {
            addCriterion("sys_cjsj <", value, "sysCjsj");
            return (Criteria) this;
        }

        public Criteria andSysCjsjLessThanOrEqualTo(Date value) {
            addCriterion("sys_cjsj <=", value, "sysCjsj");
            return (Criteria) this;
        }

        public Criteria andSysCjsjIn(List<Date> values) {
            addCriterion("sys_cjsj in", values, "sysCjsj");
            return (Criteria) this;
        }

        public Criteria andSysCjsjNotIn(List<Date> values) {
            addCriterion("sys_cjsj not in", values, "sysCjsj");
            return (Criteria) this;
        }

        public Criteria andSysCjsjBetween(Date value1, Date value2) {
            addCriterion("sys_cjsj between", value1, value2, "sysCjsj");
            return (Criteria) this;
        }

        public Criteria andSysCjsjNotBetween(Date value1, Date value2) {
            addCriterion("sys_cjsj not between", value1, value2, "sysCjsj");
            return (Criteria) this;
        }

        public Criteria andSysXgrIsNull() {
            addCriterion("sys_xgr is null");
            return (Criteria) this;
        }

        public Criteria andSysXgrIsNotNull() {
            addCriterion("sys_xgr is not null");
            return (Criteria) this;
        }

        public Criteria andSysXgrEqualTo(String value) {
            addCriterion("sys_xgr =", value, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgrNotEqualTo(String value) {
            addCriterion("sys_xgr <>", value, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgrGreaterThan(String value) {
            addCriterion("sys_xgr >", value, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgrGreaterThanOrEqualTo(String value) {
            addCriterion("sys_xgr >=", value, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgrLessThan(String value) {
            addCriterion("sys_xgr <", value, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgrLessThanOrEqualTo(String value) {
            addCriterion("sys_xgr <=", value, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgrLike(String value) {
            addCriterion("sys_xgr like", value, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgrNotLike(String value) {
            addCriterion("sys_xgr not like", value, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgrIn(List<String> values) {
            addCriterion("sys_xgr in", values, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgrNotIn(List<String> values) {
            addCriterion("sys_xgr not in", values, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgrBetween(String value1, String value2) {
            addCriterion("sys_xgr between", value1, value2, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgrNotBetween(String value1, String value2) {
            addCriterion("sys_xgr not between", value1, value2, "sysXgr");
            return (Criteria) this;
        }

        public Criteria andSysXgsjIsNull() {
            addCriterion("sys_xgsj is null");
            return (Criteria) this;
        }

        public Criteria andSysXgsjIsNotNull() {
            addCriterion("sys_xgsj is not null");
            return (Criteria) this;
        }

        public Criteria andSysXgsjEqualTo(Date value) {
            addCriterion("sys_xgsj =", value, "sysXgsj");
            return (Criteria) this;
        }

        public Criteria andSysXgsjNotEqualTo(Date value) {
            addCriterion("sys_xgsj <>", value, "sysXgsj");
            return (Criteria) this;
        }

        public Criteria andSysXgsjGreaterThan(Date value) {
            addCriterion("sys_xgsj >", value, "sysXgsj");
            return (Criteria) this;
        }

        public Criteria andSysXgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_xgsj >=", value, "sysXgsj");
            return (Criteria) this;
        }

        public Criteria andSysXgsjLessThan(Date value) {
            addCriterion("sys_xgsj <", value, "sysXgsj");
            return (Criteria) this;
        }

        public Criteria andSysXgsjLessThanOrEqualTo(Date value) {
            addCriterion("sys_xgsj <=", value, "sysXgsj");
            return (Criteria) this;
        }

        public Criteria andSysXgsjIn(List<Date> values) {
            addCriterion("sys_xgsj in", values, "sysXgsj");
            return (Criteria) this;
        }

        public Criteria andSysXgsjNotIn(List<Date> values) {
            addCriterion("sys_xgsj not in", values, "sysXgsj");
            return (Criteria) this;
        }

        public Criteria andSysXgsjBetween(Date value1, Date value2) {
            addCriterion("sys_xgsj between", value1, value2, "sysXgsj");
            return (Criteria) this;
        }

        public Criteria andSysXgsjNotBetween(Date value1, Date value2) {
            addCriterion("sys_xgsj not between", value1, value2, "sysXgsj");
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