package assignment6Dto;

import java.util.ArrayList;
import java.util.List;

class Team{
	private String name;
	private String sports;
	private String place;
	private List<Player> playerList;
	
	public Team(String name, String sports, String place) {
		this.name = name;
		this.sports = sports;
		this.place = place;
		this.playerList = new ArrayList<>();
	}
	public void addPlayer(Player player) {
		this.playerList.add(player);
	}
	public List<Player> getPlayerList(){
		return playerList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
}
class Player{
	private String palyerName;
	private String role;
	private int jerseyNumber;
	private int age;
	
	public Player(String palyerName, String role, int jerseyNumber, int age) {
		this.palyerName = palyerName;
		this.role = role;
		this.jerseyNumber = jerseyNumber;
		this.age = age;
	}
	
	public String getPalyerName() {
		return palyerName;
	}
	public void setPalyerName(String palyerName) {
		this.palyerName = palyerName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [palyerName=" + palyerName + ", role=" + role + ", jerseyNumber=" + jerseyNumber + ", age=" + age
				+ "]";
	}
	
}
public class TeamPlayer {

	public static void main(String[] args) {
		Team team = new Team("DKCC", "Cricket", "AVUDAIYANOOR");
		
		team.addPlayer(new Player("SHIV", "WK & BATSMAN", 11, 24));
		team.addPlayer(new Player("DUMINY", "BOWLER", 21, 24));
		team.addPlayer(new Player("PERIZ", "BATSMAN", 07, 25));
		team.addPlayer(new Player("LOGESH", "ALL-ROUNDER", 45, 25));
		
		for(Player player : team.getPlayerList()) {
			System.out.println(player.toString());
		}
	}

}
