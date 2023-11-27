package com.example.android_ebay_java.model;

public class Deal {
    private int image;
    private String title;
    private String discountPrice;
    private String realPrice;
    private String discount;

    public Deal(int image, String title, String discountPrice, String realPrice, String discount) {
        this.image = image;
        this.title = title;
        this.discountPrice = discountPrice;
        this.realPrice = realPrice;
        this.discount = discount;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(String realPrice) {
        this.realPrice = realPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
