package com.corpay.dao.cxxcow;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_NOTE", catalog = "", schema = "CXXCOW")
public class McNote implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McNotePK mcNotePK;
    @Column(name = "U0001_NOTE_DETAIL")
    private String u0001NoteDetail;

    public McNote() {
    }

    public McNote(McNotePK mcNotePK) {
        this.mcNotePK = mcNotePK;
    }

    public McNote(String d2PriAccntNo, int d12s1LocalTrDt, BigDecimal d30s1TrOrigAmt, short d31s1IcRtDsgtr, int d31s2AcquirBin, short d31s3JulPrcDt, long d31s4AcqSeqNo, short d31s5CheckDigit, String d38ApprvlCd) {
        this.mcNotePK = new McNotePK(d2PriAccntNo, d12s1LocalTrDt, d30s1TrOrigAmt, d31s1IcRtDsgtr, d31s2AcquirBin, d31s3JulPrcDt, d31s4AcqSeqNo, d31s5CheckDigit, d38ApprvlCd);
    }

    public McNotePK getMcNotePK() {
        return mcNotePK;
    }

    public void setMcNotePK(McNotePK mcNotePK) {
        this.mcNotePK = mcNotePK;
    }

    public String getU0001NoteDetail() {
        return u0001NoteDetail;
    }

    public void setU0001NoteDetail(String u0001NoteDetail) {
        this.u0001NoteDetail = u0001NoteDetail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcNotePK != null ? mcNotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McNote)) {
            return false;
        }
        McNote other = (McNote) object;
        if ((this.mcNotePK == null && other.mcNotePK != null) || (this.mcNotePK != null && !this.mcNotePK.equals(other.mcNotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McNote[ mcNotePK=" + mcNotePK + " ]";
    }

}
