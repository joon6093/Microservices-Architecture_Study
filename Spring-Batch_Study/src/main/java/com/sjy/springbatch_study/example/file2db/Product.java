package com.sjy.springbatch_study.example.file2db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Product {

    @Id
    private Long id;
    private String name;
    private int price;
    private String type;
}
