package cn.hots.icas.regclm.controller;

import cn.hots.icas.clmlogic.regclm.dto.WithdrawmVO;
import cn.hots.icas.clmlogic.regclm.service.WithdrawnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author TIT
 * @version 1.0
 * @description: TODO
 * @date 2025/5/7 10:22
 */
@Controller
@RequestMapping(value = "/regclm/withdrawn")
public class WithdrawCtrl {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WithdrawnService withdrawnService;

    @RequestMapping(value = "/drawnClaim", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public WithdrawmVO drawnClaim(@RequestBody WithdrawmVO vo) {
        logger.info("withdrawnClaim start");
        withdrawnService.saveWithdrawn(vo);
        return vo;
    }
}
