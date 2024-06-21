package com.allen.Application.model;

import java.util.HashSet;
import java.util.Set;

public class User {

    private int userId;
    private Set<Integer> dealIds;

    public User(int userId) {
        this.userId = userId;
        this.dealIds = new HashSet<>();
    }
}
