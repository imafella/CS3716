package pack;
public class groupListing {
	studentArray[] groupListing;
	int maxGsize;
	public groupListing(studentArray studentList, int maxGsize){
		studentArray[] temp = new studentArray[studentList.getStudents().length / maxGsize];
		this.maxGsize = maxGsize;
		int j = 0;
		for (int i = 0; i < studentList.getStudents().length / maxGsize; i++){
			studentArray groupI = new studentArray();
			while (groupI.getStudents().length < maxGsize){
				student s = studentList.getStudents()[j];
				groupI.addStudent(s);
				j++;
			}
			temp[i] = groupI;
		}
		groupListing = temp;
	}
	
	public studentArray[] getGroupListing(){
		return groupListing;
	}
	
	public int getMaxGsize(){
		return maxGsize;
	}
	
	public void displayGroupListing(){
		for (int i = 0; i < groupListing.length; i++){
			System.out.println("Group " + (i + 1));
			System.out.println(groupListing[i].toStringStudents());
		}
	}
}
