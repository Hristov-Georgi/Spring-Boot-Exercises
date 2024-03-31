package springBootExercise.model.view;

import springBootExercise.model.enums.Engine;
import springBootExercise.model.enums.Transmission;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;

public class OfferDetailsView {

    private long mileage;

    private BigDecimal price;

    private Engine engine;

    private Transmission transmission;

    private LocalDateTime created; //TODO: fix date and time Converter pattern 10.12.2020 10:38

    private LocalDateTime modified;


    //TODO: uncomment when implement user and add getters and setters
    //TODO: add code in details -> user firstName and lastName
//    private String sellerFirstName;
//
//    private String sellerLastName;

    private Year year;

    private String modelName;

    private String modelBrandName;

    private String imageUrl;

    public OfferDetailsView() {
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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
