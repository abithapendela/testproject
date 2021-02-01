package democollection;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList <Student> stlist = new ArrayList<Student>();
		
		Student st = new Student();
		st.setName("abitha");
		st.setRegdno("1282");
		st.setBranch("it");
		stlist.add(st);
		
		Student st2 = new Student();
		st2.setName("akhil");
		st2.setRegdno("1283");
		st2.setBranch("IT");
		stlist.add(st2);
		
		System.out.println(stlist.size());
		for(int i = 0;i < stlist.size();i++) {
			Student st3 = stlist.get(i);
			System.out.println(st3.getName());
		}
	}
}
