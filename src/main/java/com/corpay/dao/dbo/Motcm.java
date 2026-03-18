package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MOTCM", catalog = "", schema = "DBO")
public class Motcm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCOUNT_CODE")
    private String accountCode;
    @Basic(optional = false)
    @Column(name = "GROUP_ID1")
    private String groupId1;
    @Basic(optional = false)
    @Column(name = "GROUP_ID2")
    private String groupId2;
    @Basic(optional = false)
    @Column(name = "GROUP_ID3")
    private String groupId3;
    @Basic(optional = false)
    @Column(name = "GROUP_ID4")
    private String groupId4;
    @Basic(optional = false)
    @Column(name = "GROUP_ID5")
    private String groupId5;
    @Basic(optional = false)
    @Column(name = "TNM_INDICATOR")
    private Character tnmIndicator;

    public Motcm() {
    }

    public Motcm(String accountCode) {
        this.accountCode = accountCode;
    }

    public Motcm(String accountCode, String groupId1, String groupId2, String groupId3, String groupId4, String groupId5, Character tnmIndicator) {
        this.accountCode = accountCode;
        this.groupId1 = groupId1;
        this.groupId2 = groupId2;
        this.groupId3 = groupId3;
        this.groupId4 = groupId4;
        this.groupId5 = groupId5;
        this.tnmIndicator = tnmIndicator;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getGroupId1() {
        return groupId1;
    }

    public void setGroupId1(String groupId1) {
        this.groupId1 = groupId1;
    }

    public String getGroupId2() {
        return groupId2;
    }

    public void setGroupId2(String groupId2) {
        this.groupId2 = groupId2;
    }

    public String getGroupId3() {
        return groupId3;
    }

    public void setGroupId3(String groupId3) {
        this.groupId3 = groupId3;
    }

    public String getGroupId4() {
        return groupId4;
    }

    public void setGroupId4(String groupId4) {
        this.groupId4 = groupId4;
    }

    public String getGroupId5() {
        return groupId5;
    }

    public void setGroupId5(String groupId5) {
        this.groupId5 = groupId5;
    }

    public Character getTnmIndicator() {
        return tnmIndicator;
    }

    public void setTnmIndicator(Character tnmIndicator) {
        this.tnmIndicator = tnmIndicator;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountCode != null ? accountCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Motcm)) {
            return false;
        }
        Motcm other = (Motcm) object;
        if ((this.accountCode == null && other.accountCode != null) || (this.accountCode != null && !this.accountCode.equals(other.accountCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Motcm[ accountCode=" + accountCode + " ]";
    }

}
