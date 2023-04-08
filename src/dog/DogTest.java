package dog;

class Dog{
	private String name;
	public String breed;
	private int age;

	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public void setName(String name){
		this.name = name;
	}


	public Dog(String name, int age){
		this(name, null, age);
	}

	public Dog(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
}

class DogTest {
	public static void main(String[] args) {
		Dog d1 = new Dog("콩이",9);
		Dog d2 = new Dog("콩이","푸들",9);
		System.out.println("이름 : " +d1.getName());
		System.out.println("나이 : " +d1.getAge());
		System.out.println("종류 : " +d1.getBreed());
		System.out.println("-----------------------");
		System.out.println("이름 : " +d2.getName());
		System.out.println("나이 : " +d2.getAge());
		System.out.println("종류 : " +d2.getBreed());
	}
}

