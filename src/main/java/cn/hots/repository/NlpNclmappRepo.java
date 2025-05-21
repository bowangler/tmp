package cn.hots.repository;


import cn.hots.entity.NlpNclmappEO;


/**
 * @author TIT
 * @version 1.0
 * @description: TODO
 * @date 2025/5/7 15:43
 */
public interface NlpNclmappRepo {
    NlpNclmappEO findByCappno(String cappno);
}
