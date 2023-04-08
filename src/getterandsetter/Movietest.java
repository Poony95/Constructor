package getterandsetter;

class Movie {

	private String title;
	private String director;
	private String company;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Movie() {
		title = "내용 없음";
		director = "내용없음";
		company = "내용없음";
	}
	public Movie (String title,String director,String company) {
		this.title = title;
		this.director = director;
		this.company = company;
	}
}
public class Movietest {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		Movie m2 = new Movie("기생충","봉준호","cj");
		System.out.println("영화제목:" + m1.getTitle());
		System.out.println("영화감독:" + m1.getDirector());
		System.out.println("제작회사:" + m1.getCompany());
		System.out.println("---------------------------------");
		System.out.println("영화제목:" + m2.getTitle());
		System.out.println("영화감독:" + m2.getDirector());
		System.out.println("제작회사:" + m2.getCompany());
	}

}
