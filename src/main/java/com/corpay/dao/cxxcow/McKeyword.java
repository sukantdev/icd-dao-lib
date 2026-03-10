/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_KEYWORD", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McKeyword.findAll", query = "SELECT m FROM McKeyword m"),
    @NamedQuery(name = "McKeyword.findByKeyword", query = "SELECT m FROM McKeyword m WHERE m.keyword = :keyword"),
    @NamedQuery(name = "McKeyword.findByKwrdMcc", query = "SELECT m FROM McKeyword m WHERE m.kwrdMcc = :kwrdMcc")})
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
