package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class MsgUsrtypXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MSG_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date msgId;
    @Basic(optional = false)
    @Column(name = "RSRC_ID")
    private String rsrcId;

    public MsgUsrtypXrefPK() {
    }

    public MsgUsrtypXrefPK(Date msgId, String rsrcId) {
        this.msgId = msgId;
        this.rsrcId = rsrcId;
    }

    public Date getMsgId() {
        return msgId;
    }

    public void setMsgId(Date msgId) {
        this.msgId = msgId;
    }

    public String getRsrcId() {
        return rsrcId;
    }

    public void setRsrcId(String rsrcId) {
        this.rsrcId = rsrcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (msgId != null ? msgId.hashCode() : 0);
        hash += (rsrcId != null ? rsrcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MsgUsrtypXrefPK)) {
            return false;
        }
        MsgUsrtypXrefPK other = (MsgUsrtypXrefPK) object;
        if ((this.msgId == null && other.msgId != null) || (this.msgId != null && !this.msgId.equals(other.msgId))) {
            return false;
        }
        if ((this.rsrcId == null && other.rsrcId != null) || (this.rsrcId != null && !this.rsrcId.equals(other.rsrcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MsgUsrtypXrefPK[ msgId=" + msgId + ", rsrcId=" + rsrcId + " ]";
    }

}
