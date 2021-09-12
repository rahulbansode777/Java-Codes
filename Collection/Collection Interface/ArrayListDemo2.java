
import java.util.*;

class ITCompany {

	String cname = null;
	int empCnt = 0;
	ITCompany(String cname, int empCnt) {

		this.cname = cname;
		this.empCnt = empCnt;		
	}

	void info() {

		System.out.println("Company Name = " + cname + " "+ "EmpCnt = " +empCnt);
	}
}

class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(new ITCompany("Biencaps",25));
		al.add(new ITCompany("Bitwise",250));
		al.add(new ITCompany("Apple",5000));
		al.add(new ITCompany("Microsoft",7000));

		System.out.println(al);

		ListIterator litr = al.listIterator();

		while(litr.hasNext()) {

			ITCompany obj = (ITCompany)litr.next();
			obj.info();
		}
	}
}