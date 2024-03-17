package diem_tamgiac;

public class Diem {
	public static void main(String[] args) {
	Diem c = new Diem(2,3);
	Diem d = new Diem(4,5);
	c.inDiem();
	
	float a = c.kc(d);
	
	System.out.println(a);
	
	
	}
	
	float x;
	float y;
	
	public Diem() {
		this.x = 0;
		this.y = 0;
	}
	
	public Diem(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float kc(Diem d) {
		float kc = (float)Math.sqrt((d.x - x)*(d.x - x) + (d.y - y)*(d.y - y));
		return kc;
	}
	
	public void inDiem() {
		System.out.println("(" +  x + "," + y + ")");
	}
}
