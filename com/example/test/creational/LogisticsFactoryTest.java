package com.example.test.creational.singleton;

import com.example.pattern.creational.factory.Logistics;
import com.example.pattern.creational.factory.PlaneLogistics;
import com.example.pattern.creational.factory.RoadLogistics;

/**
 * Author: Eric
 * Date: 2025/12/8
 */
public class LogisticsFactoryTest {
    public static void main(String[] args) {
        //Decide which factory to be initialized
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();
        //Delivering by truck

        //Decide which factory to be initialized
        Logistics planeLogistics = new PlaneLogistics();
        planeLogistics.planDelivery();
        //Delivering by plane
    }
}
