package com.example.Software.InterfaceforDef;

import java.util.List;

import com.example.Software.Model.Software;

public interface SoftwareIntforDef {
	List<Software> fetchAllRecords();
 Software saveSoftware(Software obj);
void deleteSoftwarebyId(int id);
	
	

}
