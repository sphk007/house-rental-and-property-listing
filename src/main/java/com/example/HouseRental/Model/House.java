package com.example.HouseRental.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Houses")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "house_name")
    private String house_name;

    @Column(name = "address")
    private String address;
    
    
    @Column(name = "city")
    private String city;

    @Column(name = "rooms")
    private String rooms;
    
    
    @Column(name = "rent")
    private String rent;
    
   
	@Column(name = "email")
    private String email;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	


	public String getHouse_name() {
		return house_name;
	}


	public void setHouse_name(String house_name) {
		this.house_name = house_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getRooms() {
		return rooms;
	}


	public void setRooms(String rooms) {
		this.rooms = rooms;
	}


	public String getRent() {
		return rent;
	}


	public void setRent(String rent) {
		this.rent = rent;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
    

}
