package com.market.Market.repositoriy;

import com.market.Market.dto.OrderItemDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItem extends JpaRepository<OrderItemDto, Integer> {
}
