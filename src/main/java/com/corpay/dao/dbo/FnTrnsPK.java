/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class FnTrnsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "FILE_DT")
    @Temporal(TemporalType.DATE)
    private Date fileDt;
    @Basic(optional = false)
    @Column(name = "FILE_SEQ")
    private short fileSeq;
    @Basic(optional = false)
    @Column(name = "TRNS_SEQ")
    private int trnsSeq;

    public FnTrnsPK() {
    }

    public FnTrnsPK(Date fileDt, short fileSeq, int trnsSeq) {
        this.fileDt = fileDt;
        this.fileSeq = fileSeq;
        this.trnsSeq = trnsSeq;
    }

    public Date getFileDt() {
        return fileDt;
    }

    public void setFileDt(Date fileDt) {
        this.fileDt = fileDt;
    }

    public short getFileSeq() {
        return fileSeq;
    }

    public void setFileSeq(short fileSeq) {
        this.fileSeq = fileSeq;
    }

    public int getTrnsSeq() {
        return trnsSeq;
    }

    public void setTrnsSeq(int trnsSeq) {
        this.trnsSeq = trnsSeq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fileDt != null ? fileDt.hashCode() : 0);
        hash += (int) fileSeq;
        hash += (int) trnsSeq;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FnTrnsPK)) {
            return false;
        }
        FnTrnsPK other = (FnTrnsPK) object;
        if ((this.fileDt == null && other.fileDt != null) || (this.fileDt != null && !this.fileDt.equals(other.fileDt))) {
            return false;
        }
        if (this.fileSeq != other.fileSeq) {
            return false;
        }
        if (this.trnsSeq != other.trnsSeq) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnTrnsPK[ fileDt=" + fileDt + ", fileSeq=" + fileSeq + ", trnsSeq=" + trnsSeq + " ]";
    }
    
}
