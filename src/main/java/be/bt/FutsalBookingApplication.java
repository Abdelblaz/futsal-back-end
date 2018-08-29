package be.bt;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import be.bt.domain.Client;
import be.bt.domain.Hall;
import be.bt.domain.Place;
import be.bt.repository.IHallRepository;
import be.bt.repository.IPlaceRepository;

@SpringBootApplication
public class FutsalBookingApplication {
	
	@Autowired
	private IHallRepository repoHall;
	
	@Autowired
	private IPlaceRepository repoPlace;

	public static void main(String[] args) {
		SpringApplication.run(FutsalBookingApplication.class, args);
		
		

	}
	
	
//	@Bean
//	CommandLineRunner runIt(){
//		return args -> {
//			
//			Place p1 = new Place( "ForestFC","Mexico" , "MexiCity", "TacosBoulevard", (short)63, (short)8787, true, true,new ArrayList());
//			
//			Hall h1= new Hall("para1",(short)111 ,5.111, 6.11,p1);
//			Hall h2= new Hall("para2",(short)51 ,154.11, 200.2,p1);
//			Hall h3= new Hall("para3",(short)29 ,4.75, 7.65 ,p1);
//			
//			p1.getListHall().add(h1);
//			
//			repoPlace.save(p1);
//			repoHall.save(h1);
//			repoHall.save(h2);
//			repoHall.save(h3);
//			repoHall.save(h1);
//			
//			
//
//			
//		};
//		
//	}
	
}
