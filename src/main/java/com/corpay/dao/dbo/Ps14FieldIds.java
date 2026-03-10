/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "PS14_FIELD_IDS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Ps14FieldIds.findAll", query = "SELECT p FROM Ps14FieldIds p")})
public class Ps14FieldIds implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FIELD_ID")
    private String fieldId;
    @Basic(optional = false)
    @Column(name = "FIELD_DESC")
    private String fieldDesc;
    @Basic(optional = false)
    @Column(name = "FIELD_TYP")
    private Character fieldTyp;
    @Basic(optional = false)
    @Column(name = "FIELD_LENGTH")
    private int fieldLength;
    @Basic(optional = false)
    @Column(name = "PRD_RELATED")
    private Character prdRelated;
    @Basic(optional = false)
    @Column(name = "RSTNS")
    private String rstns;
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

    public Ps14FieldIds() {
    }

    public Ps14FieldIds(String fieldId) {
        this.fieldId = fieldId;
    }

    public Ps14FieldIds(String fieldId, String fieldDesc, Character fieldTyp, int fieldLength, Character prdRelated, String rstns, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fieldId = fieldId;
        this.fieldDesc = fieldDesc;
        this.fieldTyp = fieldTyp;
        this.fieldLength = fieldLength;
        this.prdRelated = prdRelated;
        this.rstns = rstns;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
    }

    public Character getFieldTyp() {
        return fieldTyp;
    }

    public void setFieldTyp(Character fieldTyp) {
        this.fieldTyp = fieldTyp;
    }

    public int getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(int fieldLength) {
        this.fieldLength = fieldLength;
    }

    public Character getPrdRelated() {
        return prdRelated;
    }

    public void setPrdRelated(Character prdRelated) {
        this.prdRelated = prdRelated;
    }

    public String getRstns() {
        return rstns;
    }

    public void setRstns(String rstns) {
        this.rstns = rstns;
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
        hash += (fieldId != null ? fieldId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ps14FieldIds)) {
            return false;
        }
        Ps14FieldIds other = (Ps14FieldIds) object;
        if ((this.fieldId == null && other.fieldId != null) || (this.fieldId != null && !this.fieldId.equals(other.fieldId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Ps14FieldIds[ fieldId=" + fieldId + " ]";
    }
    
}
