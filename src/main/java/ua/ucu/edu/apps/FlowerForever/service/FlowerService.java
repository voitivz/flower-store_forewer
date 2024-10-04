package ua.ucu.edu.apps.FlowerForever.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import ua.ucu.edu.apps.FlowerForever.model.Flower;
import ua.ucu.edu.apps.FlowerForever.repository.FlowerRepository;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }
    public Flower addFlower(@RequestBody Flower flower){
        return flowerRepository.save(flower);
    }
}
