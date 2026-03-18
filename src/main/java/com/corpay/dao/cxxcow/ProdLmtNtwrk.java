package com.corpay.dao.cxxcow;

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
@Table(name = "PROD_LMT_NTWRK", catalog = "", schema = "CXXCOW")
public class ProdLmtNtwrk implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProdLmtNtwrkPK prodLmtNtwrkPK;
    @Basic(optional = false)
    @Column(name = "PRDLN_XTN_QTY")
    private int prdlnXtnQty;
    @Basic(optional = false)
    @Column(name = "PRDLN_AVAL_FLG")
    private Character prdlnAvalFlg;
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

    public ProdLmtNtwrk() {
    }

    public ProdLmtNtwrk(ProdLmtNtwrkPK prodLmtNtwrkPK) {
        this.prodLmtNtwrkPK = prodLmtNtwrkPK;
    }

    public ProdLmtNtwrk(ProdLmtNtwrkPK prodLmtNtwrkPK, int prdlnXtnQty, Character prdlnAvalFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prodLmtNtwrkPK = prodLmtNtwrkPK;
        this.prdlnXtnQty = prdlnXtnQty;
        this.prdlnAvalFlg = prdlnAvalFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ProdLmtNtwrk(String prdlnKey, int prodcId) {
        this.prodLmtNtwrkPK = new ProdLmtNtwrkPK(prdlnKey, prodcId);
    }

    public ProdLmtNtwrkPK getProdLmtNtwrkPK() {
        return prodLmtNtwrkPK;
    }

    public void setProdLmtNtwrkPK(ProdLmtNtwrkPK prodLmtNtwrkPK) {
        this.prodLmtNtwrkPK = prodLmtNtwrkPK;
    }

    public int getPrdlnXtnQty() {
        return prdlnXtnQty;
    }

    public void setPrdlnXtnQty(int prdlnXtnQty) {
        this.prdlnXtnQty = prdlnXtnQty;
    }

    public Character getPrdlnAvalFlg() {
        return prdlnAvalFlg;
    }

    public void setPrdlnAvalFlg(Character prdlnAvalFlg) {
        this.prdlnAvalFlg = prdlnAvalFlg;
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
        hash += (prodLmtNtwrkPK != null ? prodLmtNtwrkPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ProdLmtNtwrk)) {
            return false;
        }
        ProdLmtNtwrk other = (ProdLmtNtwrk) object;
        if ((this.prodLmtNtwrkPK == null && other.prodLmtNtwrkPK != null) || (this.prodLmtNtwrkPK != null && !this.prodLmtNtwrkPK.equals(other.prodLmtNtwrkPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProdLmtNtwrk[ prodLmtNtwrkPK=" + prodLmtNtwrkPK + " ]";
    }

}
