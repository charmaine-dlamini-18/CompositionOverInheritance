package za.ac.cput.repository;

import za.ac.cput.domain.Address;
import java.util.List;

public interface IAddressRepository extends IRepository<Address, String>{
    List<Address> getAll();
}
