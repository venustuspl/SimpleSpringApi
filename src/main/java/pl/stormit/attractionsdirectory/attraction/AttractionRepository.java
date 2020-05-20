package pl.stormit.attractionsdirectory.attraction;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Long> {
}
