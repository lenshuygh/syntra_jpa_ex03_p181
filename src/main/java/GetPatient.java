import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPatient {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("medical");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Patient patient = entityManager.find(Patient.class,1L);

        System.out.println(patient.getName());
        System.out.println(patient.getMedicalFile().getHeight());
    }
}
