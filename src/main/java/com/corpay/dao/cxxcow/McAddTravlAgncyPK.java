/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class McAddTravlAgncyPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "P105S1_FILE_TY")
    private short p105s1FileTy;
    @Basic(optional = false)
    @Column(name = "P105S2_FILE_R_DT")
    private int p105s2FileRDt;
    @Basic(optional = false)
    @Column(name = "P105S3_PROC_ID")
    private long p105s3ProcId;
    @Basic(optional = false)
    @Column(name = "P105S4_FILE_SEQ_NO")
    private int p105s4FileSeqNo;
    @Basic(optional = false)
    @Column(name = "P501S3_OCC_IND")
    private short p501s3OccInd;
    @Basic(optional = false)
    @Column(name = "P501S4_MSG_NO")
    private int p501s4MsgNo;
    @Basic(optional = false)
    @Column(name = "D71_MSG_NO")
    private int d71MsgNo;

    public McAddTravlAgncyPK() {
    }

    public McAddTravlAgncyPK(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.p105s1FileTy = p105s1FileTy;
        this.p105s2FileRDt = p105s2FileRDt;
        this.p105s3ProcId = p105s3ProcId;
        this.p105s4FileSeqNo = p105s4FileSeqNo;
        this.p501s3OccInd = p501s3OccInd;
        this.p501s4MsgNo = p501s4MsgNo;
        this.d71MsgNo = d71MsgNo;
    }

    public short getP105s1FileTy() {
        return p105s1FileTy;
    }

    public void setP105s1FileTy(short p105s1FileTy) {
        this.p105s1FileTy = p105s1FileTy;
    }

    public int getP105s2FileRDt() {
        return p105s2FileRDt;
    }

    public void setP105s2FileRDt(int p105s2FileRDt) {
        this.p105s2FileRDt = p105s2FileRDt;
    }

    public long getP105s3ProcId() {
        return p105s3ProcId;
    }

    public void setP105s3ProcId(long p105s3ProcId) {
        this.p105s3ProcId = p105s3ProcId;
    }

    public int getP105s4FileSeqNo() {
        return p105s4FileSeqNo;
    }

    public void setP105s4FileSeqNo(int p105s4FileSeqNo) {
        this.p105s4FileSeqNo = p105s4FileSeqNo;
    }

    public short getP501s3OccInd() {
        return p501s3OccInd;
    }

    public void setP501s3OccInd(short p501s3OccInd) {
        this.p501s3OccInd = p501s3OccInd;
    }

    public int getP501s4MsgNo() {
        return p501s4MsgNo;
    }

    public void setP501s4MsgNo(int p501s4MsgNo) {
        this.p501s4MsgNo = p501s4MsgNo;
    }

    public int getD71MsgNo() {
        return d71MsgNo;
    }

    public void setD71MsgNo(int d71MsgNo) {
        this.d71MsgNo = d71MsgNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) p105s1FileTy;
        hash += (int) p105s2FileRDt;
        hash += (int) p105s3ProcId;
        hash += (int) p105s4FileSeqNo;
        hash += (int) p501s3OccInd;
        hash += (int) p501s4MsgNo;
        hash += (int) d71MsgNo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McAddTravlAgncyPK)) {
            return false;
        }
        McAddTravlAgncyPK other = (McAddTravlAgncyPK) object;
        if (this.p105s1FileTy != other.p105s1FileTy) {
            return false;
        }
        if (this.p105s2FileRDt != other.p105s2FileRDt) {
            return false;
        }
        if (this.p105s3ProcId != other.p105s3ProcId) {
            return false;
        }
        if (this.p105s4FileSeqNo != other.p105s4FileSeqNo) {
            return false;
        }
        if (this.p501s3OccInd != other.p501s3OccInd) {
            return false;
        }
        if (this.p501s4MsgNo != other.p501s4MsgNo) {
            return false;
        }
        if (this.d71MsgNo != other.d71MsgNo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddTravlAgncyPK[ p105s1FileTy=" + p105s1FileTy + ", p105s2FileRDt=" + p105s2FileRDt + ", p105s3ProcId=" + p105s3ProcId + ", p105s4FileSeqNo=" + p105s4FileSeqNo + ", p501s3OccInd=" + p501s3OccInd + ", p501s4MsgNo=" + p501s4MsgNo + ", d71MsgNo=" + d71MsgNo + " ]";
    }
    
}
