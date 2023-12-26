package com.nextleap.Zomato.Website;


public class Hotel {

    private Long id;
    private String h_name;
    private Long rating;
    private String food_type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return h_name;
    }

    public void setName(String name) {
        this.h_name = name;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }


    public String getFood_type() {
        return food_type;
    }

    public void setFood_type(String food_type) {
        this.food_type = food_type;
    }
}

