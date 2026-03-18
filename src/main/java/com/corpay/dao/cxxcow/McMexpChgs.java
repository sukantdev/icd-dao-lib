package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "MC_MEXP_CHGS", catalog = "", schema = "CXXCOW")
public class McMexpChgs implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McMexpChgsPK mcMexpChgsPK;
    @Basic(optional = false)
    @Column(name = "P734S1_MEXP_DISC")
    private String p734s1MexpDisc;

    @Basic(optional = false)
    @Column(name = "P734S2_MEXP_AMT")
    private BigDecimal p734s2MexpAmt;
    @Basic(optional = false)
    @Column(name = "P734S3_MEXP_AMT_EX")
    private short p734s3MexpAmtEx;
    @Basic(optional = false)
    @Column(name = "P734S4_MEXP_AMT_SI")
    private Character p734s4MexpAmtSi;

    public McMexpChgs() {
    }

    public McMexpChgs(McMexpChgsPK mcMexpChgsPK) {
        this.mcMexpChgsPK = mcMexpChgsPK;
    }

    public McMexpChgs(McMexpChgsPK mcMexpChgsPK, String p734s1MexpDisc, BigDecimal p734s2MexpAmt, short p734s3MexpAmtEx, Character p734s4MexpAmtSi) {
        this.mcMexpChgsPK = mcMexpChgsPK;
        this.p734s1MexpDisc = p734s1MexpDisc;
        this.p734s2MexpAmt = p734s2MexpAmt;
        this.p734s3MexpAmtEx = p734s3MexpAmtEx;
        this.p734s4MexpAmtSi = p734s4MexpAmtSi;
    }

    public McMexpChgs(Date mexpTs, String parentTable, short occInd) {
        this.mcMexpChgsPK = new McMexpChgsPK(mexpTs, parentTable, occInd);
    }

    public McMexpChgsPK getMcMexpChgsPK() {
        return mcMexpChgsPK;
    }

    public void setMcMexpChgsPK(McMexpChgsPK mcMexpChgsPK) {
        this.mcMexpChgsPK = mcMexpChgsPK;
    }

    public String getP734s1MexpDisc() {
        return p734s1MexpDisc;
    }

    public void setP734s1MexpDisc(String p734s1MexpDisc) {
        this.p734s1MexpDisc = p734s1MexpDisc;
    }

    public BigDecimal getP734s2MexpAmt() {
        return p734s2MexpAmt;
    }

    public void setP734s2MexpAmt(BigDecimal p734s2MexpAmt) {
        this.p734s2MexpAmt = p734s2MexpAmt;
    }

    public short getP734s3MexpAmtEx() {
        return p734s3MexpAmtEx;
    }

    public void setP734s3MexpAmtEx(short p734s3MexpAmtEx) {
        this.p734s3MexpAmtEx = p734s3MexpAmtEx;
    }

    public Character getP734s4MexpAmtSi() {
        return p734s4MexpAmtSi;
    }

    public void setP734s4MexpAmtSi(Character p734s4MexpAmtSi) {
        this.p734s4MexpAmtSi = p734s4MexpAmtSi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcMexpChgsPK != null ? mcMexpChgsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McMexpChgs)) {
            return false;
        }
        McMexpChgs other = (McMexpChgs) object;
        if ((this.mcMexpChgsPK == null && other.mcMexpChgsPK != null) || (this.mcMexpChgsPK != null && !this.mcMexpChgsPK.equals(other.mcMexpChgsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McMexpChgs[ mcMexpChgsPK=" + mcMexpChgsPK + " ]";
    }

}
