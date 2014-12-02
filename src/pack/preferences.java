package pack;

public class preferences {
	int size;
	String[] skills;
	String[] date= {"", "", ""};
	String method;
	
	public preferences(){
		size= 2;
		skills= new String[] {};
		date[0]= "July"; date[1]="12"; date[2]="13";
		method= "RANDOM";
		
	}
	
	public preferences(int size){
		this.size= size;
		skills= new String[] {};
		date[0]= "July"; date[1]="12"; date[2]="13";
		method= "RANDOM";
	}
	
	public String toString(){
		String out="";
			out+= "Max Group Size: "+size;
			out+= skills;
			out+= date;
			out+= method;
		
		return out;
	}
	
	public void setSize(int i){
		size= i;
	}
	
	public int getSize(){
		return size;
	}
	
	public void addSkill(String skill){
		skills[skills.length]= skill;
		
	}
	
	public String[] getSkills(){
		return skills;
	}
	
	public void removeSkill(String skill){
		String[] temp= new String[] {};
		for(int i =0; i<getSkills().length; i++){
			if(!skill.equals(getSkills()[i])){
				temp[temp.length-1]= getSkills()[i];
			}
		}
		skills =temp;
	}
	
	public void setDate(String month, String day, String time){
		date[0]= month; date[1]= day; date[2]= time;
	}
	
	public String[] getDate(){
		return date;
	}
	
	public void setSortMethod(String meth){
		method= meth.toUpperCase();
	}
	
	public String getSortMethod(){
		return method;
	}
}
