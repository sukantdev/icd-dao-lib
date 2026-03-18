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
@Table(name = "RS_SWTCH_LOG", catalog = "", schema = "DBO")
public class RsSwtchLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RsSwtchLogPK rsSwtchLogPK;
    @Basic(optional = false)
    @Column(name = "MSG_TYP")
    private String msgTyp;
    @Basic(optional = false)
    @Column(name = "MQ_MSG_ID")
    private String mqMsgId;
    @Basic(optional = false)
    @Column(name = "MQ_COR_ID")
    private String mqCorId;
    @Basic(optional = false)
    @Column(name = "RESP_CD")
    private int respCd;
    @Basic(optional = false)
    @Column(name = "DATA_LGTH")
    private int dataLgth;
    @Basic(optional = false)
    @Column(name = "REC_DATA_LGTH")
    private int recDataLgth;
    @Basic(optional = false)
    @Column(name = "COM_I_DATA_LGTH")
    private int comIDataLgth;
    @Basic(optional = false)
    @Column(name = "COM_O_DATA_LGTH")
    private int comODataLgth;
    @Basic(optional = false)
    @Column(name = "SEND_DATA_LGTH")
    private int sendDataLgth;
    @Basic(optional = false)
    @Column(name = "WORK_DATA_LGTH")
    private int workDataLgth;
    @Basic(optional = false)
    @Column(name = "MQ_MQMD_FRMT")
    private String mqMqmdFrmt;
    @Basic(optional = false)
    @Column(name = "SUB_FLD_1_LGTH")
    private int subFld1Lgth;
    @Basic(optional = false)
    @Column(name = "SUB_FLD_2_LGTH")
    private int subFld2Lgth;
    @Basic(optional = false)
    @Column(name = "SUB_FLD_3_LGTH")
    private int subFld3Lgth;
    @Basic(optional = false)
    @Column(name = "SUB_FLD_4_LGTH")
    private int subFld4Lgth;
    @Basic(optional = false)
    @Column(name = "SUB_FLD_5_LGTH")
    private int subFld5Lgth;
    @Basic(optional = false)
    @Column(name = "MSG_DATA")
    private String msgData;
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

    public RsSwtchLog() {
    }

    public RsSwtchLog(RsSwtchLogPK rsSwtchLogPK) {
        this.rsSwtchLogPK = rsSwtchLogPK;
    }

    public RsSwtchLog(RsSwtchLogPK rsSwtchLogPK, String msgTyp, String mqMsgId, String mqCorId, int respCd, int dataLgth, int recDataLgth, int comIDataLgth, int comODataLgth, int sendDataLgth, int workDataLgth, String mqMqmdFrmt, int subFld1Lgth, int subFld2Lgth, int subFld3Lgth, int subFld4Lgth, int subFld5Lgth, String msgData, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.rsSwtchLogPK = rsSwtchLogPK;
        this.msgTyp = msgTyp;
        this.mqMsgId = mqMsgId;
        this.mqCorId = mqCorId;
        this.respCd = respCd;
        this.dataLgth = dataLgth;
        this.recDataLgth = recDataLgth;
        this.comIDataLgth = comIDataLgth;
        this.comODataLgth = comODataLgth;
        this.sendDataLgth = sendDataLgth;
        this.workDataLgth = workDataLgth;
        this.mqMqmdFrmt = mqMqmdFrmt;
        this.subFld1Lgth = subFld1Lgth;
        this.subFld2Lgth = subFld2Lgth;
        this.subFld3Lgth = subFld3Lgth;
        this.subFld4Lgth = subFld4Lgth;
        this.subFld5Lgth = subFld5Lgth;
        this.msgData = msgData;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public RsSwtchLog(String procTrnsId, int reqNbr, long begUtime) {
        this.rsSwtchLogPK = new RsSwtchLogPK(procTrnsId, reqNbr, begUtime);
    }

    public RsSwtchLogPK getRsSwtchLogPK() {
        return rsSwtchLogPK;
    }

    public void setRsSwtchLogPK(RsSwtchLogPK rsSwtchLogPK) {
        this.rsSwtchLogPK = rsSwtchLogPK;
    }

    public String getMsgTyp() {
        return msgTyp;
    }

    public void setMsgTyp(String msgTyp) {
        this.msgTyp = msgTyp;
    }

    public String getMqMsgId() {
        return mqMsgId;
    }

    public void setMqMsgId(String mqMsgId) {
        this.mqMsgId = mqMsgId;
    }

    public String getMqCorId() {
        return mqCorId;
    }

    public void setMqCorId(String mqCorId) {
        this.mqCorId = mqCorId;
    }

    public int getRespCd() {
        return respCd;
    }

    public void setRespCd(int respCd) {
        this.respCd = respCd;
    }

    public int getDataLgth() {
        return dataLgth;
    }

    public void setDataLgth(int dataLgth) {
        this.dataLgth = dataLgth;
    }

    public int getRecDataLgth() {
        return recDataLgth;
    }

    public void setRecDataLgth(int recDataLgth) {
        this.recDataLgth = recDataLgth;
    }

    public int getComIDataLgth() {
        return comIDataLgth;
    }

    public void setComIDataLgth(int comIDataLgth) {
        this.comIDataLgth = comIDataLgth;
    }

    public int getComODataLgth() {
        return comODataLgth;
    }

    public void setComODataLgth(int comODataLgth) {
        this.comODataLgth = comODataLgth;
    }

    public int getSendDataLgth() {
        return sendDataLgth;
    }

    public void setSendDataLgth(int sendDataLgth) {
        this.sendDataLgth = sendDataLgth;
    }

    public int getWorkDataLgth() {
        return workDataLgth;
    }

    public void setWorkDataLgth(int workDataLgth) {
        this.workDataLgth = workDataLgth;
    }

    public String getMqMqmdFrmt() {
        return mqMqmdFrmt;
    }

    public void setMqMqmdFrmt(String mqMqmdFrmt) {
        this.mqMqmdFrmt = mqMqmdFrmt;
    }

    public int getSubFld1Lgth() {
        return subFld1Lgth;
    }

    public void setSubFld1Lgth(int subFld1Lgth) {
        this.subFld1Lgth = subFld1Lgth;
    }

    public int getSubFld2Lgth() {
        return subFld2Lgth;
    }

    public void setSubFld2Lgth(int subFld2Lgth) {
        this.subFld2Lgth = subFld2Lgth;
    }

    public int getSubFld3Lgth() {
        return subFld3Lgth;
    }

    public void setSubFld3Lgth(int subFld3Lgth) {
        this.subFld3Lgth = subFld3Lgth;
    }

    public int getSubFld4Lgth() {
        return subFld4Lgth;
    }

    public void setSubFld4Lgth(int subFld4Lgth) {
        this.subFld4Lgth = subFld4Lgth;
    }

    public int getSubFld5Lgth() {
        return subFld5Lgth;
    }

    public void setSubFld5Lgth(int subFld5Lgth) {
        this.subFld5Lgth = subFld5Lgth;
    }

    public String getMsgData() {
        return msgData;
    }

    public void setMsgData(String msgData) {
        this.msgData = msgData;
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
        hash += (rsSwtchLogPK != null ? rsSwtchLogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RsSwtchLog)) {
            return false;
        }
        RsSwtchLog other = (RsSwtchLog) object;
        if ((this.rsSwtchLogPK == null && other.rsSwtchLogPK != null) || (this.rsSwtchLogPK != null && !this.rsSwtchLogPK.equals(other.rsSwtchLogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RsSwtchLog[ rsSwtchLogPK=" + rsSwtchLogPK + " ]";
    }

}
