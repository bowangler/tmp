package cn.hots.icas.regclm.controller;

import cn.hots.entity.Claim;
import cn.hots.service.ClaimService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//    @Autowired
//    private WithdrawnService withdrawnService;

    @Autowired
    private ClaimService claimService;

    @PostMapping("/drawnClaim")
    public ResponseEntity<String> updateClaimStatus(@RequestParam Long id, @RequestParam String status) {
        Claim claim = claimService.updateClaimStatus(id, status);
        if (claim != null) {
            return new ResponseEntity<>("Claim status updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Claim not found", HttpStatus.NOT_FOUND);
        }
    }
//    @RequestMapping(value = "/drawnClaim", produces = "application/json", method = RequestMethod.POST)
//    @ResponseBody
//    public WithdrawmVO drawnClaim(@RequestBody WithdrawmVO vo) {
//        logger.info("withdrawnClaim start");
//        withdrawnService.saveWithdrawn(vo);
//        return vo;
//    }
}
