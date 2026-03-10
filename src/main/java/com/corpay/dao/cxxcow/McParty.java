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
@Table(name = "MC_PARTY", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McParty.findAll", query = "SELECT m FROM McParty m"),
    @NamedQuery(name = "McParty.findByP105s1FileTy", query = "SELECT m FROM McParty m WHERE m.mcPartyPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McParty.findByP105s2FileRDt", query = "SELECT m FROM McParty m WHERE m.mcPartyPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McParty.findByP105s3ProcId", query = "SELECT m FROM McParty m WHERE m.mcPartyPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McParty.findByP105s4FileSeqNo", query = "SELECT m FROM McParty m WHERE m.mcPartyPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McParty.findByD71MsgNo", query = "SELECT m FROM McParty m WHERE m.mcPartyPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McParty.findByP591s1PtyNm1", query = "SELECT m FROM McParty m WHERE m.p591s1PtyNm1 = :p591s1PtyNm1"),
    @NamedQuery(name = "McParty.findByP591s1PtyNm2", query = "SELECT m FROM McParty m WHERE m.p591s1PtyNm2 = :p591s1PtyNm2"),
    @NamedQuery(name = "McParty.findByP591s1PtyNm3", query = "SELECT m FROM McParty m WHERE m.p591s1PtyNm3 = :p591s1PtyNm3"),
    @NamedQuery(name = "McParty.findByP592s1PtyAddr1", query = "SELECT m FROM McParty m WHERE m.p592s1PtyAddr1 = :p592s1PtyAddr1"),
    @NamedQuery(name = "McParty.findByP592s1PtyAddr2", query = "SELECT m FROM McParty m WHERE m.p592s1PtyAddr2 = :p592s1PtyAddr2"),
    @NamedQuery(name = "McParty.findByP592s1PtyAddr3", query = "SELECT m FROM McParty m WHERE m.p592s1PtyAddr3 = :p592s1PtyAddr3"),
    @NamedQuery(name = "McParty.findByP592s1PtyAddr4", query = "SELECT m FROM McParty m WHERE m.p592s1PtyAddr4 = :p592s1PtyAddr4"),
    @NamedQuery(name = "McParty.findByP592s1PtyAddr5", query = "SELECT m FROM McParty m WHERE m.p592s1PtyAddr5 = :p592s1PtyAddr5"),
    @NamedQuery(name = "McParty.findByP592s1PtyAddr6", query = "SELECT m FROM McParty m WHERE m.p592s1PtyAddr6 = :p592s1PtyAddr6"),
    @NamedQuery(name = "McParty.findByP593s1PtyCty", query = "SELECT m FROM McParty m WHERE m.p593s1PtyCty = :p593s1PtyCty"),
    @NamedQuery(name = "McParty.findByP593s2PtySt", query = "SELECT m FROM McParty m WHERE m.p593s2PtySt = :p593s2PtySt"),
    @NamedQuery(name = "McParty.findByP593s3PtyCrty", query = "SELECT m FROM McParty m WHERE m.p593s3PtyCrty = :p593s3PtyCrty"),
    @NamedQuery(name = "McParty.findByP593s4PtyZip", query = "SELECT m FROM McParty m WHERE m.p593s4PtyZip = :p593s4PtyZip")})
