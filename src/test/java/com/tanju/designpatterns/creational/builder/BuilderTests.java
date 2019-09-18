package com.tanju.designpatterns.creational.builder;

import com.tanju.designpatterns.creational.builder.model.Car;
import com.tanju.designpatterns.creational.builder.model.Transmission;
import com.tanju.designpatterns.creational.builder.model.Type;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BuilderTests {

    @Test
    public void testSportCarBuilderWithDirector() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.makeSportsCar(carBuilder);
        Car car = carBuilder.getResult();

        assertFor(car);
    }

    @Test
    public void testManualBuilderWithDirector() {
        //TODO: implement the other builder for Manual model

    }

    private void assertFor(Car car) {
        assertThat(car).isNotNull();
        assertThat(car.getType()).isEqualTo(Type.SPORT);
        assertThat(car.getTransmission()).isEqualTo(Transmission.MANUAL);
        assertThat(car.getSeats()).isEqualTo(2);
        assertThat(car.getGpsNavigator()).isNotNull();
        assertThat(car.getGpsNavigator().getDestination()).isEqualTo("Istanbul");
        assertThat(car.getTripComputer()).isNotNull();
        assertThat(car.getTripComputer().getFuel()).isEqualTo(65);
        assertThat(car.getEngine()).isNotNull();
        assertThat(car.getEngine().getSize()).isEqualTo(2.0f);
        assertThat(car.getEngine().getHorsePower()).isEqualTo(150);
    }
}
