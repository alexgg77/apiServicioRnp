package com.example.springsocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.example.springsocial.model.TcedulaModel;
import com.example.springsocial.model.TcedulaVista;


public interface TcedulaRepository extends CrudRepository<TcedulaVista,Long>,JpaRepository<TcedulaVista,Long>{
	
	@Query(value="select * from tcedula where ordenced=:orden and registroced=:registro",nativeQuery = true)
	List< TcedulaVista> consultaPorCedula(@Param("orden") String orden,@Param("registro") Long registro );
}
