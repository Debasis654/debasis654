//CUstomer.java
package com.nt.beans;

public class Student {
  //let us assume optional to provide
	private int age;
	private String collegeName;
	private String qlfy;
	private String sname;
	
		public void setSname(String sname) {
			this.sname=sname;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName=collegeName;
	}
		public void setAge(int age) {
			this.age=age;
		}
		public void setQlfy(String qlfy) {
			this.qlfy=qlfy;
		}
		@Override
		public String toString() {
			return "Student[sname="+sname+",collegeName="+collegeName+",age="+age+",qlfy="+qlfy+"]";		}
		
}
