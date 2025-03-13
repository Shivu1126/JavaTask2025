package assignment6Dto;
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
public class MovieDto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie();
		movie.setId(1);
		movie.setMovieName("VinnaiThandiVaruvaayaa");
		movie.setTimeLineMins(157);
		movie.setDirectorName("Gautham Vasudev Menon");
		movie.setActorName("Silambarasan TR");
		movie.setActressName("Trisha Krishnan");
		movie.setCoActorName("VTV Ganesh");
		movie.setVillainName("Jessi(Trisha)");
		movie.setCertificate("U");
	
		System.out.println(movie.toString());
	}

}
