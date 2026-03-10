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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CODEWORD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Codeword.findAll", query = "SELECT c FROM Codeword c")})
public class Codeword implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CodewordPK codewordPK;
    @Basic(optional = false)
    @Column(name = "CODEWORD")
    private String codeword;
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

    public Codeword() {
    }

    public Codeword(CodewordPK codewordPK) {
        this.codewordPK = codewordPK;
    }

    public Codeword(CodewordPK codewordPK, String codeword, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.codewordPK = codewordPK;
        this.codeword = codeword;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Codeword(String usrId, String custId) {
        this.codewordPK = new CodewordPK(usrId, custId);
    }

    public CodewordPK getCodewordPK() {
        return codewordPK;
    }

    public void setCodewordPK(CodewordPK codewordPK) {
        this.codewordPK = codewordPK;
    }

    public String getCodeword() {
        return codeword;
    }

    public void setCodeword(String codeword) {
        this.codeword = codeword;
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
        hash += (codewordPK != null ? codewordPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Codeword)) {
            return false;
        }
        Codeword other = (Codeword) object;
        if ((this.codewordPK == null && other.codewordPK != null) || (this.codewordPK != null && !this.codewordPK.equals(other.codewordPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Codeword[ codewordPK=" + codewordPK + " ]";
    }
    
}
