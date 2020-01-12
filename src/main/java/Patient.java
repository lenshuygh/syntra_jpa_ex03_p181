import javax.persistence.*;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.PERSIST/*,
    fetch = FetchType.EAGER*/)
    private MedicalFile medicalFile;

    public MedicalFile getMedicalFile() {
        return medicalFile;
    }

    public void setMedicalFile(MedicalFile medicalFile) {
        this.medicalFile = medicalFile;
        medicalFile.setPatient(this);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void removeMedicalFile(){
        if(medicalFile != null){
            medicalFile.setPatient(null);
            medicalFile = null;
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", medicalFile=" + medicalFile +
                '}';
    }
}
