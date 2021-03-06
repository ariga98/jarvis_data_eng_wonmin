package ca.jrvs.apps.twitter.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Coordinates {
    private float[] coordinates;
    private String type;

    public Coordinates() { }

    public float[] getCoordinates() { return coordinates; }

    public void setCoordinates(float[] coordinates) { this.coordinates = coordinates; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }
}
