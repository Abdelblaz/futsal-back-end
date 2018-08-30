package be.bt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.bt.domain.Place;
import be.bt.repository.IPlaceRepository;

@RestController
@RequestMapping("/places")
public class PlaceRestController {
	
	@Autowired
	private IPlaceRepository repo;
	
	@GetMapping(value="")
	public List<Place> tous(){
		
		return repo.findAll();
	}
	
	@PostMapping(value="")
	public void addPlace(Place p) {
		
		repo.save(p);
	}

}
