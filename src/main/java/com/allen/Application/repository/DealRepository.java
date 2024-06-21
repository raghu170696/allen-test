package com.allen.Application.repository;

import com.allen.Application.model.Deal;

public interface DealRepository {

    void addDeal(Deal deal);
    Deal getDeal(int id);
    void updateDealQuantity(int id);
    void updateDealStatus(int id,boolean isActive);
    void updateDeal(Deal deal);
}
