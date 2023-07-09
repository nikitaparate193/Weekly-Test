package com.example.Ecommerce_API.service;

import com.example.Ecommerce_API.model.Address;
import com.example.Ecommerce_API.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public void createAddress(Address address) {
        addressRepo.save(address);
    }
}
