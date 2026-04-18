package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Job;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.factory.JobFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AddressRepositoryTest {
    private static IAddressRepository repository = AddressRepository.getRepository();

    Address address = AddressFactory.createAddress("14",
            "Station road",
            "Cape Town",
            "7462");

    @Test
    void a_create() {
        Address created = repository.create(address);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void b_read() {
        Address read = repository.read(address.getStreetNumber());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void c_update() {
        Address newAddress = new Address.Builder()
                .copy(address)
                .setStreetName("Hanover St")
                .setPostalCode("8000")
                .build();
        Address updated = repository.update(newAddress);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(address.getStreetNumber()));
        System.out.println("Success: address deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}