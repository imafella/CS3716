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
			if (studentArray[i].getNumber().equals(number)){
				count++;
			}
		}
		if (count != 0){
			student[] result = new student[studentArray.length - count];
			int j = 0;
			for (int i = 0; i < studentArray.length; i++) {

				if (!(studentArray[i].getNumber().equals(number))) {
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
	
	
	public String getLowestGPA(){
		int lowest= 0;
		for(int i =1; i<getStudents().length-1; i++){
			if(getStudents()[lowest].getGPA()> getStudents()[i].getGPA()){
				lowest= i;
			}
		}
		String student= getStudents()[lowest].getNumber();
		return student;
	}
	
	public String getHighestGPA(){
		int highest= 0;
		for(int i =1; i<getStudents().length-1; i++){
			if(getStudents()[highest].getGPA()< getStudents()[i].getGPA()){
				highest= i;
			}
		}
		String student= getStudents()[highest].getNumber();
		return student;
	}
	
	public student getStudent(int i){
		return getStudents()[i];
	}

	public String toStringStudents() {
		String output = "";
		for (int i = 0; i < studentArray.length; i++) {
			output = output + studentArray[i].getName()
					+ " - #" + studentArray[i].getNumber() + "\n";
		}
		return output;
	}
}
