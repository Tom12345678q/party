package cn.edu.hist.party.entity;

public class TbUser {
    private Integer id;

    private String name;

    private String password;

    private String salt;

    private String phone;

    private String email;

    private Integer age;

    private Integer birthday;

    private String classname;

    private String grade;

    private Integer joinpartydate;

    private Integer joinschooldate;

    private Integer joinworkdate;

    private String nation;

    private String nativeplace;

    private String jobLevel;

    private String sex;

    private Long studysecond;

    private String studytime;

    
    //学生党员的构造方法，加了一层皮
    public TbUser studentParty(
    	Integer id,
        String name,
    	String password,
        String salt,
        String phone,
    	String email,
    	Integer age,
        Integer birthday,
    	String classname,
    	String grade,
    	Integer joinpartydate,
    	Integer joinschooldate,
    	String nation,
    	String nativeplace,
    	String sex,
    	Long studysecond,
    	String studytime
    		){
    	return new TbUser(id, name, password, salt, phone, email, age,
    			birthday, classname, grade, joinpartydate, joinschooldate,
    			nation, nativeplace, sex, studysecond, studytime);
    }
    
    
    //同上，教职工党员的构造方法
    public TbUser teacherParty(Integer id, String name, String password, String salt, String phone, String email, Integer age,
			Integer birthday, Integer joinpartydate, Integer joinworkdate, String nation, String nativeplace,
			String jobLevel, String sex, Long studysecond, String studytime){
    	
    	return new TbUser(id, name, password, salt, phone, email, age,
    			birthday, joinpartydate, joinworkdate, jobLevel,
    			nation, nativeplace, sex, studysecond, studytime);
    	
    }
    
    
    public TbUser(Integer id, String name, String password, String salt, String phone, String email, Integer age,
			Integer birthday, Integer joinpartydate, Integer joinworkdate, String nation, String nativeplace,
			String jobLevel, String sex, Long studysecond, String studytime) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.salt = salt;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.birthday = birthday;
		this.joinpartydate = joinpartydate;
		this.joinworkdate = joinworkdate;
		this.nation = nation;
		this.nativeplace = nativeplace;
		this.jobLevel = jobLevel;
		this.sex = sex;
		this.studysecond = studysecond;
		this.studytime = studytime;
	}


	public TbUser(Integer id, String name, String password, String salt, String phone, String email, Integer age,
			Integer birthday, String classname, String grade, Integer joinpartydate, Integer joinschooldate,
			String nation, String nativeplace, String sex, Long studysecond, String studytime) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.salt = salt;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.birthday = birthday;
		this.classname = classname;
		this.grade = grade;
		this.joinpartydate = joinpartydate;
		this.joinschooldate = joinschooldate;
		this.nation = nation;
		this.nativeplace = nativeplace;
		this.sex = sex;
		this.studysecond = studysecond;
		this.studytime = studytime;
	}


	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Integer getJoinpartydate() {
        return joinpartydate;
    }

    public void setJoinpartydate(Integer joinpartydate) {
        this.joinpartydate = joinpartydate;
    }

    public Integer getJoinschooldate() {
        return joinschooldate;
    }

    public void setJoinschooldate(Integer joinschooldate) {
        this.joinschooldate = joinschooldate;
    }

    public Integer getJoinworkdate() {
        return joinworkdate;
    }

    public void setJoinworkdate(Integer joinworkdate) {
        this.joinworkdate = joinworkdate;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel == null ? null : jobLevel.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public TbUser() {
		super();
	}

	@Override
	public String toString() {
		return "TbUser [id=" + id + ", name=" + name + ", password=" + password + ", salt=" + salt + ", phone=" + phone
				+ ", email=" + email + ", age=" + age + ", birthday=" + birthday + ", classname=" + classname
				+ ", grade=" + grade + ", joinpartydate=" + joinpartydate + ", joinschooldate=" + joinschooldate
				+ ", joinworkdate=" + joinworkdate + ", nation=" + nation + ", nativeplace=" + nativeplace
				+ ", jobLevel=" + jobLevel + ", sex=" + sex + ", studysecond=" + studysecond + ", studytime="
				+ studytime + "]";
	}

	public Long getStudysecond() {
        return studysecond;
    }

    public void setStudysecond(Long studysecond) {
        this.studysecond = studysecond;
    }

    public String getStudytime() {
        return studytime;
    }

    public void setStudytime(String studytime) {
        this.studytime = studytime == null ? null : studytime.trim();
    }
}