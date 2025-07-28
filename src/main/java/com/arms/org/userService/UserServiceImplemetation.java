package com.arms.org.userService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arms.org.Entity.UsersDetails;
import com.arms.org.ExceptionHandler.UsersNotFoundException;
import com.arms.org.Repository.UserRepository;
import com.arms.org.dto.UsersDto;
import com.arms.org.mapper.UsersDetailsMapper;

@Service
public class UserServiceImplemetation implements UserService {
	
	@Autowired
	 private UserRepository userRepository;
	@Autowired
	private UsersDetailsMapper mapper;


	@Override
	public List<UsersDto> getAllDetails() {
		
		return userRepository.findAll()
				.stream().map(mapper::toDto).collect(Collectors.toList());
	}

	@Override
	public UsersDto createUser(UsersDto userDto) {
		
	
		UsersDetails userDetails=mapper.toEntity(userDto);
	
		UsersDetails save=userRepository.save(userDetails);
		
		return mapper.toDto(save);
	}

	@Override
	public UsersDto updateById(UsersDto userDto, Long id) {
		
		Optional<UsersDetails> existingUserDetails=userRepository.findById(id);
		
		if(existingUserDetails==null) {
			System.out.println("User  Not present"+id);
		}
		
			UsersDetails existingUser=existingUserDetails.get();
		 existingUser.setfName(userDto.getfName());
         existingUser.setmName(userDto.getmName());
         existingUser.setlName(userDto.getlName());
         existingUser.seteMail(userDto.geteMail());
         existingUser.setGender(userDto.getGender());
         existingUser.setMobileNo(userDto.getMobileNo());
         existingUser.setPassword(userDto.getPassword());
      
        
         existingUser.setAddress(mapper.toAddressEntity(userDto.getAddress()));
       
         UsersDetails userDetail=userRepository.save(existingUser);
         
         return mapper.toDto(userDetail);
		
	}

	@Override
	public  UsersDto getById(Long id) {
		UsersDetails user=userRepository.findById(id).orElseThrow(()-> new UsersNotFoundException("User Not Found"+id));

		return mapper.toDto(user);
	}

	@Override
	public void deleteById(Long id) {

		if(userRepository.existsById(id)) {
			userRepository.deleteById(id);
		}
		throw new RuntimeException("User not found  " + id);

	}

}
