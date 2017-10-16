package cn.edu.hist.party.entity.enums;

/**
 * 这是一个用来描述党员内部等级(层级)的枚举类
 * @author 丁赵雷
 *
 */
public enum Hierarchy {
	
	/**
	 * 
	 */
	
	ORGANIZATION_DEPARTMENT("组织部" , 1),
	PARTY_SECRETARY("党委书记" , 2),
	BRANCH_SECRETARY("党支部书记" , 3),
	PARTY_MEMBER("党员" , 4),
	ACTIVIST("积极分子" , 5);
	
	

	private final String name;//职称
	private final Integer level;//等级 值越小等级越高
	
	private Hierarchy(String name ,Integer level){
		this.name = name;
		this.level = level;
	}
	
	public String getName() {
		return name;
	}

	public Integer getLevel() {
		return level;
	}


}
