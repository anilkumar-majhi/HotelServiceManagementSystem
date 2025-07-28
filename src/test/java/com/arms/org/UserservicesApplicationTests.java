package com.arms.org;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.arms.org.Entity.UsersDetails;
import com.arms.org.Entity.Address;
import com.arms.org.Repository.UserRepository;

@SpringBootTest
class UserservicesApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUserDetails() {
        // Create entity
        UsersDetails user = new UsersDetails();
        user.setfName("Anil");
        user.setmName("Kumar");
        user.setlName("Majhi");
        user.seteMail("anil@gmail.com");
        user.setMobileNo("7978901289");
        user.setGender("Male");
        user.setPassword("secret123");

        // Create and set embedded Address
        Address address = new Address();
        address.setCountry("India");
        address.setState("Odisha");
        address.setBlock("Baliapal");
        address.setDistrict("Balasore");
        address.setCity("Balasore");
        address.setGp("Jambhirai");
        address.setPincode("756024");

        user.setAddress(address);

        // Save to DB
        UsersDetails savedUser = userRepository.save(user);

        // Assertions
        assertNotNull(savedUser.getUserId(), "User ID should not be null after saving");
        assertEquals("Anil", savedUser.getfName());
        assertEquals("Odisha", savedUser.getAddress().getState());
        assertEquals("Balasore", savedUser.getAddress().getCity());
    }
}
