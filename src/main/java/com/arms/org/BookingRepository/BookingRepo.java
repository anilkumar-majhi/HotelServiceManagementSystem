package com.arms.org.BookingRepository;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arms.org.BookingDetails.UsersBookingDetails;

public interface BookingRepo extends JpaRepository<UsersBookingDetails, Long>{
	Optional<UsersBookingDetails> findById(Long id);

}
