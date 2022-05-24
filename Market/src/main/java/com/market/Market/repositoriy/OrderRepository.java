package com.market.Market.repositoriy;

import com.market.Market.dto.OrderDto;
import com.market.Market.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
