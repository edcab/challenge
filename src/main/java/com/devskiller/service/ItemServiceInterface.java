package com.devskiller.service;

import java.util.List;

public interface ItemServiceInterface {

    List<String> getTitlesWithAverageRatingLowerThan(Double rating);
}
