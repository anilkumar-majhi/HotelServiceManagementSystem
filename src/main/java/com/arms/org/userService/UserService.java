package com.arms.org.userService;

import java.util.*;

import com.arms.org.dto.UsersDto;

public interface UserService {
	

	
	List<UsersDto> getAllDetails();
	UsersDto createUser(UsersDto userDto);
	UsersDto getById(Long id);
	UsersDto updateById(UsersDto userDto,Long id);
	
	public void deleteById(Long id);

}
