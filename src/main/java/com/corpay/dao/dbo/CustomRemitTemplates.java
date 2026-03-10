/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
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
@Table(name = "CUSTOM_REMIT_TEMPLATES", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CustomRemitTemplates.findAll", query = "SELECT c FROM CustomRemitTemplates c")})
public class CustomRemitTemplates implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustomRemitTemplatesPK customRemitTemplatesPK;
    @Basic(optional = false)
    @Column(name = "FIELD_REQD_FLG")
    private Character fieldReqdFlg;
    @Basic(optional = false)
    @Column(name = "SELD_OPT_TXT")
    private String seldOptTxt;
    @Basic(optional = false)
    @Lob
    @Column(name = "UPLOAD_IMG")
    private Serializable uploadImg;
    @Basic(optional = false)
    @Column(name = "USR_SELD_FLG")
    private Character usrSeldFlg;
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
    @Basic(optional = false)
    @Column(name = "DB2_GENERATED_ROWID_FOR_LOBS")
    private Serializable db2GeneratedRowidForLobs;

    public CustomRemitTemplates() {
    }

    public CustomRemitTemplates(CustomRemitTemplatesPK customRemitTemplatesPK) {
        this.customRemitTemplatesPK = customRemitTemplatesPK;
    }

    public CustomRemitTemplates(CustomRemitTemplatesPK customRemitTemplatesPK, Character fieldReqdFlg, String seldOptTxt, Serializable uploadImg, Character usrSeldFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Serializable db2GeneratedRowidForLobs) {
        this.customRemitTemplatesPK = customRemitTemplatesPK;
        this.fieldReqdFlg = fieldReqdFlg;
        this.seldOptTxt = seldOptTxt;
        this.uploadImg = uploadImg;
        this.usrSeldFlg = usrSeldFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public CustomRemitTemplates(String acctNbr, String custId, String cstmRemitTmpltNm, String fieldRefTxt, Character seldOptVal) {
        this.customRemitTemplatesPK = new CustomRemitTemplatesPK(acctNbr, custId, cstmRemitTmpltNm, fieldRefTxt, seldOptVal);
    }

    public CustomRemitTemplatesPK getCustomRemitTemplatesPK() {
        return customRemitTemplatesPK;
    }

    public void setCustomRemitTemplatesPK(CustomRemitTemplatesPK customRemitTemplatesPK) {
        this.customRemitTemplatesPK = customRemitTemplatesPK;
    }

    public Character getFieldReqdFlg() {
        return fieldReqdFlg;
    }

    public void setFieldReqdFlg(Character fieldReqdFlg) {
        this.fieldReqdFlg = fieldReqdFlg;
    }

    public String getSeldOptTxt() {
        return seldOptTxt;
    }

    public void setSeldOptTxt(String seldOptTxt) {
        this.seldOptTxt = seldOptTxt;
    }

    public Serializable getUploadImg() {
        return uploadImg;
    }

    public void setUploadImg(Serializable uploadImg) {
        this.uploadImg = uploadImg;
    }

    public Character getUsrSeldFlg() {
        return usrSeldFlg;
    }

    public void setUsrSeldFlg(Character usrSeldFlg) {
        this.usrSeldFlg = usrSeldFlg;
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

    public Serializable getDb2GeneratedRowidForLobs() {
        return db2GeneratedRowidForLobs;
    }

    public void setDb2GeneratedRowidForLobs(Serializable db2GeneratedRowidForLobs) {
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customRemitTemplatesPK != null ? customRemitTemplatesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomRemitTemplates)) {
            return false;
        }
        CustomRemitTemplates other = (CustomRemitTemplates) object;
        if ((this.customRemitTemplatesPK == null && other.customRemitTemplatesPK != null) || (this.customRemitTemplatesPK != null && !this.customRemitTemplatesPK.equals(other.customRemitTemplatesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustomRemitTemplates[ customRemitTemplatesPK=" + customRemitTemplatesPK + " ]";
    }
    
}
