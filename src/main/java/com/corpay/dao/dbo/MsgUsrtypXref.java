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
@Table(name = "MSG_USRTYP_XREF", catalog = "", schema = "DBO")
public class MsgUsrtypXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MsgUsrtypXrefPK msgUsrtypXrefPK;
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

    public MsgUsrtypXref() {
    }

    public MsgUsrtypXref(MsgUsrtypXrefPK msgUsrtypXrefPK) {
        this.msgUsrtypXrefPK = msgUsrtypXrefPK;
    }

    public MsgUsrtypXref(MsgUsrtypXrefPK msgUsrtypXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.msgUsrtypXrefPK = msgUsrtypXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MsgUsrtypXref(Date msgId, String rsrcId) {
        this.msgUsrtypXrefPK = new MsgUsrtypXrefPK(msgId, rsrcId);
    }

    public MsgUsrtypXrefPK getMsgUsrtypXrefPK() {
        return msgUsrtypXrefPK;
    }

    public void setMsgUsrtypXrefPK(MsgUsrtypXrefPK msgUsrtypXrefPK) {
        this.msgUsrtypXrefPK = msgUsrtypXrefPK;
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
        hash += (msgUsrtypXrefPK != null ? msgUsrtypXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MsgUsrtypXref)) {
            return false;
        }
        MsgUsrtypXref other = (MsgUsrtypXref) object;
        if ((this.msgUsrtypXrefPK == null && other.msgUsrtypXrefPK != null) || (this.msgUsrtypXrefPK != null && !this.msgUsrtypXrefPK.equals(other.msgUsrtypXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MsgUsrtypXref[ msgUsrtypXrefPK=" + msgUsrtypXrefPK + " ]";
    }

}
