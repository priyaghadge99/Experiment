package beans;

//Q2.	Define a structure called student that will describe the following information
//	Name
//	Div
//	%obtain
//Using studentt, declare an array marksheet with 10 elements and write a program to read the information
// about all the 10 students and print a division  wise list containing names of student with their % obtain
public class Student {

    String name;
    String div;
	float percentage;

	public Student(String name, String div, float percentage) {
		this.name = name;
		this.div = div;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
}
