package springBootExercise.model.view;

import springBootExercise.model.enums.Engine;
import springBootExercise.model.enums.Transmission;

import java.math.BigDecimal;
import java.time.Year;

public class OfferSummaryView {

    private String imageUrl;

    private long mileage;

    private BigDecimal price;

    private Engine engine;

    private Transmission transmission;

    private Year year;

    private String modelName;

    private String modelBrandName;

    public OfferSummaryView() {
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelBrandName() {
        return modelBrandName;
    }

    public void setModelBrandName(String modelBrandName) {
        this.modelBrandName = modelBrandName;
    }
}
