package com.adda.app.Service;

import java.util.List;

import com.adda.app.Entity.Address;

public interface AddService {

	public Address createrole(Address address);
	public String deleteAddress(Integer id);
	public String updateAddress(Address address);
	public List<Address>viewAll();
}
