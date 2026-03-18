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
@Table(name = "CDN_SUB_PROD_DESC", catalog = "", schema = "DBO")
public class CdnSubProdDesc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDN_SUB_PROD_CD")
    private String cdnSubProdCd;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_DESC_FULL")
    private String subProdDescFull;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_DESC_16")
    private String subProdDesc16;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_DESC_10")
    private String subProdDesc10;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_DESC_9")
    private String subProdDesc9;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_DESC_8")
    private String subProdDesc8;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_DESC_7")
    private String subProdDesc7;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_DESC_6")
    private String subProdDesc6;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_DESC_5")
    private String subProdDesc5;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_DESC_4")
    private String subProdDesc4;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_DESC_3")
    private String subProdDesc3;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_DESC_2")
    private String subProdDesc2;
    @Basic(optional = false)
    @Column(name = "CST_PLUS_SUFFIX")
    private String cstPlusSuffix;
    @Basic(optional = false)
    @Column(name = "FL_OR_MAINT_FLG")
    private Character flOrMaintFlg;
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
    @Column(name = "SUB_PROD_SUB_CAT")
    private String subProdSubCat;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_SORT_KEY")
    private int subProdSortKey;
    @Basic(optional = false)
    @Column(name = "SUB_PRD_1_BYTE_DES")
    private Character subPrd1ByteDes;
    @Basic(optional = false)
    @Column(name = "SUPPLY_TYPE")
    private String supplyType;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_GROUP")
    private String subProdGroup;
    @Basic(optional = false)
    @Column(name = "DSC_APPLY_FLG")
    private Character dscApplyFlg;
    @Basic(optional = false)
    @Column(name = "ADDITIVE_FLG")
    private Character additiveFlg;

    public CdnSubProdDesc() {
    }

    public CdnSubProdDesc(String cdnSubProdCd) {
        this.cdnSubProdCd = cdnSubProdCd;
    }

    public CdnSubProdDesc(String cdnSubProdCd, String subProdDescFull, String subProdDesc16, String subProdDesc10, String subProdDesc9, String subProdDesc8, String subProdDesc7, String subProdDesc6, String subProdDesc5, String subProdDesc4, String subProdDesc3, String subProdDesc2, String cstPlusSuffix, Character flOrMaintFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String subProdSubCat, int subProdSortKey, Character subPrd1ByteDes, String supplyType, String subProdGroup, Character dscApplyFlg, Character additiveFlg) {
        this.cdnSubProdCd = cdnSubProdCd;
        this.subProdDescFull = subProdDescFull;
        this.subProdDesc16 = subProdDesc16;
        this.subProdDesc10 = subProdDesc10;
        this.subProdDesc9 = subProdDesc9;
        this.subProdDesc8 = subProdDesc8;
        this.subProdDesc7 = subProdDesc7;
        this.subProdDesc6 = subProdDesc6;
        this.subProdDesc5 = subProdDesc5;
        this.subProdDesc4 = subProdDesc4;
        this.subProdDesc3 = subProdDesc3;
        this.subProdDesc2 = subProdDesc2;
        this.cstPlusSuffix = cstPlusSuffix;
        this.flOrMaintFlg = flOrMaintFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.subProdSubCat = subProdSubCat;
        this.subProdSortKey = subProdSortKey;
        this.subPrd1ByteDes = subPrd1ByteDes;
        this.supplyType = supplyType;
        this.subProdGroup = subProdGroup;
        this.dscApplyFlg = dscApplyFlg;
        this.additiveFlg = additiveFlg;
    }

    public String getCdnSubProdCd() {
        return cdnSubProdCd;
    }

    public void setCdnSubProdCd(String cdnSubProdCd) {
        this.cdnSubProdCd = cdnSubProdCd;
    }

    public String getSubProdDescFull() {
        return subProdDescFull;
    }

    public void setSubProdDescFull(String subProdDescFull) {
        this.subProdDescFull = subProdDescFull;
    }

    public String getSubProdDesc16() {
        return subProdDesc16;
    }

    public void setSubProdDesc16(String subProdDesc16) {
        this.subProdDesc16 = subProdDesc16;
    }

    public String getSubProdDesc10() {
        return subProdDesc10;
    }

    public void setSubProdDesc10(String subProdDesc10) {
        this.subProdDesc10 = subProdDesc10;
    }

    public String getSubProdDesc9() {
        return subProdDesc9;
    }

    public void setSubProdDesc9(String subProdDesc9) {
        this.subProdDesc9 = subProdDesc9;
    }

    public String getSubProdDesc8() {
        return subProdDesc8;
    }

    public void setSubProdDesc8(String subProdDesc8) {
        this.subProdDesc8 = subProdDesc8;
    }

    public String getSubProdDesc7() {
        return subProdDesc7;
    }

    public void setSubProdDesc7(String subProdDesc7) {
        this.subProdDesc7 = subProdDesc7;
    }

    public String getSubProdDesc6() {
        return subProdDesc6;
    }

    public void setSubProdDesc6(String subProdDesc6) {
        this.subProdDesc6 = subProdDesc6;
    }

    public String getSubProdDesc5() {
        return subProdDesc5;
    }

    public void setSubProdDesc5(String subProdDesc5) {
        this.subProdDesc5 = subProdDesc5;
    }

    public String getSubProdDesc4() {
        return subProdDesc4;
    }

    public void setSubProdDesc4(String subProdDesc4) {
        this.subProdDesc4 = subProdDesc4;
    }

    public String getSubProdDesc3() {
        return subProdDesc3;
    }

    public void setSubProdDesc3(String subProdDesc3) {
        this.subProdDesc3 = subProdDesc3;
    }

    public String getSubProdDesc2() {
        return subProdDesc2;
    }

    public void setSubProdDesc2(String subProdDesc2) {
        this.subProdDesc2 = subProdDesc2;
    }

    public String getCstPlusSuffix() {
        return cstPlusSuffix;
    }

    public void setCstPlusSuffix(String cstPlusSuffix) {
        this.cstPlusSuffix = cstPlusSuffix;
    }

    public Character getFlOrMaintFlg() {
        return flOrMaintFlg;
    }

    public void setFlOrMaintFlg(Character flOrMaintFlg) {
        this.flOrMaintFlg = flOrMaintFlg;
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

    public String getSubProdSubCat() {
        return subProdSubCat;
    }

    public void setSubProdSubCat(String subProdSubCat) {
        this.subProdSubCat = subProdSubCat;
    }

    public int getSubProdSortKey() {
        return subProdSortKey;
    }

    public void setSubProdSortKey(int subProdSortKey) {
        this.subProdSortKey = subProdSortKey;
    }

    public Character getSubPrd1ByteDes() {
        return subPrd1ByteDes;
    }

    public void setSubPrd1ByteDes(Character subPrd1ByteDes) {
        this.subPrd1ByteDes = subPrd1ByteDes;
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    public String getSubProdGroup() {
        return subProdGroup;
    }

    public void setSubProdGroup(String subProdGroup) {
        this.subProdGroup = subProdGroup;
    }

    public Character getDscApplyFlg() {
        return dscApplyFlg;
    }

    public void setDscApplyFlg(Character dscApplyFlg) {
        this.dscApplyFlg = dscApplyFlg;
    }

    public Character getAdditiveFlg() {
        return additiveFlg;
    }

    public void setAdditiveFlg(Character additiveFlg) {
        this.additiveFlg = additiveFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdnSubProdCd != null ? cdnSubProdCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CdnSubProdDesc)) {
            return false;
        }
        CdnSubProdDesc other = (CdnSubProdDesc) object;
        if ((this.cdnSubProdCd == null && other.cdnSubProdCd != null) || (this.cdnSubProdCd != null && !this.cdnSubProdCd.equals(other.cdnSubProdCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CdnSubProdDesc[ cdnSubProdCd=" + cdnSubProdCd + " ]";
    }

}
