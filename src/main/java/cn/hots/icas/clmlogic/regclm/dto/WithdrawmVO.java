package cn.hots.icas.clmlogic.regclm.dto;

import cn.hots.icas.clmlogic.clmpublic.dto.PolicyDetailInfoVO;
import cn.hots.icas.clmlogic.common.dto.HeadVO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author TIT
 * @version 1.0
 * @description: TODO
 * @date 2025/5/7 13:57
 */
public class WithdrawmVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean confirmflag;
    private String cappno;
    private String acctype;
    private String illcode;
    private String bodystatus;
    private Date bthday;
    private String movereason;
    private String secmovereason;
    private String isdead;
    private Date diedate;
    private String moveby;
    private List<PolicyDetailInfoVO> polList;
    private HeadVO head;
    private Date accdate;
    private String pname;
    private String name;
    private String classcode;
    private String classname;
    private String policyno;
    private String tele;
    private String branchname;
    private String compname;
    private String postcode;
    private String empname;
    private String addr;
    private String recipient;
    private String pid;
    private Date nowdate;
    private Date begdate;
    private String freeze;
    private String claimno;
    private String flag;
    private String hmFlag;
    private String noaptflag;
    private String movechecked;

    public boolean isConfirmflag() {
        return confirmflag;
    }

    public void setConfirmflag(boolean confirmflag) {
        this.confirmflag = confirmflag;
    }

    public String getCappno() {
        return cappno;
    }

    public void setCappno(String cappno) {
        this.cappno = cappno;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public String getIllcode() {
        return illcode;
    }

    public void setIllcode(String illcode) {
        this.illcode = illcode;
    }

    public String getBodystatus() {
        return bodystatus;
    }

    public void setBodystatus(String bodystatus) {
        this.bodystatus = bodystatus;
    }

    public Date getBthday() {
        return bthday;
    }

    public void setBthday(Date bthday) {
        this.bthday = bthday;
    }

    public String getMovereason() {
        return movereason;
    }

    public void setMovereason(String movereason) {
        this.movereason = movereason;
    }

    public String getSecmovereason() {
        return secmovereason;
    }

    public void setSecmovereason(String secmovereason) {
        this.secmovereason = secmovereason;
    }

    public String getIsdead() {
        return isdead;
    }

    public void setIsdead(String isdead) {
        this.isdead = isdead;
    }

    public Date getDiedate() {
        return diedate;
    }

    public void setDiedate(Date diedate) {
        this.diedate = diedate;
    }

    public String getMoveby() {
        return moveby;
    }

    public void setMoveby(String moveby) {
        this.moveby = moveby;
    }

    public List<PolicyDetailInfoVO> getPolList() {
        return polList;
    }

    public void setPolList(List<PolicyDetailInfoVO> polList) {
        this.polList = polList;
    }

    public HeadVO getHead() {
        return head;
    }

    public void setHead(HeadVO head) {
        this.head = head;
    }

    public Date getAccdate() {
        return accdate;
    }

    public void setAccdate(Date accdate) {
        this.accdate = accdate;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasscode() {
        return classcode;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getPolicyno() {
        return policyno;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Date getNowdate() {
        return nowdate;
    }

    public void setNowdate(Date nowdate) {
        this.nowdate = nowdate;
    }

    public Date getBegdate() {
        return begdate;
    }

    public void setBegdate(Date begdate) {
        this.begdate = begdate;
    }

    public String getFreeze() {
        return freeze;
    }

    public void setFreeze(String freeze) {
        this.freeze = freeze;
    }

    public String getClaimno() {
        return claimno;
    }

    public void setClaimno(String claimno) {
        this.claimno = claimno;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getHmFlag() {
        return hmFlag;
    }

    public void setHmFlag(String hmFlag) {
        this.hmFlag = hmFlag;
    }

    public String getNoaptflag() {
        return noaptflag;
    }

    public void setNoaptflag(String noaptflag) {
        this.noaptflag = noaptflag;
    }

    public String getMovechecked() {
        return movechecked;
    }

    public void setMovechecked(String movechecked) {
        this.movechecked = movechecked;
    }
}
