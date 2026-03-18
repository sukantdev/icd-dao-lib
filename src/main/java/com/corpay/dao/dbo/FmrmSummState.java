package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "FMRM_SUMM_STATE", catalog = "", schema = "DBO")
public class FmrmSummState implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FmrmSummStatePK fmrmSummStatePK;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_FLG")
    private Character lmtdNetwFlg;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_FUEL")
    private Character lmtdNetwPrdFuel;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_OIL")
    private Character lmtdNetwPrdOil;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_CASH")
    private Character lmtdNetwPrdCash;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_0")
    private Character lmtdNetwPrd0;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_1")
    private Character lmtdNetwPrd1;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_2")
    private Character lmtdNetwPrd2;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_3")
    private Character lmtdNetwPrd3;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_4")
    private Character lmtdNetwPrd4;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_5")
    private Character lmtdNetwPrd5;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_6")
    private Character lmtdNetwPrd6;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_7")
    private Character lmtdNetwPrd7;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_8")
    private Character lmtdNetwPrd8;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_9")
    private Character lmtdNetwPrd9;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_A")
    private Character lmtdNetwPrdA;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_B")
    private Character lmtdNetwPrdB;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_C")
    private Character lmtdNetwPrdC;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_D")
    private Character lmtdNetwPrdD;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_E")
    private Character lmtdNetwPrdE;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_F")
    private Character lmtdNetwPrdF;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_G")
    private Character lmtdNetwPrdG;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_H")
    private Character lmtdNetwPrdH;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_I")
    private Character lmtdNetwPrdI;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_J")
    private Character lmtdNetwPrdJ;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_K")
    private Character lmtdNetwPrdK;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_L")
    private Character lmtdNetwPrdL;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_M")
    private Character lmtdNetwPrdM;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_N")
    private Character lmtdNetwPrdN;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_O")
    private Character lmtdNetwPrdO;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_P")
    private Character lmtdNetwPrdP;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_Q")
    private Character lmtdNetwPrdQ;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_R")
    private Character lmtdNetwPrdR;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_S")
    private Character lmtdNetwPrdS;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_T")
    private Character lmtdNetwPrdT;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_U")
    private Character lmtdNetwPrdU;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_V")
    private Character lmtdNetwPrdV;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_W")
    private Character lmtdNetwPrdW;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_X")
    private Character lmtdNetwPrdX;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_Y")
    private Character lmtdNetwPrdY;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_Z")
    private Character lmtdNetwPrdZ;
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

    public FmrmSummState() {
    }

    public FmrmSummState(FmrmSummStatePK fmrmSummStatePK) {
        this.fmrmSummStatePK = fmrmSummStatePK;
    }

    public FmrmSummState(FmrmSummStatePK fmrmSummStatePK, Character lmtdNetwFlg, Character lmtdNetwPrdFuel, Character lmtdNetwPrdOil, Character lmtdNetwPrdCash, Character lmtdNetwPrd0, Character lmtdNetwPrd1, Character lmtdNetwPrd2, Character lmtdNetwPrd3, Character lmtdNetwPrd4, Character lmtdNetwPrd5, Character lmtdNetwPrd6, Character lmtdNetwPrd7, Character lmtdNetwPrd8, Character lmtdNetwPrd9, Character lmtdNetwPrdA, Character lmtdNetwPrdB, Character lmtdNetwPrdC, Character lmtdNetwPrdD, Character lmtdNetwPrdE, Character lmtdNetwPrdF, Character lmtdNetwPrdG, Character lmtdNetwPrdH, Character lmtdNetwPrdI, Character lmtdNetwPrdJ, Character lmtdNetwPrdK, Character lmtdNetwPrdL, Character lmtdNetwPrdM, Character lmtdNetwPrdN, Character lmtdNetwPrdO, Character lmtdNetwPrdP, Character lmtdNetwPrdQ, Character lmtdNetwPrdR, Character lmtdNetwPrdS, Character lmtdNetwPrdT, Character lmtdNetwPrdU, Character lmtdNetwPrdV, Character lmtdNetwPrdW, Character lmtdNetwPrdX, Character lmtdNetwPrdY, Character lmtdNetwPrdZ, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fmrmSummStatePK = fmrmSummStatePK;
        this.lmtdNetwFlg = lmtdNetwFlg;
        this.lmtdNetwPrdFuel = lmtdNetwPrdFuel;
        this.lmtdNetwPrdOil = lmtdNetwPrdOil;
        this.lmtdNetwPrdCash = lmtdNetwPrdCash;
        this.lmtdNetwPrd0 = lmtdNetwPrd0;
        this.lmtdNetwPrd1 = lmtdNetwPrd1;
        this.lmtdNetwPrd2 = lmtdNetwPrd2;
        this.lmtdNetwPrd3 = lmtdNetwPrd3;
        this.lmtdNetwPrd4 = lmtdNetwPrd4;
        this.lmtdNetwPrd5 = lmtdNetwPrd5;
        this.lmtdNetwPrd6 = lmtdNetwPrd6;
        this.lmtdNetwPrd7 = lmtdNetwPrd7;
        this.lmtdNetwPrd8 = lmtdNetwPrd8;
        this.lmtdNetwPrd9 = lmtdNetwPrd9;
        this.lmtdNetwPrdA = lmtdNetwPrdA;
        this.lmtdNetwPrdB = lmtdNetwPrdB;
        this.lmtdNetwPrdC = lmtdNetwPrdC;
        this.lmtdNetwPrdD = lmtdNetwPrdD;
        this.lmtdNetwPrdE = lmtdNetwPrdE;
        this.lmtdNetwPrdF = lmtdNetwPrdF;
        this.lmtdNetwPrdG = lmtdNetwPrdG;
        this.lmtdNetwPrdH = lmtdNetwPrdH;
        this.lmtdNetwPrdI = lmtdNetwPrdI;
        this.lmtdNetwPrdJ = lmtdNetwPrdJ;
        this.lmtdNetwPrdK = lmtdNetwPrdK;
        this.lmtdNetwPrdL = lmtdNetwPrdL;
        this.lmtdNetwPrdM = lmtdNetwPrdM;
        this.lmtdNetwPrdN = lmtdNetwPrdN;
        this.lmtdNetwPrdO = lmtdNetwPrdO;
        this.lmtdNetwPrdP = lmtdNetwPrdP;
        this.lmtdNetwPrdQ = lmtdNetwPrdQ;
        this.lmtdNetwPrdR = lmtdNetwPrdR;
        this.lmtdNetwPrdS = lmtdNetwPrdS;
        this.lmtdNetwPrdT = lmtdNetwPrdT;
        this.lmtdNetwPrdU = lmtdNetwPrdU;
        this.lmtdNetwPrdV = lmtdNetwPrdV;
        this.lmtdNetwPrdW = lmtdNetwPrdW;
        this.lmtdNetwPrdX = lmtdNetwPrdX;
        this.lmtdNetwPrdY = lmtdNetwPrdY;
        this.lmtdNetwPrdZ = lmtdNetwPrdZ;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FmrmSummState(String custId, String stCd) {
        this.fmrmSummStatePK = new FmrmSummStatePK(custId, stCd);
    }

    public FmrmSummStatePK getFmrmSummStatePK() {
        return fmrmSummStatePK;
    }

    public void setFmrmSummStatePK(FmrmSummStatePK fmrmSummStatePK) {
        this.fmrmSummStatePK = fmrmSummStatePK;
    }

    public Character getLmtdNetwFlg() {
        return lmtdNetwFlg;
    }

    public void setLmtdNetwFlg(Character lmtdNetwFlg) {
        this.lmtdNetwFlg = lmtdNetwFlg;
    }

    public Character getLmtdNetwPrdFuel() {
        return lmtdNetwPrdFuel;
    }

    public void setLmtdNetwPrdFuel(Character lmtdNetwPrdFuel) {
        this.lmtdNetwPrdFuel = lmtdNetwPrdFuel;
    }

    public Character getLmtdNetwPrdOil() {
        return lmtdNetwPrdOil;
    }

    public void setLmtdNetwPrdOil(Character lmtdNetwPrdOil) {
        this.lmtdNetwPrdOil = lmtdNetwPrdOil;
    }

    public Character getLmtdNetwPrdCash() {
        return lmtdNetwPrdCash;
    }

    public void setLmtdNetwPrdCash(Character lmtdNetwPrdCash) {
        this.lmtdNetwPrdCash = lmtdNetwPrdCash;
    }

    public Character getLmtdNetwPrd0() {
        return lmtdNetwPrd0;
    }

    public void setLmtdNetwPrd0(Character lmtdNetwPrd0) {
        this.lmtdNetwPrd0 = lmtdNetwPrd0;
    }

    public Character getLmtdNetwPrd1() {
        return lmtdNetwPrd1;
    }

    public void setLmtdNetwPrd1(Character lmtdNetwPrd1) {
        this.lmtdNetwPrd1 = lmtdNetwPrd1;
    }

    public Character getLmtdNetwPrd2() {
        return lmtdNetwPrd2;
    }

    public void setLmtdNetwPrd2(Character lmtdNetwPrd2) {
        this.lmtdNetwPrd2 = lmtdNetwPrd2;
    }

    public Character getLmtdNetwPrd3() {
        return lmtdNetwPrd3;
    }

    public void setLmtdNetwPrd3(Character lmtdNetwPrd3) {
        this.lmtdNetwPrd3 = lmtdNetwPrd3;
    }

    public Character getLmtdNetwPrd4() {
        return lmtdNetwPrd4;
    }

    public void setLmtdNetwPrd4(Character lmtdNetwPrd4) {
        this.lmtdNetwPrd4 = lmtdNetwPrd4;
    }

    public Character getLmtdNetwPrd5() {
        return lmtdNetwPrd5;
    }

    public void setLmtdNetwPrd5(Character lmtdNetwPrd5) {
        this.lmtdNetwPrd5 = lmtdNetwPrd5;
    }

    public Character getLmtdNetwPrd6() {
        return lmtdNetwPrd6;
    }

    public void setLmtdNetwPrd6(Character lmtdNetwPrd6) {
        this.lmtdNetwPrd6 = lmtdNetwPrd6;
    }

    public Character getLmtdNetwPrd7() {
        return lmtdNetwPrd7;
    }

    public void setLmtdNetwPrd7(Character lmtdNetwPrd7) {
        this.lmtdNetwPrd7 = lmtdNetwPrd7;
    }

    public Character getLmtdNetwPrd8() {
        return lmtdNetwPrd8;
    }

    public void setLmtdNetwPrd8(Character lmtdNetwPrd8) {
        this.lmtdNetwPrd8 = lmtdNetwPrd8;
    }

    public Character getLmtdNetwPrd9() {
        return lmtdNetwPrd9;
    }

    public void setLmtdNetwPrd9(Character lmtdNetwPrd9) {
        this.lmtdNetwPrd9 = lmtdNetwPrd9;
    }

    public Character getLmtdNetwPrdA() {
        return lmtdNetwPrdA;
    }

    public void setLmtdNetwPrdA(Character lmtdNetwPrdA) {
        this.lmtdNetwPrdA = lmtdNetwPrdA;
    }

    public Character getLmtdNetwPrdB() {
        return lmtdNetwPrdB;
    }

    public void setLmtdNetwPrdB(Character lmtdNetwPrdB) {
        this.lmtdNetwPrdB = lmtdNetwPrdB;
    }

    public Character getLmtdNetwPrdC() {
        return lmtdNetwPrdC;
    }

    public void setLmtdNetwPrdC(Character lmtdNetwPrdC) {
        this.lmtdNetwPrdC = lmtdNetwPrdC;
    }

    public Character getLmtdNetwPrdD() {
        return lmtdNetwPrdD;
    }

    public void setLmtdNetwPrdD(Character lmtdNetwPrdD) {
        this.lmtdNetwPrdD = lmtdNetwPrdD;
    }

    public Character getLmtdNetwPrdE() {
        return lmtdNetwPrdE;
    }

    public void setLmtdNetwPrdE(Character lmtdNetwPrdE) {
        this.lmtdNetwPrdE = lmtdNetwPrdE;
    }

    public Character getLmtdNetwPrdF() {
        return lmtdNetwPrdF;
    }

    public void setLmtdNetwPrdF(Character lmtdNetwPrdF) {
        this.lmtdNetwPrdF = lmtdNetwPrdF;
    }

    public Character getLmtdNetwPrdG() {
        return lmtdNetwPrdG;
    }

    public void setLmtdNetwPrdG(Character lmtdNetwPrdG) {
        this.lmtdNetwPrdG = lmtdNetwPrdG;
    }

    public Character getLmtdNetwPrdH() {
        return lmtdNetwPrdH;
    }

    public void setLmtdNetwPrdH(Character lmtdNetwPrdH) {
        this.lmtdNetwPrdH = lmtdNetwPrdH;
    }

    public Character getLmtdNetwPrdI() {
        return lmtdNetwPrdI;
    }

    public void setLmtdNetwPrdI(Character lmtdNetwPrdI) {
        this.lmtdNetwPrdI = lmtdNetwPrdI;
    }

    public Character getLmtdNetwPrdJ() {
        return lmtdNetwPrdJ;
    }

    public void setLmtdNetwPrdJ(Character lmtdNetwPrdJ) {
        this.lmtdNetwPrdJ = lmtdNetwPrdJ;
    }

    public Character getLmtdNetwPrdK() {
        return lmtdNetwPrdK;
    }

    public void setLmtdNetwPrdK(Character lmtdNetwPrdK) {
        this.lmtdNetwPrdK = lmtdNetwPrdK;
    }

    public Character getLmtdNetwPrdL() {
        return lmtdNetwPrdL;
    }

    public void setLmtdNetwPrdL(Character lmtdNetwPrdL) {
        this.lmtdNetwPrdL = lmtdNetwPrdL;
    }

    public Character getLmtdNetwPrdM() {
        return lmtdNetwPrdM;
    }

    public void setLmtdNetwPrdM(Character lmtdNetwPrdM) {
        this.lmtdNetwPrdM = lmtdNetwPrdM;
    }

    public Character getLmtdNetwPrdN() {
        return lmtdNetwPrdN;
    }

    public void setLmtdNetwPrdN(Character lmtdNetwPrdN) {
        this.lmtdNetwPrdN = lmtdNetwPrdN;
    }

    public Character getLmtdNetwPrdO() {
        return lmtdNetwPrdO;
    }

    public void setLmtdNetwPrdO(Character lmtdNetwPrdO) {
        this.lmtdNetwPrdO = lmtdNetwPrdO;
    }

    public Character getLmtdNetwPrdP() {
        return lmtdNetwPrdP;
    }

    public void setLmtdNetwPrdP(Character lmtdNetwPrdP) {
        this.lmtdNetwPrdP = lmtdNetwPrdP;
    }

    public Character getLmtdNetwPrdQ() {
        return lmtdNetwPrdQ;
    }

    public void setLmtdNetwPrdQ(Character lmtdNetwPrdQ) {
        this.lmtdNetwPrdQ = lmtdNetwPrdQ;
    }

    public Character getLmtdNetwPrdR() {
        return lmtdNetwPrdR;
    }

    public void setLmtdNetwPrdR(Character lmtdNetwPrdR) {
        this.lmtdNetwPrdR = lmtdNetwPrdR;
    }

    public Character getLmtdNetwPrdS() {
        return lmtdNetwPrdS;
    }

    public void setLmtdNetwPrdS(Character lmtdNetwPrdS) {
        this.lmtdNetwPrdS = lmtdNetwPrdS;
    }

    public Character getLmtdNetwPrdT() {
        return lmtdNetwPrdT;
    }

    public void setLmtdNetwPrdT(Character lmtdNetwPrdT) {
        this.lmtdNetwPrdT = lmtdNetwPrdT;
    }

    public Character getLmtdNetwPrdU() {
        return lmtdNetwPrdU;
    }

    public void setLmtdNetwPrdU(Character lmtdNetwPrdU) {
        this.lmtdNetwPrdU = lmtdNetwPrdU;
    }

    public Character getLmtdNetwPrdV() {
        return lmtdNetwPrdV;
    }

    public void setLmtdNetwPrdV(Character lmtdNetwPrdV) {
        this.lmtdNetwPrdV = lmtdNetwPrdV;
    }

    public Character getLmtdNetwPrdW() {
        return lmtdNetwPrdW;
    }

    public void setLmtdNetwPrdW(Character lmtdNetwPrdW) {
        this.lmtdNetwPrdW = lmtdNetwPrdW;
    }

    public Character getLmtdNetwPrdX() {
        return lmtdNetwPrdX;
    }

    public void setLmtdNetwPrdX(Character lmtdNetwPrdX) {
        this.lmtdNetwPrdX = lmtdNetwPrdX;
    }

    public Character getLmtdNetwPrdY() {
        return lmtdNetwPrdY;
    }

    public void setLmtdNetwPrdY(Character lmtdNetwPrdY) {
        this.lmtdNetwPrdY = lmtdNetwPrdY;
    }

    public Character getLmtdNetwPrdZ() {
        return lmtdNetwPrdZ;
    }

    public void setLmtdNetwPrdZ(Character lmtdNetwPrdZ) {
        this.lmtdNetwPrdZ = lmtdNetwPrdZ;
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
        hash += (fmrmSummStatePK != null ? fmrmSummStatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FmrmSummState)) {
            return false;
        }
        FmrmSummState other = (FmrmSummState) object;
        if ((this.fmrmSummStatePK == null && other.fmrmSummStatePK != null) || (this.fmrmSummStatePK != null && !this.fmrmSummStatePK.equals(other.fmrmSummStatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FmrmSummState[ fmrmSummStatePK=" + fmrmSummStatePK + " ]";
    }

}
