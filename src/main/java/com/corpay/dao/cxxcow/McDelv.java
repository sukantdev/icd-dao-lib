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
@Table(name = "MC_DELV", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McDelv.findAll", query = "SELECT m FROM McDelv m"),
    @NamedQuery(name = "McDelv.findByP105s1FileTy", query = "SELECT m FROM McDelv m WHERE m.mcDelvPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McDelv.findByP105s2FileRDt", query = "SELECT m FROM McDelv m WHERE m.mcDelvPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McDelv.findByP105s3ProcId", query = "SELECT m FROM McDelv m WHERE m.mcDelvPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McDelv.findByP105s4FileSeqNo", query = "SELECT m FROM McDelv m WHERE m.mcDelvPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McDelv.findByD71MsgNo", query = "SELECT m FROM McDelv m WHERE m.mcDelvPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McDelv.findByP748s1DelvNm1", query = "SELECT m FROM McDelv m WHERE m.p748s1DelvNm1 = :p748s1DelvNm1"),
    @NamedQuery(name = "McDelv.findByP748s1DelvNm2", query = "SELECT m FROM McDelv m WHERE m.p748s1DelvNm2 = :p748s1DelvNm2"),
    @NamedQuery(name = "McDelv.findByP748s1DelvNm3", query = "SELECT m FROM McDelv m WHERE m.p748s1DelvNm3 = :p748s1DelvNm3"),
    @NamedQuery(name = "McDelv.findByP749s1DelvAddr1", query = "SELECT m FROM McDelv m WHERE m.p749s1DelvAddr1 = :p749s1DelvAddr1"),
    @NamedQuery(name = "McDelv.findByP749s1DelvAddr2", query = "SELECT m FROM McDelv m WHERE m.p749s1DelvAddr2 = :p749s1DelvAddr2"),
    @NamedQuery(name = "McDelv.findByP749s1DelvAddr3", query = "SELECT m FROM McDelv m WHERE m.p749s1DelvAddr3 = :p749s1DelvAddr3"),
    @NamedQuery(name = "McDelv.findByP749s1DelvAddr4", query = "SELECT m FROM McDelv m WHERE m.p749s1DelvAddr4 = :p749s1DelvAddr4"),
    @NamedQuery(name = "McDelv.findByP749s1DelvAddr5", query = "SELECT m FROM McDelv m WHERE m.p749s1DelvAddr5 = :p749s1DelvAddr5"),
    @NamedQuery(name = "McDelv.findByP749s1DelvAddr6", query = "SELECT m FROM McDelv m WHERE m.p749s1DelvAddr6 = :p749s1DelvAddr6"),
    @NamedQuery(name = "McDelv.findByP750s1DelvCity", query = "SELECT m FROM McDelv m WHERE m.p750s1DelvCity = :p750s1DelvCity"),
    @NamedQuery(name = "McDelv.findByP750s2DelvSt", query = "SELECT m FROM McDelv m WHERE m.p750s2DelvSt = :p750s2DelvSt"),
    @NamedQuery(name = "McDelv.findByP750s3DelvCrty", query = "SELECT m FROM McDelv m WHERE m.p750s3DelvCrty = :p750s3DelvCrty"),
    @NamedQuery(name = "McDelv.findByP750s4DelvZip", query = "SELECT m FROM McDelv m WHERE m.p750s4DelvZip = :p750s4DelvZip")})
