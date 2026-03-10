/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PS14_MAINT_REQ", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Ps14MaintReq.findAll", query = "SELECT p FROM Ps14MaintReq p")})
public class Ps14MaintReq implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Ps14MaintReqPK ps14MaintReqPK;
    @Basic(optional = false)
    @Column(name = "STAND_TO_UPD")
    private Character standToUpd;
    @Basic(optional = false)
    @Column(name = "STAND_ID")
    private String standId;
    @Basic(optional = false)
    @Column(name = "FIELD_ID")
    private String fieldId;
    @Basic(optional = false)
    @Column(name = "NEW_VAL")
    private String newVal;
    @Basic(optional = false)
    @Column(name = "MIN")
    private String min;
    @Basic(optional = false)
    @Column(name = "MAX")
    private String max;
    @Basic(optional = false)
    @Column(name = "MCC")
    private String mcc;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    @Basic(optional = false)
    @Column(name = "STAT")
    private Character stat;
    @Basic(optional = false)
    @Column(name = "PROC_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date procTs;
    @Basic(optional = false)
    @Column(name = "NBR_UPDS_ATMPTD")
    private int nbrUpdsAtmptd;
    @Basic(optional = false)
    @Column(name = "NBR_UPDS_SCSFL")
    private int nbrUpdsScsfl;
    @Basic(optional = false)
    @Column(name = "NBR_UPDS_ERR")
    private int nbrUpdsErr;
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
    @Basic(optional = false)
    @Column(name = "CUST_CODEWORD")
    private String custCodeword;

    public Ps14MaintReq() {
    }

    public Ps14MaintReq(Ps14MaintReqPK ps14MaintReqPK) {
        this.ps14MaintReqPK = ps14MaintReqPK;
    }

    public Ps14MaintReq(Ps14MaintReqPK ps14MaintReqPK, Character standToUpd, String standId, String fieldId, String newVal, String min, String max, String mcc, String prdCd, Character stat, Date procTs, int nbrUpdsAtmptd, int nbrUpdsScsfl, int nbrUpdsErr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String custCodeword) {
        this.ps14MaintReqPK = ps14MaintReqPK;
        this.standToUpd = standToUpd;
        this.standId = standId;
        this.fieldId = fieldId;
        this.newVal = newVal;
        this.min = min;
        this.max = max;
        this.mcc = mcc;
        this.prdCd = prdCd;
        this.stat = stat;
        this.procTs = procTs;
        this.nbrUpdsAtmptd = nbrUpdsAtmptd;
        this.nbrUpdsScsfl = nbrUpdsScsfl;
        this.nbrUpdsErr = nbrUpdsErr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.custCodeword = custCodeword;
    }

    public Ps14MaintReq(String acctNbr, String custId, String usrId, Date reqTs, int seqNbr) {
        this.ps14MaintReqPK = new Ps14MaintReqPK(acctNbr, custId, usrId, reqTs, seqNbr);
    }

    public Ps14MaintReqPK getPs14MaintReqPK() {
        return ps14MaintReqPK;
    }

    public void setPs14MaintReqPK(Ps14MaintReqPK ps14MaintReqPK) {
        this.ps14MaintReqPK = ps14MaintReqPK;
    }

    public Character getStandToUpd() {
        return standToUpd;
    }

    public void setStandToUpd(Character standToUpd) {
        this.standToUpd = standToUpd;
    }

    public String getStandId() {
        return standId;
    }

    public void setStandId(String standId) {
        this.standId = standId;
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getNewVal() {
        return newVal;
    }

    public void setNewVal(String newVal) {
        this.newVal = newVal;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public Character getStat() {
        return stat;
    }

    public void setStat(Character stat) {
        this.stat = stat;
    }

    public Date getProcTs() {
        return procTs;
    }

    public void setProcTs(Date procTs) {
        this.procTs = procTs;
    }

    public int getNbrUpdsAtmptd() {
        return nbrUpdsAtmptd;
    }

    public void setNbrUpdsAtmptd(int nbrUpdsAtmptd) {
        this.nbrUpdsAtmptd = nbrUpdsAtmptd;
    }

    public int getNbrUpdsScsfl() {
        return nbrUpdsScsfl;
    }

    public void setNbrUpdsScsfl(int nbrUpdsScsfl) {
        this.nbrUpdsScsfl = nbrUpdsScsfl;
    }

    public int getNbrUpdsErr() {
        return nbrUpdsErr;
    }

    public void setNbrUpdsErr(int nbrUpdsErr) {
        this.nbrUpdsErr = nbrUpdsErr;
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

    public String getCustCodeword() {
        return custCodeword;
    }

    public void setCustCodeword(String custCodeword) {
        this.custCodeword = custCodeword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ps14MaintReqPK != null ? ps14MaintReqPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ps14MaintReq)) {
            return false;
        }
        Ps14MaintReq other = (Ps14MaintReq) object;
        if ((this.ps14MaintReqPK == null && other.ps14MaintReqPK != null) || (this.ps14MaintReqPK != null && !this.ps14MaintReqPK.equals(other.ps14MaintReqPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Ps14MaintReq[ ps14MaintReqPK=" + ps14MaintReqPK + " ]";
    }
    
}
