package com.example.zadaca.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

//@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Furniture {
    private String type;
    private int wood;
    private int glass;
    private int plastic;

    public Furniture(String type, int wood, int glass, int plastic) {
        this.type = type;
        this.wood = wood;
        this.glass = glass;
        this.plastic = plastic;
    }

}
