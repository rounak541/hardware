package Emp.entity;




public class entity {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id ;*/
	String name;
	String address ;
	String email;
	String ph;
	int salary;
	
	public entity() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
		public String toString() {
			return "entity [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", ph=" + ph
					+ ", salary=" + salary + "]";
	}
	
	

}
