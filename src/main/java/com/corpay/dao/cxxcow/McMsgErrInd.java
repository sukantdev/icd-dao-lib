/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_MSG_ERR_IND", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McMsgErrInd.findAll", query = "SELECT m FROM McMsgErrInd m"),
    @NamedQuery(name = "McMsgErrInd.findByP105s1FileTy", query = "SELECT m FROM McMsgErrInd m WHERE m.mcMsgErrIndPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McMsgErrInd.findByP105s2FileRDt", query = "SELECT m FROM McMsgErrInd m WHERE m.mcMsgErrIndPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McMsgErrInd.findByP105s3ProcId", query = "SELECT m FROM McMsgErrInd m WHERE m.mcMsgErrIndPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McMsgErrInd.findByP105s4FileSeqNo", query = "SELECT m FROM McMsgErrInd m WHERE m.mcMsgErrIndPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McMsgErrInd.findByP005s1DataElId", query = "SELECT m FROM McMsgErrInd m WHERE m.p005s1DataElId = :p005s1DataElId"),
    @NamedQuery(name = "McMsgErrInd.findByP005s2ErrSevty", query = "SELECT m FROM McMsgErrInd m WHERE m.p005s2ErrSevty = :p005s2ErrSevty"),
    @NamedQuery(name = "McMsgErrInd.findByP005s3ErrMsgCd", query = "SELECT m FROM McMsgErrInd m WHERE m.p005s3ErrMsgCd = :p005s3ErrMsgCd"),
    @NamedQuery(name = "McMsgErrInd.findByD71MsgNo", query = "SELECT m FROM McMsgErrInd m WHERE m.mcMsgErrIndPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McMsgErrInd.findByOccInd", query = "SELECT m FROM McMsgErrInd m WHERE m.mcMsgErrIndPK.occInd = :occInd"),
    @NamedQuery(name = "McMsgErrInd.findByP005s4SubfieldId", query = "SELECT m FROM McMsgErrInd m WHERE m.p005s4SubfieldId = :p005s4SubfieldId")})
public class McMsgErrInd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McMsgErrIndPK mcMsgErrIndPK;
    @Column(name = "P005S1_DATA_EL_ID")
    private String p005s1DataElId;
    @Column(name = "P005S2_ERR_SEVTY")
    private Short p005s2ErrSevty;
    @Column(name = "P005S3_ERR_MSG_CD")
    private String p005s3ErrMsgCd;
    @Basic(optional = false)
    @Column(name = "P005S4_SUBFIELD_ID")
    private short p005s4SubfieldId;

    public McMsgErrInd() {
    }

    public McMsgErrInd(McMsgErrIndPK mcMsgErrIndPK) {
        this.mcMsgErrIndPK = mcMsgErrIndPK;
    }

    public McMsgErrInd(McMsgErrIndPK mcMsgErrIndPK, short p005s4SubfieldId) {
        this.mcMsgErrIndPK = mcMsgErrIndPK;
        this.p005s4SubfieldId = p005s4SubfieldId;
    }

    public McMsgErrInd(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcMsgErrIndPK = new McMsgErrIndPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McMsgErrIndPK getMcMsgErrIndPK() {
        return mcMsgErrIndPK;
    }

    public void setMcMsgErrIndPK(McMsgErrIndPK mcMsgErrIndPK) {
        this.mcMsgErrIndPK = mcMsgErrIndPK;
    }

    public String getP005s1DataElId() {
        return p005s1DataElId;
    }

    public void setP005s1DataElId(String p005s1DataElId) {
        this.p005s1DataElId = p005s1DataElId;
    }

    public Short getP005s2ErrSevty() {
        return p005s2ErrSevty;
    }

    public void setP005s2ErrSevty(Short p005s2ErrSevty) {
        this.p005s2ErrSevty = p005s2ErrSevty;
    }

    public String getP005s3ErrMsgCd() {
        return p005s3ErrMsgCd;
    }

    public void setP005s3ErrMsgCd(String p005s3ErrMsgCd) {
        this.p005s3ErrMsgCd = p005s3ErrMsgCd;
    }

    public short getP005s4SubfieldId() {
        return p005s4SubfieldId;
    }

    public void setP005s4SubfieldId(short p005s4SubfieldId) {
        this.p005s4SubfieldId = p005s4SubfieldId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcMsgErrIndPK != null ? mcMsgErrIndPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McMsgErrInd)) {
            return false;
        }
        McMsgErrInd other = (McMsgErrInd) object;
        if ((this.mcMsgErrIndPK == null && other.mcMsgErrIndPK != null) || (this.mcMsgErrIndPK != null && !this.mcMsgErrIndPK.equals(other.mcMsgErrIndPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McMsgErrInd[ mcMsgErrIndPK=" + mcMsgErrIndPK + " ]";
    }
    
}
