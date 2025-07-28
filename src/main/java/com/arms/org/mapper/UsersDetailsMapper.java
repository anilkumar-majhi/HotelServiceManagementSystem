package com.arms.org.mapper;

import org.mapstruct.Mapper;


import com.arms.org.Entity.Address;
import com.arms.org.Entity.UsersDetails;
import com.arms.org.dto.AddressDto;
import com.arms.org.dto.UsersDto;

@Mapper(componentModel="spring")
public interface UsersDetailsMapper {
 
	
    // Entity to DTO
    UsersDto toDto(UsersDetails user);

    // DTO to Entity
    UsersDetails toEntity(UsersDto userDTO);
    Address toAddressEntity(AddressDto addressDto);

}
