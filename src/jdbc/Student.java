package jdbc;

public class Student {
	private String id,name,sex,birthday,className;
	private int age;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String id, String name, String sex, String birthday, String className, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.className = className;
		this.age = age;
	}

}
