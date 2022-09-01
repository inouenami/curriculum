package bean;

public class Employee {

	private Integer id;
	private String name;
	private String password;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Employee() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public Employee(Integer id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}


}
