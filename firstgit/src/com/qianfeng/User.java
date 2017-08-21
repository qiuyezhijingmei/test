package com.qianfeng;

/**

 * @ClassName:     User.java

 * @author          李亚明

 * @Date           2017年8月21日 下午5:03:20 

 */

public class User {
private int id;
private String name;
private String sex;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
	return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
}
public User(int id, String name, String sex, int age) {
	super();
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.age = age;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
};

}
