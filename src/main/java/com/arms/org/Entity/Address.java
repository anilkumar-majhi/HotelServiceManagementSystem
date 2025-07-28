package com.arms.org.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable

public class Address {
    public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getGp() {
		return gp;
	}
	public void setGp(String gp) {
		this.gp = gp;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Column
	private String country;
	@Column
    private String state;
	@Column
    private String city;
	@Column
    private String district;
	@Column
    private String block;
	@Column
    private String gp;
	@Column
    private String pincode;
}