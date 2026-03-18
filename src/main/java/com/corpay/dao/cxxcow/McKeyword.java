package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_KEYWORD", catalog = "", schema = "CXXCOW")
public class McKeyword implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KEYWORD")
    private String keyword;
    @Basic(optional = false)
    @Column(name = "KWRD_MCC")
    private String kwrdMcc;

    public McKeyword() {
    }

    public McKeyword(String keyword) {
        this.keyword = keyword;
    }

    public McKeyword(String keyword, String kwrdMcc) {
        this.keyword = keyword;
        this.kwrdMcc = kwrdMcc;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKwrdMcc() {
        return kwrdMcc;
    }

    public void setKwrdMcc(String kwrdMcc) {
        this.kwrdMcc = kwrdMcc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyword != null ? keyword.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McKeyword)) {
            return false;
        }
        McKeyword other = (McKeyword) object;
        if ((this.keyword == null && other.keyword != null) || (this.keyword != null && !this.keyword.equals(other.keyword))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McKeyword[ keyword=" + keyword + " ]";
    }

}
