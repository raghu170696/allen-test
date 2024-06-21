package com.allen.Application.repository;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepositoryImpl implements UserRepository{

    private Map<Integer, Set<Integer>> userDealsMap;

    public UserRepositoryImpl() {
        userDealsMap = new ConcurrentHashMap<>();
    }

    @Override
    public void claimDeal(int userId,int dealId) {
        Set<Integer> dealIds;
        if(userDealsMap.containsKey(userId)) {
            dealIds = userDealsMap.get(userId);
        } else {
            dealIds = new HashSet<>();
        }
        dealIds.add(dealId);
        userDealsMap.put(userId, dealIds);
    }

    @Override
    public Set<Integer> getDeals(int userId) {
        if(userDealsMap.get(userId)==null) {
            return new HashSet<>();
        }
        return userDealsMap.get(userId);
    }
}
