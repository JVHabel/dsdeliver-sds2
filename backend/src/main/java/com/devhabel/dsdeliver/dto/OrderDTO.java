package com.devhabel.dsdeliver.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.devhabel.dsdeliver.entities.Order;
import com.devhabel.dsdeliver.entities.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String address;
	private Double latitude;
	private Double longitude;
	private Instant moment;
	private OrderStatus status;
	
	private List<ProductDTO> products = new ArrayList<>();

	public OrderDTO(Order entity) {
		super();
		id = entity.getId();
		address = entity.getAddress();
		latitude = entity.getLatitude();
		longitude = entity.getLongitude();
		moment = entity.getMoment();
		status = entity.getStatus();
		products = entity.getProducts().stream()
				.map(x-> new ProductDTO(x)).collect(Collectors.toList());
	}
	
	
}
