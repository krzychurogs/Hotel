package application;

import java.sql.Date;
//test
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "room")
public class Rooms {
 @Id @GeneratedValue
@Column(name = "ID")
	private int id;
 @Column(name = "NUMBER_OF_SEATS")
	private int numberOfSeats;
 @Column(name = "ROOM_NUMBER")
	private int roomNumber;
 @Column(name = "lvl")
	private String lvl;
 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getLvl() {
		return lvl;
	}

	public void setLvl(String lvl) {
		this.lvl = lvl;
	}



	public Rooms(int id, int numberOfSeats, int roomNumber, String lvl) {
		super();
		this.id = id;
		this.numberOfSeats = numberOfSeats;
		this.roomNumber = roomNumber;
		this.lvl = lvl;
	}
	
	
	
	
	
	
	

	
	
}