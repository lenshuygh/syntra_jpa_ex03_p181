import javax.persistence.*;

@Entity
public class MedicalFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float height;
    private float weight;

    @OneToOne(mappedBy = "medicalFile")
    private Patient patient;

    public Long getId() {
        return id;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "MedicalFile{" +
                "id=" + id +
                ", height=" + height +
                ", weight=" + weight +
                ", patient=" + patient +
                '}';
    }
}
