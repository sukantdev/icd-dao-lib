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
@Table(name = "MC_SHPNG", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McShpng.findAll", query = "SELECT m FROM McShpng m"),
    @NamedQuery(name = "McShpng.findByP105s1FileTy", query = "SELECT m FROM McShpng m WHERE m.mcShpngPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McShpng.findByP105s2FileRDt", query = "SELECT m FROM McShpng m WHERE m.mcShpngPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McShpng.findByP105s3ProcId", query = "SELECT m FROM McShpng m WHERE m.mcShpngPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McShpng.findByP105s4FileSeqNo", query = "SELECT m FROM McShpng m WHERE m.mcShpngPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McShpng.findByD71MsgNo", query = "SELECT m FROM McShpng m WHERE m.mcShpngPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McShpng.findByP744s1ShpngNm1", query = "SELECT m FROM McShpng m WHERE m.p744s1ShpngNm1 = :p744s1ShpngNm1"),
    @NamedQuery(name = "McShpng.findByP744s1ShpngNm2", query = "SELECT m FROM McShpng m WHERE m.p744s1ShpngNm2 = :p744s1ShpngNm2"),
    @NamedQuery(name = "McShpng.findByP744s1ShpngNm3", query = "SELECT m FROM McShpng m WHERE m.p744s1ShpngNm3 = :p744s1ShpngNm3"),
    @NamedQuery(name = "McShpng.findByP745s1ShpngAddr1", query = "SELECT m FROM McShpng m WHERE m.p745s1ShpngAddr1 = :p745s1ShpngAddr1"),
    @NamedQuery(name = "McShpng.findByP745s1ShpngAddr2", query = "SELECT m FROM McShpng m WHERE m.p745s1ShpngAddr2 = :p745s1ShpngAddr2"),
    @NamedQuery(name = "McShpng.findByP745s1ShpngAddr3", query = "SELECT m FROM McShpng m WHERE m.p745s1ShpngAddr3 = :p745s1ShpngAddr3"),
    @NamedQuery(name = "McShpng.findByP745s1ShpngAddr4", query = "SELECT m FROM McShpng m WHERE m.p745s1ShpngAddr4 = :p745s1ShpngAddr4"),
    @NamedQuery(name = "McShpng.findByP745s1ShpngAddr5", query = "SELECT m FROM McShpng m WHERE m.p745s1ShpngAddr5 = :p745s1ShpngAddr5"),
    @NamedQuery(name = "McShpng.findByP745s1ShpngAddr6", query = "SELECT m FROM McShpng m WHERE m.p745s1ShpngAddr6 = :p745s1ShpngAddr6"),
    @NamedQuery(name = "McShpng.findByP746s1ShpngCity", query = "SELECT m FROM McShpng m WHERE m.p746s1ShpngCity = :p746s1ShpngCity"),
    @NamedQuery(name = "McShpng.findByP746s2ShpngSt", query = "SELECT m FROM McShpng m WHERE m.p746s2ShpngSt = :p746s2ShpngSt"),
    @NamedQuery(name = "McShpng.findByP746s3ShpngCrty", query = "SELECT m FROM McShpng m WHERE m.p746s3ShpngCrty = :p746s3ShpngCrty"),
    @NamedQuery(name = "McShpng.findByP746s4ShpngZip", query = "SELECT m FROM McShpng m WHERE m.p746s4ShpngZip = :p746s4ShpngZip")})
