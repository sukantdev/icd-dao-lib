package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CRD_USG_SETUP", catalog = "", schema = "DBO")
public class CrdUsgSetup implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdUsgSetupPK crdUsgSetupPK;
    @Basic(optional = false)
    @Column(name = "DELV_TYP")
    private Character delvTyp;
    @Basic(optional = false)
    @Column(name = "OVRD_FLG")
    private Character ovrdFlg;
    @Basic(optional = false)
    @Column(name = "EMAIL_FREQ")
    private Character emailFreq;
    @Basic(optional = false)
    @Column(name = "PRINT_FREQ")
    private int printFreq;
    @Basic(optional = false)
    @Column(name = "SETUP_NM")
    private String setupNm;
    @Basic(optional = false)
    @Column(name = "SETUP_ADDR1")
    private String setupAddr1;
    @Basic(optional = false)
    @Column(name = "SETUP_ADDR2")
    private String setupAddr2;
    @Basic(optional = false)
    @Column(name = "SETUP_CTY")
    private String setupCty;
    @Basic(optional = false)
    @Column(name = "SETUP_ST")
    private String setupSt;
    @Basic(optional = false)
    @Column(name = "SETUP_ZIP")
    private String setupZip;
    @Basic(optional = false)
    @Column(name = "EMAIL_SUBJECT")
    private String emailSubject;
    @Basic(optional = false)
    @Column(name = "EMAIL_MSG")
    private String emailMsg;
    @Basic(optional = false)
    @Column(name = "EMAIL_TYP")
    private Character emailTyp;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public CrdUsgSetup() {
    }

    public CrdUsgSetup(CrdUsgSetupPK crdUsgSetupPK) {
        this.crdUsgSetupPK = crdUsgSetupPK;
    }

    public CrdUsgSetup(CrdUsgSetupPK crdUsgSetupPK, Character delvTyp, Character ovrdFlg, Character emailFreq, int printFreq, String setupNm, String setupAddr1, String setupAddr2, String setupCty, String setupSt, String setupZip, String emailSubject, String emailMsg, Character emailTyp, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdUsgSetupPK = crdUsgSetupPK;
        this.delvTyp = delvTyp;
        this.ovrdFlg = ovrdFlg;
        this.emailFreq = emailFreq;
        this.printFreq = printFreq;
        this.setupNm = setupNm;
        this.setupAddr1 = setupAddr1;
        this.setupAddr2 = setupAddr2;
        this.setupCty = setupCty;
        this.setupSt = setupSt;
        this.setupZip = setupZip;
        this.emailSubject = emailSubject;
        this.emailMsg = emailMsg;
        this.emailTyp = emailTyp;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdUsgSetup(String entityLvl, String entityId) {
        this.crdUsgSetupPK = new CrdUsgSetupPK(entityLvl, entityId);
    }

    public CrdUsgSetupPK getCrdUsgSetupPK() {
        return crdUsgSetupPK;
    }

    public void setCrdUsgSetupPK(CrdUsgSetupPK crdUsgSetupPK) {
        this.crdUsgSetupPK = crdUsgSetupPK;
    }

    public Character getDelvTyp() {
        return delvTyp;
    }

    public void setDelvTyp(Character delvTyp) {
        this.delvTyp = delvTyp;
    }

    public Character getOvrdFlg() {
        return ovrdFlg;
    }

    public void setOvrdFlg(Character ovrdFlg) {
        this.ovrdFlg = ovrdFlg;
    }

    public Character getEmailFreq() {
        return emailFreq;
    }

    public void setEmailFreq(Character emailFreq) {
        this.emailFreq = emailFreq;
    }

    public int getPrintFreq() {
        return printFreq;
    }

    public void setPrintFreq(int printFreq) {
        this.printFreq = printFreq;
    }

    public String getSetupNm() {
        return setupNm;
    }

    public void setSetupNm(String setupNm) {
        this.setupNm = setupNm;
    }

    public String getSetupAddr1() {
        return setupAddr1;
    }

    public void setSetupAddr1(String setupAddr1) {
        this.setupAddr1 = setupAddr1;
    }

    public String getSetupAddr2() {
        return setupAddr2;
    }

    public void setSetupAddr2(String setupAddr2) {
        this.setupAddr2 = setupAddr2;
    }

    public String getSetupCty() {
        return setupCty;
    }

    public void setSetupCty(String setupCty) {
        this.setupCty = setupCty;
    }

    public String getSetupSt() {
        return setupSt;
    }

    public void setSetupSt(String setupSt) {
        this.setupSt = setupSt;
    }

    public String getSetupZip() {
        return setupZip;
    }

    public void setSetupZip(String setupZip) {
        this.setupZip = setupZip;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailMsg() {
        return emailMsg;
    }

    public void setEmailMsg(String emailMsg) {
        this.emailMsg = emailMsg;
    }

    public Character getEmailTyp() {
        return emailTyp;
    }

    public void setEmailTyp(Character emailTyp) {
        this.emailTyp = emailTyp;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdUsgSetupPK != null ? crdUsgSetupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdUsgSetup)) {
            return false;
        }
        CrdUsgSetup other = (CrdUsgSetup) object;
        if ((this.crdUsgSetupPK == null && other.crdUsgSetupPK != null) || (this.crdUsgSetupPK != null && !this.crdUsgSetupPK.equals(other.crdUsgSetupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdUsgSetup[ crdUsgSetupPK=" + crdUsgSetupPK + " ]";
    }

}
