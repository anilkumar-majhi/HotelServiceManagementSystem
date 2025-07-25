package com.arms.org.userService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arms.org.Entity.UsersDetails;
import com.arms.org.Repository.UserRepository;
import com.arms.org.dto.UsersDto;

@Service
public class UserServiceImplemetation implements UserService {
	
	@Autowired
	 private UserRepository userRepository;
	@Autowired
	private UsersDto userDto;

//	@Override
//	public UsersDetails saveAllDetails(UsersDetails userDetails) {
//		if(userDetails==null) {
//			System.out.println("User is NOt present");
//		}
//		return userRepository.save(userDetails);
//	}
//
//	@Override
//	public List<UsersDetails> getAllUsers() {
//		
//		return userRepository.findAll();
//	}
//
//	@Override
//	public Optional<UsersDetails> getById(Long id) {
//	
//		return userRepository.findById(id);
//	}
//
//	@Override
//	public UsersDetails updateById(UsersDetails userDetails, Long id) {
//		Optional<UsersDetails> existingUserOpt = userRepository.findById(id);
//
//        if (existingUserOpt.isPresent()) {
//            UsersDetails existingUser = existingUserOpt.get();
//            
//            
//            
//            existingUser.setfName(userDetails.getfName());
//            existingUser.setmName(userDetails.getmName());
//            existingUser.setlName(userDetails.getlName());
//            existingUser.seteMail(userDetails.geteMail());
//            existingUser.setMobileNo(userDetails.getMobileNo());
//            existingUser.setAddress(userDetails.getAddress());
//
////            // Update fields as needed
////            existingUser.setUserName(updatedDetails.getUserName());
////            existingUser.setEmail(updatedDetails.getEmail());
////            existingUser.setAddress(updatedDetails.getAddress());
////            // Add more setters as per your entity
//
//            return userRepository.save(existingUser);
//        } else {
//            throw new RuntimeException("User not found with ID: " + id);
//        }
//	}
//
//	@Override
//	public void deleteById(Long id) {
//		
//		Optional<UsersDetails> existUser=userRepository.findById(id);
//		if(existUser.isPresent()) {
//			userRepository.deleteById(id);
//		}
//		throw new RuntimeException("User not found with ID: " + id);
//
//		
//	}
//	
	
	

	@Override
	public List<UsersDto> getAllDetails(UsersDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersDto createUser(UsersDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersDto updateById(UsersDto userDto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UsersDto> getById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
