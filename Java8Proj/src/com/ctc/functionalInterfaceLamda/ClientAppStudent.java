package com.ctc.functionalInterfaceLamda;

import java.util.ArrayList;
import java.util.List;

public class ClientAppStudent {
	public static void main(String[] args) {
		List<Student> arrayList=new ArrayList<>();
		arrayList.add(new Student(1,"Salam"));
		arrayList.add(new Student(2,"kalam"));
		arrayList.add(new Student(3,"alam"));
		for(Student st:arrayList) {
			//System.out.println(st.customShow(->st.getNo()+""+st.getName()));
		}
		
	}

}
