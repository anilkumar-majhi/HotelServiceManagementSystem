package com.arms.org.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.arms.org.Entity.UsersDetails;
import com.arms.org.dto.UsersDto;

@Mapper(componentModel="spring")
public interface UsersDetailsMapper {
    UsersDetailsMapper INSTANCE = Mappers.getMapper(UsersDetailsMapper.class);
	
    // Entity to DTO
    UsersDto toDto(UsersDetails user);

    // DTO to Entity
    UsersDetails toEntity(UsersDto userDTO);
}
