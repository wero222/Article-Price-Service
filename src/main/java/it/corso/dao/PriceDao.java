package it.corso.dao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import it.corso.model.Price;

public interface PriceDao extends CrudRepository<Price, Integer>
{
	@Query
	(
			value = "SELECT p.price FROM Price p WHERE p.artCode=:a"
	)
	double getPriceByArtCode(@Param("a") String artCode);
}