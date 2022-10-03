package eblue.hub.eblue.hub.speciesModel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Species")
public class Species implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String speciesName;
    private String speciesScientificName;
    private String speciesWeight;
    private String speciesLength;
    private String speciesColor;
    private String speciesLifeSpan;
    private String speciesReproductiveRate;
    private String speciesCondition;
    private String speciesImage;
    @Column(nullable = false,updatable = false)
    private String speciesCode;

    public Species() {
    }

    public Species(Long id, String speciesName, String speciesScientificName, String speciesWeight, String speciesLength, String speciesColor, String speciesLifeSpan, String speciesReproductiveRate, String speciesCondition, String speciesImage, String speciesCode) {
        this.id = id;
        this.speciesName = speciesName;
        this.speciesScientificName = speciesScientificName;
        this.speciesWeight = speciesWeight;
        this.speciesLength = speciesLength;
        this.speciesColor = speciesColor;
        this.speciesLifeSpan = speciesLifeSpan;
        this.speciesReproductiveRate = speciesReproductiveRate;
        this.speciesCondition = speciesCondition;
        this.speciesImage = speciesImage;
        this.speciesCode = speciesCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesScientificName() {
        return speciesScientificName;
    }

    public void setSpeciesScientificName(String speciesScientificName) {
        this.speciesScientificName = speciesScientificName;
    }

    public String getSpeciesWeight() {
        return speciesWeight;
    }

    public void setSpeciesWeight(String speciesWeight) {
        this.speciesWeight = speciesWeight;
    }

    public String getSpeciesLength() {
        return speciesLength;
    }

    public void setSpeciesLength(String speciesLength) {
        this.speciesLength = speciesLength;
    }

    public String getSpeciesColor() {
        return speciesColor;
    }

    public void setSpeciesColor(String speciesColor) {
        this.speciesColor = speciesColor;
    }

    public String getSpeciesLifeSpan() {
        return speciesLifeSpan;
    }

    public void setSpeciesLifeSpan(String speciesLifeSpan) {
        this.speciesLifeSpan = speciesLifeSpan;
    }

    public String getSpeciesReproductiveRate() {
        return speciesReproductiveRate;
    }

    public void setSpeciesReproductiveRate(String speciesReproductiveRate) {
        this.speciesReproductiveRate = speciesReproductiveRate;
    }

    public String getSpeciesCondition() {
        return speciesCondition;
    }

    public void setSpeciesCondition(String speciesCondition) {
        this.speciesCondition = speciesCondition;
    }

    public String getSpeciesImage() {
        return speciesImage;
    }

    public void setSpeciesImage(String speciesImage) {
        this.speciesImage = speciesImage;
    }

    public String getSpeciesCode() {
        return speciesCode;
    }

    public void setSpeciesCode(String speciesCode) {
        this.speciesCode = speciesCode;
    }

    @Override
    public String toString() {
        return "Species{" +
                "id=" + id +
                ", speciesName='" + speciesName + '\'' +
                ", speciesScientificName='" + speciesScientificName + '\'' +
                ", speciesWeight='" + speciesWeight + '\'' +
                ", speciesLength='" + speciesLength + '\'' +
                ", speciesColor='" + speciesColor + '\'' +
                ", speciesLifeSpan='" + speciesLifeSpan + '\'' +
                ", speciesReproductiveRate='" + speciesReproductiveRate + '\'' +
                ", speciesCondition='" + speciesCondition + '\'' +
                ", speciesImage='" + speciesImage + '\'' +
                ", speciesCode='" + speciesCode + '\'' +
                '}';
    }
}
