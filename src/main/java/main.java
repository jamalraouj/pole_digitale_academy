import Entity.Participant;
import Entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("digital_academy");
        System.out.println("entityManager open "+entityManagerFactory.isOpen());
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Participant p=new Participant();
        p.setName("abdesselam");
        p.setEmail("abdesslam@gmail.com");
        p.setPhone("929438984");
        p.setPassword("1234");
        p.setStatus(true);
        p.setDomaine("shdsjds");
        p.setStructure("ertyui");
        entityManager.persist(p);
//        Student s2=new Student();
//        s2.setName("jamal");
//        s2.setClasse("java");
//        entityManager.persist(s2);
        System.out.println("name "+entityManager.find(User.class,1).getName());
        System.out.println("done");
        entityManager.getTransaction().commit();
        entityManager.getTransaction().begin();
        entityManager.createQuery("select user from User user",User.class).getResultList().stream().map(u->u.getName()).forEach(System.out::println);
        entityManager.getTransaction().commit();
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("digital_academy");
//        System.out.println(entityManagerFactory.isOpen());
//        System.exit(0);
//        EntityManager entityManager = entityManagerFactory.createEntityManager();

    }
}
