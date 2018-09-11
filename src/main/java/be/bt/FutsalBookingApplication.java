package be.bt;



import java.time.LocalTime;
import java.util.ArrayList;

import org.hibernate.type.LocalTimeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.format.datetime.joda.LocalTimeParser;

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
		System.out.println("Hello");
		SpringApplication.run(FutsalBookingApplication.class, args);
		
		

	}
	
	
	@Bean
	CommandLineRunner runIt(){
		return args -> {
			
//			Place p1 = new Place("DrogGolaBoss", "Mexico", "MexiCity", "street", 12,7, 8,20, true, new ArrayList());
//
//			
//			Hall h1= new Hall(1 ,5, 6.11,13.15, p1);
//			Hall h2= new Hall(2, 51 ,154.11, 200.2,p1);
//			Hall h3= new Hall(3, 29 ,4.75, 7.65 ,p1);
//			
//			p1.getListHall().add(h1);
//			p1.getListHall().add(h2);
//			p1.getListHall().add(h3);
//			
//			Place p2 = new Place("SoFoot", "jaksonville", "gol", "street", 12,7, 8,20, true, new ArrayList());
//
//			
//			Hall h4= new Hall(8,29 ,10.75, 15.65 ,p2);
//			Hall h5= new Hall(13,29 ,4.75, 7.65 ,p2);
//			
//			p1.getListHall().add(h4);
//			p1.getListHall().add(h5);
//			
//			Place p3 = new Place("FitFive", "anverse", "yoyo", "street", 12,7, 8,20, true, new ArrayList());
//			
//			Hall h6= new Hall(4,79 ,8.75, 5.65 ,p3);
//			Hall h7= new Hall(3,19 ,9.75, 7.65 ,p3);
//			Hall h8= new Hall(5,20 ,10.75, 9.65 ,p3);
//			
//			p1.getListHall().add(h6);
//			p1.getListHall().add(h7);
//			p1.getListHall().add(h8);
//			
//			repoPlace.save(p1);
//			repoPlace.save(p2);
//			repoPlace.save(p3);
//			repoHall.save(h1);
//			repoHall.save(h2);
//			repoHall.save(h3);
//			repoHall.save(h4);
//			repoHall.save(h5);
//			repoHall.save(h6);
//			repoHall.save(h7);
//			repoHall.save(h8);
//
//
		};
		
	}
	
}
