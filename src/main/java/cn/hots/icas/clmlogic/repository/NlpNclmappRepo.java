package cn.hots.icas.clmlogic.repository;

import cn.hots.icas.clmlogic.entity.NlpNclmappEO;

import java.util.List;

/**
 * @author TIT
 * @version 1.0
 * @description: TODO
 * @date 2025/5/7 15:43
 */
public interface NlpNclmappRepo {
    NlpNclmappEO findByCappno(String cappno);

    void save(NlpNclmappEO nlpNclmappEO);
}
