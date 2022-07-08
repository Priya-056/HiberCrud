package com.sonata;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table
public class Player 
{
	@Id
	private int playerId;
	private String playerName;
	private String teamName;
	private int playerAge;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", teamName=" + teamName + ", playerAge="
				+ playerAge + "]";
	}
	public Player(int playerId, String playerName, String teamName, int playerAge) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.teamName = teamName;
		this.playerAge = playerAge;
	}
	
}
