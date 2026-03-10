/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PRD_EXP_CHK", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdExpChk.findAll", query = "SELECT p FROM PrdExpChk p")})
public class PrdExpChk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "MEDIUM")
    private short medium;
    @Basic(optional = false)
    @Column(name = "FORM_ORD_QTY")
    private int formOrdQty;
    @Basic(optional = false)
    @Column(name = "CUST_FEE")
    private Character custFee;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TRNS_FEE")
    private BigDecimal trnsFee;
    @Basic(optional = false)
    @Column(name = "BILL_OPTION")
    private Character billOption;
    @Basic(optional = false)
    @Column(name = "CAPTURE_FLT_CD")
    private Character captureFltCd;
    @Basic(optional = false)
    @Column(name = "CPTR_PRPS_CD")
    private Character cptrPrpsCd;
    @Basic(optional = false)
    @Column(name = "CPTR_DRV_NBR")
    private Character cptrDrvNbr;
    @Basic(optional = false)
    @Column(name = "CPTR_RECEIVER_NM")
    private Character cptrReceiverNm;
    @Basic(optional = false)
    @Column(name = "CPTR_TRIP_NBR")
    private Character cptrTripNbr;
    @Basic(optional = false)
    @Column(name = "CPTR_UNIT_NBR")
    private Character cptrUnitNbr;
    @Basic(optional = false)
    @Column(name = "CPTR_LOC_DSGNTN")
    private Character cptrLocDsgntn;
    @Basic(optional = false)
    @Column(name = "POS_DRV_NBR")
    private Character posDrvNbr;
    @Basic(optional = false)
    @Column(name = "POS_RECEIVER_NM")
    private Character posReceiverNm;
    @Basic(optional = false)
    @Column(name = "POS_TRIP_NBR")
    private Character posTripNbr;
    @Basic(optional = false)
    @Column(name = "POS_UNIT_NBR")
    private Character posUnitNbr;
    @Basic(optional = false)
    @Column(name = "INV")
    private short inv;
    @Basic(optional = false)
    @Column(name = "REG")
    private Character reg;
    @Basic(optional = false)
    @Column(name = "UNUSED_CDS")
    private Character unusedCds;
    @Basic(optional = false)
    @Column(name = "USG")
    private Character usg;
    @Basic(optional = false)
    @Column(name = "EXP_CHK_USG")
    private Character expChkUsg;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;

    public PrdExpChk() {
    }

    public PrdExpChk(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdExpChk(String applNbr, short medium, int formOrdQty, Character custFee, BigDecimal trnsFee, Character billOption, Character captureFltCd, Character cptrPrpsCd, Character cptrDrvNbr, Character cptrReceiverNm, Character cptrTripNbr, Character cptrUnitNbr, Character cptrLocDsgntn, Character posDrvNbr, Character posReceiverNm, Character posTripNbr, Character posUnitNbr, short inv, Character reg, Character unusedCds, Character usg, Character expChkUsg, String crtUsr, Date crtTs, String mdyUsr, Date mdyTs) {
        this.applNbr = applNbr;
        this.medium = medium;
        this.formOrdQty = formOrdQty;
        this.custFee = custFee;
        this.trnsFee = trnsFee;
        this.billOption = billOption;
        this.captureFltCd = captureFltCd;
        this.cptrPrpsCd = cptrPrpsCd;
        this.cptrDrvNbr = cptrDrvNbr;
        this.cptrReceiverNm = cptrReceiverNm;
        this.cptrTripNbr = cptrTripNbr;
        this.cptrUnitNbr = cptrUnitNbr;
        this.cptrLocDsgntn = cptrLocDsgntn;
        this.posDrvNbr = posDrvNbr;
        this.posReceiverNm = posReceiverNm;
        this.posTripNbr = posTripNbr;
        this.posUnitNbr = posUnitNbr;
        this.inv = inv;
        this.reg = reg;
        this.unusedCds = unusedCds;
        this.usg = usg;
        this.expChkUsg = expChkUsg;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public short getMedium() {
        return medium;
    }

    public void setMedium(short medium) {
        this.medium = medium;
    }

    public int getFormOrdQty() {
        return formOrdQty;
    }

    public void setFormOrdQty(int formOrdQty) {
        this.formOrdQty = formOrdQty;
    }

    public Character getCustFee() {
        return custFee;
    }

    public void setCustFee(Character custFee) {
        this.custFee = custFee;
    }

    public BigDecimal getTrnsFee() {
        return trnsFee;
    }

    public void setTrnsFee(BigDecimal trnsFee) {
        this.trnsFee = trnsFee;
    }

    public Character getBillOption() {
        return billOption;
    }

    public void setBillOption(Character billOption) {
        this.billOption = billOption;
    }

    public Character getCaptureFltCd() {
        return captureFltCd;
    }

    public void setCaptureFltCd(Character captureFltCd) {
        this.captureFltCd = captureFltCd;
    }

    public Character getCptrPrpsCd() {
        return cptrPrpsCd;
    }

    public void setCptrPrpsCd(Character cptrPrpsCd) {
        this.cptrPrpsCd = cptrPrpsCd;
    }

    public Character getCptrDrvNbr() {
        return cptrDrvNbr;
    }

    public void setCptrDrvNbr(Character cptrDrvNbr) {
        this.cptrDrvNbr = cptrDrvNbr;
    }

    public Character getCptrReceiverNm() {
        return cptrReceiverNm;
    }

    public void setCptrReceiverNm(Character cptrReceiverNm) {
        this.cptrReceiverNm = cptrReceiverNm;
    }

    public Character getCptrTripNbr() {
        return cptrTripNbr;
    }

    public void setCptrTripNbr(Character cptrTripNbr) {
        this.cptrTripNbr = cptrTripNbr;
    }

    public Character getCptrUnitNbr() {
        return cptrUnitNbr;
    }

    public void setCptrUnitNbr(Character cptrUnitNbr) {
        this.cptrUnitNbr = cptrUnitNbr;
    }

    public Character getCptrLocDsgntn() {
        return cptrLocDsgntn;
    }

    public void setCptrLocDsgntn(Character cptrLocDsgntn) {
        this.cptrLocDsgntn = cptrLocDsgntn;
    }

    public Character getPosDrvNbr() {
        return posDrvNbr;
    }

    public void setPosDrvNbr(Character posDrvNbr) {
        this.posDrvNbr = posDrvNbr;
    }

    public Character getPosReceiverNm() {
        return posReceiverNm;
    }

    public void setPosReceiverNm(Character posReceiverNm) {
        this.posReceiverNm = posReceiverNm;
    }

    public Character getPosTripNbr() {
        return posTripNbr;
    }

    public void setPosTripNbr(Character posTripNbr) {
        this.posTripNbr = posTripNbr;
    }

    public Character getPosUnitNbr() {
        return posUnitNbr;
    }

    public void setPosUnitNbr(Character posUnitNbr) {
        this.posUnitNbr = posUnitNbr;
    }

    public short getInv() {
        return inv;
    }

    public void setInv(short inv) {
        this.inv = inv;
    }

    public Character getReg() {
        return reg;
    }

    public void setReg(Character reg) {
        this.reg = reg;
    }

    public Character getUnusedCds() {
        return unusedCds;
    }

    public void setUnusedCds(Character unusedCds) {
        this.unusedCds = unusedCds;
    }

    public Character getUsg() {
        return usg;
    }

    public void setUsg(Character usg) {
        this.usg = usg;
    }

    public Character getExpChkUsg() {
        return expChkUsg;
    }

    public void setExpChkUsg(Character expChkUsg) {
        this.expChkUsg = expChkUsg;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdExpChk)) {
            return false;
        }
        PrdExpChk other = (PrdExpChk) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdExpChk[ applNbr=" + applNbr + " ]";
    }
    
}
