package vnua.fita.credit;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Student extends Human {
	private String class_;
	 private  List<Subject>subjectList = new ArrayList<Subject>();
	
	public Student() {
	}
	
	public Student(String studentCode) {
		super(studentCode);
	}
	
	public Student(String studentCode,String fullname) {
		super(studentCode,fullname);
	}
	
	public Student(String studentCode,String fullname,String class_) {
		this(studentCode,fullname);
		this.class_=class_;
	}
	
	public Student(String studentCode,String fullname,String class_,String address) {
		this(studentCode,fullname,class_);
		this.address = address;
	} 
	
	public void addSubject(Subject sub) {
		subjectList.add(sub);
	}

	
	public float calTermAverageMark() {
		float sum1 = 0;
		int sum2 = 0;
		 
		for(Subject sub:subjectList ) {
			sum1+= sub.calConversionMark()*sub.getCredit();
			sum2+=sub.getCredit();
		}
		
		return sum1/sum2;
	}
	
	public void enterInfo(Scanner sc) {
		super.enterInfo(sc);
		System.out.println("Enter class: ");
		class_=sc.nextLine();
		
		System.out.println("nhap so luong mon hoc");
		int n = sc.nextInt();sc.nextLine();
		
		System.out.println("nhap ki: ");
		int t = sc.nextInt();sc.nextLine();
		for(int i = 0 ;i<n;i++) {
			Subject sub = new Subject();
			addSubject(sub);
		}
		
	}
	
	public String getClass_() {
		return class_;
		
	}
	
	public void setClass_(String class_) {
		this.class_ = class_;
	}
	
	
}

