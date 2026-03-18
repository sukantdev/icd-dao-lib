package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_SRV_CHRG_DTL", catalog = "", schema = "CXXCOW")
public class McSrvChrgDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McSrvChrgDtlPK mcSrvChrgDtlPK;
    @Basic(optional = false)
    @Column(name = "P588S1_SRV_CD")
    private String p588s1SrvCd;

    @Basic(optional = false)
    @Column(name = "P588S2_SRV_CHRG")
    private BigDecimal p588s2SrvChrg;
    @Basic(optional = false)
    @Column(name = "P588S3_SRV_CHRG_EX")
    private short p588s3SrvChrgEx;
    @Basic(optional = false)
    @Column(name = "P588S4_SRV_CHRG_SI")
    private Character p588s4SrvChrgSi;

    public McSrvChrgDtl() {
    }

    public McSrvChrgDtl(McSrvChrgDtlPK mcSrvChrgDtlPK) {
        this.mcSrvChrgDtlPK = mcSrvChrgDtlPK;
    }

    public McSrvChrgDtl(McSrvChrgDtlPK mcSrvChrgDtlPK, String p588s1SrvCd, BigDecimal p588s2SrvChrg, short p588s3SrvChrgEx, Character p588s4SrvChrgSi) {
        this.mcSrvChrgDtlPK = mcSrvChrgDtlPK;
        this.p588s1SrvCd = p588s1SrvCd;
        this.p588s2SrvChrg = p588s2SrvChrg;
        this.p588s3SrvChrgEx = p588s3SrvChrgEx;
        this.p588s4SrvChrgSi = p588s4SrvChrgSi;
    }

    public McSrvChrgDtl(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcSrvChrgDtlPK = new McSrvChrgDtlPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McSrvChrgDtlPK getMcSrvChrgDtlPK() {
        return mcSrvChrgDtlPK;
    }

    public void setMcSrvChrgDtlPK(McSrvChrgDtlPK mcSrvChrgDtlPK) {
        this.mcSrvChrgDtlPK = mcSrvChrgDtlPK;
    }

    public String getP588s1SrvCd() {
        return p588s1SrvCd;
    }

    public void setP588s1SrvCd(String p588s1SrvCd) {
        this.p588s1SrvCd = p588s1SrvCd;
    }

    public BigDecimal getP588s2SrvChrg() {
        return p588s2SrvChrg;
    }

    public void setP588s2SrvChrg(BigDecimal p588s2SrvChrg) {
        this.p588s2SrvChrg = p588s2SrvChrg;
    }

    public short getP588s3SrvChrgEx() {
        return p588s3SrvChrgEx;
    }

    public void setP588s3SrvChrgEx(short p588s3SrvChrgEx) {
        this.p588s3SrvChrgEx = p588s3SrvChrgEx;
    }

    public Character getP588s4SrvChrgSi() {
        return p588s4SrvChrgSi;
    }

    public void setP588s4SrvChrgSi(Character p588s4SrvChrgSi) {
        this.p588s4SrvChrgSi = p588s4SrvChrgSi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcSrvChrgDtlPK != null ? mcSrvChrgDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McSrvChrgDtl)) {
            return false;
        }
        McSrvChrgDtl other = (McSrvChrgDtl) object;
        if ((this.mcSrvChrgDtlPK == null && other.mcSrvChrgDtlPK != null) || (this.mcSrvChrgDtlPK != null && !this.mcSrvChrgDtlPK.equals(other.mcSrvChrgDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McSrvChrgDtl[ mcSrvChrgDtlPK=" + mcSrvChrgDtlPK + " ]";
    }

}
