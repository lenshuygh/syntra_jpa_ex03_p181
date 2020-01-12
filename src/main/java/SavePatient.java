import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePatient {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("medical");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        MedicalFile medicalFile = new MedicalFile();
        medicalFile.setHeight(173F);
        medicalFile.setWeight(110F);

        Patient patient = new Patient();
        patient.setName("Lens Huygh");

        patient.setMedicalFile(medicalFile);

        entityTransaction.begin();
        //entityManager.persist(medicalFile);
        entityManager.persist(patient);
        entityTransaction.commit();
    }
}
