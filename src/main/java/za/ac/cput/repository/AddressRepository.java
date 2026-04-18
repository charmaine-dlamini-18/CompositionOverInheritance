package za.ac.cput.repository;

import za.ac.cput.domain.Address;

import java.util.ArrayList;
import java.util.List;

public class AddressRepository implements IAddressRepository{

    private static IAddressRepository repository = null;
    private List<Address> addressList;

    private AddressRepository(){
        addressList = new ArrayList<>();
    }


    public static IAddressRepository getRepository(){
        if (repository == null){
            repository = new AddressRepository();
        }
        return repository;
    }

    @Override
    public Address create(Address address) {
        boolean success = addressList.add(address);
        if (success){
            return address;
        }
        return null;
    }

    @Override
    public Address read(String streetNumber) {
        for (Address address: addressList){
            if (address.getStreetNumber().equals(streetNumber)) {
                return address;
            }
        }
        return null;
    }

    @Override
    public Address update(Address address) {
        String streetNumber = address.getStreetNumber();
        Address oldAddress = read(streetNumber);
        if (oldAddress == null) {
            return null;
        }
        boolean success = addressList.remove(oldAddress);
        if (success){
            if (addressList.add(address)) {
                return address;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String streetNumber) {
        Address addressToDelete = read(streetNumber);
        if (addressToDelete == null) {
            return false;
        }
        return (addressList.remove(addressToDelete));
    }

    @Override
    public List<Address> getAll() {
        return addressList;
    }
}
