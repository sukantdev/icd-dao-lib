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
@Table(name = "MC_SUPLM_DATA", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McSuplmData.findAll", query = "SELECT m FROM McSuplmData m"),
    @NamedQuery(name = "McSuplmData.findByP105s1FileTy", query = "SELECT m FROM McSuplmData m WHERE m.mcSuplmDataPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McSuplmData.findByP105s2FileRDt", query = "SELECT m FROM McSuplmData m WHERE m.mcSuplmDataPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McSuplmData.findByP105s3ProcId", query = "SELECT m FROM McSuplmData m WHERE m.mcSuplmDataPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McSuplmData.findByP105s4FileSeqNo", query = "SELECT m FROM McSuplmData m WHERE m.mcSuplmDataPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McSuplmData.findByD71MsgNo", query = "SELECT m FROM McSuplmData m WHERE m.mcSuplmDataPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McSuplmData.findByOccInd", query = "SELECT m FROM McSuplmData m WHERE m.mcSuplmDataPK.occInd = :occInd"),
    @NamedQuery(name = "McSuplmData.findBySdataTyp", query = "SELECT m FROM McSuplmData m WHERE m.mcSuplmDataPK.sdataTyp = :sdataTyp"),
    @NamedQuery(name = "McSuplmData.findByP604s1SdataDesc1", query = "SELECT m FROM McSuplmData m WHERE m.p604s1SdataDesc1 = :p604s1SdataDesc1"),
    @NamedQuery(name = "McSuplmData.findByP604s2Sdata1", query = "SELECT m FROM McSuplmData m WHERE m.p604s2Sdata1 = :p604s2Sdata1"),
    @NamedQuery(name = "McSuplmData.findByP604s3SDataCd1", query = "SELECT m FROM McSuplmData m WHERE m.p604s3SDataCd1 = :p604s3SDataCd1"),
    @NamedQuery(name = "McSuplmData.findByP604s1SdataDesc2", query = "SELECT m FROM McSuplmData m WHERE m.p604s1SdataDesc2 = :p604s1SdataDesc2"),
    @NamedQuery(name = "McSuplmData.findByP604s2Sdata2", query = "SELECT m FROM McSuplmData m WHERE m.p604s2Sdata2 = :p604s2Sdata2"),
    @NamedQuery(name = "McSuplmData.findByP604s3SDataCd2", query = "SELECT m FROM McSuplmData m WHERE m.p604s3SDataCd2 = :p604s3SDataCd2")})
public class McSuplmData implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McSuplmDataPK mcSuplmDataPK;
    @Basic(optional = false)
    @Column(name = "P604S1_SDATA_DESC1")
    private String p604s1SdataDesc1;
    @Basic(optional = false)
    @Column(name = "P604S2_SDATA_1")
    private String p604s2Sdata1;
    @Basic(optional = false)
    @Column(name = "P604S3_S_DATA_CD_1")
    private String p604s3SDataCd1;
    @Basic(optional = false)
    @Column(name = "P604S1_SDATA_DESC2")
    private String p604s1SdataDesc2;
    @Basic(optional = false)
    @Column(name = "P604S2_SDATA_2")
    private String p604s2Sdata2;
    @Basic(optional = false)
    @Column(name = "P604S3_S_DATA_CD_2")
    private String p604s3SDataCd2;

    public McSuplmData() {
    }

    public McSuplmData(McSuplmDataPK mcSuplmDataPK) {
        this.mcSuplmDataPK = mcSuplmDataPK;
    }

    public McSuplmData(McSuplmDataPK mcSuplmDataPK, String p604s1SdataDesc1, String p604s2Sdata1, String p604s3SDataCd1, String p604s1SdataDesc2, String p604s2Sdata2, String p604s3SDataCd2) {
        this.mcSuplmDataPK = mcSuplmDataPK;
        this.p604s1SdataDesc1 = p604s1SdataDesc1;
        this.p604s2Sdata1 = p604s2Sdata1;
        this.p604s3SDataCd1 = p604s3SDataCd1;
        this.p604s1SdataDesc2 = p604s1SdataDesc2;
        this.p604s2Sdata2 = p604s2Sdata2;
        this.p604s3SDataCd2 = p604s3SDataCd2;
    }

    public McSuplmData(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd, Character sdataTyp) {
        this.mcSuplmDataPK = new McSuplmDataPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd, sdataTyp);
    }

    public McSuplmDataPK getMcSuplmDataPK() {
        return mcSuplmDataPK;
    }

    public void setMcSuplmDataPK(McSuplmDataPK mcSuplmDataPK) {
        this.mcSuplmDataPK = mcSuplmDataPK;
    }

    public String getP604s1SdataDesc1() {
        return p604s1SdataDesc1;
    }

    public void setP604s1SdataDesc1(String p604s1SdataDesc1) {
        this.p604s1SdataDesc1 = p604s1SdataDesc1;
    }

    public String getP604s2Sdata1() {
        return p604s2Sdata1;
    }

    public void setP604s2Sdata1(String p604s2Sdata1) {
        this.p604s2Sdata1 = p604s2Sdata1;
    }

    public String getP604s3SDataCd1() {
        return p604s3SDataCd1;
    }

    public void setP604s3SDataCd1(String p604s3SDataCd1) {
        this.p604s3SDataCd1 = p604s3SDataCd1;
    }

    public String getP604s1SdataDesc2() {
        return p604s1SdataDesc2;
    }

    public void setP604s1SdataDesc2(String p604s1SdataDesc2) {
        this.p604s1SdataDesc2 = p604s1SdataDesc2;
    }

    public String getP604s2Sdata2() {
        return p604s2Sdata2;
    }

    public void setP604s2Sdata2(String p604s2Sdata2) {
        this.p604s2Sdata2 = p604s2Sdata2;
    }

    public String getP604s3SDataCd2() {
        return p604s3SDataCd2;
    }

    public void setP604s3SDataCd2(String p604s3SDataCd2) {
        this.p604s3SDataCd2 = p604s3SDataCd2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcSuplmDataPK != null ? mcSuplmDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McSuplmData)) {
            return false;
        }
        McSuplmData other = (McSuplmData) object;
        if ((this.mcSuplmDataPK == null && other.mcSuplmDataPK != null) || (this.mcSuplmDataPK != null && !this.mcSuplmDataPK.equals(other.mcSuplmDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McSuplmData[ mcSuplmDataPK=" + mcSuplmDataPK + " ]";
    }
    
}
