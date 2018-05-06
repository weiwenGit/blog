package com.blog.bloguser.blog.pojo;

public class UserEntity {
    private static final long serialVersionUID = 1L;

    private String loginName;                                   // 用户登陆名称
    private String name;                                        // 用户姓名
    private String remarks;
    private String email;
    private String phone;

    public UserEntity(String loginName, String name, String remarks, String email, String phone) {
        this.loginName = loginName;
        this.name = name;
        this.remarks = remarks;
        this.email = email;
        this.phone = phone;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
