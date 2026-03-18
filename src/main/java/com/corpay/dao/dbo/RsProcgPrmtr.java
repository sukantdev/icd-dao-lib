package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "RS_PROCG_PRMTR", catalog = "", schema = "DBO")
public class RsProcgPrmtr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "QUE_NM")
    private String queNm;
    @Basic(optional = false)
    @Column(name = "QUE_TRNS_ID")
    private String queTrnsId;
    @Basic(optional = false)
    @Column(name = "RPLY_QUE_NM")
    private String rplyQueNm;
    @Basic(optional = false)
    @Column(name = "PROC_NM")
    private String procNm;
    @Basic(optional = false)
    @Column(name = "MSG_TYP_TXT")
    private String msgTypTxt;
    @Basic(optional = false)
    @Column(name = "PROC_TRNS_ID")
    private String procTrnsId;
    @Basic(optional = false)
    @Column(name = "DFLT_APPL_TRNS_ID")
    private String dfltApplTrnsId;
    @Basic(optional = false)
    @Column(name = "DFLT_APPL_PGM_NM")
    private String dfltApplPgmNm;
    @Basic(optional = false)
    @Column(name = "IN_PROCS_NBR")
    private short inProcsNbr;
    @Basic(optional = false)
    @Column(name = "OUT_PROCS_NBR")
    private short outProcsNbr;
    @Basic(optional = false)
    @Column(name = "IN_PROCS_TXT")
    private String inProcsTxt;
    @Basic(optional = false)
    @Column(name = "OUT_PROCS_TXT")
    private String outProcsTxt;
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
    @Column(name = "MQ_EXPIRY_TM")
    private int mqExpiryTm;

    public RsProcgPrmtr() {
    }

    public RsProcgPrmtr(String queNm) {
        this.queNm = queNm;
    }

    public RsProcgPrmtr(String queNm, String queTrnsId, String rplyQueNm, String procNm, String msgTypTxt, String procTrnsId, String dfltApplTrnsId, String dfltApplPgmNm, short inProcsNbr, short outProcsNbr, String inProcsTxt, String outProcsTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, int mqExpiryTm) {
        this.queNm = queNm;
        this.queTrnsId = queTrnsId;
        this.rplyQueNm = rplyQueNm;
        this.procNm = procNm;
        this.msgTypTxt = msgTypTxt;
        this.procTrnsId = procTrnsId;
        this.dfltApplTrnsId = dfltApplTrnsId;
        this.dfltApplPgmNm = dfltApplPgmNm;
        this.inProcsNbr = inProcsNbr;
        this.outProcsNbr = outProcsNbr;
        this.inProcsTxt = inProcsTxt;
        this.outProcsTxt = outProcsTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.mqExpiryTm = mqExpiryTm;
    }

    public String getQueNm() {
        return queNm;
    }

    public void setQueNm(String queNm) {
        this.queNm = queNm;
    }

    public String getQueTrnsId() {
        return queTrnsId;
    }

    public void setQueTrnsId(String queTrnsId) {
        this.queTrnsId = queTrnsId;
    }

    public String getRplyQueNm() {
        return rplyQueNm;
    }

    public void setRplyQueNm(String rplyQueNm) {
        this.rplyQueNm = rplyQueNm;
    }

    public String getProcNm() {
        return procNm;
    }

    public void setProcNm(String procNm) {
        this.procNm = procNm;
    }

    public String getMsgTypTxt() {
        return msgTypTxt;
    }

    public void setMsgTypTxt(String msgTypTxt) {
        this.msgTypTxt = msgTypTxt;
    }

    public String getProcTrnsId() {
        return procTrnsId;
    }

    public void setProcTrnsId(String procTrnsId) {
        this.procTrnsId = procTrnsId;
    }

    public String getDfltApplTrnsId() {
        return dfltApplTrnsId;
    }

    public void setDfltApplTrnsId(String dfltApplTrnsId) {
        this.dfltApplTrnsId = dfltApplTrnsId;
    }

    public String getDfltApplPgmNm() {
        return dfltApplPgmNm;
    }

    public void setDfltApplPgmNm(String dfltApplPgmNm) {
        this.dfltApplPgmNm = dfltApplPgmNm;
    }

    public short getInProcsNbr() {
        return inProcsNbr;
    }

    public void setInProcsNbr(short inProcsNbr) {
        this.inProcsNbr = inProcsNbr;
    }

    public short getOutProcsNbr() {
        return outProcsNbr;
    }

    public void setOutProcsNbr(short outProcsNbr) {
        this.outProcsNbr = outProcsNbr;
    }

    public String getInProcsTxt() {
        return inProcsTxt;
    }

    public void setInProcsTxt(String inProcsTxt) {
        this.inProcsTxt = inProcsTxt;
    }

    public String getOutProcsTxt() {
        return outProcsTxt;
    }

    public void setOutProcsTxt(String outProcsTxt) {
        this.outProcsTxt = outProcsTxt;
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

    public int getMqExpiryTm() {
        return mqExpiryTm;
    }

    public void setMqExpiryTm(int mqExpiryTm) {
        this.mqExpiryTm = mqExpiryTm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (queNm != null ? queNm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RsProcgPrmtr)) {
            return false;
        }
        RsProcgPrmtr other = (RsProcgPrmtr) object;
        if ((this.queNm == null && other.queNm != null) || (this.queNm != null && !this.queNm.equals(other.queNm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RsProcgPrmtr[ queNm=" + queNm + " ]";
    }

}
