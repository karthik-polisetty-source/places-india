package com.places.world.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AddNewPlaces {
	
	@Id
	private String nplace;
	private String ncountry;
	private String npincode;
	private String nurl;
	public AddNewPlaces() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddNewPlaces(String nplace, String ncountry, String npincode, String nurl) {
		super();
		this.nplace = nplace;
		this.ncountry = ncountry;
		this.npincode = npincode;
		this.nurl = nurl;
	}
	
	public String getNplace() {
		return nplace;
	}
	public void setNplace(String nplace) {
		this.nplace = nplace;
	}
	public String getNcountry() {
		return ncountry;
	}
	public void setNcountry(String ncountry) {
		this.ncountry = ncountry;
	}
	public String getNpincode() {
		return npincode;
	}
	public void setNpincode(String npincode) {
		this.npincode = npincode;
	}
	public String getNurl() {
		return nurl;
	}
	public void setNurl(String nurl) {
		this.nurl = nurl;
	}
	@Override
	public String toString() {
		return "AddNewPlaces [nplace=" + nplace + ", ncountry=" + ncountry + ", npincode=" + npincode + ", nurl=" + nurl
				+ "]";
	}
	
	
	
	

}
