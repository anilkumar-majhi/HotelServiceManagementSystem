package com.arms.org.userService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arms.org.Entity.UsersDetails;
import com.arms.org.Repository.UserRepository;
import com.arms.org.dto.UsersDto;
import com.arms.org.mapper.UsersDetailsMapper;

@Service
public class UserServiceImplemetation implements UserService {
	
	@Autowired
	 private UserRepository userRepository;
	@Autowired
	UsersDetailsMapper mapper;


	@Override
	public List<UsersDto> getAllDetails(UsersDto userDto) {
		if(userDto==null) {
			System.out.println("Users Not Avalabile");
		}
		
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
         existingUser.setMobileNo(userDto.getMobileNo());
         existingUser.setAddress(userDto.getAddress());
         
         UsersDetails userDetail=userRepository.save(existingUser);
         
         return mapper.toDto(userDetail);
		
	}

	@Override
	public Optional<UsersDto> getById(Long id) {

		return userRepository.findById(id).map(mapper::toDto);
	}

	@Override
	public void deleteById(Long id) {

		Optional<UsersDetails> existUser=userRepository.findById(id);
		if(existUser.isPresent()) {
			userRepository.deleteById(id);
		}
		throw new RuntimeException("User not found : " + id);

	}

}
