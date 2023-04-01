package com.devskiller.service.impl;

import com.devskiller.dao.ItemRepository;
import com.devskiller.model.Item;
import com.devskiller.service.ItemServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ItemService implements ItemServiceInterface {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<String> getTitlesWithAverageRatingLowerThan(Double rating) {
        List<Item> itemsWithAverageRatingLowerThan = itemRepository.findItemsWithAverageRatingLowerThan(
            rating);

        if (CollectionUtils.isEmpty(itemsWithAverageRatingLowerThan)){
            throw new IllegalArgumentException("No items found with average rating lower than " + rating);
        }

        return itemsWithAverageRatingLowerThan.stream().map(Item::getTitle).toList();
    }

}
