package dev.narasimha.midterm.dto;

import dev.narasimha.midterm.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private double price;
    private String category;
    private  String description;
    private String image;

    public void FakeStoreCategoryDto(){
        return;
    }
    public void FakeStoreCategoryDto(Product product){
        this.category = product.getCategory();
        this.title = product.getTitle();
        this.description = product.getDescription();
        this.image = product.getImageURL();
        this.price = product.getPrice();
    }
}
