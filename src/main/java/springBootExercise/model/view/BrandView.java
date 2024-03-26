package springBootExercise.model.view;

import java.util.ArrayList;
import java.util.List;

public class BrandView {

    private String name;

    private List<ModelView> models = new ArrayList<>();

    public BrandView addModel(ModelView modelView) {
        this.models.add(modelView);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ModelView> getModels() {
        return models;
    }

    public void setModels(List<ModelView> models) {
        this.models = models;
    }


}
