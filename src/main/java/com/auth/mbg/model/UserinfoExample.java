package com.auth.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andProfileIsNull() {
            addCriterion("profile is null");
            return (Criteria) this;
        }

        public Criteria andProfileIsNotNull() {
            addCriterion("profile is not null");
            return (Criteria) this;
        }

        public Criteria andProfileEqualTo(String value) {
            addCriterion("profile =", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotEqualTo(String value) {
            addCriterion("profile <>", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThan(String value) {
            addCriterion("profile >", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThanOrEqualTo(String value) {
            addCriterion("profile >=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThan(String value) {
            addCriterion("profile <", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThanOrEqualTo(String value) {
            addCriterion("profile <=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLike(String value) {
            addCriterion("profile like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotLike(String value) {
            addCriterion("profile not like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileIn(List<String> values) {
            addCriterion("profile in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotIn(List<String> values) {
            addCriterion("profile not in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileBetween(String value1, String value2) {
            addCriterion("profile between", value1, value2, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotBetween(String value1, String value2) {
            addCriterion("profile not between", value1, value2, "profile");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("isactive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isactive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(Integer value) {
            addCriterion("isactive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(Integer value) {
            addCriterion("isactive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(Integer value) {
            addCriterion("isactive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isactive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(Integer value) {
            addCriterion("isactive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(Integer value) {
            addCriterion("isactive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<Integer> values) {
            addCriterion("isactive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<Integer> values) {
            addCriterion("isactive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(Integer value1, Integer value2) {
            addCriterion("isactive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(Integer value1, Integer value2) {
            addCriterion("isactive not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andExpirydateIsNull() {
            addCriterion("expirydate is null");
            return (Criteria) this;
        }

        public Criteria andExpirydateIsNotNull() {
            addCriterion("expirydate is not null");
            return (Criteria) this;
        }

        public Criteria andExpirydateEqualTo(Date value) {
            addCriterion("expirydate =", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotEqualTo(Date value) {
            addCriterion("expirydate <>", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateGreaterThan(Date value) {
            addCriterion("expirydate >", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateGreaterThanOrEqualTo(Date value) {
            addCriterion("expirydate >=", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateLessThan(Date value) {
            addCriterion("expirydate <", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateLessThanOrEqualTo(Date value) {
            addCriterion("expirydate <=", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateIn(List<Date> values) {
            addCriterion("expirydate in", values, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotIn(List<Date> values) {
            addCriterion("expirydate not in", values, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateBetween(Date value1, Date value2) {
            addCriterion("expirydate between", value1, value2, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotBetween(Date value1, Date value2) {
            addCriterion("expirydate not between", value1, value2, "expirydate");
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