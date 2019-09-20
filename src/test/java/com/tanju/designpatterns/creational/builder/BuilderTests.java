package com.tanju.designpatterns.creational.builder;

import com.tanju.designpatterns.creational.builder.model.Car;
import com.tanju.designpatterns.creational.builder.model.Manual;
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

        assertForSport(car);
    }

    @Test
    public void testManualBuilderWithDirector() {
        Director director = new Director();
        ManualBuilder manualBuilder = new ManualBuilder();
        director.makeSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();

        assertForSport(manual);
    }

    @Test
    public void testFamilyCarBuilderWithDirector() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.makeFamilyCar(carBuilder);
        Car car = carBuilder.getResult();

        assertForFamily(car);
    }

    @Test
    public void testFamilyManualBuilderWithDirector() {
        Director director = new Director();
        ManualBuilder manualBuilder = new ManualBuilder();
        director.makeFamilyCar(manualBuilder);
        Manual manual = manualBuilder.getResult();

        assertForFamily(manual);
    }

    private void assertForSport(Car car) {
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

    private void assertForSport(Manual manual) {
        assertThat(manual).isNotNull();
        assertThat(manual.getType()).isEqualTo(Type.SPORT);
        assertThat(manual.getTransmission()).isEqualTo(Transmission.MANUAL);
        assertThat(manual.getSeats()).isEqualTo(2);
        assertThat(manual.getGpsNavigator()).isNotNull();
        assertThat(manual.getGpsNavigator().getDestination()).isEqualTo("Istanbul");
        assertThat(manual.getTripComputer()).isNotNull();
        assertThat(manual.getTripComputer().getFuel()).isEqualTo(65);
        assertThat(manual.getEngine()).isNotNull();
        assertThat(manual.getEngine().getSize()).isEqualTo(2.0f);
        assertThat(manual.getEngine().getHorsePower()).isEqualTo(150);
    }

    private void assertForFamily(Car car) {
        assertThat(car).isNotNull();
        assertThat(car.getType()).isEqualTo(Type.SUV);
        assertThat(car.getTransmission()).isEqualTo(Transmission.AUTO);
        assertThat(car.getSeats()).isEqualTo(7);
        assertThat(car.getGpsNavigator()).isNotNull();
        assertThat(car.getGpsNavigator().getDestination()).isEqualTo("Washington");
        assertThat(car.getTripComputer()).isNotNull();
        assertThat(car.getTripComputer().getFuel()).isEqualTo(70);
        assertThat(car.getEngine()).isNotNull();
        assertThat(car.getEngine().getSize()).isEqualTo(3.0f);
        assertThat(car.getEngine().getHorsePower()).isEqualTo(200);
    }

    private void assertForFamily(Manual manual) {
        assertThat(manual).isNotNull();
        assertThat(manual.getType()).isEqualTo(Type.SUV);
        assertThat(manual.getTransmission()).isEqualTo(Transmission.AUTO);
        assertThat(manual.getSeats()).isEqualTo(7);
        assertThat(manual.getGpsNavigator()).isNotNull();
        assertThat(manual.getGpsNavigator().getDestination()).isEqualTo("Washington");
        assertThat(manual.getTripComputer()).isNotNull();
        assertThat(manual.getTripComputer().getFuel()).isEqualTo(70);
        assertThat(manual.getEngine()).isNotNull();
        assertThat(manual.getEngine().getSize()).isEqualTo(3.0f);
        assertThat(manual.getEngine().getHorsePower()).isEqualTo(200);
    }
}
