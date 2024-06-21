package com.allen.Application.repository;

import com.allen.Application.exception.DealNotFoundException;
import com.allen.Application.model.Deal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DealRepositoryImpl implements DealRepository{

    private Map<Integer,Deal> dealsMap;

    public DealRepositoryImpl() {
        dealsMap = new ConcurrentHashMap<>();
    }

    @Override
    public void addDeal(Deal deal) {
        dealsMap.put(deal.getId(),deal);
    }

    @Override
    public Deal getDeal(int id) {
        if(dealsMap.containsKey(id)) {
            System.out.println("deal item is : " + dealsMap.get(id));
            return dealsMap.get(id);
        } else {
            throw new DealNotFoundException("No deal present");
        }
    }

    @Override
    public void updateDealQuantity(int id) {
        if(dealsMap.containsKey(id)) {
            Deal deal = dealsMap.get(id);
            deal.setQuantity(deal.getQuantity()-1);
        } else {
            throw new DealNotFoundException("No deal present");
        }
    }

    @Override
    public void updateDealStatus(int id, boolean isActive) {
        if(dealsMap.containsKey(id)) {
            Deal deal = dealsMap.get(id);
            deal.setActive(isActive);
        } else {
            throw new DealNotFoundException("No deal present");
        }
    }

    @Override
    public void updateDeal(Deal deal) {
        if(dealsMap.containsKey(deal.getId())) {
            dealsMap.put(deal.getId(), deal);
        } else {
            throw new DealNotFoundException("No deal present");
        }
    }
}
