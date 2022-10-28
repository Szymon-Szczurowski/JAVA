package com.example.oop.basic.inner_class;

class CarObj{
    private String modelName;
    private String manufacturer;
    private int year;

    public static class CarObjBuilder{

        public CarObj car = new CarObj();

        public CarObjBuilder setModelName(String modelName) {
            car.modelName = modelName;
            return this;
        }
        public CarObjBuilder setManufacturer(String manufacturer) {
            car.manufacturer = manufacturer;
            return this;
        }

        public CarObjBuilder setYear(int year) {
            car.year = year;
            return this;
        }
        public CarObj getCar(){
            return car;
        }


    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarObj{" +
                "modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                '}';
    }
}

public class PublicStaticInnerClass {
    public static void main(String[] args) {

        CarObj carObj = new CarObj.CarObjBuilder()
                .setModelName("T")
                .setManufacturer("War")
                .setYear(2001)
                .getCar();

        System.out.println(carObj.getModelName() + "\n"  + carObj.getManufacturer() + "\n " + carObj.getYear());

        System.out.println(carObj);

    }
}
