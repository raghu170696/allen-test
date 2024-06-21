package com.allen.Application.repository;

import java.util.Set;

public interface UserRepository {

    void claimDeal(int userId, int dealId);
    Set<Integer> getDeals(int userId);
}
