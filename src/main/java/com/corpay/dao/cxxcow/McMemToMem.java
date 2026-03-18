package com.corpay.dao.cxxcow;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_MEM_TO_MEM", catalog = "", schema = "CXXCOW")
public class McMemToMem implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McMemToMemPK mcMemToMemPK;
    @Column(name = "P1000_MBR_TO_MBR")
    private String p1000MbrToMbr;
    @Column(name = "P501S3_OCC_IND")
    private Short p501s3OccInd;
    @Column(name = "P501S4_MSG_NO")
    private Integer p501s4MsgNo;

    public McMemToMem() {
    }

    public McMemToMem(McMemToMemPK mcMemToMemPK) {
        this.mcMemToMemPK = mcMemToMemPK;
    }

    public McMemToMem(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcMemToMemPK = new McMemToMemPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McMemToMemPK getMcMemToMemPK() {
        return mcMemToMemPK;
    }

    public void setMcMemToMemPK(McMemToMemPK mcMemToMemPK) {
        this.mcMemToMemPK = mcMemToMemPK;
    }

    public String getP1000MbrToMbr() {
        return p1000MbrToMbr;
    }

    public void setP1000MbrToMbr(String p1000MbrToMbr) {
        this.p1000MbrToMbr = p1000MbrToMbr;
    }

    public Short getP501s3OccInd() {
        return p501s3OccInd;
    }

    public void setP501s3OccInd(Short p501s3OccInd) {
        this.p501s3OccInd = p501s3OccInd;
    }

    public Integer getP501s4MsgNo() {
        return p501s4MsgNo;
    }

    public void setP501s4MsgNo(Integer p501s4MsgNo) {
        this.p501s4MsgNo = p501s4MsgNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcMemToMemPK != null ? mcMemToMemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McMemToMem)) {
            return false;
        }
        McMemToMem other = (McMemToMem) object;
        if ((this.mcMemToMemPK == null && other.mcMemToMemPK != null) || (this.mcMemToMemPK != null && !this.mcMemToMemPK.equals(other.mcMemToMemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McMemToMem[ mcMemToMemPK=" + mcMemToMemPK + " ]";
    }

}
