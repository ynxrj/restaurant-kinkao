package th.ac.ku.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.restaurant.model.Restaurant;
import th.ac.ku.restaurant.repository.RestaurantRepository;

import java.util.List;
import java.util.UUID;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> getAll(){
        return repository.findAll();
    }

    public Restaurant create(Restaurant restaurant){
        repository.save(restaurant);
        return restaurant;
    }

    public Restaurant getRestaurant(UUID id){
        return repository.findById(id).get();
    }

    public Restaurant update(UUID id, Restaurant reqBody){
        Restaurant restaurant = repository.findById(id).get();

        restaurant.setName(reqBody.getName());
        restaurant.setAddress(reqBody.getAddress());
        restaurant.setPhone(reqBody.getPhone());
        restaurant.setNumSeats(reqBody.getNumSeats());

        repository.save(restaurant);
        return restaurant;
    }

    public Restaurant delete(UUID id){
        Restaurant restaurant = repository.findById(id).get();
        repository.deleteById(id);
        return restaurant;
    }
}
