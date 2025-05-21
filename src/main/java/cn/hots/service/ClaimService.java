package cn.hots.service;

import cn.hots.entity.Claim;
import cn.hots.entity.NlpNclmappEO;
import cn.hots.repository.ClaimRepository;
import cn.hots.repository.NlpNclmappRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;
    @Autowired
    private NlpNclmappRepo nlpNclmappRepo;

    public Claim updateClaimStatus(Long id, String status) {
//        NlpNclmappEO nlpNclmapp = nlpNclmappRepo.findById("2").orElse(null);
        NlpNclmappEO nlpNclmapp = nlpNclmappRepo.findByCappno("2");
        System.out.println("nlpNclmapp: " + nlpNclmapp.getCappno());
        nlpNclmapp.setFlag("3");
        Claim claim = claimRepository.findById(id).orElse(null);
        if (claim != null) {
            claim.setStatus(status);
            return claim;
        }
        return null;
    }
}
