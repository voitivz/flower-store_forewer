package ua.ucu.edu.apps.FlowerForever.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.ucu.edu.apps.FlowerForever.model.Flower;

@Repository
public interface FlowerRepository
    extends JpaRepository<Flower, Integer>{
}
