package com.example.Software.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Software.InterfaceforDef.SoftwareIntforDef;
import com.example.Software.Model.Software;

@Controller
public class SoftwareController{
	public SoftwareIntforDef service;

	public SoftwareController(SoftwareIntforDef service) {
		this.service = service;
	}
	@GetMapping("/viewAllSoftwares")
	public String listOfsoftwares(Model model) {
	model.addAttribute("softwareList",service.fetchAllRecords());
	return "software";  
	}

	@GetMapping("software/createNewSoftware")
	public String createSoftware(Model model) {
		Software emptyObj=new Software();
		model.addAttribute("softobj", emptyObj);
		return "createSoftware";
	}
	@PostMapping("/insertSoftwares")	
	public String InsertIntoDataBase(@ModelAttribute("softobj") Software obj) {
		service.saveSoftware(obj);
		return "redirect:/viewAllSoftwares";
	}
	@GetMapping("/delete/{id}")
	public String deleteSoftware(@PathVariable int id) {
		service.deleteSoftwarebyId(id);
		return "redirect:/viewAllSoftwares";
	}
	
		
	

}

