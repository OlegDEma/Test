package com.test.test.Service;

import com.test.test.Model.PostTrucks;
import com.test.test.TestApplication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("truckService")
public class TruckServiceImpl implements TruckService{

    @Override
    public List<PostTrucks> getList() {
        return TestApplication.getList();
    }
}
