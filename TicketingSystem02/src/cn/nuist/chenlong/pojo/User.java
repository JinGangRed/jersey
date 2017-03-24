package cn.nuist.chenlong.pojo;

public class User {
	private String name;
	private String address;
	private String sex;
	private int age;
	public User() {
		super();
	}
	public User(String name, String address, String sex, int age) {
		super();
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "<User><name>" + name + "</name><address>" + address + "</address><sex>" + sex + "</sex><age>" + age + "</age></User>";
	}
	
}
