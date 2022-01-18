package com.example.springsocial.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.springsocial.model.Trenapn;


@Repository
@Transactional
public interface TrenapnRepository extends CrudRepository<Trenapn,String>,JpaRepository<Trenapn,String>{
	
	@Query(value="select * from trenapn where cui = :cui",nativeQuery = true)
	Trenapn consultaPorCui(@Param("cui") String cui);
}
