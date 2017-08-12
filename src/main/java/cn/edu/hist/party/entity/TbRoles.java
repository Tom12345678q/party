package cn.edu.hist.party.entity;

public class TbRoles {
    @Override
	public String toString() {
		return "TbRoles [id=" + id + ", pid=" + pid + ", departmentId=" + departmentId + ", name=" + name
				+ ", description=" + description + ", priority=" + priority + ", available=" + available + "]";
	}

	private Integer id;

    private Integer pid;

    private Integer departmentId;

    private String name;

    private String description;

    private Byte priority;

    private Boolean available;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}