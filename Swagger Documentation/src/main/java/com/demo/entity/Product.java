package com.demo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Schema(
		description="this is the product entity"
		)
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String description;
   private String price;
   
}
