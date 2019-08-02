package com.tanju.designpatterns.creational.builder;

import com.tanju.designpatterns.creational.builder.model.Engine;
import com.tanju.designpatterns.creational.builder.model.GpsNavigator;
import com.tanju.designpatterns.creational.builder.model.Transmission;
import com.tanju.designpatterns.creational.builder.model.TripComputer;
import com.tanju.designpatterns.creational.builder.model.Type;

public interface Builder {

    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGpsNavigator(GpsNavigator gpsNavigator);
}
