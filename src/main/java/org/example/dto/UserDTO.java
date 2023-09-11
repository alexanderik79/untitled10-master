package org.example.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@Builder@ToString
public class UserDTO {
    private String name;
    private String email;
    private String pass;
}
