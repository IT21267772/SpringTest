package com.example.tutorial2.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class Cat {
    @Id
    private String id;
    private String name;
    private String address;
}
