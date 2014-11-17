package pack;

public class studentArray {
	student[] studentArray;

	public studentArray() {
		studentArray = new student[] {};
	}

	public studentArray(student[] x) {
		studentArray = x;
	}

	public void addStudent(student a) {
		student[] temp = new student[studentArray.length + 1];
		for (int i = 0; i < studentArray.length; i++){
			temp[i] = studentArray[i];
		}
		temp[studentArray.length] = a;
		studentArray = temp;
	}

	public void deleteStudent(String number) {
		int count = 0;
		for (int i = 0; i < studentArray.length; i++){
			if (studentArray[i].getNumber() == number){
				count++;
			}
		}
		if (count != 0){
			student[] result = new student[studentArray.length - count];
			int j = 0;
			for (int i = 0; i < studentArray.length; i++) {

				if (studentArray[i].getNumber() != number) {
					result[j] = studentArray[i];
					j++;
				}
			}
			if (result.length != studentArray.length) {
				studentArray = result;
			}
		}

	}

	public student[] getStudents() {
		return studentArray;
	}

	public String toStringStudents() {
		String output = "";
		for (int i = 0; i < studentArray.length; i++) {
			output = output + "Student Name: " + studentArray[i].getName()
					+ " Student Number: " + studentArray[i].getNumber() + "\n";
		}
		return output;
	}
}
