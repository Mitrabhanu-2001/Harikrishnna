package p9;

public class Voter {
	int age;
	String name;
	public void setAge(int age)throws IllegalArgumentException{
		if(age<18 || age>108)
			throw new IllegalArgumentException("you are not able to give vote");
		this.age=age;
		}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name=name;
		}
	public String getName() {
		return this.name;
	}

}
