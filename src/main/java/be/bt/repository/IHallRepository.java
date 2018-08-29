package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.bt.domain.Hall;

public interface IHallRepository extends  JpaRepository<Hall, String> {


}
