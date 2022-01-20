package com.example.springsocial.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.springsocial.model.TpadronVista;



@Repository
@Transactional
public interface TpadronRepository extends CrudRepository<TpadronVista,Long>,JpaRepository<TpadronVista,Long>{
	
	/*//CONSULTA POR CUI
	@Query(value = "SELECT d.cui from TPADRON p,TDPI d where p.nroboleta = d.nroboleta and d.cui=:cui",nativeQuery = true)
	String consultaPorCui(@Param("cui") String cui);
	
	//CONSULTA POR CEDULA
	@Query(value="SELECT d.*, p.* from TDPI d, TPADRON p where d.nroboleta=p.nroboleta and d.registrocedref=:registro and d.ordencedref=:orden",nativeQuery=true)
	List<TpadronModel> consultaPorCedula(@Param("registro") Long registro, @Param("orden") String orden);
	
	@Query(value = "SELECT * from TPADRON where nroboleta=:nroboleta",nativeQuery = true)
	TpadronModel consultaNroboleta(@Param("nroboleta") Long nroboleta);*/
	
	
	@Query(value="SELECT * FROM TPADRON WHERE CUI=:cui",nativeQuery=true)
	TpadronVista consultaparon(@Param("cui") String cui);
	
	
}
