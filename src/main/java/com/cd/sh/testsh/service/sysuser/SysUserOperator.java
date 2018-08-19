package com.cd.sh.testsh.service.sysuser;

import com.cd.sh.testsh.service.sysuser.entity.SysUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class SysUserOperator {
    private SessionFactory sessionFactory;

    protected void setUp() throws Exception {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    public void listUser() throws Exception {
        setUp();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery("from sys_user").list();
        for (SysUser event : (List<SysUser>) result) {
            System.out.println("Event (" + event.getName() + ") : " + event.getEmail());
        }
        session.getTransaction().commit();
        session.close();
    }


}
