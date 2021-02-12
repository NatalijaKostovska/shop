package com.example.zadaca.Service;

import com.example.zadaca.Model.Furniture;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SerivceFurnitureImpl implements ServiceFurniture {

    @Override
    public int addition(ArrayList<Furniture> furnitureArray) {
        int priceWood = 9;
        int priceGlass = 11;
        int pricePlastic = 4;

        int sumTable = 0;
        int sumCupboard = 0;
        int sumChair = 0;
        for (Furniture f:furnitureArray) {
            int tmp=0;
            if(f.getType().equals("glass")){
                tmp = (f.getWood() * priceWood) + (f.getPlastic() *  priceGlass) + (f.getPlastic() * pricePlastic);
                if (tmp>sumTable){
                    sumTable=tmp;
                }
            }else if(f.getType().equals("cupboard")){
                tmp = (f.getWood() * priceWood) + (f.getPlastic() *  priceGlass) + (f.getPlastic() * pricePlastic);
                if(tmp>sumCupboard){
                    sumCupboard=tmp;
                }
            }else{
                tmp = (f.getWood() * priceWood) + (f.getPlastic() *  priceGlass) + (f.getPlastic() * pricePlastic);
                if(tmp>sumChair){
                    sumChair=tmp;
                }
            }

        }
        int sum=0;
        if (sumChair > sumCupboard && sumChair > sumTable) {
            sum =  sumChair;
        }

        else if (sumCupboard > sumChair && sumCupboard > sumTable) {
            sum  = sumCupboard;
        }

        else if (sumTable > sumChair && sumTable > sumCupboard) {
            sum = sumTable;
        }
        return sum;
    }
}
