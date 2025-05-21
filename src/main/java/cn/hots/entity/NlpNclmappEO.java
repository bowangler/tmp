package cn.hots.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author TIT
 * @version 1.0
 * @description: TODO
 * @date 2025/4/29 14:54
 */

@Entity
@Table(name = "NLP_NCLMAPP")
@DynamicUpdate
public class NlpNclmappEO {
    @Id
    private String cappno;
    private String pid;
    @Temporal(TemporalType.DATE)
    private Date accdate;
    private String acceptype;
    private String accidental;
    private String bodystat;
    private String bodystatcode;
    private String name;
    private String sex;
    private String iccard;
    private String operno;
    private String localtype;
    private String local;
    private String result;
    private String empno;
    private String repzip;
    private String reprel;
    private String repid;
    private String repname;
    private Integer repage;
    private String repsex;
    @Temporal(TemporalType.TIMESTAMP)
    private Date repdate;
    private String reptype;
    private String reptele;
    private String repaddr;
    @Column(name = "REMPHONE_A")
    private String remphoneA;
    @Column(name = "REMPHONE_B")
    private String remphoneB;
    @Temporal(TemporalType.TIMESTAMP)
    private Date reptime;
    private String sudtype;
    private String flag;
    @Temporal(TemporalType.TIMESTAMP)
    private Date movedate;
    private String moveno;
    private String movereason;
    private String moveby;
    @Temporal(TemporalType.TIMESTAMP)
    private Date getdate;
    @Temporal(TemporalType.DATE)
    private Date deaddate;
    private String deadreason;
    private String emptel;
    private String diseCode;
    @Temporal(TemporalType.DATE)
    @Column(name = "DISECODE_AUTH_DATE")
    private Date diseCodeAuthDate;
    @Temporal(TemporalType.DATE)
    private Date maimdate;
    @Column(name = "FREEZE_FLAG")
    private String freezeFlag;
    @Temporal(TemporalType.DATE)
    private Date renguan;
    private String empnum;
    private String sdmsgrep;
    private String sdmsgemp;
    private String recordflag;
    private String claimtag;
    private String isjvclaim;
    private String companyname;
    private String branchid;
    private String tfyjflag;
    @Column(name = "VIP_LEVEL")
    private String vipLevel;
    @Temporal(TemporalType.TIMESTAMP)
    private Date utime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updtime;
    private String stat;
    private String orgid;
    private String describe;
    private String compid;
    private String ownemp;
    private String addinfo;
    private String repidtype;
    private String zbnoticetype;
    private String openid;
    private String otherinfo;
    private String empname;
    private String pushstatus;
    private String jvrevoke;
    private String diseType;
    private String billchange;
    @Column(name = "is_tep")
    private String isTep;
    private String localcode;
    private String biglocalcode;
    @Temporal(TemporalType.DATE)
    private Date firstdiseasedate;
    private String phone;
    private String orgen;
    private String orgename;
    private String haveill;
    @Temporal(TemporalType.DATE)
    private Date idbegin;
    @Temporal(TemporalType.DATE)
    private Date idend;
    private String isdf;
    private String batchcode;
    private String jbtNo;
    private String repeMail;
    private String repWechat;
    private String sdmsgben;
    private String source;
    private String wbcomid;
    private Date wbpreDate;
    private Date wbregDate;
    private Date wbrepDate;
    private String specialflag;
    private String bcno;
    private String cuidtype;
    private String ifhos;
    private String dfresult;
    private String dfreason;
    private String sdgwLsh;
    private String noAptFlag;
    private String rescodeType;
    private String axbwbillType;
    private String ischeck;

    public String getCappno() {
        return cappno;
    }

