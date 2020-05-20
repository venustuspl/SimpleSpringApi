package pl.stormit.attractionsdirectory.attraction;

import lombok.Data;
import pl.stormit.attractionsdirectory.location.City;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Attraction {

	@Id
	private Long id;

	private String name;

	@ManyToOne
	private City city;
}
