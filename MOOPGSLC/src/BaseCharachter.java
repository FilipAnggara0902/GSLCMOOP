public class BaseCharachter {
	String name;
	String description;
	
	public BaseCharachter(String name,String description) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.description = description;
	}
	
	public void getInfo() {
		System.out.println(name+" "+description);
}


}