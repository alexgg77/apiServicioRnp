package com.example.springsocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.example.springsocial.model.TcedulaModel;


public interface TcedulaRepository extends CrudRepository<TcedulaModel,Long>,JpaRepository<TcedulaModel,Long>{
	
	@Query(value="SELECT * FROM tcedula WHERE registroced=:registro AND ordenced=:orden",nativeQuery = true)
	List< TcedulaModel> consultaPorCedula(@Param("orden") String orden,@Param("registro") Long registro );
}
