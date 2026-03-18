package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MRCH_LOC_CFC_EMAIL", catalog = "", schema = "DBO")
public class MrchLocCfcEmail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BLNG_ID")
    private String blngId;
    @Basic(optional = false)
    @Column(name = "EMAIL1")
    private String email1;
    @Basic(optional = false)
    @Column(name = "EMAIL2")
    private String email2;
    @Basic(optional = false)
    @Column(name = "EMAIL3")
    private String email3;
    @Basic(optional = false)
    @Column(name = "EMAIL4")
    private String email4;
    @Basic(optional = false)
    @Column(name = "EMAIL5")
    private String email5;
    @Basic(optional = false)
    @Column(name = "EMAIL6")
    private String email6;
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

    public MrchLocCfcEmail() {
    }

    public MrchLocCfcEmail(String blngId) {
        this.blngId = blngId;
    }

    public MrchLocCfcEmail(String blngId, String email1, String email2, String email3, String email4, String email5, String email6, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.blngId = blngId;
        this.email1 = email1;
        this.email2 = email2;
        this.email3 = email3;
        this.email4 = email4;
        this.email5 = email5;
        this.email6 = email6;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getBlngId() {
        return blngId;
    }

    public void setBlngId(String blngId) {
        this.blngId = blngId;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    public String getEmail4() {
        return email4;
    }

    public void setEmail4(String email4) {
        this.email4 = email4;
    }

    public String getEmail5() {
        return email5;
    }

    public void setEmail5(String email5) {
        this.email5 = email5;
    }

    public String getEmail6() {
        return email6;
    }

    public void setEmail6(String email6) {
        this.email6 = email6;
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
        hash += (blngId != null ? blngId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchLocCfcEmail)) {
            return false;
        }
        MrchLocCfcEmail other = (MrchLocCfcEmail) object;
        if ((this.blngId == null && other.blngId != null) || (this.blngId != null && !this.blngId.equals(other.blngId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocCfcEmail[ blngId=" + blngId + " ]";
    }

}
