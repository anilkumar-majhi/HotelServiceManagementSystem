package com.arms.org;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.arms.org.Entity.Address;
import com.arms.org.Entity.UsersDetails;
import com.arms.org.Repository.UserRepository;

@SpringBootTest
class UserservicesApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUserDetails() {
        // Create user
        UsersDetails user = new UsersDetails();
        user.setfName("Anil");
        user.setmName("Kumar");
        user.setlName("Majhi");
        user.setMobileNo("7978901289");
        // Do NOT manually set ID if it’s auto-generated
        // user.setUserId(1L);

        // Create address
        Address add = new Address();
        add.setCountry("India");
        add.setState("Odisha");
        add.setBlock("Baliapal");
        add.setDistrict("Balasore");
        add.setCity("Balasore");
        add.setGp("Jambhirai");
        add.setPincode("756024");

        // Set address to user
        user.setAddress(add);

        // Save user
        UsersDetails savedUser = userRepository.save(user);

        // Assertions
        assertNotNull(savedUser.getUserId(), "User ID should not be null after saving");
        assertEquals("Anil", savedUser.getfName());
        assertEquals("Odisha", savedUser.getAddress().getState());
    }
}
