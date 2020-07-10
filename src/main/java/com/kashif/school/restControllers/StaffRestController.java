package com.kashif.school.restControllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kashif.school.models.Staff;
import com.kashif.school.repos.StaffRepo;

@RestController
@RequestMapping("/staffapi")
public class StaffRestController {

	@Autowired
	private StaffRepo repo;

	@GetMapping(path = "/staff")
	public List<Staff> getStafflist() {
		return repo.findAll();
	}

	@GetMapping(path = "/staff/{id}")
	public Staff getStaffer(@PathVariable String id) {
		if (repo.findById(id).get().toString().isEmpty()) {
			throw new StafferNotFoundException("Staff id not found - " + id);
		} else {
			return repo.findById(id).get();
		}
	}

	@PostMapping(path = "/staff")
	public Staff create(@RequestBody Staff staff) {
		if (repo.findById(staff.getStaff_mobile()).get().toString().isEmpty()) {
			return repo.save(staff);

		} else {
			throw new StafferNotFoundException("Staff already exists");
		}

	}

	@DeleteMapping(path = "/staff/{id}")
	public void deleteStaffer(@PathVariable String id) {
		if (repo.findById(id).get().toString().isEmpty()) {
			throw new StafferNotFoundException("Staff id not found - " + id);
		} else {
			repo.deleteById(id);
		}

	}

	@PutMapping("/staff/{id}")
	public Staff updateStaffer(@RequestBody Staff staff, @PathVariable String id) {
		Staff existingStaff = repo.getOne(id);
		BeanUtils.copyProperties(staff, existingStaff, "staff_mobile");
		return repo.saveAndFlush(existingStaff);
	}

}
