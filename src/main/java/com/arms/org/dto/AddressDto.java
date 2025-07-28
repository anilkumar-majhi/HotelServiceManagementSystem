package com.arms.org.dto;



public class AddressDto {
	private String country;
    private String state;
    private String city;
    private String district;
    private String block;
    private String gp;
    private String pincode;
    
    
    
	public AddressDto(String country, String state, String city, String district, String block, String gp,
			String pincode) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.district = district;
		this.block = block;
		this.gp = gp;
		this.pincode = pincode;
	}
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

}
