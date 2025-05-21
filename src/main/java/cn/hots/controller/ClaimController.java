package cn.hots.controller;

import cn.hots.service.ClaimService;
import cn.hots.entity.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo/withdrawn")
public class ClaimController {

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
}