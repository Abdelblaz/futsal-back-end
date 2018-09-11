package be.bt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.bt.domain.Hall;
import be.bt.domain.Place;
import be.bt.repository.IHallRepository;
import be.bt.repository.IPlaceRepository;

@RestController
@RequestMapping("/halls")
@CrossOrigin(origins="*")
public class HallRestController {
	
	@Autowired
	private IHallRepository repo;
	
	@GetMapping(value="")
	public List<Hall> tous(){
		
		return repo.findAll();
	}
	
	@PostMapping
	public void addHall(@RequestBody Hall h) {
		
		repo.save(h);
	}

}
