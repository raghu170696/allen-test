package com.allen.Application.service;

import com.allen.Application.model.Deal;
import com.allen.Application.repository.DealRepository;
import com.allen.Application.repository.UserRepository;

public class DealServiceImpl implements DealService{

    public DealRepository dealRepository;
    public UserRepository userRepository;

    public DealServiceImpl(DealRepository dealRepository, UserRepository userRepository) {
        this.dealRepository = dealRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void addDeal(Deal deal) {
        dealRepository.addDeal(deal);
    }

    @Override
    public Deal getDeal(int id) {
        return dealRepository.getDeal(id);
    }

    @Override
    public void claimDeal(int userId, int dealId) {
        if(!dealRepository.getDeal(dealId).isActive() || dealRepository.getDeal(dealId).getQuantity()<1 || userRepository.getDeals(userId).contains(dealId)) {
            System.out.println("Not eligible to claim a deal");
        } else {
            userRepository.claimDeal(userId,dealId);
            dealRepository.updateDealQuantity(dealId);
        }
    }

    @Override
    public void updateDealStatus(int dealId, boolean status) {
        dealRepository.updateDealStatus(dealId, status);
    }

    @Override
    public void updateDeal(Deal deal) {
        dealRepository.updateDeal(deal);
    }
}
