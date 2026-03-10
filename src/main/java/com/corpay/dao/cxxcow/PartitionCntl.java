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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PARTITION_CNTL", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "PartitionCntl.findAll", query = "SELECT p FROM PartitionCntl p"),
    @NamedQuery(name = "PartitionCntl.findByPcName", query = "SELECT p FROM PartitionCntl p WHERE p.pcName = :pcName"),
    @NamedQuery(name = "PartitionCntl.findByPcMax", query = "SELECT p FROM PartitionCntl p WHERE p.pcMax = :pcMax"),
    @NamedQuery(name = "PartitionCntl.findByPcIntervalType", query = "SELECT p FROM PartitionCntl p WHERE p.pcIntervalType = :pcIntervalType"),
    @NamedQuery(name = "PartitionCntl.findByPcInterval", query = "SELECT p FROM PartitionCntl p WHERE p.pcInterval = :pcInterval"),
    @NamedQuery(name = "PartitionCntl.findByPcActCluster", query = "SELECT p FROM PartitionCntl p WHERE p.pcActCluster = :pcActCluster"),
    @NamedQuery(name = "PartitionCntl.findByPcActDate", query = "SELECT p FROM PartitionCntl p WHERE p.pcActDate = :pcActDate"),
    @NamedQuery(name = "PartitionCntl.findByPcLoadSw", query = "SELECT p FROM PartitionCntl p WHERE p.pcLoadSw = :pcLoadSw"),
    @NamedQuery(name = "PartitionCntl.findByPcStatusSw", query = "SELECT p FROM PartitionCntl p WHERE p.pcStatusSw = :pcStatusSw")})
public class PartitionCntl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PC_NAME")
    private String pcName;
    @Basic(optional = false)
    @Column(name = "PC_MAX")
    private int pcMax;
    @Basic(optional = false)
    @Column(name = "PC_INTERVAL_TYPE")
    private Character pcIntervalType;
    @Basic(optional = false)
    @Column(name = "PC_INTERVAL")
    private int pcInterval;
    @Basic(optional = false)
    @Column(name = "PC_ACT_CLUSTER")
    private int pcActCluster;
    @Basic(optional = false)
    @Column(name = "PC_ACT_DATE")
    @Temporal(TemporalType.DATE)
    private Date pcActDate;
    @Basic(optional = false)
    @Column(name = "PC_LOAD_SW")
    private Character pcLoadSw;
    @Basic(optional = false)
    @Column(name = "PC_STATUS_SW")
    private Character pcStatusSw;

    public PartitionCntl() {
    }

    public PartitionCntl(String pcName) {
        this.pcName = pcName;
    }

    public PartitionCntl(String pcName, int pcMax, Character pcIntervalType, int pcInterval, int pcActCluster, Date pcActDate, Character pcLoadSw, Character pcStatusSw) {
        this.pcName = pcName;
        this.pcMax = pcMax;
        this.pcIntervalType = pcIntervalType;
        this.pcInterval = pcInterval;
        this.pcActCluster = pcActCluster;
        this.pcActDate = pcActDate;
        this.pcLoadSw = pcLoadSw;
        this.pcStatusSw = pcStatusSw;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public int getPcMax() {
        return pcMax;
    }

    public void setPcMax(int pcMax) {
        this.pcMax = pcMax;
    }

    public Character getPcIntervalType() {
        return pcIntervalType;
    }

    public void setPcIntervalType(Character pcIntervalType) {
        this.pcIntervalType = pcIntervalType;
    }

    public int getPcInterval() {
        return pcInterval;
    }

    public void setPcInterval(int pcInterval) {
        this.pcInterval = pcInterval;
    }

    public int getPcActCluster() {
        return pcActCluster;
    }

    public void setPcActCluster(int pcActCluster) {
        this.pcActCluster = pcActCluster;
    }

    public Date getPcActDate() {
        return pcActDate;
    }

    public void setPcActDate(Date pcActDate) {
        this.pcActDate = pcActDate;
    }

    public Character getPcLoadSw() {
        return pcLoadSw;
    }

    public void setPcLoadSw(Character pcLoadSw) {
        this.pcLoadSw = pcLoadSw;
    }

    public Character getPcStatusSw() {
        return pcStatusSw;
    }

    public void setPcStatusSw(Character pcStatusSw) {
        this.pcStatusSw = pcStatusSw;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pcName != null ? pcName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartitionCntl)) {
            return false;
        }
        PartitionCntl other = (PartitionCntl) object;
        if ((this.pcName == null && other.pcName != null) || (this.pcName != null && !this.pcName.equals(other.pcName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.PartitionCntl[ pcName=" + pcName + " ]";
    }
    
}
