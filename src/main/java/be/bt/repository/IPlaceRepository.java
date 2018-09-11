package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.bt.domain.Hall;
import be.bt.domain.Place;

public interface IPlaceRepository extends  JpaRepository<Place, Long> {

}
