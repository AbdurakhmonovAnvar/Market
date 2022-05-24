package com.market.Market.repositoriy;

import com.market.Market.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Integer> {
}
