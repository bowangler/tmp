package cn.hots.icas.clmlogic.repository;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/**
 * @author TIT
 * @version 1.0
 * @description: TODO
 * @date 2025/5/20 15:37
 */
@Repository
public class BaseHibernate4QueryDao<E extends Serializable> {
    @PersistenceContext
    private EntityManager em;
    private static SessionFactory sf;
    protected Class<E> entityClass = null;

    public BaseHibernate4QueryDao() {
        if (this.getClass().getGenericSuperclass() instanceof ParameterizedType && !(((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0] instanceof TypeVariable)) {
            this.entityClass = (Class) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        }

    }

    public void flush() {this.em.flush();}

    public void clear() {
        this.em.flush();
        this.em.clear();
    }

    public void save(E entity) {
        if (!this.em.contains(entity)) {
            this.em.merge(entity);
        }
    }

    public void save(Collection<E> entities) {
        for (E entity : entities) {
            this.save(entity);
        }
    }

}
