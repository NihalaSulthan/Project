package exam;

import java.util.*;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;

class Student {
	private int rollNo;
	private String name;
	private long contact;
	private String city;
	private String mail;
	private int standard;
	
	Student(int rollNo, String name, long contact,String city,String mail, int standard) {

	    this.rollNo = rollNo;
	    this.name = name;
	    this.contact = contact;
	    this.city = city;
	    this.mail=mail;
	    this.standard=standard;

	}
	public int getRollNo() {
	    return rollNo;
	}
	public long getContact() {
		return contact;
	}
	public int getStandard() {
		return standard;
	}
	public String getName() {
	    return name;
	}
	public String getCity() {
	    return city;
	}
	public String getMail() {
	    return mail;
	}
	public String toString() {
		return rollNo+" "+name+" "+contact+" "+city+" "+mail+" "+standard;
	}

}
class StudentData{
	public static void main(String[] args) {
		List<Student> c =new ArrayList<Student>();
		 Scanner sc = new Scanner(System.in);
		 Scanner sc1 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.println("Enter your Choice : ");
		ch=sc.nextInt();
		 
		switch(ch){
			case 1:
				System.out.println("Enter RollNo :");
				int rollNo=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name :");
				String name=sc.nextLine();
				System.out.println("Enter Contact :");
				long contact=sc.nextLong();
				sc.nextLine();
				System.out.println("Enter City :");
				String city=sc.nextLine();
				System.out.println("Enter Email :");
				String mail=sc.nextLine();
				System.out.println("Enter Standard :");
				int standard=sc.nextInt();
				
				c.add(new Student(rollNo,name,contact,city,mail,standard));
				break;
			case 2:
				System.out.println("...............");
				Iterator<Student>i=c.iterator();
				while(i.hasNext()) {
					Student s=i.next();
					System.out.println(s);
					}
				System.out.println("...............");
				break;
				
			case 3:
				boolean found =false;
				System.out.println("Enter StudentrollNo to Update: ");
				rollNo=sc.nextInt();
				sc.nextLine();
				System.out.println("...............");
				ListIterator<Student> li=c.listIterator();				
				while(li.hasNext()) {
					Student s=li.next();
					if(s.getRollNo()==rollNo) {
						System.out.println("Enter new Name :");
						name=sc1.nextLine();
						System.out.println("Enter new Contact :");
						contact=sc1.nextLong();
						sc1.nextLine();
						System.out.println("Enter new City :");
						city=sc1.nextLine();
						System.out.println("Enter new Email :");
						mail=sc1.nextLine();
						System.out.println("Enter new Standard :");
						standard=sc1.nextInt();
						sc1.nextLine();
						
						li.set(new Student(rollNo,name,contact,city,mail,standard));
					found=true;
					}
				}
				if(!found) {
					System.out.println("Record Not Found");
					}else {
						System.out.println("Record Updated Successfully..:");
					}
				break;
				
			case 4:
				found =false;
				System.out.println("Enter StudentrollNo to Delete: ");
				rollNo=sc.nextInt();
				System.out.println("...............");
				i=c.iterator();
				while(i.hasNext()) {
					Student s=i.next();
					if(s.getRollNo()==rollNo) {
						i.remove();
					found=true;
					}
				}
				if(!found) {
					System.out.println("Record Not Found");
					}else {
						System.out.println("Record Deleted Successfully..:");
					}
				System.out.println("...............");
				break;
		
			case 5:
				found =false;
			System.out.println("Exited successfully: ");
			/*	rollNo=sc.nextInt();
				System.out.println("...............");
				i=c.iterator();
				while(i.hasNext()) {
					Student s=i.next();
					//if(s.getRollNo()==rollNo) {
					found=true;
					}
				}
				if(!found) {
					System.out.println("Record Not Found");
					}else {
						System.out.println("Exits Successfully..:");
					}
				System.out.println("...............");*/
				break;
				}
			
		}while(ch!=0);
		}
}