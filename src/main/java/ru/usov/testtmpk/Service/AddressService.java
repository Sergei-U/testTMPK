package ru.usov.testtmpk.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.usov.testtmpk.Entity.Address;
import ru.usov.testtmpk.Repo.AddressRepo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
@RequiredArgsConstructor
public class AddressService {
    
    private final AddressRepo addressRepo;


    public void addAddress(Address address) {
        this.addressRepo.save(address);
    }

    public void editAddress(Address address) {
        this.addressRepo.save(address);
    }

    public void deleteAddress(Long id) {
        this.addressRepo.deleteById(id);
    }

    public List<Address> addressList() {
        List<Address> addresses = new ArrayList<>(addressRepo.findAll());
        return addresses;
    }

    public Address getAddress(Long id) {
        return addressRepo.getById(id);
    }
}
