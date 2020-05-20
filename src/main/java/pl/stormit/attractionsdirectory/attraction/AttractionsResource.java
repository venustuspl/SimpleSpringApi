package pl.stormit.attractionsdirectory.attraction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("attractions")
public class AttractionsResource {

	private AttractionRepository repository;

	public AttractionsResource(AttractionRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public Iterable<Attraction> attraction(){
		return repository.findAll();
	}
}
