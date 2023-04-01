package com.devskiller.controller;

import com.devskiller.service.impl.ItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping(
        value = "/titles/{rating}",
        produces = "application/json"
    )
    public ResponseEntity<List<String>> getTitles(
        @PathVariable(value = "rating") Double rating) {
        return new ResponseEntity<>(itemService.getTitlesWithAverageRatingLowerThan(rating),
            HttpStatus.OK);
    }
}
