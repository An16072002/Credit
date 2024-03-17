package vnua.fita.credit;

import java.util.Scanner;

public class Human {
	public static void main(String[] args) {
		Human test = new Human( "651514","NhuyenHuuAn","222");
		System.out.println(test.toString());
		//khai bao moi dung dc trong ham
		Scanner sc = new Scanner(System.in);
		test.enterInfo(sc);
		
		Human test1 = new Human("651514","LA LA ");
		System.out.println(test1.code);
		
		System.out.println(test.toString());
	}
	protected String fullname;
	protected String address;
	protected String code;
	
	public Human() {
		//code mac dinh
		this.code = "xxxxx";
	}
	
	public Human(String code) {
		this.code = code;
	}
	
	public Human(String code,String fullname) {
		this(code);
		this.fullname = fullname;
	}
	
	public Human(String code,String fullname, String address){
		this(code, fullname);
		this.address = address;
	}
	
	public void enterInfo(Scanner sc) {
		System.out.println("Nhap vao ho va ten :\t");
		this.fullname = sc.nextLine();
		System.out.println("Nhap vao dia chi :\t");
		this.address = sc.nextLine();
		System.out.println("Nhap vao msv:\t");
		this.code = sc.nextLine();
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String toString() {
		return "\nFullname: "+fullname+
				"\nAddress: "+address+
				"\nCode: "+code;
	}
	
	

}
