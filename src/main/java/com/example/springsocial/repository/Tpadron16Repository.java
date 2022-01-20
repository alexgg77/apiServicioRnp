package com.example.springsocial.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.springsocial.model.Tpadron16Vista;


@Repository
@Transactional
public interface Tpadron16Repository extends CrudRepository<Tpadron16Vista,Long>,JpaRepository<Tpadron16Vista,Long>{
	
	
	@Query(value = "select * from tpadron16 where nroboleta=:nroboleta",nativeQuery = true)
	Tpadron16Vista consultaNroboleta(@Param("nroboleta") Long nroboleta);
	
}
