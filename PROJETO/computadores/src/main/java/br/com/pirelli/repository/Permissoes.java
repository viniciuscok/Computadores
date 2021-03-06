package br.com.pirelli.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.pirelli.model.Permissao;

@Repository
public interface Permissoes extends JpaRepository<Permissao, Long> 
{
	Optional<Permissao> findByNomeStartingWithIgnoreCase(String nome);
	
	@Query(value = "SELECT * FROM Permissao WHERE nome like ?1% order by nome ASC", 
			countQuery = "SELECT count(*) FROM Permissao WHERE nome like ?1% order by nome ASC",
		    nativeQuery = true)
	Page<Permissao> findByNome(String nome, Pageable pageable);

}
