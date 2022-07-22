package fr.sma.back.guitare.controller;

import fr.sma.back.guitare.domain.Guitare;
import fr.sma.back.guitare.repository.GuitareRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/guitare")
@Slf4j
public class GuitareController {

	private final GuitareRepository guitareRepository;

	@GetMapping("/{id}")
	public Guitare getById(@PathVariable("id") Long id) {
		if(id==0){
			throw new IllegalArgumentException("oy");
		}
		return guitareRepository.findById(id).orElse(null);
	}

	@PostMapping
	public ResponseEntity<Guitare> save(@RequestBody Guitare guitare) {
		return ResponseEntity.ok(guitareRepository.save(guitare));
	}

}
