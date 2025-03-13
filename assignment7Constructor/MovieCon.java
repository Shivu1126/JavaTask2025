package assignment7Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Movie{
	private int id;
	private String movieName;
	private int timeLineMins;
	private String directorName;
	private String certificate;
	private String villainName;
	private String actorName;
	private String actressName;
	private String coActorName;
	
	public Movie(int id, String movieName, int timeLineMins, String directorName, String certificate,
			String villainName, String actorName, String actressName, String coActorName) {
		this.id = id;
		this.movieName = movieName;
		this.timeLineMins = timeLineMins;
		this.directorName = directorName;
		this.certificate = certificate;
		this.villainName = villainName;
		this.actorName = actorName;
		this.actressName = actressName;
		this.coActorName = coActorName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getTimeLineMins() {
		return timeLineMins;
	}
	public void setTimeLineMins(int timeLineMins) {
		this.timeLineMins = timeLineMins;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getVillainName() {
		return villainName;
	}
	public void setVillainName(String villainName) {
		this.villainName = villainName;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActressName() {
		return actressName;
	}
	public void setActressName(String actressName) {
		this.actressName = actressName;
	}
	public String getCoActorName() {
		return coActorName;
	}
	public void setCoActorName(String coActorName) {
		this.coActorName = coActorName;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", timeLineMins=" + timeLineMins + ", directorName="
				+ directorName + ", certificate=" + certificate + ", villainName=" + villainName + ", actorName="
				+ actorName + ", actressName=" + actressName + ", coActorName=" + coActorName + "]";
	}
	
}

public class MovieCon {
	static Scanner scanner = new Scanner(System.in);
	static List<Movie> movieList = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieCon movCon = new MovieCon();
		int option = 0;
		do{
			System.out.println("1. Add Movie");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			option = scanner.nextInt();
			if(option==1) {
				movCon.addMovie();
			}
			else if(option==2) {
				if(movieList.isEmpty())
					System.out.println("Empty List..");
				else {
					for(Movie movie : movieList)
						System.out.println(movie.toString());
				}
			}
				
		}while(option!=3);
	}
	public void addMovie() {
		System.out.println("Enter id");
		int id = scanner.nextInt();
		System.out.println("Enter movie name");
		scanner.nextLine();
		String movieName = scanner.nextLine();
		System.out.println("Enter timeline mins");
		int mins = scanner.nextInt();
		System.out.println("Enter director name");
		String directorName = scanner.next();
		System.out.println("Enter certificate");
		String certificate = scanner.next();
		System.out.println("Enter villain name");
		String villainName = scanner.next();
		System.out.println("Enter actor name");
		String actorName = scanner.next();
		System.out.println("Enter actress name");
		String actressName = scanner.next();
		System.out.println("Enter co-actor name");
		String coActorName = scanner.next();
		
		movieList.add(new Movie(id, movieName, mins, directorName, certificate, villainName, actorName, actressName, coActorName));
		
	}
}
