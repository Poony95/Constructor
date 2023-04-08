package getterandsetter;

class Person2{
	private String name;
	private int age;
	public Person2(String name, int age){
		this.name = name;
		this.age = age;
	}	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void info(){
		System.out.println("이름:"+name+",나이:"+age);
	}
}
public class PersonTest2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2("김유신", 40);
		p1.info();
		p1.setName("김유식");
		p1.info();
		System.out.println(p1.getName());
		p1.setAge(30);
		System.out.println(p1.getAge());
		p1.info();
	}
}
