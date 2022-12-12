package com.example.Software.Implentaion;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.Software.InterfaceforDef.SoftwareIntforDef;
import com.example.Software.Model.Software;
import com.example.Software.SoftwareInterface.SoftwareInt;
@Service
public class SoftwareImpforInterface implements  SoftwareIntforDef{

	private SoftwareInt software;
public SoftwareImpforInterface(SoftwareInt software) {
	
		this.software = software;
	}
@Override
public List<Software> fetchAllRecords() {
	
	return software.findAll();
}
@Override
public Software saveSoftware(Software obj) {
		return software.save(obj);
}
public void deleteSoftwarebyId(int id) {
	 software.deleteById(id);
}


}
