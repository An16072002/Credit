package diem_tamgiac;

public class TamGiac {
	public static void main(String[] args) {
		Diem A = new Diem(1,2);
		A.inDiem();
		
		Diem B = new Diem(5,6);
		B.inDiem();
		
		Diem C = new Diem(7,8);
		C.inDiem();
		
		TamGiac tg = new TamGiac(A,B,C);
		System.out.println("Dien tich: " + tg.dienTich());
		System.out.println("Chu vi: " + tg.chuVi());
	}
	
	private Diem A;
	private Diem B;
	private Diem C;
	
	public TamGiac() {
		
	}
	
	public TamGiac(Diem A, Diem B, Diem C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public float chuVi() {
		float AB = A.kc(B);
		float BC = B.kc(C);
		float CA = C.kc(A);
		return (AB + BC + CA);
	}
	
	public float dienTich() {
		float AB = A.kc(B);
		float BC = B.kc(C);
		float CA = C.kc(A);
		float p = chuVi()/2;
		float dt = (float)Math.sqrt(p * (p-AB) * (p-BC) * (p-CA));
		return dt;
	}
}
