package springBootExercise.model.entities;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;
import springBootExercise.model.entities.BaseEntity;
import springBootExercise.model.entities.Brand;
import springBootExercise.model.enums.VehicleCategory;

import java.time.Year;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private VehicleCategory category;

    @Column(name = "image_url")
    @Length(min = 8, max = 512)
    private String imageUrl;

    @Column(name = "star_year")
    private Year startYear;

    @Column(name = "end_year")
    private Year endYear;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Brand brand;

    public VehicleCategory getCategory() {
        return category;
    }

    public void setCategory(VehicleCategory category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Year getStartYear() {
        return startYear;
    }

    public void setStartYear(Year startYear) {
        this.startYear = startYear;
    }

    public Year getEndYear() {
        return endYear;
    }

    public void setEndYear(Year endYear) {
        this.endYear = endYear;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }


}
