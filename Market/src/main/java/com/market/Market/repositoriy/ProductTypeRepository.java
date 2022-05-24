package com.market.Market.repositoriy;

import com.market.Market.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductType,Integer> {
}
