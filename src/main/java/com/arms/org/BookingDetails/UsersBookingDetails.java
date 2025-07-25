package com.arms.org.BookingDetails;

import java.time.LocalDateTime;

import com.arms.org.Entity.UsersDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UsersBookingDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long bookingId;
	private String roomNo;
	private LocalDateTime entryTime;
	private LocalDateTime outingTime;
	
	@ManyToOne
	@JoinColumn(name="userId",nullable=false)
	private UsersDetails userDetails;

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public LocalDateTime getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}

	public LocalDateTime getOutingTime() {
		return outingTime;
	}

	public void setOutingTime(LocalDateTime outingTime) {
		this.outingTime = outingTime;
	}

	public UsersDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UsersDetails userDetails) {
		this.userDetails = userDetails;
	}

}