    public void setCappno(String cappno) {
        this.cappno = cappno;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Date getAccdate() {
        return accdate;
    }

    public void setAccdate(Date accdate) {
        this.accdate = accdate;
    }

    public String getAcceptype() {
        return acceptype;
    }

    public void setAcceptype(String acceptype) {
        this.acceptype = acceptype;
    }

    public String getAccidental() {
        return accidental;
    }

    public void setAccidental(String accidental) {
        this.accidental = accidental;
    }

    public String getBodystat() {
        return bodystat;
    }

    public void setBodystat(String bodystat) {
        this.bodystat = bodystat;
    }

    public String getBodystatcode() {
        return bodystatcode;
    }

    public void setBodystatcode(String bodystatcode) {
        this.bodystatcode = bodystatcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIccard() {
        return iccard;
    }

    public void setIccard(String iccard) {
        this.iccard = iccard;
    }

    public String getOperno() {
        return operno;
    }

    public void setOperno(String operno) {
        this.operno = operno;
    }

    public String getLocaltype() {
        return localtype;
    }

    public void setLocaltype(String localtype) {
        this.localtype = localtype;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getRepzip() {
        return repzip;
    }

    public void setRepzip(String repzip) {
        this.repzip = repzip;
    }

    public String getReprel() {
        return reprel;
    }

    public void setReprel(String reprel) {
        this.reprel = reprel;
    }

    public String getRepid() {
        return repid;
    }

    public void setRepid(String repid) {
        this.repid = repid;
    }

    public String getRepname() {
        return repname;
    }

    public void setRepname(String repname) {
        this.repname = repname;
    }

    public Integer getRepage() {
        return repage;
    }

    public void setRepage(Integer repage) {
        this.repage = repage;
    }

    public String getRepsex() {
        return repsex;
    }

    public void setRepsex(String repsex) {
        this.repsex = repsex;
    }

    public Date getRepdate() {
        return repdate;
    }

    public void setRepdate(Date repdate) {
        this.repdate = repdate;
    }

    public String getReptype() {
        return reptype;
    }

    public void setReptype(String reptype) {
        this.reptype = reptype;
    }

    public String getReptele() {
        return reptele;
    }

    public void setReptele(String reptele) {
        this.reptele = reptele;
    }

    public String getRepaddr() {
        return repaddr;
    }

    public void setRepaddr(String repaddr) {
        this.repaddr = repaddr;
    }

    public String getRemphoneA() {
        return remphoneA;
    }

    public void setRemphoneA(String remphoneA) {
        this.remphoneA = remphoneA;
    }

    public String getRemphoneB() {
        return remphoneB;
    }

    public void setRemphoneB(String remphoneB) {
        this.remphoneB = remphoneB;
    }

    public Date getReptime() {
        return reptime;
    }

    public void setReptime(Date reptime) {
        this.reptime = reptime;
    }

    public String getSudtype() {
        return sudtype;
    }

    public void setSudtype(String sudtype) {
        this.sudtype = sudtype;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Date getMovedate() {
        return movedate;
    }

    public void setMovedate(Date movedate) {
        this.movedate = movedate;
    }

    public String getMoveno() {
        return moveno;
    }

    public void setMoveno(String moveno) {
        this.moveno = moveno;
    }

    public String getMovereason() {
        return movereason;
    }

    public void setMovereason(String movereason) {
        this.movereason = movereason;
    }

    public String getMoveby() {
        return moveby;
    }

    public void setMoveby(String moveby) {
        this.moveby = moveby;
    }

    public Date getGetdate() {
        return getdate;
    }

    public void setGetdate(Date getdate) {
        this.getdate = getdate;
    }

    public Date getDeaddate() {
        return deaddate;
    }

    public void setDeaddate(Date deaddate) {
        this.deaddate = deaddate;
    }

    public String getDeadreason() {
        return deadreason;
    }

    public void setDeadreason(String deadreason) {
        this.deadreason = deadreason;
    }

    public String getEmptel() {
        return emptel;
    }

    public void setEmptel(String emptel) {
        this.emptel = emptel;
    }

    public String getDiseCode() {
        return diseCode;
    }

    public void setDiseCode(String diseCode) {
        this.diseCode = diseCode;
    }

    public Date getDiseCodeAuthDate() {
        return diseCodeAuthDate;
    }

    public void setDiseCodeAuthDate(Date diseCodeAuthDate) {
        this.diseCodeAuthDate = diseCodeAuthDate;
    }

    public Date getMaimdate() {
        return maimdate;
    }

    public void setMaimdate(Date maimdate) {
        this.maimdate = maimdate;
    }

    public String getFreezeFlag() {
        return freezeFlag;
    }

    public void setFreezeFlag(String freezeFlag) {
        this.freezeFlag = freezeFlag;
    }

    public Date getRenguan() {
        return renguan;
    }

    public void setRenguan(Date renguan) {
        this.renguan = renguan;
    }

    public String getEmpnum() {
        return empnum;
    }

    public void setEmpnum(String empnum) {
        this.empnum = empnum;
    }

    public String getSdmsgrep() {
        return sdmsgrep;
    }

    public void setSdmsgrep(String sdmsgrep) {
        this.sdmsgrep = sdmsgrep;
    }

    public String getSdmsgemp() {
        return sdmsgemp;
    }

    public void setSdmsgemp(String sdmsgemp) {
        this.sdmsgemp = sdmsgemp;
    }

    public String getRecordflag() {
        return recordflag;
    }

    public void setRecordflag(String recordflag) {
        this.recordflag = recordflag;
    }

    public String getClaimtag() {
        return claimtag;
    }

    public void setClaimtag(String claimtag) {
        this.claimtag = claimtag;
    }

    public String getIsjvclaim() {
        return isjvclaim;
    }

    public void setIsjvclaim(String isjvclaim) {
        this.isjvclaim = isjvclaim;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public String getTfyjflag() {
        return tfyjflag;
    }

    public void setTfyjflag(String tfyjflag) {
        this.tfyjflag = tfyjflag;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid;
    }

    public String getOwnemp() {
        return ownemp;
    }

    public void setOwnemp(String ownemp) {
        this.ownemp = ownemp;
    }

    public String getAddinfo() {
        return addinfo;
    }

    public void setAddinfo(String addinfo) {
        this.addinfo = addinfo;
    }

    public String getRepidtype() {
        return repidtype;
    }

    public void setRepidtype(String repidtype) {
        this.repidtype = repidtype;
    }

    public String getZbnoticetype() {
        return zbnoticetype;
    }

    public void setZbnoticetype(String zbnoticetype) {
        this.zbnoticetype = zbnoticetype;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getOtherinfo() {
        return otherinfo;
    }

    public void setOtherinfo(String otherinfo) {
        this.otherinfo = otherinfo;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getPushstatus() {
        return pushstatus;
    }

    public void setPushstatus(String pushstatus) {
        this.pushstatus = pushstatus;
    }

    public String getJvrevoke() {
        return jvrevoke;
    }

    public void setJvrevoke(String jvrevoke) {
        this.jvrevoke = jvrevoke;
    }

    public String getDiseType() {
        return diseType;
    }

    public void setDiseType(String diseType) {
        this.diseType = diseType;
    }

    public String getBillchange() {
        return billchange;
    }

    public void setBillchange(String billchange) {
        this.billchange = billchange;
    }

    public String getIsTep() {
        return isTep;
    }

    public void setIsTep(String isTep) {
        this.isTep = isTep;
    }

    public String getLocalcode() {
        return localcode;
    }

    public void setLocalcode(String localcode) {
        this.localcode = localcode;
    }

    public String getBiglocalcode() {
        return biglocalcode;
    }

    public void setBiglocalcode(String biglocalcode) {
        this.biglocalcode = biglocalcode;
    }

    public Date getFirstdiseasedate() {
        return firstdiseasedate;
    }

    public void setFirstdiseasedate(Date firstdiseasedate) {
        this.firstdiseasedate = firstdiseasedate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrgen() {
        return orgen;
    }

    public void setOrgen(String orgen) {
        this.orgen = orgen;
    }

    public String getOrgename() {
        return orgename;
    }

    public void setOrgename(String orgename) {
        this.orgename = orgename;
    }

    public String getHaveill() {
        return haveill;
    }

    public void setHaveill(String haveill) {
        this.haveill = haveill;
    }

    public Date getIdbegin() {
        return idbegin;
    }

    public void setIdbegin(Date idbegin) {
        this.idbegin = idbegin;
    }

    public Date getIdend() {
        return idend;
    }

    public void setIdend(Date idend) {
        this.idend = idend;
    }

    public String getIsdf() {
        return isdf;
    }

    public void setIsdf(String isdf) {
        this.isdf = isdf;
    }

    public String getBatchcode() {
        return batchcode;
    }

    public void setBatchcode(String batchcode) {
        this.batchcode = batchcode;
    }

    public String getJbtNo() {
        return jbtNo;
    }

    public void setJbtNo(String jbtNo) {
        this.jbtNo = jbtNo;
    }

    public String getRepeMail() {
        return repeMail;
    }

    public void setRepeMail(String repeMail) {
        this.repeMail = repeMail;
    }

    public String getRepWechat() {
        return repWechat;
    }

    public void setRepWechat(String repWechat) {
        this.repWechat = repWechat;
    }

    public String getSdmsgben() {
        return sdmsgben;
    }

    public void setSdmsgben(String sdmsgben) {
        this.sdmsgben = sdmsgben;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getWbcomid() {
        return wbcomid;
    }

    public void setWbcomid(String wbcomid) {
        this.wbcomid = wbcomid;
    }

    public Date getWbpreDate() {
        return wbpreDate;
    }

    public void setWbpreDate(Date wbpreDate) {
        this.wbpreDate = wbpreDate;
    }

    public Date getWbregDate() {
        return wbregDate;
    }

    public void setWbregDate(Date wbregDate) {
        this.wbregDate = wbregDate;
    }

    public Date getWbrepDate() {
        return wbrepDate;
    }

    public void setWbrepDate(Date wbrepDate) {
        this.wbrepDate = wbrepDate;
    }

    public String getSpecialflag() {
        return specialflag;
    }

    public void setSpecialflag(String specialflag) {
        this.specialflag = specialflag;
    }

    public String getBcno() {
        return bcno;
    }

    public void setBcno(String bcno) {
        this.bcno = bcno;
    }

    public String getCuidtype() {
        return cuidtype;
    }

    public void setCuidtype(String cuidtype) {
        this.cuidtype = cuidtype;
    }

    public String getIfhos() {
        return ifhos;
    }

    public void setIfhos(String ifhos) {
        this.ifhos = ifhos;
    }

    public String getDfresult() {
        return dfresult;
    }

    public void setDfresult(String dfresult) {
        this.dfresult = dfresult;
    }

    public String getDfreason() {
        return dfreason;
    }

    public void setDfreason(String dfreason) {
        this.dfreason = dfreason;
    }

    public String getSdgwLsh() {
        return sdgwLsh;
    }

    public void setSdgwLsh(String sdgwLsh) {
        this.sdgwLsh = sdgwLsh;
    }

    public String getNoAptFlag() {
        return noAptFlag;
    }

    public void setNoAptFlag(String noAptFlag) {
        this.noAptFlag = noAptFlag;
    }

    public String getRescodeType() {
        return rescodeType;
    }

    public void setRescodeType(String rescodeType) {
        this.rescodeType = rescodeType;
    }

    public String getAxbwbillType() {
        return axbwbillType;
    }

    public void setAxbwbillType(String axbwbillType) {
        this.axbwbillType = axbwbillType;
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck;
    }
}
