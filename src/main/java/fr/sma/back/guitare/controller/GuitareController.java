package fr.sma.back.guitare.controller;

import fr.sma.back.guitare.domain.Guitare;
import fr.sma.back.guitare.repository.GuitareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuitareController {

    @Autowired
    private GuitareRepository guitareRepository;

    @GetMapping("/{id}")
    public Guitare getById(@PathVariable("id") String id){
        return guitareRepository.findById(id).orElse(null);
    }
}
