package com.dario.car.server.domain.mybatis.domain;

import javax.persistence.Id;
import java.util.Date;

public class Employees {
    /**
     * 员工编号
     */
    @Id
    private Integer epid;

    /**
     * 员工名字
     */
    private String epname;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 员工岗位
     */
    private String jobs;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 录用时间
     */
    private Date employdate;

    /**
     * 状态（1在职、0离职）
     */
    private Integer status;

    /**
     * 角色（0：普通员工1-管理员）后期代码补上
     */
    private Integer roles;

    /**
     * 获取员工编号
     *
     * @return epid - 员工编号
     */
    public Integer getEpid() {
        return epid;
    }

    /**
     * 设置员工编号
     *
     * @param epid 员工编号
     */
    public void setEpid(Integer epid) {
        this.epid = epid;
    }

    /**
     * 获取员工名字
     *
     * @return epname - 员工名字
     */
    public String getEpname() {
        return epname;
    }

    /**
     * 设置员工名字
     *
     * @param epname 员工名字
     */
    public void setEpname(String epname) {
        this.epname = epname;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取员工岗位
     *
     * @return jobs - 员工岗位
     */
    public String getJobs() {
        return jobs;
    }

    /**
     * 设置员工岗位
     *
     * @param jobs 员工岗位
     */
    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    /**
     * 获取电话
     *
     * @return telephone - 电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置电话
     *
     * @param telephone 电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取录用时间
     *
     * @return employdate - 录用时间
     */
    public Date getEmploydate() {
        return employdate;
    }

    /**
     * 设置录用时间
     *
     * @param employdate 录用时间
     */
    public void setEmploydate(Date employdate) {
        this.employdate = employdate;
    }

    /**
     * 获取状态（1在职、0离职）
     *
     * @return status - 状态（1在职、0离职）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（1在职、0离职）
     *
     * @param status 状态（1在职、0离职）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取角色（0：普通员工1-管理员）后期代码补上
     *
     * @return roles - 角色（0：普通员工1-管理员）后期代码补上
     */
    public Integer getRoles() {
        return roles;
    }

    /**
     * 设置角色（0：普通员工1-管理员）后期代码补上
     *
     * @param roles 角色（0：普通员工1-管理员）后期代码补上
     */
    public void setRoles(Integer roles) {
        this.roles = roles;
    }
}