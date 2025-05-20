package cn.hots.icas.clmlogic.regclm.service.impl;

import cn.hots.icas.clmlogic.entity.NlpNclmappEO;
import cn.hots.icas.clmlogic.regclm.dto.WithdrawmVO;
import cn.hots.icas.clmlogic.regclm.service.WithdrawnService;
import cn.hots.icas.clmlogic.repository.NlpNclmappRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TIT
 * @version 1.0
 * @description: TODO
 * @date 2025/5/7 10:05
 */
@Service
public class WithdrawnServiceImpl implements WithdrawnService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private NlpNclmappRepo nlpNclmappRepo;

    @Override
    public void saveWithdrawn(WithdrawmVO vo) {
        logger.info("WithdrawnVO: {}", vo);
//        logger.info("Transaction active: {}", TransactionSynchronizationManager.isActualTransactionActive());
        logger.info("Proxy Type: {}", this.getClass().getName());

        NlpNclmappEO nlpNclmappEO = nlpNclmappRepo.findByCappno(vo.getCappno());
        logger.info(nlpNclmappEO.getCappno());
        logger.info(nlpNclmappEO.getPid());
        logger.info(nlpNclmappEO.getName());
        nlpNclmappEO.setFlag("4");
        nlpNclmappEO.setMovereason("不统一");
        nlpNclmappEO.setMoveby("系统");
        nlpNclmappEO.setFlag("4");
    }

}