public class McShpng implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McShpngPK mcShpngPK;
    @Basic(optional = false)
    @Column(name = "P744S1_SHPNG_NM_1")
    private String p744s1ShpngNm1;
    @Basic(optional = false)
    @Column(name = "P744S1_SHPNG_NM_2")
    private String p744s1ShpngNm2;
    @Basic(optional = false)
    @Column(name = "P744S1_SHPNG_NM_3")
    private String p744s1ShpngNm3;
    @Basic(optional = false)
    @Column(name = "P745S1_SHPNG_ADDR1")
    private String p745s1ShpngAddr1;
    @Basic(optional = false)
    @Column(name = "P745S1_SHPNG_ADDR2")
    private String p745s1ShpngAddr2;
    @Basic(optional = false)
    @Column(name = "P745S1_SHPNG_ADDR3")
    private String p745s1ShpngAddr3;
    @Basic(optional = false)
    @Column(name = "P745S1_SHPNG_ADDR4")
    private String p745s1ShpngAddr4;
    @Basic(optional = false)
    @Column(name = "P745S1_SHPNG_ADDR5")
    private String p745s1ShpngAddr5;
    @Basic(optional = false)
    @Column(name = "P745S1_SHPNG_ADDR6")
    private String p745s1ShpngAddr6;
    @Basic(optional = false)
    @Column(name = "P746S1_SHPNG_CITY")
    private String p746s1ShpngCity;
    @Basic(optional = false)
    @Column(name = "P746S2_SHPNG_ST")
    private String p746s2ShpngSt;
    @Basic(optional = false)
    @Column(name = "P746S3_SHPNG_CRTY")
    private String p746s3ShpngCrty;
    @Basic(optional = false)
    @Column(name = "P746S4_SHPNG_ZIP")
    private String p746s4ShpngZip;

    public McShpng() {
    }

    public McShpng(McShpngPK mcShpngPK) {
        this.mcShpngPK = mcShpngPK;
    }

    public McShpng(McShpngPK mcShpngPK, String p744s1ShpngNm1, String p744s1ShpngNm2, String p744s1ShpngNm3, String p745s1ShpngAddr1, String p745s1ShpngAddr2, String p745s1ShpngAddr3, String p745s1ShpngAddr4, String p745s1ShpngAddr5, String p745s1ShpngAddr6, String p746s1ShpngCity, String p746s2ShpngSt, String p746s3ShpngCrty, String p746s4ShpngZip) {
        this.mcShpngPK = mcShpngPK;
        this.p744s1ShpngNm1 = p744s1ShpngNm1;
        this.p744s1ShpngNm2 = p744s1ShpngNm2;
        this.p744s1ShpngNm3 = p744s1ShpngNm3;
        this.p745s1ShpngAddr1 = p745s1ShpngAddr1;
        this.p745s1ShpngAddr2 = p745s1ShpngAddr2;
        this.p745s1ShpngAddr3 = p745s1ShpngAddr3;
        this.p745s1ShpngAddr4 = p745s1ShpngAddr4;
        this.p745s1ShpngAddr5 = p745s1ShpngAddr5;
        this.p745s1ShpngAddr6 = p745s1ShpngAddr6;
        this.p746s1ShpngCity = p746s1ShpngCity;
        this.p746s2ShpngSt = p746s2ShpngSt;
        this.p746s3ShpngCrty = p746s3ShpngCrty;
        this.p746s4ShpngZip = p746s4ShpngZip;
    }

    public McShpng(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcShpngPK = new McShpngPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McShpngPK getMcShpngPK() {
        return mcShpngPK;
    }

    public void setMcShpngPK(McShpngPK mcShpngPK) {
        this.mcShpngPK = mcShpngPK;
    }

    public String getP744s1ShpngNm1() {
        return p744s1ShpngNm1;
    }

    public void setP744s1ShpngNm1(String p744s1ShpngNm1) {
        this.p744s1ShpngNm1 = p744s1ShpngNm1;
    }

    public String getP744s1ShpngNm2() {
        return p744s1ShpngNm2;
    }

    public void setP744s1ShpngNm2(String p744s1ShpngNm2) {
        this.p744s1ShpngNm2 = p744s1ShpngNm2;
    }

    public String getP744s1ShpngNm3() {
        return p744s1ShpngNm3;
    }

    public void setP744s1ShpngNm3(String p744s1ShpngNm3) {
        this.p744s1ShpngNm3 = p744s1ShpngNm3;
    }

    public String getP745s1ShpngAddr1() {
        return p745s1ShpngAddr1;
    }

    public void setP745s1ShpngAddr1(String p745s1ShpngAddr1) {
        this.p745s1ShpngAddr1 = p745s1ShpngAddr1;
    }

    public String getP745s1ShpngAddr2() {
        return p745s1ShpngAddr2;
    }

    public void setP745s1ShpngAddr2(String p745s1ShpngAddr2) {
        this.p745s1ShpngAddr2 = p745s1ShpngAddr2;
    }

    public String getP745s1ShpngAddr3() {
        return p745s1ShpngAddr3;
    }

    public void setP745s1ShpngAddr3(String p745s1ShpngAddr3) {
        this.p745s1ShpngAddr3 = p745s1ShpngAddr3;
    }

    public String getP745s1ShpngAddr4() {
        return p745s1ShpngAddr4;
    }

    public void setP745s1ShpngAddr4(String p745s1ShpngAddr4) {
        this.p745s1ShpngAddr4 = p745s1ShpngAddr4;
    }

    public String getP745s1ShpngAddr5() {
        return p745s1ShpngAddr5;
    }

    public void setP745s1ShpngAddr5(String p745s1ShpngAddr5) {
        this.p745s1ShpngAddr5 = p745s1ShpngAddr5;
    }

    public String getP745s1ShpngAddr6() {
        return p745s1ShpngAddr6;
    }

    public void setP745s1ShpngAddr6(String p745s1ShpngAddr6) {
        this.p745s1ShpngAddr6 = p745s1ShpngAddr6;
    }

    public String getP746s1ShpngCity() {
        return p746s1ShpngCity;
    }

    public void setP746s1ShpngCity(String p746s1ShpngCity) {
        this.p746s1ShpngCity = p746s1ShpngCity;
    }

    public String getP746s2ShpngSt() {
        return p746s2ShpngSt;
    }

    public void setP746s2ShpngSt(String p746s2ShpngSt) {
        this.p746s2ShpngSt = p746s2ShpngSt;
    }

    public String getP746s3ShpngCrty() {
        return p746s3ShpngCrty;
    }

    public void setP746s3ShpngCrty(String p746s3ShpngCrty) {
        this.p746s3ShpngCrty = p746s3ShpngCrty;
    }

    public String getP746s4ShpngZip() {
        return p746s4ShpngZip;
    }

    public void setP746s4ShpngZip(String p746s4ShpngZip) {
        this.p746s4ShpngZip = p746s4ShpngZip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcShpngPK != null ? mcShpngPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McShpng)) {
            return false;
        }
        McShpng other = (McShpng) object;
        if ((this.mcShpngPK == null && other.mcShpngPK != null) || (this.mcShpngPK != null && !this.mcShpngPK.equals(other.mcShpngPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McShpng[ mcShpngPK=" + mcShpngPK + " ]";
    }
    
}
