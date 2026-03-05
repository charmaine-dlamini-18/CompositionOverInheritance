package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    @Test
    void createAddress() {
        Address address = AddressFactory.createAddress("14",
                "Station road",
                "Cape Town",
                "7462");

        assertNotNull(address);
        System.out.println(address);
    }
}