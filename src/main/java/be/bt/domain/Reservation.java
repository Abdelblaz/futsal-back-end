package be.bt.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
	
	int id;
	LocalDate date;
	LocalTime begin;
	LocalTime end;
	
	Hall hall;
	Client client;
	Facture facture;

}
