package pack;



public class run{
	
	public static void main(String[] args) {
		
		preferences fiech= new preferences();
		
		studentArray classList = new studentArray();
		String[][] grades = {{"1710", "3.5"},{"2710", "2.1"}, {"2711", "4.0"}};
		student a = new student("Jim", "001");	
		a.setGrades(grades);
		
		classList.addStudent(a);
		
		grades[0][1]="1.1"; grades[1][1]="3.4"; grades[2][1]="4.0";
		student b = new student("Janet", "02");
		b.setGrades(grades);
		classList.addStudent(b);
		
	
		
		
		grades[0][1]="3.6"; grades[1][1]="4.0"; grades[2][1]="1.4";
		student c = new student("Jocelyn", "03");
		c.setGrades(grades);
		classList.addStudent(c);
		
		grades[0][1]="2.0"; grades[1][1]="1.4"; grades[2][1]="1.8";
		student d = new student("Jackie", "04");
		d.setGrades(grades);
		classList.addStudent(d);
		
		grades[0][1]="3.1"; grades[1][1]="1.9"; grades[2][1]="2.7";
		student e = new student("John", "05");
		e.setGrades(grades);
		classList.addStudent(e);
		
		grades[0][1]="2.6"; grades[1][1]="1.6"; grades[2][1]="0.5";
		student f = new student("Jason", "06");
		f.setGrades(grades);
		classList.addStudent(f);
		
		grades[0][1]="4.0"; grades[1][1]="4.0"; grades[2][1]="3.9";
		student g = new student("Jordon", "07" );
		g.setGrades(grades);
		classList.addStudent(g);
		
		grades[0][1]="3.3"; grades[1][1]="3.1"; grades[2][1]="2.8";
		student h = new student("Jon", "08" );
		h.setGrades(grades);
		classList.addStudent(h);
		
		grades[0][1]="1.9"; grades[1][1]="2.1"; grades[2][1]="2.0";
		student i = new student("Jonathan", "09");
		i.setGrades(grades);
		classList.addStudent(i);
		
		grades[0][1]="2.5"; grades[1][1]="2.7"; grades[2][1]="1.5";
		student j = new student("Johnny", "10" );
		j.setGrades(grades);
		classList.addStudent(j);
		
		grades[0][1]="1.1"; grades[1][1]="1.2"; grades[2][1]="1.1";
		student k = new student("Jacob", "11" );
		k.setGrades(grades);
		classList.addStudent(k);
		
		grades[0][1]="3.5"; grades[1][1]="3.4"; grades[2][1]="2.7";
		student l = new student("Julia", "12" );
		l.setGrades(grades);
		classList.addStudent(l);
		
		grades[0][1]="3.7"; grades[1][1]="3.8"; grades[2][1]="3.5";
		student m = new student("Jackson", "13" );
		classList.addStudent(m);
		
		grades[0][1]="2.4"; grades[1][1]="3.4"; grades[2][1]="4.0";
		student n = new student("Jimbo", "14" );
		n.setGrades(grades);
		classList.addStudent(n);
		
		grades[0][1]="4.0"; grades[1][1]="3.9"; grades[2][1]="4.0";
		student o = new student("Jack", "15" );
		o.setGrades(grades);
		classList.addStudent(o);
		
		grades[0][1]="4.0"; grades[1][1]="4.0"; grades[2][1]="4.0";
		student p = new student("Jesus", "16" );
		p.setGrades(grades);
		classList.addStudent(p);
		
		grades[0][1]="2.0"; grades[1][1]="1.4"; grades[2][1]="1.5";
		student q = new student("Jillian", "17" );
		classList.addStudent(q);
		
		grades[0][1]="3.0"; grades[1][1]="3.0"; grades[2][1]="3.0";
		student r = new student("Julian", "18" );
		r.setGrades(grades);
		classList.addStudent(r);
	
		grades[0][1]="1.0"; grades[1][1]="2.0"; grades[2][1]="1.0";
		student s = new student("Bob", "68" );
		s.setGrades(grades);
		classList.addStudent(s);
		
		System.out.println(classList.getHighestGPA());
		
		
		

		
	}
	
}
