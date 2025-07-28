package com.arms.org.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.arms.org.Entity.UsersDetails;

public interface UserRepository extends JpaRepository<UsersDetails,Long> {
	
}
