
public class Student {
	protected Studentkind kind = Studentkind.Universary;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	
	public Student() {
	}
	
	public Student(String name,int id) {
		this.name = name;
		this.id=id;
	}
	public Student(String name,int id, String email,String phone) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
	}
	
	public Studentkind getKind() {
		return kind;
	}
	public void setkind(Studentkind kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void printInfo() {
		System.out.println("name: " +name +" id: "+id+" email: "+email+" phone: "+phone);
	}

}
