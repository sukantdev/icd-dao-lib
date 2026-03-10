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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "INV_ARLN", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvArln.findAll", query = "SELECT i FROM InvArln i")})
public class InvArln implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvArlnPK invArlnPK;
    @Basic(optional = false)
    @Column(name = "ARLN_DB_OR_CR")
    private Character arlnDbOrCr;
    @Basic(optional = false)
    @Column(name = "BLNG_TYP")
    private Character blngTyp;
    @Basic(optional = false)
    @Column(name = "PSGR_NM")
    private String psgrNm;
    @Basic(optional = false)
    @Column(name = "TKT_NBR")
    private String tktNbr;
    @Basic(optional = false)
    @Column(name = "ISNG_CARR")
    private String isngCarr;
    @Basic(optional = false)
    @Column(name = "CUST_CD")
    private String custCd;
    @Basic(optional = false)
    @Column(name = "ISU_DT")
    @Temporal(TemporalType.DATE)
    private Date isuDt;
    @Basic(optional = false)
    @Column(name = "TRVL_AGCY_CD")
    private String trvlAgcyCd;
    @Basic(optional = false)
    @Column(name = "TRVL_AGCY_NM")
    private String trvlAgcyNm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TOT_FARE")
    private BigDecimal totFare;
    @Basic(optional = false)
    @Column(name = "TOT_FEES")
    private BigDecimal totFees;
    @Basic(optional = false)
    @Column(name = "TOT_TAXES")
    private BigDecimal totTaxes;
    @Basic(optional = false)
    @Column(name = "COM_CD")
    private String comCd;
    @Basic(optional = false)
    @Column(name = "TAX_EXPT_IND")
    private Character taxExptInd;
    @Basic(optional = false)
    @Column(name = "RESTR_TKT_IND")
    private Character restrTktInd;
    @Basic(optional = false)
    @Column(name = "XCHG_TKT_AMT")
    private BigDecimal xchgTktAmt;
    @Basic(optional = false)
    @Column(name = "XCHG_FEE_AMT")
    private BigDecimal xchgFeeAmt;
    @Basic(optional = false)
    @Column(name = "TRVL_AUTH_CD")
    private String trvlAuthCd;
    @Basic(optional = false)
    @Column(name = "IATA_CLIENT_CD")
    private String iataClientCd;
    @Basic(optional = false)
    @Column(name = "TAX_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date taxTs;
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
    @Column(name = "XCHG_TICKET_NBR")
    private String xchgTicketNbr;
    @Basic(optional = false)
    @Column(name = "COMP_RSRV_SYS_CD")
    private String compRsrvSysCd;
    @Basic(optional = false)
    @Column(name = "REFUND_IND")
    private Character refundInd;
    @Basic(optional = false)
    @Column(name = "NBR_OF_LEGS_NBR")
    private short nbrOfLegsNbr;
    @Basic(optional = false)
    @Column(name = "TRVL_AGCY_INV_NBR")
    private String trvlAgcyInvNbr;
    @Basic(optional = false)
    @Column(name = "REFUND_NBR")
    private String refundNbr;
    @Basic(optional = false)
    @Column(name = "DEPART_TAX_AMT")
    private BigDecimal departTaxAmt;
    @Basic(optional = false)
    @Column(name = "DEPART_TAX_AMT_D_C_FLG")
    private Character departTaxAmtDCFlg;
    @Basic(optional = false)
    @Column(name = "DMST_IND")
    private Character dmstInd;
    @Basic(optional = false)
    @Column(name = "TICKET_TYP_CD")
    private String ticketTypCd;
    @Basic(optional = false)
    @Column(name = "PNR_REC_LOC_TXT")
    private String pnrRecLocTxt;
    @Basic(optional = false)
    @Column(name = "FINAL_DEST_CITY_TXT")
    private String finalDestCityTxt;
    @Basic(optional = false)
    @Column(name = "FARE_CALC_MODE_IND")
    private String fareCalcModeInd;
    @Basic(optional = false)
    @Column(name = "FARE_BLK_ONE_TXT")
    private String fareBlkOneTxt;
    @Basic(optional = false)
    @Column(name = "FARE_BLK_TWO_TXT")
    private String fareBlkTwoTxt;
    @Basic(optional = false)
    @Column(name = "FARE_BLK_THREE_TXT")
    private String fareBlkThreeTxt;
    @Basic(optional = false)
    @Column(name = "FARE_BLK_FOUR_TXT")
    private String fareBlkFourTxt;
    @Basic(optional = false)
    @Column(name = "TRVL_AGCY_PROD_CD")
    private String trvlAgcyProdCd;
    @Basic(optional = false)
    @Column(name = "TMC_IS_MRCH_CD")
    private Character tmcIsMrchCd;
    @Basic(optional = false)
    @Column(name = "ORIG_ISS_TICKET_NBR")
    private String origIssTicketNbr;
    @Basic(optional = false)
    @Column(name = "XCHG_TICKET_NBR2")
    private String xchgTicketNbr2;
    @Basic(optional = false)
    @Column(name = "TMC_CLIENT_ACCT_NBR")
    private String tmcClientAcctNbr;

    public InvArln() {
    }

    public InvArln(InvArlnPK invArlnPK) {
        this.invArlnPK = invArlnPK;
    }

    public InvArln(InvArlnPK invArlnPK, Character arlnDbOrCr, Character blngTyp, String psgrNm, String tktNbr, String isngCarr, String custCd, Date isuDt, String trvlAgcyCd, String trvlAgcyNm, BigDecimal totFare, BigDecimal totFees, BigDecimal totTaxes, String comCd, Character taxExptInd, Character restrTktInd, BigDecimal xchgTktAmt, BigDecimal xchgFeeAmt, String trvlAuthCd, String iataClientCd, Date taxTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String xchgTicketNbr, String compRsrvSysCd, Character refundInd, short nbrOfLegsNbr, String trvlAgcyInvNbr, String refundNbr, BigDecimal departTaxAmt, Character departTaxAmtDCFlg, Character dmstInd, String ticketTypCd, String pnrRecLocTxt, String finalDestCityTxt, String fareCalcModeInd, String fareBlkOneTxt, String fareBlkTwoTxt, String fareBlkThreeTxt, String fareBlkFourTxt, String trvlAgcyProdCd, Character tmcIsMrchCd, String origIssTicketNbr, String xchgTicketNbr2, String tmcClientAcctNbr) {
        this.invArlnPK = invArlnPK;
        this.arlnDbOrCr = arlnDbOrCr;
        this.blngTyp = blngTyp;
        this.psgrNm = psgrNm;
        this.tktNbr = tktNbr;
        this.isngCarr = isngCarr;
        this.custCd = custCd;
        this.isuDt = isuDt;
        this.trvlAgcyCd = trvlAgcyCd;
        this.trvlAgcyNm = trvlAgcyNm;
        this.totFare = totFare;
        this.totFees = totFees;
        this.totTaxes = totTaxes;
        this.comCd = comCd;
        this.taxExptInd = taxExptInd;
        this.restrTktInd = restrTktInd;
        this.xchgTktAmt = xchgTktAmt;
        this.xchgFeeAmt = xchgFeeAmt;
        this.trvlAuthCd = trvlAuthCd;
        this.iataClientCd = iataClientCd;
        this.taxTs = taxTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.xchgTicketNbr = xchgTicketNbr;
        this.compRsrvSysCd = compRsrvSysCd;
        this.refundInd = refundInd;
        this.nbrOfLegsNbr = nbrOfLegsNbr;
        this.trvlAgcyInvNbr = trvlAgcyInvNbr;
        this.refundNbr = refundNbr;
        this.departTaxAmt = departTaxAmt;
        this.departTaxAmtDCFlg = departTaxAmtDCFlg;
        this.dmstInd = dmstInd;
        this.ticketTypCd = ticketTypCd;
        this.pnrRecLocTxt = pnrRecLocTxt;
        this.finalDestCityTxt = finalDestCityTxt;
        this.fareCalcModeInd = fareCalcModeInd;
        this.fareBlkOneTxt = fareBlkOneTxt;
        this.fareBlkTwoTxt = fareBlkTwoTxt;
        this.fareBlkThreeTxt = fareBlkThreeTxt;
        this.fareBlkFourTxt = fareBlkFourTxt;
        this.trvlAgcyProdCd = trvlAgcyProdCd;
        this.tmcIsMrchCd = tmcIsMrchCd;
        this.origIssTicketNbr = origIssTicketNbr;
        this.xchgTicketNbr2 = xchgTicketNbr2;
        this.tmcClientAcctNbr = tmcClientAcctNbr;
    }

    public InvArln(Date pstdDt, int trnsId) {
        this.invArlnPK = new InvArlnPK(pstdDt, trnsId);
    }

    public InvArlnPK getInvArlnPK() {
        return invArlnPK;
    }

    public void setInvArlnPK(InvArlnPK invArlnPK) {
        this.invArlnPK = invArlnPK;
    }

    public Character getArlnDbOrCr() {
        return arlnDbOrCr;
    }

    public void setArlnDbOrCr(Character arlnDbOrCr) {
        this.arlnDbOrCr = arlnDbOrCr;
    }

    public Character getBlngTyp() {
        return blngTyp;
    }

    public void setBlngTyp(Character blngTyp) {
        this.blngTyp = blngTyp;
    }

    public String getPsgrNm() {
        return psgrNm;
    }

    public void setPsgrNm(String psgrNm) {
        this.psgrNm = psgrNm;
    }

    public String getTktNbr() {
        return tktNbr;
    }

    public void setTktNbr(String tktNbr) {
        this.tktNbr = tktNbr;
    }

    public String getIsngCarr() {
        return isngCarr;
    }

    public void setIsngCarr(String isngCarr) {
        this.isngCarr = isngCarr;
    }

    public String getCustCd() {
        return custCd;
    }

    public void setCustCd(String custCd) {
        this.custCd = custCd;
    }

    public Date getIsuDt() {
        return isuDt;
    }

    public void setIsuDt(Date isuDt) {
        this.isuDt = isuDt;
    }

    public String getTrvlAgcyCd() {
        return trvlAgcyCd;
    }

    public void setTrvlAgcyCd(String trvlAgcyCd) {
        this.trvlAgcyCd = trvlAgcyCd;
    }

    public String getTrvlAgcyNm() {
        return trvlAgcyNm;
    }

    public void setTrvlAgcyNm(String trvlAgcyNm) {
        this.trvlAgcyNm = trvlAgcyNm;
    }

    public BigDecimal getTotFare() {
        return totFare;
    }

    public void setTotFare(BigDecimal totFare) {
        this.totFare = totFare;
    }

    public BigDecimal getTotFees() {
        return totFees;
    }

    public void setTotFees(BigDecimal totFees) {
        this.totFees = totFees;
    }

    public BigDecimal getTotTaxes() {
        return totTaxes;
    }

    public void setTotTaxes(BigDecimal totTaxes) {
        this.totTaxes = totTaxes;
    }

    public String getComCd() {
        return comCd;
    }

    public void setComCd(String comCd) {
        this.comCd = comCd;
    }

    public Character getTaxExptInd() {
        return taxExptInd;
    }

    public void setTaxExptInd(Character taxExptInd) {
        this.taxExptInd = taxExptInd;
    }

    public Character getRestrTktInd() {
        return restrTktInd;
    }

    public void setRestrTktInd(Character restrTktInd) {
        this.restrTktInd = restrTktInd;
    }

    public BigDecimal getXchgTktAmt() {
        return xchgTktAmt;
    }

    public void setXchgTktAmt(BigDecimal xchgTktAmt) {
        this.xchgTktAmt = xchgTktAmt;
    }

    public BigDecimal getXchgFeeAmt() {
        return xchgFeeAmt;
    }

    public void setXchgFeeAmt(BigDecimal xchgFeeAmt) {
        this.xchgFeeAmt = xchgFeeAmt;
    }

    public String getTrvlAuthCd() {
        return trvlAuthCd;
    }

    public void setTrvlAuthCd(String trvlAuthCd) {
        this.trvlAuthCd = trvlAuthCd;
    }

    public String getIataClientCd() {
        return iataClientCd;
    }

    public void setIataClientCd(String iataClientCd) {
        this.iataClientCd = iataClientCd;
    }

    public Date getTaxTs() {
        return taxTs;
    }

    public void setTaxTs(Date taxTs) {
        this.taxTs = taxTs;
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

    public String getXchgTicketNbr() {
        return xchgTicketNbr;
    }

    public void setXchgTicketNbr(String xchgTicketNbr) {
        this.xchgTicketNbr = xchgTicketNbr;
    }

    public String getCompRsrvSysCd() {
        return compRsrvSysCd;
    }

    public void setCompRsrvSysCd(String compRsrvSysCd) {
        this.compRsrvSysCd = compRsrvSysCd;
    }

    public Character getRefundInd() {
        return refundInd;
    }

    public void setRefundInd(Character refundInd) {
        this.refundInd = refundInd;
    }

    public short getNbrOfLegsNbr() {
        return nbrOfLegsNbr;
    }

    public void setNbrOfLegsNbr(short nbrOfLegsNbr) {
        this.nbrOfLegsNbr = nbrOfLegsNbr;
    }

    public String getTrvlAgcyInvNbr() {
        return trvlAgcyInvNbr;
    }

    public void setTrvlAgcyInvNbr(String trvlAgcyInvNbr) {
        this.trvlAgcyInvNbr = trvlAgcyInvNbr;
    }

    public String getRefundNbr() {
        return refundNbr;
    }

    public void setRefundNbr(String refundNbr) {
        this.refundNbr = refundNbr;
    }

    public BigDecimal getDepartTaxAmt() {
        return departTaxAmt;
    }

    public void setDepartTaxAmt(BigDecimal departTaxAmt) {
        this.departTaxAmt = departTaxAmt;
    }

    public Character getDepartTaxAmtDCFlg() {
        return departTaxAmtDCFlg;
    }

    public void setDepartTaxAmtDCFlg(Character departTaxAmtDCFlg) {
        this.departTaxAmtDCFlg = departTaxAmtDCFlg;
    }

    public Character getDmstInd() {
        return dmstInd;
    }

    public void setDmstInd(Character dmstInd) {
        this.dmstInd = dmstInd;
    }

    public String getTicketTypCd() {
        return ticketTypCd;
    }

    public void setTicketTypCd(String ticketTypCd) {
        this.ticketTypCd = ticketTypCd;
    }

    public String getPnrRecLocTxt() {
        return pnrRecLocTxt;
    }

    public void setPnrRecLocTxt(String pnrRecLocTxt) {
        this.pnrRecLocTxt = pnrRecLocTxt;
    }

    public String getFinalDestCityTxt() {
        return finalDestCityTxt;
    }

    public void setFinalDestCityTxt(String finalDestCityTxt) {
        this.finalDestCityTxt = finalDestCityTxt;
    }

    public String getFareCalcModeInd() {
        return fareCalcModeInd;
    }

    public void setFareCalcModeInd(String fareCalcModeInd) {
        this.fareCalcModeInd = fareCalcModeInd;
    }

    public String getFareBlkOneTxt() {
        return fareBlkOneTxt;
    }

    public void setFareBlkOneTxt(String fareBlkOneTxt) {
        this.fareBlkOneTxt = fareBlkOneTxt;
    }

    public String getFareBlkTwoTxt() {
        return fareBlkTwoTxt;
    }

    public void setFareBlkTwoTxt(String fareBlkTwoTxt) {
        this.fareBlkTwoTxt = fareBlkTwoTxt;
    }

    public String getFareBlkThreeTxt() {
        return fareBlkThreeTxt;
    }

    public void setFareBlkThreeTxt(String fareBlkThreeTxt) {
        this.fareBlkThreeTxt = fareBlkThreeTxt;
    }

    public String getFareBlkFourTxt() {
        return fareBlkFourTxt;
    }

    public void setFareBlkFourTxt(String fareBlkFourTxt) {
        this.fareBlkFourTxt = fareBlkFourTxt;
    }

    public String getTrvlAgcyProdCd() {
        return trvlAgcyProdCd;
    }

    public void setTrvlAgcyProdCd(String trvlAgcyProdCd) {
        this.trvlAgcyProdCd = trvlAgcyProdCd;
    }

    public Character getTmcIsMrchCd() {
        return tmcIsMrchCd;
    }

    public void setTmcIsMrchCd(Character tmcIsMrchCd) {
        this.tmcIsMrchCd = tmcIsMrchCd;
    }

    public String getOrigIssTicketNbr() {
        return origIssTicketNbr;
    }

    public void setOrigIssTicketNbr(String origIssTicketNbr) {
        this.origIssTicketNbr = origIssTicketNbr;
    }

    public String getXchgTicketNbr2() {
        return xchgTicketNbr2;
    }

    public void setXchgTicketNbr2(String xchgTicketNbr2) {
        this.xchgTicketNbr2 = xchgTicketNbr2;
    }

    public String getTmcClientAcctNbr() {
        return tmcClientAcctNbr;
    }

    public void setTmcClientAcctNbr(String tmcClientAcctNbr) {
        this.tmcClientAcctNbr = tmcClientAcctNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invArlnPK != null ? invArlnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvArln)) {
            return false;
        }
        InvArln other = (InvArln) object;
        if ((this.invArlnPK == null && other.invArlnPK != null) || (this.invArlnPK != null && !this.invArlnPK.equals(other.invArlnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvArln[ invArlnPK=" + invArlnPK + " ]";
    }
    
}
