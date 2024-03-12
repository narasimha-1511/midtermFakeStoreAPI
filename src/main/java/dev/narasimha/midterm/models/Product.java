package dev.narasimha.midterm.models;


import dev.narasimha.midterm.dto.FakeStoreProductDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private Long id;
    private String title;
    private String description;
    private double price;
    private String category;
    private String imageURL;
    
    public Product(){
        
    }
    
    public Product(FakeStoreProductDto fakeStoreProductDto){
        this.setId(fakeStoreProductDto.getId());
        this.setCategory(fakeStoreProductDto.getCategory());
        this.setTitle(fakeStoreProductDto.getTitle());
        this.setDescription(fakeStoreProductDto.getDescription());
        this.setPrice(fakeStoreProductDto.getPrice());
        this.setImageURL(fakeStoreProductDto.getImage());
    }

}

