package com.tanju.designpatterns.creational.builder;

import com.tanju.designpatterns.creational.builder.model.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BuilderTests {

    @Test
    public void testSportCarBuilder() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();

        director.makeSportsCar(carBuilder);

        Car car = carBuilder.getResult();

        assertThat(car).isNotNull();
        assertThat(car.getTransmission()).isNotNull();
    }

    @Test
    public void testManualBuilder() {

    }
}
