package com.arms.org.userService;

import java.util.*;
import com.arms.org.Entity.UsersDetails;
import com.arms.org.dto.UsersDto;

public interface UserService {
	
//	UsersDetails saveAllDetails(UsersDetails userDetails);
//	
//	List<UsersDetails> getAllUsers();
//	
//	//Optional<UsersDetails> getById(Long id);
//	
//	UsersDetails updateById(UsersDetails userDetails,Long id);
//	
//	//public void deleteById(Long id);
	
	List<UsersDto> getAllDetails(UsersDto userDto);
	UsersDto createUser(UsersDto userDto);
	Optional<UsersDto> getById(Long id);
	UsersDto updateById(UsersDto userDto,Long id);
	
	public void deleteById(Long id);

}
