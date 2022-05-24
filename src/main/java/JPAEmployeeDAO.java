import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

    public class JPAEmployeeDAO implements EmployeeDAO {
        private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
        private final EntityManager entityManager = entityManagerFactory.createEntityManager();

        @Override
        public void saveEmployee(Employee a) {
            entityManager.getTransaction().begin();
            entityManager.persist(a);
            entityManager.getTransaction().commit();
        }

        @Override
        public void deleteEmployee(Employee a) {
            entityManager.getTransaction().begin();
            entityManager.remove(a);
            entityManager.getTransaction().commit();
        }

        @Override
        public void updateEmployee(Employee a) {
            entityManager.getTransaction().begin();
            entityManager.persist(a);
            entityManager.getTransaction().commit();
            //saveAnimal(a);
        }

        @Override
        public List<Employee> getEmployee() {
            TypedQuery<Employee> query = entityManager.createQuery(
                    "SELECT a FROM Animal a", Employee.class);
            List<Employee> animals = query.getResultList();
            return animals;
        }


        @Override
        public void close() throws InterruptedException {
            entityManager.close();
            entityManagerFactory.close();
        }
    }


