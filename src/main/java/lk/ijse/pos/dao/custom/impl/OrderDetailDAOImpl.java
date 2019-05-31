package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.CrudDAOImpl;
import lk.ijse.pos.dao.custom.OrderDetailDAO;
import lk.ijse.pos.entity.OrderDetail;
import lk.ijse.pos.entity.OrderDetailPK;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.util.List;

public class OrderDetailDAOImpl extends CrudDAOImpl<OrderDetail, OrderDetailPK> implements OrderDetailDAO {



//    @Override
//    public void setSession(EntityManager session) {
//        this.entityManager = session;
//    }


}
