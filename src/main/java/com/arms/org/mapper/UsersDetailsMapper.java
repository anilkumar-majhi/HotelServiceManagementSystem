package com.arms.org.mapper;

import org.mapstruct.Mapper;

import com.arms.org.Entity.Address;
import com.arms.org.Entity.UsersDetails;
import com.arms.org.dto.AddressDto;
import com.arms.org.dto.UsersDto;

@Mapper(componentModel = "spring")
public interface UsersDetailsMapper {

    UsersDto toDto(UsersDetails user); 
    UsersDetails toEntity(UsersDto userDTO);
    AddressDto toAddressDto(Address address);
    
    Address toAddressEntity(AddressDto dto);
}
