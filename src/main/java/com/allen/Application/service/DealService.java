package com.allen.Application.service;

import com.allen.Application.model.Deal;
import com.allen.Application.repository.DealRepository;

public interface DealService {

    void addDeal(Deal deal);
    Deal getDeal(int id);
    void claimDeal(int userId,int dealId);
    void updateDealStatus(int dealId,boolean status);
    void updateDeal(Deal deal);
}
