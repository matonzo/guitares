package fr.sma.back.guitare.repository;

import fr.sma.back.guitare.domain.Guitare;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GuitareRepository extends MongoRepository<Guitare, String> {
    //
}