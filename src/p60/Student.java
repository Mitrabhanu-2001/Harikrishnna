//Develope a student class sname,sno,course,fee,values
//and getting values after object creation.when student object is diplayy its start must be display
package p60;

public class Student {
	int sNo;
	String sName;
	String courseName;
	double fees;
	public String toString() {
		return sNo+" "+sName+" "+courseName+fees;
	}
	void setsNo(int sNo) {
		this.sNo=sNo;
	}
	int getsNo() {
		return sNo;
	}
	void setsNmae(String sName) {
		 this.sName=sName;
	}
	String getsName() {
		return sName;
	}
	void setCourseName( String courseName) {
		this.courseName=courseName;
	}
	String getcourseName() {
		return courseName;
	}






    public static void main(String[]args) {
    	Student s1=new Student();
    	s1.setsNo(101);
    	s1.setsNmae("Mitrabhanu");
    	s1.setCourseName("java by harikrishna");
    	
    	
    	int no=s1.getsNo();
    	String name=s1.getsName();
    	String course=s1.getcourseName();
    	
    	
    	System.out.println(no+" "+name+" "+course);
    	
    }
}
