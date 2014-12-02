package pack;

import java.util.Random;

public class groupListing {
	studentArray[] groupListing;
	preferences prof= new preferences();
	studentArray classList;
	public groupListing(studentArray studentList,  preferences prof){
		studentArray[] temp = null;
		classList= studentList;
		this.prof= prof;
		int groups= 0;
		if(studentList.getStudents().length%prof.getSize()>0){
			 temp = new studentArray[(studentList.getStudents().length / prof.getSize()) + 2];
			 groups= (studentList.getStudents().length / prof.getSize()) + 2;
		}
		if(studentList.getStudents().length%prof.getSize()==0){
			 temp = new studentArray[(studentList.getStudents().length / prof.getSize()) + 1];
			 groups= (studentList.getStudents().length / prof.getSize()) + 1;
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
	
	public studentArray getClassList(){
		return classList;
	}
	
	public void setClassList(studentArray x){
		classList= x;
	}
	
	public void displayGroupListing(){
		for (int i = 0; i < getGroups().length; i++){
			
			if(i!=0){System.out.println("Group " + (i));}
			if(i==0){System.out.println("Unsorted Students");}
			System.out.println(groupListing[i].toStringStudents());
		}
	}
	
	public preferences getPref(){
		return prof;
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
		if(getGroups()[targetGroup].getStudents().length-1<prof.getSize()){
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
					x.setGroupNum(targetGroup);
					getGroups()[targetGroup].addStudent(x);
					
				}
			}
			
			
		}
	}
	
	
	public int findStudent(String stuNum){
		for(int i =0; i<getGroups().length; i++){
			for(int j = 0; j<getGroups()[i].getStudents().length; j++){
				if(getGroups()[i].getStudents()[j].getNumber()==stuNum){
					return getGroups()[i].getStudents()[j].getGroupNum();
				}
			}
		}
		return -1;
	}
	
	public int getMostEmpty(){
		int emptiest=1; 
		for(int i=2; i<getGroups().length; i++)
			if(getGroups()[emptiest].getStudents().length>getGroups()[i].getStudents().length){
				emptiest= i;
			}
		
		return emptiest;
	}
	
	public void clearGroups(){
		for(int i=1; i<getGroups().length; i++){
			for(int j = 0; j< getGroups()[i].getStudents().length; j++){
				getGroups()[0].addStudent(getGroups()[i].getStudents()[j]);
			}
			getGroups()[i]= new studentArray();
		}
	}
	
	public void randomSort(){
		Random rand= new Random();
			while(getGroups()[0].getStudents().length>0){
			
			int n = rand.nextInt(getGroups()[0].getStudents().length);
			String number = getGroups()[0].getStudents()[n].getNumber();
			moveStudent(number, 0, getMostEmpty());
			
			
			
		}
	}
	
	public void estiSort(){
		int i = 0;
		String student= "";
		while(getGroups()[0].getStudents().length>0){
			if(getMostEmpty()== i ){
				student= getGroups()[0].getHighestGPA();
			}
			if(getMostEmpty()!=i){
				student= getGroups()[0].getLowestGPA();
			}
				
			
			moveStudent(student, 0, getMostEmpty());
		}
	}
}
