package cellphone;

class cellphone{
	private String model;
	private String maker;
	private String color;
	private boolean camera;
	private boolean power;
	
	public cellphone() {
		
	}
	
	public cellphone(String model, String maker, String color, 
			boolean camera, boolean power) {
		this.model =model;
		this.maker = maker;
		this.color = color;
		this.camera = camera;
		this.power = power;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getCamera() {
		return camera;
	}
	public void setCamera(boolean camera) {
		this.camera = camera;
	}
	public boolean getPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void onOff( boolean power) {
		this.power = power;
		if(true) {
			System.out.println("핸드폰이 켜졌습니다.");
		}else {
			System.out.println("핸드폰이 꺼졌습니다.");
		}
	}
}


public class CellPhonetest {

	public static void main(String[] args) {
		cellphone c1 = new cellphone();
		cellphone c2 = new cellphone("아이폰", 
			"애플", "핑크", true,false);
		System.out.println("모델명 : "+c1.getModel());
		System.out.println("제조사 : "+c1.getMaker());
		System.out.println("컬러 : "+c1.getColor());
		System.out.println("카메라 : "+c1.getCamera());
		System.out.println("전원 : "+c1.getPower());
		System.out.println("-------------------------");
		System.out.println("모델명 : "+c2.getModel());
		System.out.println("제조사 : "+c2.getMaker());
		System.out.println("컬러 : "+c2.getColor());
		System.out.println("카메라 : "+c2.getCamera());
		System.out.println("전원 : "+c2.getPower());
		System.out.println("-------------------------");
		c2.onOff(true);
		System.out.println("모델명 : "+c2.getModel());
		System.out.println("제조사 : "+c2.getMaker());
		System.out.println("컬러 : "+c2.getColor());
		System.out.println("카메라 : "+c2.getCamera());
		System.out.println("전원 : "+c2.getPower());
		
		
	}

}
