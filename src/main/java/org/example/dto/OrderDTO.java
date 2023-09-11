package org.example.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder@Setter@Getter@ToString
public class OrderDTO {
    private String name;
    private int orderNumber;
    private String product;
    private int quantity;
}
