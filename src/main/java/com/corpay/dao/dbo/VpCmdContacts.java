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
@Table(name = "VP_CMD_CONTACTS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpCmdContacts.findAll", query = "SELECT v FROM VpCmdContacts v")})
public class VpCmdContacts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpCmdContactsPK vpCmdContactsPK;
    @Basic(optional = false)
    @Column(name = "CDN_SALES1_FNAME")
    private String cdnSales1Fname;
    @Basic(optional = false)
    @Column(name = "CDN_SALES1_LNAME")
    private String cdnSales1Lname;
    @Basic(optional = false)
    @Column(name = "CDN_SALES1_EMAIL_ADDR")
    private String cdnSales1EmailAddr;
    @Basic(optional = false)
    @Column(name = "CDN_SALES1_PHONE_NBR")
    private String cdnSales1PhoneNbr;
    @Basic(optional = false)
    @Column(name = "CDN_SALES2_FNAME")
    private String cdnSales2Fname;
    @Basic(optional = false)
    @Column(name = "CDN_SALES2_LNAME")
    private String cdnSales2Lname;
    @Basic(optional = false)
    @Column(name = "CDN_SALES2_EMAIL_ADDR")
    private String cdnSales2EmailAddr;
    @Basic(optional = false)
    @Column(name = "CDN_SALES2_PHONE__NBR")
    private String cdnSales2PhoneNbr;
    @Basic(optional = false)
    @Column(name = "CDN_SALES3_FNAME")
    private String cdnSales3Fname;
    @Basic(optional = false)
    @Column(name = "CDN_SALES3_LNAME")
    private String cdnSales3Lname;
    @Basic(optional = false)
    @Column(name = "CDN_SALES3_EMAIL_ADDR")
    private String cdnSales3EmailAddr;
    @Basic(optional = false)
    @Column(name = "CDN_SALES3_PHONE_NBR")
    private String cdnSales3PhoneNbr;
    @Basic(optional = false)
    @Column(name = "VE_SPEC_FNAME")
    private String veSpecFname;
    @Basic(optional = false)
    @Column(name = "VE_SPEC_LNAME")
    private String veSpecLname;
    @Basic(optional = false)
    @Column(name = "VE_SPEC_EMAIL_ADDR")
    private String veSpecEmailAddr;
    @Basic(optional = false)
    @Column(name = "VE_SPEC_PHONE_NBR")
    private String veSpecPhoneNbr;
    @Basic(optional = false)
    @Column(name = "PM_FNAME")
    private String pmFname;
    @Basic(optional = false)
    @Column(name = "PM_LNAME")
    private String pmLname;
    @Basic(optional = false)
    @Column(name = "PM_EMAIL_ADDR")
    private String pmEmailAddr;
    @Basic(optional = false)
    @Column(name = "PM_PHONE_NBR")
    private String pmPhoneNbr;
    @Basic(optional = false)
    @Column(name = "SC_FNAME")
    private String scFname;
    @Basic(optional = false)
    @Column(name = "SC_LNAME")
    private String scLname;
    @Basic(optional = false)
    @Column(name = "SC_EMAIL_ADDR")
    private String scEmailAddr;
    @Basic(optional = false)
    @Column(name = "SC_PHONE_NBR")
    private String scPhoneNbr;
    @Basic(optional = false)
    @Column(name = "CRR_FNAME")
    private String crrFname;
    @Basic(optional = false)
    @Column(name = "CRR_LNAME")
    private String crrLname;
    @Basic(optional = false)
    @Column(name = "CRR_EMAIL_ADDR")
    private String crrEmailAddr;
    @Basic(optional = false)
    @Column(name = "CRR_PHONE_NBR")
    private String crrPhoneNbr;
    @Basic(optional = false)
    @Column(name = "TRR_FNAME")
    private String trrFname;
    @Basic(optional = false)
    @Column(name = "TRR_LNAME")
    private String trrLname;
    @Basic(optional = false)
    @Column(name = "TRR_EMAIL_ADDR")
    private String trrEmailAddr;
    @Basic(optional = false)
    @Column(name = "TRR_PHONE_NBR")
    private String trrPhoneNbr;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public VpCmdContacts() {
    }

    public VpCmdContacts(VpCmdContactsPK vpCmdContactsPK) {
        this.vpCmdContactsPK = vpCmdContactsPK;
    }

    public VpCmdContacts(VpCmdContactsPK vpCmdContactsPK, String cdnSales1Fname, String cdnSales1Lname, String cdnSales1EmailAddr, String cdnSales1PhoneNbr, String cdnSales2Fname, String cdnSales2Lname, String cdnSales2EmailAddr, String cdnSales2PhoneNbr, String cdnSales3Fname, String cdnSales3Lname, String cdnSales3EmailAddr, String cdnSales3PhoneNbr, String veSpecFname, String veSpecLname, String veSpecEmailAddr, String veSpecPhoneNbr, String pmFname, String pmLname, String pmEmailAddr, String pmPhoneNbr, String scFname, String scLname, String scEmailAddr, String scPhoneNbr, String crrFname, String crrLname, String crrEmailAddr, String crrPhoneNbr, String trrFname, String trrLname, String trrEmailAddr, String trrPhoneNbr, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.vpCmdContactsPK = vpCmdContactsPK;
        this.cdnSales1Fname = cdnSales1Fname;
        this.cdnSales1Lname = cdnSales1Lname;
        this.cdnSales1EmailAddr = cdnSales1EmailAddr;
        this.cdnSales1PhoneNbr = cdnSales1PhoneNbr;
        this.cdnSales2Fname = cdnSales2Fname;
        this.cdnSales2Lname = cdnSales2Lname;
        this.cdnSales2EmailAddr = cdnSales2EmailAddr;
        this.cdnSales2PhoneNbr = cdnSales2PhoneNbr;
        this.cdnSales3Fname = cdnSales3Fname;
        this.cdnSales3Lname = cdnSales3Lname;
        this.cdnSales3EmailAddr = cdnSales3EmailAddr;
        this.cdnSales3PhoneNbr = cdnSales3PhoneNbr;
        this.veSpecFname = veSpecFname;
        this.veSpecLname = veSpecLname;
        this.veSpecEmailAddr = veSpecEmailAddr;
        this.veSpecPhoneNbr = veSpecPhoneNbr;
        this.pmFname = pmFname;
        this.pmLname = pmLname;
        this.pmEmailAddr = pmEmailAddr;
        this.pmPhoneNbr = pmPhoneNbr;
        this.scFname = scFname;
        this.scLname = scLname;
        this.scEmailAddr = scEmailAddr;
        this.scPhoneNbr = scPhoneNbr;
        this.crrFname = crrFname;
        this.crrLname = crrLname;
        this.crrEmailAddr = crrEmailAddr;
        this.crrPhoneNbr = crrPhoneNbr;
        this.trrFname = trrFname;
        this.trrLname = trrLname;
        this.trrEmailAddr = trrEmailAddr;
        this.trrPhoneNbr = trrPhoneNbr;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public VpCmdContacts(String custVend, String mastId) {
        this.vpCmdContactsPK = new VpCmdContactsPK(custVend, mastId);
    }

    public VpCmdContactsPK getVpCmdContactsPK() {
        return vpCmdContactsPK;
    }

    public void setVpCmdContactsPK(VpCmdContactsPK vpCmdContactsPK) {
        this.vpCmdContactsPK = vpCmdContactsPK;
    }

    public String getCdnSales1Fname() {
        return cdnSales1Fname;
    }

    public void setCdnSales1Fname(String cdnSales1Fname) {
        this.cdnSales1Fname = cdnSales1Fname;
    }

    public String getCdnSales1Lname() {
        return cdnSales1Lname;
    }

    public void setCdnSales1Lname(String cdnSales1Lname) {
        this.cdnSales1Lname = cdnSales1Lname;
    }

    public String getCdnSales1EmailAddr() {
        return cdnSales1EmailAddr;
    }

    public void setCdnSales1EmailAddr(String cdnSales1EmailAddr) {
        this.cdnSales1EmailAddr = cdnSales1EmailAddr;
    }

    public String getCdnSales1PhoneNbr() {
        return cdnSales1PhoneNbr;
    }

    public void setCdnSales1PhoneNbr(String cdnSales1PhoneNbr) {
        this.cdnSales1PhoneNbr = cdnSales1PhoneNbr;
    }

    public String getCdnSales2Fname() {
        return cdnSales2Fname;
    }

    public void setCdnSales2Fname(String cdnSales2Fname) {
        this.cdnSales2Fname = cdnSales2Fname;
    }

    public String getCdnSales2Lname() {
        return cdnSales2Lname;
    }

    public void setCdnSales2Lname(String cdnSales2Lname) {
        this.cdnSales2Lname = cdnSales2Lname;
    }

    public String getCdnSales2EmailAddr() {
        return cdnSales2EmailAddr;
    }

    public void setCdnSales2EmailAddr(String cdnSales2EmailAddr) {
        this.cdnSales2EmailAddr = cdnSales2EmailAddr;
    }

    public String getCdnSales2PhoneNbr() {
        return cdnSales2PhoneNbr;
    }

    public void setCdnSales2PhoneNbr(String cdnSales2PhoneNbr) {
        this.cdnSales2PhoneNbr = cdnSales2PhoneNbr;
    }

    public String getCdnSales3Fname() {
        return cdnSales3Fname;
    }

    public void setCdnSales3Fname(String cdnSales3Fname) {
        this.cdnSales3Fname = cdnSales3Fname;
    }

    public String getCdnSales3Lname() {
        return cdnSales3Lname;
    }

    public void setCdnSales3Lname(String cdnSales3Lname) {
        this.cdnSales3Lname = cdnSales3Lname;
    }

    public String getCdnSales3EmailAddr() {
        return cdnSales3EmailAddr;
    }

    public void setCdnSales3EmailAddr(String cdnSales3EmailAddr) {
        this.cdnSales3EmailAddr = cdnSales3EmailAddr;
    }

    public String getCdnSales3PhoneNbr() {
        return cdnSales3PhoneNbr;
    }

    public void setCdnSales3PhoneNbr(String cdnSales3PhoneNbr) {
        this.cdnSales3PhoneNbr = cdnSales3PhoneNbr;
    }

    public String getVeSpecFname() {
        return veSpecFname;
    }

    public void setVeSpecFname(String veSpecFname) {
        this.veSpecFname = veSpecFname;
    }

    public String getVeSpecLname() {
        return veSpecLname;
    }

    public void setVeSpecLname(String veSpecLname) {
        this.veSpecLname = veSpecLname;
    }

    public String getVeSpecEmailAddr() {
        return veSpecEmailAddr;
    }

    public void setVeSpecEmailAddr(String veSpecEmailAddr) {
        this.veSpecEmailAddr = veSpecEmailAddr;
    }

    public String getVeSpecPhoneNbr() {
        return veSpecPhoneNbr;
    }

    public void setVeSpecPhoneNbr(String veSpecPhoneNbr) {
        this.veSpecPhoneNbr = veSpecPhoneNbr;
    }

    public String getPmFname() {
        return pmFname;
    }

    public void setPmFname(String pmFname) {
        this.pmFname = pmFname;
    }

    public String getPmLname() {
        return pmLname;
    }

    public void setPmLname(String pmLname) {
        this.pmLname = pmLname;
    }

    public String getPmEmailAddr() {
        return pmEmailAddr;
    }

    public void setPmEmailAddr(String pmEmailAddr) {
        this.pmEmailAddr = pmEmailAddr;
    }

    public String getPmPhoneNbr() {
        return pmPhoneNbr;
    }

    public void setPmPhoneNbr(String pmPhoneNbr) {
        this.pmPhoneNbr = pmPhoneNbr;
    }

    public String getScFname() {
        return scFname;
    }

    public void setScFname(String scFname) {
        this.scFname = scFname;
    }

    public String getScLname() {
        return scLname;
    }

    public void setScLname(String scLname) {
        this.scLname = scLname;
    }

    public String getScEmailAddr() {
        return scEmailAddr;
    }

    public void setScEmailAddr(String scEmailAddr) {
        this.scEmailAddr = scEmailAddr;
    }

    public String getScPhoneNbr() {
        return scPhoneNbr;
    }

    public void setScPhoneNbr(String scPhoneNbr) {
        this.scPhoneNbr = scPhoneNbr;
    }

    public String getCrrFname() {
        return crrFname;
    }

    public void setCrrFname(String crrFname) {
        this.crrFname = crrFname;
    }

    public String getCrrLname() {
        return crrLname;
    }

    public void setCrrLname(String crrLname) {
        this.crrLname = crrLname;
    }

    public String getCrrEmailAddr() {
        return crrEmailAddr;
    }

    public void setCrrEmailAddr(String crrEmailAddr) {
        this.crrEmailAddr = crrEmailAddr;
    }

    public String getCrrPhoneNbr() {
        return crrPhoneNbr;
    }

    public void setCrrPhoneNbr(String crrPhoneNbr) {
        this.crrPhoneNbr = crrPhoneNbr;
    }

    public String getTrrFname() {
        return trrFname;
    }

    public void setTrrFname(String trrFname) {
        this.trrFname = trrFname;
    }

    public String getTrrLname() {
        return trrLname;
    }

    public void setTrrLname(String trrLname) {
        this.trrLname = trrLname;
    }

    public String getTrrEmailAddr() {
        return trrEmailAddr;
    }

    public void setTrrEmailAddr(String trrEmailAddr) {
        this.trrEmailAddr = trrEmailAddr;
    }

    public String getTrrPhoneNbr() {
        return trrPhoneNbr;
    }

    public void setTrrPhoneNbr(String trrPhoneNbr) {
        this.trrPhoneNbr = trrPhoneNbr;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpCmdContactsPK != null ? vpCmdContactsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpCmdContacts)) {
            return false;
        }
        VpCmdContacts other = (VpCmdContacts) object;
        if ((this.vpCmdContactsPK == null && other.vpCmdContactsPK != null) || (this.vpCmdContactsPK != null && !this.vpCmdContactsPK.equals(other.vpCmdContactsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCmdContacts[ vpCmdContactsPK=" + vpCmdContactsPK + " ]";
    }
    
}
