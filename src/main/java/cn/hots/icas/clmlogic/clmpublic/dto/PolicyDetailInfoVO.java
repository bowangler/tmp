package cn.hots.icas.clmlogic.clmpublic.dto;

import java.io.Serializable;

/**
 * @author TIT
 * @version 1.0
 * @description: TODO
 * @date 2025/5/8 13:53
 */
public class PolicyDetailInfoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String policyno; //保单号
    private String appno; //投保单号
    private String classname; //险种名称
    private String describe; //保单状态
    private String valdate; //生效日期
    private String delstat; //理赔状态
    private String iscon; //是否共同被保人保单
    private String autoadd; //是否自动续保
    private String sysattr; //系统来源
    private String classcode; //险种代码
    private String apid; //投保人号

    public String getPolicyno() {
        return policyno;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getValdate() {
        return valdate;
    }

    public void setValdate(String valdate) {
        this.valdate = valdate;
    }

    public String getDelstat() {
        return delstat;
    }

    public void setDelstat(String delstat) {
        this.delstat = delstat;
    }

    public String getIscon() {
        return iscon;
    }

    public void setIscon(String iscon) {
        this.iscon = iscon;
    }

    public String getAutoadd() {
        return autoadd;
    }

    public void setAutoadd(String autoadd) {
        this.autoadd = autoadd;
    }

    public String getSysattr() {
        return sysattr;
    }

    public void setSysattr(String sysattr) {
        this.sysattr = sysattr;
    }

    public String getClasscode() {
        return classcode;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode;
    }

    public String getApid() {
        return apid;
    }

    public void setApid(String apid) {
        this.apid = apid;
    }
}
