package getterandsetter;

class Person{
	private String name;
	private int age;
	public Person(String n, int a){
		name = n;
		age = a;
	}
	public Person(){
		name = "홍길동";
		age = 20;
	}
	public Person(String n){
		name = n;
		age = 20;
	}
	public Person(int a){
		name = "홍길동";
		age = a;
	}
	public void info(){
		System.out.println("이름:"+name+",나이:"+age);
	}
}
public class PersonTest {

	public static void main(String[] args) {

			Person p1 = new Person("김유신",30);
			Person p2 = new Person();
			Person p3 = new Person("김유신");
			Person p4 = new Person(30);
			p1.info();
			p2.info();
			p3.info();
			p4.info();
	}
}
