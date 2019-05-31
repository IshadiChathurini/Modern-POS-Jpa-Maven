package lk.ijse.pos.dao;

import lk.ijse.pos.entity.SuperEntity;

import javax.persistence.EntityManager;
import java.util.List;

public interface CrudDAO<T extends SuperEntity, ID> extends SuperDAO {

    void setEntityManager(EntityManager entityManager);

    void save(T entity) throws Exception;

    void update(T entity) throws Exception;

    void delete(ID entityId) throws Exception;

    List<T> findAll() throws Exception;

    T find(ID entityId) throws Exception;

}
