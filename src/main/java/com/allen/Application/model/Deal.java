package com.allen.Application.model;

import org.springframework.lang.NonNull;

public class Deal {

    @NonNull private int id;
    private int productId;
    private int quantity;
    private boolean isActive;
    private int startTimeStamp;
    private int endTimeStamp;

    public Deal(int id, int productId, int quantity, boolean isActive, int startTimeStamp, int endTimeStamp) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.isActive = isActive;
        this.startTimeStamp = startTimeStamp;
        this.endTimeStamp = endTimeStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getStartTimeStamp() {
        return startTimeStamp;
    }

    public void setStartTimeStamp(int startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public int getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(int endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "id=" + id +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", isActive=" + isActive +
                ", startTimeStamp=" + startTimeStamp +
                ", endTimeStamp=" + endTimeStamp +
                '}';
    }
}