public class McDelv implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McDelvPK mcDelvPK;
    @Basic(optional = false)
    @Column(name = "P748S1_DELV_NM_1")
    private String p748s1DelvNm1;
    @Basic(optional = false)
    @Column(name = "P748S1_DELV_NM_2")
    private String p748s1DelvNm2;
    @Basic(optional = false)
    @Column(name = "P748S1_DELV_NM_3")
    private String p748s1DelvNm3;
    @Basic(optional = false)
    @Column(name = "P749S1_DELV_ADDR1")
    private String p749s1DelvAddr1;
    @Basic(optional = false)
    @Column(name = "P749S1_DELV_ADDR2")
    private String p749s1DelvAddr2;
    @Basic(optional = false)
    @Column(name = "P749S1_DELV_ADDR3")
    private String p749s1DelvAddr3;
    @Basic(optional = false)
    @Column(name = "P749S1_DELV_ADDR4")
    private String p749s1DelvAddr4;
    @Basic(optional = false)
    @Column(name = "P749S1_DELV_ADDR5")
    private String p749s1DelvAddr5;
    @Basic(optional = false)
    @Column(name = "P749S1_DELV_ADDR6")
    private String p749s1DelvAddr6;
    @Basic(optional = false)
    @Column(name = "P750S1_DELV_CITY")
    private String p750s1DelvCity;
    @Basic(optional = false)
    @Column(name = "P750S2_DELV_ST")
    private String p750s2DelvSt;
    @Basic(optional = false)
    @Column(name = "P750S3_DELV_CRTY")
    private String p750s3DelvCrty;
    @Basic(optional = false)
    @Column(name = "P750S4_DELV_ZIP")
    private String p750s4DelvZip;

    public McDelv() {
    }

    public McDelv(McDelvPK mcDelvPK) {
        this.mcDelvPK = mcDelvPK;
    }

    public McDelv(McDelvPK mcDelvPK, String p748s1DelvNm1, String p748s1DelvNm2, String p748s1DelvNm3, String p749s1DelvAddr1, String p749s1DelvAddr2, String p749s1DelvAddr3, String p749s1DelvAddr4, String p749s1DelvAddr5, String p749s1DelvAddr6, String p750s1DelvCity, String p750s2DelvSt, String p750s3DelvCrty, String p750s4DelvZip) {
        this.mcDelvPK = mcDelvPK;
        this.p748s1DelvNm1 = p748s1DelvNm1;
        this.p748s1DelvNm2 = p748s1DelvNm2;
        this.p748s1DelvNm3 = p748s1DelvNm3;
        this.p749s1DelvAddr1 = p749s1DelvAddr1;
        this.p749s1DelvAddr2 = p749s1DelvAddr2;
        this.p749s1DelvAddr3 = p749s1DelvAddr3;
        this.p749s1DelvAddr4 = p749s1DelvAddr4;
        this.p749s1DelvAddr5 = p749s1DelvAddr5;
        this.p749s1DelvAddr6 = p749s1DelvAddr6;
        this.p750s1DelvCity = p750s1DelvCity;
        this.p750s2DelvSt = p750s2DelvSt;
        this.p750s3DelvCrty = p750s3DelvCrty;
        this.p750s4DelvZip = p750s4DelvZip;
    }

    public McDelv(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcDelvPK = new McDelvPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McDelvPK getMcDelvPK() {
        return mcDelvPK;
    }

    public void setMcDelvPK(McDelvPK mcDelvPK) {
        this.mcDelvPK = mcDelvPK;
    }

    public String getP748s1DelvNm1() {
        return p748s1DelvNm1;
    }

    public void setP748s1DelvNm1(String p748s1DelvNm1) {
        this.p748s1DelvNm1 = p748s1DelvNm1;
    }

    public String getP748s1DelvNm2() {
        return p748s1DelvNm2;
    }

    public void setP748s1DelvNm2(String p748s1DelvNm2) {
        this.p748s1DelvNm2 = p748s1DelvNm2;
    }

    public String getP748s1DelvNm3() {
        return p748s1DelvNm3;
    }

    public void setP748s1DelvNm3(String p748s1DelvNm3) {
        this.p748s1DelvNm3 = p748s1DelvNm3;
    }

    public String getP749s1DelvAddr1() {
        return p749s1DelvAddr1;
    }

    public void setP749s1DelvAddr1(String p749s1DelvAddr1) {
        this.p749s1DelvAddr1 = p749s1DelvAddr1;
    }

    public String getP749s1DelvAddr2() {
        return p749s1DelvAddr2;
    }

    public void setP749s1DelvAddr2(String p749s1DelvAddr2) {
        this.p749s1DelvAddr2 = p749s1DelvAddr2;
    }

    public String getP749s1DelvAddr3() {
        return p749s1DelvAddr3;
    }

    public void setP749s1DelvAddr3(String p749s1DelvAddr3) {
        this.p749s1DelvAddr3 = p749s1DelvAddr3;
    }

    public String getP749s1DelvAddr4() {
        return p749s1DelvAddr4;
    }

    public void setP749s1DelvAddr4(String p749s1DelvAddr4) {
        this.p749s1DelvAddr4 = p749s1DelvAddr4;
    }

    public String getP749s1DelvAddr5() {
        return p749s1DelvAddr5;
    }

    public void setP749s1DelvAddr5(String p749s1DelvAddr5) {
        this.p749s1DelvAddr5 = p749s1DelvAddr5;
    }

    public String getP749s1DelvAddr6() {
        return p749s1DelvAddr6;
    }

    public void setP749s1DelvAddr6(String p749s1DelvAddr6) {
        this.p749s1DelvAddr6 = p749s1DelvAddr6;
    }

    public String getP750s1DelvCity() {
        return p750s1DelvCity;
    }

    public void setP750s1DelvCity(String p750s1DelvCity) {
        this.p750s1DelvCity = p750s1DelvCity;
    }

    public String getP750s2DelvSt() {
        return p750s2DelvSt;
    }

    public void setP750s2DelvSt(String p750s2DelvSt) {
        this.p750s2DelvSt = p750s2DelvSt;
    }

    public String getP750s3DelvCrty() {
        return p750s3DelvCrty;
    }

    public void setP750s3DelvCrty(String p750s3DelvCrty) {
        this.p750s3DelvCrty = p750s3DelvCrty;
    }

    public String getP750s4DelvZip() {
        return p750s4DelvZip;
    }

    public void setP750s4DelvZip(String p750s4DelvZip) {
        this.p750s4DelvZip = p750s4DelvZip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcDelvPK != null ? mcDelvPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McDelv)) {
            return false;
        }
        McDelv other = (McDelv) object;
        if ((this.mcDelvPK == null && other.mcDelvPK != null) || (this.mcDelvPK != null && !this.mcDelvPK.equals(other.mcDelvPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McDelv[ mcDelvPK=" + mcDelvPK + " ]";
    }
    
}
