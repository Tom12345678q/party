package cn.edu.hist.party.entity;

import java.util.Date;

public class TbInform {
    private Integer id;

    private Integer autherId;

    private String autherName;

    private String title;

    private String roleIdList;

    private String departmentIdList;

    private Date createtime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAutherId() {
        return autherId;
    }

    public void setAutherId(Integer autherId) {
        this.autherId = autherId;
    }

    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName == null ? null : autherName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getRoleIdList() {
        return roleIdList;
    }

    public void setRoleIdList(String roleIdList) {
        this.roleIdList = roleIdList == null ? null : roleIdList.trim();
    }

    public String getDepartmentIdList() {
        return departmentIdList;
    }

    public void setDepartmentIdList(String departmentIdList) {
        this.departmentIdList = departmentIdList == null ? null : departmentIdList.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}