public class McParty implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McPartyPK mcPartyPK;
    @Basic(optional = false)
    @Column(name = "P591S1_PTY_NM_1")
    private String p591s1PtyNm1;
    @Basic(optional = false)
    @Column(name = "P591S1_PTY_NM_2")
    private String p591s1PtyNm2;
    @Basic(optional = false)
    @Column(name = "P591S1_PTY_NM_3")
    private String p591s1PtyNm3;
    @Basic(optional = false)
    @Column(name = "P592S1_PTY_ADDR1")
    private String p592s1PtyAddr1;
    @Basic(optional = false)
    @Column(name = "P592S1_PTY_ADDR2")
    private String p592s1PtyAddr2;
    @Basic(optional = false)
    @Column(name = "P592S1_PTY_ADDR3")
    private String p592s1PtyAddr3;
    @Basic(optional = false)
    @Column(name = "P592S1_PTY_ADDR4")
    private String p592s1PtyAddr4;
    @Basic(optional = false)
    @Column(name = "P592S1_PTY_ADDR5")
    private String p592s1PtyAddr5;
    @Basic(optional = false)
    @Column(name = "P592S1_PTY_ADDR6")
    private String p592s1PtyAddr6;
    @Basic(optional = false)
    @Column(name = "P593S1_PTY_CTY")
    private String p593s1PtyCty;
    @Basic(optional = false)
    @Column(name = "P593S2_PTY_ST")
    private String p593s2PtySt;
    @Basic(optional = false)
    @Column(name = "P593S3_PTY_CRTY")
    private String p593s3PtyCrty;
    @Basic(optional = false)
    @Column(name = "P593S4_PTY_ZIP")
    private String p593s4PtyZip;

    public McParty() {
    }

    public McParty(McPartyPK mcPartyPK) {
        this.mcPartyPK = mcPartyPK;
    }

    public McParty(McPartyPK mcPartyPK, String p591s1PtyNm1, String p591s1PtyNm2, String p591s1PtyNm3, String p592s1PtyAddr1, String p592s1PtyAddr2, String p592s1PtyAddr3, String p592s1PtyAddr4, String p592s1PtyAddr5, String p592s1PtyAddr6, String p593s1PtyCty, String p593s2PtySt, String p593s3PtyCrty, String p593s4PtyZip) {
        this.mcPartyPK = mcPartyPK;
        this.p591s1PtyNm1 = p591s1PtyNm1;
        this.p591s1PtyNm2 = p591s1PtyNm2;
        this.p591s1PtyNm3 = p591s1PtyNm3;
        this.p592s1PtyAddr1 = p592s1PtyAddr1;
        this.p592s1PtyAddr2 = p592s1PtyAddr2;
        this.p592s1PtyAddr3 = p592s1PtyAddr3;
        this.p592s1PtyAddr4 = p592s1PtyAddr4;
        this.p592s1PtyAddr5 = p592s1PtyAddr5;
        this.p592s1PtyAddr6 = p592s1PtyAddr6;
        this.p593s1PtyCty = p593s1PtyCty;
        this.p593s2PtySt = p593s2PtySt;
        this.p593s3PtyCrty = p593s3PtyCrty;
        this.p593s4PtyZip = p593s4PtyZip;
    }

    public McParty(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcPartyPK = new McPartyPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McPartyPK getMcPartyPK() {
        return mcPartyPK;
    }

    public void setMcPartyPK(McPartyPK mcPartyPK) {
        this.mcPartyPK = mcPartyPK;
    }

    public String getP591s1PtyNm1() {
        return p591s1PtyNm1;
    }

    public void setP591s1PtyNm1(String p591s1PtyNm1) {
        this.p591s1PtyNm1 = p591s1PtyNm1;
    }

    public String getP591s1PtyNm2() {
        return p591s1PtyNm2;
    }

    public void setP591s1PtyNm2(String p591s1PtyNm2) {
        this.p591s1PtyNm2 = p591s1PtyNm2;
    }

    public String getP591s1PtyNm3() {
        return p591s1PtyNm3;
    }

    public void setP591s1PtyNm3(String p591s1PtyNm3) {
        this.p591s1PtyNm3 = p591s1PtyNm3;
    }

    public String getP592s1PtyAddr1() {
        return p592s1PtyAddr1;
    }

    public void setP592s1PtyAddr1(String p592s1PtyAddr1) {
        this.p592s1PtyAddr1 = p592s1PtyAddr1;
    }

    public String getP592s1PtyAddr2() {
        return p592s1PtyAddr2;
    }

    public void setP592s1PtyAddr2(String p592s1PtyAddr2) {
        this.p592s1PtyAddr2 = p592s1PtyAddr2;
    }

    public String getP592s1PtyAddr3() {
        return p592s1PtyAddr3;
    }

    public void setP592s1PtyAddr3(String p592s1PtyAddr3) {
        this.p592s1PtyAddr3 = p592s1PtyAddr3;
    }

    public String getP592s1PtyAddr4() {
        return p592s1PtyAddr4;
    }

    public void setP592s1PtyAddr4(String p592s1PtyAddr4) {
        this.p592s1PtyAddr4 = p592s1PtyAddr4;
    }

    public String getP592s1PtyAddr5() {
        return p592s1PtyAddr5;
    }

    public void setP592s1PtyAddr5(String p592s1PtyAddr5) {
        this.p592s1PtyAddr5 = p592s1PtyAddr5;
    }

    public String getP592s1PtyAddr6() {
        return p592s1PtyAddr6;
    }

    public void setP592s1PtyAddr6(String p592s1PtyAddr6) {
        this.p592s1PtyAddr6 = p592s1PtyAddr6;
    }

    public String getP593s1PtyCty() {
        return p593s1PtyCty;
    }

    public void setP593s1PtyCty(String p593s1PtyCty) {
        this.p593s1PtyCty = p593s1PtyCty;
    }

    public String getP593s2PtySt() {
        return p593s2PtySt;
    }

    public void setP593s2PtySt(String p593s2PtySt) {
        this.p593s2PtySt = p593s2PtySt;
    }

    public String getP593s3PtyCrty() {
        return p593s3PtyCrty;
    }

    public void setP593s3PtyCrty(String p593s3PtyCrty) {
        this.p593s3PtyCrty = p593s3PtyCrty;
    }

    public String getP593s4PtyZip() {
        return p593s4PtyZip;
    }

    public void setP593s4PtyZip(String p593s4PtyZip) {
        this.p593s4PtyZip = p593s4PtyZip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcPartyPK != null ? mcPartyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McParty)) {
            return false;
        }
        McParty other = (McParty) object;
        if ((this.mcPartyPK == null && other.mcPartyPK != null) || (this.mcPartyPK != null && !this.mcPartyPK.equals(other.mcPartyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McParty[ mcPartyPK=" + mcPartyPK + " ]";
    }
    
}
