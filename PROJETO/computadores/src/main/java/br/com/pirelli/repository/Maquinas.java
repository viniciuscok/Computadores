package br.com.pirelli.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.pirelli.model.Maquina;
import br.com.pirelli.repository.helper.maquina.MaquinasQueries;

@Repository
public interface Maquinas extends JpaRepository<Maquina, Long>, MaquinasQueries
{
	public Optional<Maquina> findByNomeStartingWithIgnoreCase(String nome); 
	
	
	

}