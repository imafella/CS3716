package pack;
public class groupListing {
	studentArray[] groupListing;
	int maxGsize;
	public groupListing(studentArray studentList, int maxGsize){
		studentArray[] temp = null;
		this.maxGsize= maxGsize;
		int groups= 0;
		if(studentList.getStudents().length%maxGsize>0){
			 temp = new studentArray[(studentList.getStudents().length / maxGsize) + 2];
			 groups= (studentList.getStudents().length / maxGsize) + 2;
		}
		if(studentList.getStudents().length%maxGsize==0){
			 temp = new studentArray[(studentList.getStudents().length / maxGsize) + 1];
			 groups= (studentList.getStudents().length / maxGsize) + 1;
		}
		
		for (int i = 0; i < groups; i++){
			studentArray groupI = new studentArray();
			temp[i] = groupI;
		}
		temp[0]= studentList;
		groupListing = temp;
	}
	
	public studentArray[] getGroups(){
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
	
	public boolean checkStudent(String Number, int initialGroup){
		int size= getGroups()[initialGroup].getStudents().length;
		student[] initial =getGroups()[initialGroup].getStudents();
		for(int i=0; i<size; i++){
			if(initial[i].getNumber()== Number){
				return true;
			}
		}
		
		return false;
	}
	
	public boolean sizeCheck(int targetGroup){
		if(getGroups()[targetGroup].getStudents().length-1<getMaxGsize()){
			return true;
		}
		
		return false;
	}
	
	public void moveStudent(String number, int initialGroup, int targetGroup){
		if(checkStudent(number, initialGroup)&&(sizeCheck(targetGroup))){
			int size= getGroups()[initialGroup].getStudents().length;
			student x;
			student[] initial =getGroups()[initialGroup].getStudents();
			for(int i=0; i<size; i++){
				if(initial[i].getNumber()== number){
					x= getGroups()[initialGroup].getStudents()[i];
					getGroups()[initialGroup].deleteStudent(number);
					getGroups()[targetGroup].addStudent(x);
				}
			}
			
			
		}
	}
	
	public void randomSort(){
		while(getGroups()[0].getStudents().length>0){
			
		}
	}
}
