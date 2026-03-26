package ex04;

class Member{
	// Field 는 전부 private 
	private int id;
	private String name;
	private String email;
	
	// Constructor
	public Member() {}
	public Member(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	// Setter 함수 : 외부 class 에서 내부 Field 에 값을 넣는 방법
	// Getter 함수 : 외부 class 로 내부 Field 에 값을 내보내는 방법
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
}

public class TestMember {

	public static void main(String[] args) {
	
		Member m1 = new Member();
		m1.setId(1);
		m1.setName("박찬호");
		m1.setEmail("parch@lotte.com");
		String name1 = m1.getName();
		System.out.println("m1의 이름:" + name1);
		
		
		Member m2 = new Member(2, "강호동", "kanghodong@jtbc.com");
		System.out.println(m2);
		m2.setEmail("kanghodong@kbs.com");
		// m2.email = "kanghodong@kbs.com";	// error : not visible
		System.out.println(m2);
		System.out.println("m2의 ID:" + m2.getId());
		System.out.println("m2의 NAME:" + m2.getName());
		System.out.println("m2의 EMAIL:" + m2.getEmail());
		
	}

}
