package com.adda.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Address;
import com.adda.app.Reposatary.AddRepo;
import com.adda.app.Service.AddService;
@Service
public class AddServiceImple implements AddService {
    @Autowired
	private AddRepo arepo;
	@Override
	public Address createrole(Address address) {
		return this.arepo.save(address);
		
	}

	@Override
	public String deleteAddress(Integer id) {
		if(arepo.existsById(id)) {
			arepo.deleteById(id);
		return "Successfull delete";
		}
		return "Address not found";
	}

	@Override
	public String updateAddress(Address address) {
	if(arepo.existsById(address.getAid())) 
	{
		arepo.save(address);
		return "Successfull update";
	}
		return "Address Not Found";
	}

	@Override
	public List<Address> viewAll() {
		return 	arepo.findAll();
		
	}

}
