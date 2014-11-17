package pack;

public class run{
	
	public static void main(String[] args){
		studentArray classList = new studentArray();
		student a = new student("Jim", "01");
		classList.addStudent(a);
		student b = new student("Janet", "02");
		classList.addStudent(b);
		student c = new student("Jocelyn", "03");
		classList.addStudent(c);
		student d = new student("Jackie", "04");
		classList.addStudent(d);
		student e = new student("John", "05");
		classList.addStudent(e);
		student f = new student("Jason", "06");
		classList.addStudent(f);
		student g = new student("Jordon", "07");
		classList.addStudent(g);
		student h = new student("Jon", "08");
		classList.addStudent(h);
		student i = new student("Jonathan", "09");
		classList.addStudent(i);
		student j = new student("Johnny", "10");
		classList.addStudent(j);
		student k = new student("Jacob", "11");
		classList.addStudent(k);
		student l = new student("Julia", "12");
		classList.addStudent(l);
		student m = new student("Jackson", "13");
		classList.addStudent(m);
		student n = new student("Jimbo", "14");
		classList.addStudent(n);
		student o = new student("Jack", "15");
		classList.addStudent(o);
		student p = new student("Jake", "16");
		classList.addStudent(p);
		student q = new student("Jillian", "17");
		classList.addStudent(q);
		student r = new student("Julian", "18");
		classList.addStudent(r);
		student s = new student("Jezzabelle", "19");
		classList.addStudent(s);
		student t = new student("Jesus", "20");
		classList.addStudent(t);
		
		String potato = classList.toStringStudents();
		System.out.println(potato);
		System.out.println("test");
	}
}
