package com.devskiller.dao;

import com.devskiller.model.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

    @Query("SELECT i FROM Item i JOIN i.reviews r GROUP BY i HAVING AVG(r.rating) < :rating")
    List<Item> findItemsWithAverageRatingLowerThan(Double rating);

}
