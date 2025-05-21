package cn.hots.repository.impl;

import cn.hots.entity.NlpNclmappEO;
import cn.hots.repository.NlpNclmappRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author TIT
 * @version 1.0
 * @description: TODO
 * @date 2025/5/20 17:14
 */
@Repository
public class NlpNclmappRepoImpl implements NlpNclmappRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public NlpNclmappEO findByCappno(String cappno) {
        String hql = "from NlpNclmappEO where cappno = :cappno";
        TypedQuery<NlpNclmappEO> query = entityManager.createQuery(hql, NlpNclmappEO.class);
        query.setParameter("cappno", cappno);
        List<NlpNclmappEO> resultList = query.getResultList();
        if (resultList.isEmpty()) {
            return null;
        }
        return resultList.get(0);
    }

}