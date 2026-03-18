package com.corpay.dao.cxxcow;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT_CONTRL_REL", catalog = "", schema = "CXXCOW")
public class ProductContrlRel implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductContrlRelPK productContrlRelPK;

    public ProductContrlRel() {
    }

    public ProductContrlRel(ProductContrlRelPK productContrlRelPK) {
        this.productContrlRelPK = productContrlRelPK;
    }

    public ProductContrlRel(int prodcId, int prodcIdSub) {
        this.productContrlRelPK = new ProductContrlRelPK(prodcId, prodcIdSub);
    }

    public ProductContrlRelPK getProductContrlRelPK() {
        return productContrlRelPK;
    }

    public void setProductContrlRelPK(ProductContrlRelPK productContrlRelPK) {
        this.productContrlRelPK = productContrlRelPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productContrlRelPK != null ? productContrlRelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ProductContrlRel)) {
            return false;
        }
        ProductContrlRel other = (ProductContrlRel) object;
        if ((this.productContrlRelPK == null && other.productContrlRelPK != null) || (this.productContrlRelPK != null && !this.productContrlRelPK.equals(other.productContrlRelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProductContrlRel[ productContrlRelPK=" + productContrlRelPK + " ]";
    }

}
