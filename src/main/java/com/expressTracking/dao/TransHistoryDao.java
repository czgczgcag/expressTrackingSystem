package com.expressTracking.dao;

import com.expressTracking.entity.TransHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TransHistoryDao {

    public void insert(TransHistory transHistory);

    public TransHistory get(String id);

}
