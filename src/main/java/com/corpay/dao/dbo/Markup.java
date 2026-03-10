/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MARKUP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Markup.findAll", query = "SELECT m FROM Markup m")})
public class Markup implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MarkupPK markupPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MKUP_PCT")
    private BigDecimal mkupPct;
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

    public Markup() {
    }

    public Markup(MarkupPK markupPK) {
        this.markupPK = markupPK;
    }

    public Markup(MarkupPK markupPK, BigDecimal mkupPct, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.markupPK = markupPK;
        this.mkupPct = mkupPct;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Markup(String mkupFromCurr, String mkupToCurr) {
        this.markupPK = new MarkupPK(mkupFromCurr, mkupToCurr);
    }

    public MarkupPK getMarkupPK() {
        return markupPK;
    }

    public void setMarkupPK(MarkupPK markupPK) {
        this.markupPK = markupPK;
    }

    public BigDecimal getMkupPct() {
        return mkupPct;
    }

    public void setMkupPct(BigDecimal mkupPct) {
        this.mkupPct = mkupPct;
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
        hash += (markupPK != null ? markupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Markup)) {
            return false;
        }
        Markup other = (Markup) object;
        if ((this.markupPK == null && other.markupPK != null) || (this.markupPK != null && !this.markupPK.equals(other.markupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Markup[ markupPK=" + markupPK + " ]";
    }
    
}
