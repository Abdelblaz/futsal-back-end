package be.bt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.bt.domain.Hall;
import be.bt.domain.Place;
import be.bt.repository.IPlaceRepository;

@RestController
@RequestMapping("/places")
@CrossOrigin(origins="*")
public class PlaceRestController {

   // private  List<Hall> hall;
	
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
	
	
    @RequestMapping(path = "/hall/{id}", method = RequestMethod.GET)
    public  List<Hall> getHalls(@PathVariable("id") Long id) {
        
    	return repo.getOne(id).getListHall();
        
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public  Place getSalles(@PathVariable("id") Long id) {
        
    	return repo.findById(id).get();
    
        
    }

//    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
//    public  Hall getSalle(@PathVariable("id") String id) {
//        return hall.stream()
//                .filter(h -> id.equals(h.getId()))
//                .findAny().orElse(null);
//    }

}
