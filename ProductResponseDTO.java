package com.example.demo.dto;

import com.example.demo.entity.Category;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDTO {
    private Long id;
    private String name;
    private double price;
    private Category category;
}