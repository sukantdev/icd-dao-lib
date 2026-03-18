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
@Table(name = "MSG_HIER_XREF", catalog = "", schema = "DBO")
public class MsgHierXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MsgHierXrefPK msgHierXrefPK;
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

    public MsgHierXref() {
    }

    public MsgHierXref(MsgHierXrefPK msgHierXrefPK) {
        this.msgHierXrefPK = msgHierXrefPK;
    }

    public MsgHierXref(MsgHierXrefPK msgHierXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.msgHierXrefPK = msgHierXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MsgHierXref(Date msgId, String hierId, String nodeId) {
        this.msgHierXrefPK = new MsgHierXrefPK(msgId, hierId, nodeId);
    }

    public MsgHierXrefPK getMsgHierXrefPK() {
        return msgHierXrefPK;
    }

    public void setMsgHierXrefPK(MsgHierXrefPK msgHierXrefPK) {
        this.msgHierXrefPK = msgHierXrefPK;
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
        hash += (msgHierXrefPK != null ? msgHierXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MsgHierXref)) {
            return false;
        }
        MsgHierXref other = (MsgHierXref) object;
        if ((this.msgHierXrefPK == null && other.msgHierXrefPK != null) || (this.msgHierXrefPK != null && !this.msgHierXrefPK.equals(other.msgHierXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MsgHierXref[ msgHierXrefPK=" + msgHierXrefPK + " ]";
    }

}
