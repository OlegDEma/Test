package com.test.test.Service;

import com.test.test.Model.PostTrucks;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TruckService {
    List<PostTrucks> getList();
}
