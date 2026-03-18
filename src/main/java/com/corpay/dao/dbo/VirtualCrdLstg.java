package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "VIRTUAL_CRD_LSTG", catalog = "", schema = "DBO")
public class VirtualCrdLstg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Id
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "CRD_EMP_ID")
    private String crdEmpId;
    @Basic(optional = false)
    @Column(name = "DRV_TRIP_NBR")
    private String drvTripNbr;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "LST_NM")
    private String lstNm;
    @Basic(optional = false)
    @Column(name = "FST_NM")
    private String fstNm;
    @Basic(optional = false)
    @Column(name = "STAT")
    private Character stat;
    @Basic(optional = false)
    @Column(name = "CRTN_DT")
    @Temporal(TemporalType.DATE)
    private Date crtnDt;
    @Basic(optional = false)
    @Column(name = "LST_USED_DT")
    @Temporal(TemporalType.DATE)
    private Date lstUsedDt;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_NBR")
    private String drvLicNbr;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_ST_PROV")
    private String drvLicStProv;
    @Basic(optional = false)
    @Column(name = "COMP_STAND_ID")
    private String compStandId;
    @Column(name = "MISC1")
    private String misc1;
    @Column(name = "MISC2")
    private String misc2;
    @Basic(optional = false)
    @Column(name = "COMP_STAND_FLG")
    private Character compStandFlg;
    @Basic(optional = false)
    @Column(name = "COMP_STAND_XREF")
    private String compStandXref;
    @Basic(optional = false)
    @Column(name = "VC_PRMTD_ID_DRV")
    private String vcPrmtdIdDrv;
    @Basic(optional = false)
    @Column(name = "VC_VNDR_INV_NBR")
    private String vcVndrInvNbr;
    @Basic(optional = false)
    @Column(name = "VC_VNDR_NBR")
    private String vcVndrNbr;
    @Basic(optional = false)
    @Column(name = "VC_PO_NBR")
    private String vcPoNbr;
    @Basic(optional = false)
    @Column(name = "VC_WRTY_RPT")
    private Character vcWrtyRpt;
    @Basic(optional = false)
    @Column(name = "VC_WRTY_PERD")
    private String vcWrtyPerd;
    @Basic(optional = false)
    @Column(name = "RPAIR_ORD_NBR")
    private String rpairOrdNbr;

    @Basic(optional = false)
    @Column(name = "TOT_PARTS_CST")
    private BigDecimal totPartsCst;
    @Basic(optional = false)
    @Column(name = "TOT_LABOR_CST")
    private BigDecimal totLaborCst;
    @Basic(optional = false)
    @Column(name = "TOT_TAX_CST")
    private BigDecimal totTaxCst;
    @Basic(optional = false)
    @Column(name = "MISC_CST")
    private BigDecimal miscCst;
    @Basic(optional = false)
    @Column(name = "CD1_DFLT")
    private Character cd1Dflt;
    @Basic(optional = false)
    @Column(name = "VC_GL_CD1")
    private String vcGlCd1;
    @Basic(optional = false)
    @Column(name = "VC_GL_CD1_AMT")
    private BigDecimal vcGlCd1Amt;
    @Basic(optional = false)
    @Column(name = "VC_GL_CD2")
    private String vcGlCd2;
    @Basic(optional = false)
    @Column(name = "VC_GL_CD2_AMT")
    private BigDecimal vcGlCd2Amt;
    @Basic(optional = false)
    @Column(name = "VC_GL_CD3")
    private String vcGlCd3;
    @Basic(optional = false)
    @Column(name = "VC_GL_CD3_AMT")
    private BigDecimal vcGlCd3Amt;
    @Basic(optional = false)
    @Column(name = "VC_GL_CD4")
    private String vcGlCd4;
    @Basic(optional = false)
    @Column(name = "VC_GL_CD4_AMT")
    private BigDecimal vcGlCd4Amt;
    @Basic(optional = false)
    @Column(name = "EXACT_AMT")
    private Character exactAmt;
    @Basic(optional = false)
    @Column(name = "VEHS_NBR")
    private String vehsNbr;
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
    @Column(name = "CYC_FLG")
    private Character cycFlg;
    @Basic(optional = false)
    @Column(name = "CYC_OPEN_CLSD_FLG")
    private Character cycOpenClsdFlg;
    @Basic(optional = false)
    @Column(name = "CYC_AMT")
    private BigDecimal cycAmt;
    @Basic(optional = false)
    @Column(name = "CYC_AMT_USED")
    private BigDecimal cycAmtUsed;
    @Basic(optional = false)
    @Column(name = "CYC_AMT_HOLD")
    private BigDecimal cycAmtHold;
    @Basic(optional = false)
    @Column(name = "CYC_QTY")
    private int cycQty;
    @Basic(optional = false)
    @Column(name = "CYC_QTY_USED")
    private int cycQtyUsed;
    @Basic(optional = false)
    @Column(name = "CYC_QTY_HOLD")
    private int cycQtyHold;
    @Basic(optional = false)
    @Column(name = "CYC_XTNS")
    private int cycXtns;
    @Basic(optional = false)
    @Column(name = "CYC_XTNS_USED")
    private int cycXtnsUsed;
    @Basic(optional = false)
    @Column(name = "CYC_XTNS_HOLD")
    private int cycXtnsHold;
    @Basic(optional = false)
    @Column(name = "CRD_NBR15")
    private long crdNbr15;
    @Basic(optional = false)
    @Column(name = "LST_PRMCRD_UPD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lstPrmcrdUpdTs;
    @Basic(optional = false)
    @Column(name = "LST_PRMINFO_UPD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lstPrminfoUpdTs;
    @Basic(optional = false)
    @Column(name = "CRD_EXP_DT")
    private short crdExpDt;
    @Basic(optional = false)
    @Column(name = "CRD_ACTV_DT")
    @Temporal(TemporalType.DATE)
    private Date crdActvDt;
    @Basic(optional = false)
    @Column(name = "BLK_RSN_CD")
    private short blkRsnCd;
    @Basic(optional = false)
    @Column(name = "BLK_DT")
    @Temporal(TemporalType.DATE)
    private Date blkDt;
    @Basic(optional = false)
    @Column(name = "BLK_TM")
    @Temporal(TemporalType.TIME)
    private Date blkTm;
    @Basic(optional = false)
    @Column(name = "MISC3")
    private String misc3;

    public VirtualCrdLstg() {
    }

    public VirtualCrdLstg(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public VirtualCrdLstg(String crdNbr, String custId, String crdEmpId, String drvTripNbr, String unitNbr, String lstNm, String fstNm, Character stat, Date crtnDt, Date lstUsedDt, String drvLicNbr, String drvLicStProv, String compStandId, Character compStandFlg, String compStandXref, String vcPrmtdIdDrv, String vcVndrInvNbr, String vcVndrNbr, String vcPoNbr, Character vcWrtyRpt, String vcWrtyPerd, String rpairOrdNbr, BigDecimal totPartsCst, BigDecimal totLaborCst, BigDecimal totTaxCst, BigDecimal miscCst, Character cd1Dflt, String vcGlCd1, BigDecimal vcGlCd1Amt, String vcGlCd2, BigDecimal vcGlCd2Amt, String vcGlCd3, BigDecimal vcGlCd3Amt, String vcGlCd4, BigDecimal vcGlCd4Amt, Character exactAmt, String vehsNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character cycFlg, Character cycOpenClsdFlg, BigDecimal cycAmt, BigDecimal cycAmtUsed, BigDecimal cycAmtHold, int cycQty, int cycQtyUsed, int cycQtyHold, int cycXtns, int cycXtnsUsed, int cycXtnsHold, long crdNbr15, Date lstPrmcrdUpdTs, Date lstPrminfoUpdTs, short crdExpDt, Date crdActvDt, short blkRsnCd, Date blkDt, Date blkTm, String misc3) {
        this.crdNbr = crdNbr;
        this.custId = custId;
        this.crdEmpId = crdEmpId;
        this.drvTripNbr = drvTripNbr;
        this.unitNbr = unitNbr;
        this.lstNm = lstNm;
        this.fstNm = fstNm;
        this.stat = stat;
        this.crtnDt = crtnDt;
        this.lstUsedDt = lstUsedDt;
        this.drvLicNbr = drvLicNbr;
        this.drvLicStProv = drvLicStProv;
        this.compStandId = compStandId;
        this.compStandFlg = compStandFlg;
        this.compStandXref = compStandXref;
        this.vcPrmtdIdDrv = vcPrmtdIdDrv;
        this.vcVndrInvNbr = vcVndrInvNbr;
        this.vcVndrNbr = vcVndrNbr;
        this.vcPoNbr = vcPoNbr;
        this.vcWrtyRpt = vcWrtyRpt;
        this.vcWrtyPerd = vcWrtyPerd;
        this.rpairOrdNbr = rpairOrdNbr;
        this.totPartsCst = totPartsCst;
        this.totLaborCst = totLaborCst;
        this.totTaxCst = totTaxCst;
        this.miscCst = miscCst;
        this.cd1Dflt = cd1Dflt;
        this.vcGlCd1 = vcGlCd1;
        this.vcGlCd1Amt = vcGlCd1Amt;
        this.vcGlCd2 = vcGlCd2;
        this.vcGlCd2Amt = vcGlCd2Amt;
        this.vcGlCd3 = vcGlCd3;
        this.vcGlCd3Amt = vcGlCd3Amt;
        this.vcGlCd4 = vcGlCd4;
        this.vcGlCd4Amt = vcGlCd4Amt;
        this.exactAmt = exactAmt;
        this.vehsNbr = vehsNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.cycFlg = cycFlg;
        this.cycOpenClsdFlg = cycOpenClsdFlg;
        this.cycAmt = cycAmt;
        this.cycAmtUsed = cycAmtUsed;
        this.cycAmtHold = cycAmtHold;
        this.cycQty = cycQty;
        this.cycQtyUsed = cycQtyUsed;
        this.cycQtyHold = cycQtyHold;
        this.cycXtns = cycXtns;
        this.cycXtnsUsed = cycXtnsUsed;
        this.cycXtnsHold = cycXtnsHold;
        this.crdNbr15 = crdNbr15;
        this.lstPrmcrdUpdTs = lstPrmcrdUpdTs;
        this.lstPrminfoUpdTs = lstPrminfoUpdTs;
        this.crdExpDt = crdExpDt;
        this.crdActvDt = crdActvDt;
        this.blkRsnCd = blkRsnCd;
        this.blkDt = blkDt;
        this.blkTm = blkTm;
        this.misc3 = misc3;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getCrdEmpId() {
        return crdEmpId;
    }

    public void setCrdEmpId(String crdEmpId) {
        this.crdEmpId = crdEmpId;
    }

    public String getDrvTripNbr() {
        return drvTripNbr;
    }

    public void setDrvTripNbr(String drvTripNbr) {
        this.drvTripNbr = drvTripNbr;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public String getLstNm() {
        return lstNm;
    }

    public void setLstNm(String lstNm) {
        this.lstNm = lstNm;
    }

    public String getFstNm() {
        return fstNm;
    }

    public void setFstNm(String fstNm) {
        this.fstNm = fstNm;
    }

    public Character getStat() {
        return stat;
    }

    public void setStat(Character stat) {
        this.stat = stat;
    }

    public Date getCrtnDt() {
        return crtnDt;
    }

    public void setCrtnDt(Date crtnDt) {
        this.crtnDt = crtnDt;
    }

    public Date getLstUsedDt() {
        return lstUsedDt;
    }

    public void setLstUsedDt(Date lstUsedDt) {
        this.lstUsedDt = lstUsedDt;
    }

    public String getDrvLicNbr() {
        return drvLicNbr;
    }

    public void setDrvLicNbr(String drvLicNbr) {
        this.drvLicNbr = drvLicNbr;
    }

    public String getDrvLicStProv() {
        return drvLicStProv;
    }

    public void setDrvLicStProv(String drvLicStProv) {
        this.drvLicStProv = drvLicStProv;
    }

    public String getCompStandId() {
        return compStandId;
    }

    public void setCompStandId(String compStandId) {
        this.compStandId = compStandId;
    }

    public String getMisc1() {
        return misc1;
    }

    public void setMisc1(String misc1) {
        this.misc1 = misc1;
    }

    public String getMisc2() {
        return misc2;
    }

    public void setMisc2(String misc2) {
        this.misc2 = misc2;
    }

    public Character getCompStandFlg() {
        return compStandFlg;
    }

    public void setCompStandFlg(Character compStandFlg) {
        this.compStandFlg = compStandFlg;
    }

    public String getCompStandXref() {
        return compStandXref;
    }

    public void setCompStandXref(String compStandXref) {
        this.compStandXref = compStandXref;
    }

    public String getVcPrmtdIdDrv() {
        return vcPrmtdIdDrv;
    }

    public void setVcPrmtdIdDrv(String vcPrmtdIdDrv) {
        this.vcPrmtdIdDrv = vcPrmtdIdDrv;
    }

    public String getVcVndrInvNbr() {
        return vcVndrInvNbr;
    }

    public void setVcVndrInvNbr(String vcVndrInvNbr) {
        this.vcVndrInvNbr = vcVndrInvNbr;
    }

    public String getVcVndrNbr() {
        return vcVndrNbr;
    }

    public void setVcVndrNbr(String vcVndrNbr) {
        this.vcVndrNbr = vcVndrNbr;
    }

    public String getVcPoNbr() {
        return vcPoNbr;
    }

    public void setVcPoNbr(String vcPoNbr) {
        this.vcPoNbr = vcPoNbr;
    }

    public Character getVcWrtyRpt() {
        return vcWrtyRpt;
    }

    public void setVcWrtyRpt(Character vcWrtyRpt) {
        this.vcWrtyRpt = vcWrtyRpt;
    }

    public String getVcWrtyPerd() {
        return vcWrtyPerd;
    }

    public void setVcWrtyPerd(String vcWrtyPerd) {
        this.vcWrtyPerd = vcWrtyPerd;
    }

    public String getRpairOrdNbr() {
        return rpairOrdNbr;
    }

    public void setRpairOrdNbr(String rpairOrdNbr) {
        this.rpairOrdNbr = rpairOrdNbr;
    }

    public BigDecimal getTotPartsCst() {
        return totPartsCst;
    }

    public void setTotPartsCst(BigDecimal totPartsCst) {
        this.totPartsCst = totPartsCst;
    }

    public BigDecimal getTotLaborCst() {
        return totLaborCst;
    }

    public void setTotLaborCst(BigDecimal totLaborCst) {
        this.totLaborCst = totLaborCst;
    }

    public BigDecimal getTotTaxCst() {
        return totTaxCst;
    }

    public void setTotTaxCst(BigDecimal totTaxCst) {
        this.totTaxCst = totTaxCst;
    }

    public BigDecimal getMiscCst() {
        return miscCst;
    }

    public void setMiscCst(BigDecimal miscCst) {
        this.miscCst = miscCst;
    }

    public Character getCd1Dflt() {
        return cd1Dflt;
    }

    public void setCd1Dflt(Character cd1Dflt) {
        this.cd1Dflt = cd1Dflt;
    }

    public String getVcGlCd1() {
        return vcGlCd1;
    }

    public void setVcGlCd1(String vcGlCd1) {
        this.vcGlCd1 = vcGlCd1;
    }

    public BigDecimal getVcGlCd1Amt() {
        return vcGlCd1Amt;
    }

    public void setVcGlCd1Amt(BigDecimal vcGlCd1Amt) {
        this.vcGlCd1Amt = vcGlCd1Amt;
    }

    public String getVcGlCd2() {
        return vcGlCd2;
    }

    public void setVcGlCd2(String vcGlCd2) {
        this.vcGlCd2 = vcGlCd2;
    }

    public BigDecimal getVcGlCd2Amt() {
        return vcGlCd2Amt;
    }

    public void setVcGlCd2Amt(BigDecimal vcGlCd2Amt) {
        this.vcGlCd2Amt = vcGlCd2Amt;
    }

    public String getVcGlCd3() {
        return vcGlCd3;
    }

    public void setVcGlCd3(String vcGlCd3) {
        this.vcGlCd3 = vcGlCd3;
    }

    public BigDecimal getVcGlCd3Amt() {
        return vcGlCd3Amt;
    }

    public void setVcGlCd3Amt(BigDecimal vcGlCd3Amt) {
        this.vcGlCd3Amt = vcGlCd3Amt;
    }

    public String getVcGlCd4() {
        return vcGlCd4;
    }

    public void setVcGlCd4(String vcGlCd4) {
        this.vcGlCd4 = vcGlCd4;
    }

    public BigDecimal getVcGlCd4Amt() {
        return vcGlCd4Amt;
    }

    public void setVcGlCd4Amt(BigDecimal vcGlCd4Amt) {
        this.vcGlCd4Amt = vcGlCd4Amt;
    }

    public Character getExactAmt() {
        return exactAmt;
    }

    public void setExactAmt(Character exactAmt) {
        this.exactAmt = exactAmt;
    }

    public String getVehsNbr() {
        return vehsNbr;
    }

    public void setVehsNbr(String vehsNbr) {
        this.vehsNbr = vehsNbr;
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

    public Character getCycFlg() {
        return cycFlg;
    }

    public void setCycFlg(Character cycFlg) {
        this.cycFlg = cycFlg;
    }

    public Character getCycOpenClsdFlg() {
        return cycOpenClsdFlg;
    }

    public void setCycOpenClsdFlg(Character cycOpenClsdFlg) {
        this.cycOpenClsdFlg = cycOpenClsdFlg;
    }

    public BigDecimal getCycAmt() {
        return cycAmt;
    }

    public void setCycAmt(BigDecimal cycAmt) {
        this.cycAmt = cycAmt;
    }

    public BigDecimal getCycAmtUsed() {
        return cycAmtUsed;
    }

    public void setCycAmtUsed(BigDecimal cycAmtUsed) {
        this.cycAmtUsed = cycAmtUsed;
    }

    public BigDecimal getCycAmtHold() {
        return cycAmtHold;
    }

    public void setCycAmtHold(BigDecimal cycAmtHold) {
        this.cycAmtHold = cycAmtHold;
    }

    public int getCycQty() {
        return cycQty;
    }

    public void setCycQty(int cycQty) {
        this.cycQty = cycQty;
    }

    public int getCycQtyUsed() {
        return cycQtyUsed;
    }

    public void setCycQtyUsed(int cycQtyUsed) {
        this.cycQtyUsed = cycQtyUsed;
    }

    public int getCycQtyHold() {
        return cycQtyHold;
    }

    public void setCycQtyHold(int cycQtyHold) {
        this.cycQtyHold = cycQtyHold;
    }

    public int getCycXtns() {
        return cycXtns;
    }

    public void setCycXtns(int cycXtns) {
        this.cycXtns = cycXtns;
    }

    public int getCycXtnsUsed() {
        return cycXtnsUsed;
    }

    public void setCycXtnsUsed(int cycXtnsUsed) {
        this.cycXtnsUsed = cycXtnsUsed;
    }

    public int getCycXtnsHold() {
        return cycXtnsHold;
    }

    public void setCycXtnsHold(int cycXtnsHold) {
        this.cycXtnsHold = cycXtnsHold;
    }

    public long getCrdNbr15() {
        return crdNbr15;
    }

    public void setCrdNbr15(long crdNbr15) {
        this.crdNbr15 = crdNbr15;
    }

    public Date getLstPrmcrdUpdTs() {
        return lstPrmcrdUpdTs;
    }

    public void setLstPrmcrdUpdTs(Date lstPrmcrdUpdTs) {
        this.lstPrmcrdUpdTs = lstPrmcrdUpdTs;
    }

    public Date getLstPrminfoUpdTs() {
        return lstPrminfoUpdTs;
    }

    public void setLstPrminfoUpdTs(Date lstPrminfoUpdTs) {
        this.lstPrminfoUpdTs = lstPrminfoUpdTs;
    }

    public short getCrdExpDt() {
        return crdExpDt;
    }

    public void setCrdExpDt(short crdExpDt) {
        this.crdExpDt = crdExpDt;
    }

    public Date getCrdActvDt() {
        return crdActvDt;
    }

    public void setCrdActvDt(Date crdActvDt) {
        this.crdActvDt = crdActvDt;
    }

    public short getBlkRsnCd() {
        return blkRsnCd;
    }

    public void setBlkRsnCd(short blkRsnCd) {
        this.blkRsnCd = blkRsnCd;
    }

    public Date getBlkDt() {
        return blkDt;
    }

    public void setBlkDt(Date blkDt) {
        this.blkDt = blkDt;
    }

    public Date getBlkTm() {
        return blkTm;
    }

    public void setBlkTm(Date blkTm) {
        this.blkTm = blkTm;
    }

    public String getMisc3() {
        return misc3;
    }

    public void setMisc3(String misc3) {
        this.misc3 = misc3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VirtualCrdLstg)) {
            return false;
        }
        VirtualCrdLstg other = (VirtualCrdLstg) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VirtualCrdLstg[ crdNbr=" + crdNbr + " ]";
    }

}
