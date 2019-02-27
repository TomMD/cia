/*
 * Copyright 2010 James Pether Sörling
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:54 PM CET 
//


package com.hack23.cia.model.external.val.kommunvalkrets.impl;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class SwedenMunicipalityData.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwedenMunicipalityData", propOrder = {
    "code",
    "municipalName",
    "kommunvalkrets"
})
@Entity(name = "SwedenMunicipalityData")
@Table(name = "SWEDEN_MUNICIPALITY_DATA")
@Inheritance(strategy = InheritanceType.JOINED)
public class SwedenMunicipalityData
    implements ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The code. */
    @XmlElement(name = "kommunkod", required = true)
    protected BigInteger code;
    
    /** The municipal name. */
    @XmlElement(name = "kommunnamn", required = true)
    protected String municipalName;
    
    /** The kommunvalkrets. */
    @XmlElement(required = true)
    protected List<SwedenMunicipalityElectionRegionData> kommunvalkrets;
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the code.
	 *
	 * @return the code
	 */
    @Basic
    @Column(name = "CODE", precision = 20)
    public BigInteger getCode() {
        return code;
    }

    /**
	 * Sets the code.
	 *
	 * @param value the new code
	 */
    public void setCode(final BigInteger value) {
        this.code = value;
    }

    /**
	 * Gets the municipal name.
	 *
	 * @return the municipal name
	 */
    @Basic
    @Column(name = "MUNICIPAL_NAME")
    public String getMunicipalName() {
        return municipalName;
    }

    /**
	 * Sets the municipal name.
	 *
	 * @param value the new municipal name
	 */
    public void setMunicipalName(final String value) {
        this.municipalName = value;
    }

    /**
	 * Gets the kommunvalkrets.
	 *
	 * @return the kommunvalkrets
	 */
    @OneToMany(targetEntity = SwedenMunicipalityElectionRegionData.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "KOMMUNVALKRETS_SWEDEN_MUNICI_0")
    public List<SwedenMunicipalityElectionRegionData> getKommunvalkrets() {
        if (kommunvalkrets == null) {
            kommunvalkrets = new ArrayList<SwedenMunicipalityElectionRegionData>();
        }
        return this.kommunvalkrets;
    }

    /**
	 * Sets the kommunvalkrets.
	 *
	 * @param kommunvalkrets the new kommunvalkrets
	 */
    public void setKommunvalkrets(final List<SwedenMunicipalityElectionRegionData> kommunvalkrets) {
        this.kommunvalkrets = kommunvalkrets;
    }

    /**
	 * Gets the hjid.
	 *
	 * @return the hjid
	 */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
	 * Sets the hjid.
	 *
	 * @param value the new hjid
	 */
    public void setHjid(final Long value) {
        this.hjid = value;
    }

    /* (non-Javadoc)
     * @see org.jvnet.jaxb2_commons.lang.Equals#equals(org.jvnet.jaxb2_commons.locator.ObjectLocator, org.jvnet.jaxb2_commons.locator.ObjectLocator, java.lang.Object, org.jvnet.jaxb2_commons.lang.EqualsStrategy)
     */
    public boolean equals(final ObjectLocator thisLocator, final ObjectLocator thatLocator, final Object object, final EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SwedenMunicipalityData that = ((SwedenMunicipalityData) object);
        {
            BigInteger lhsCode;
            lhsCode = this.getCode();
            BigInteger rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            String lhsMunicipalName;
            lhsMunicipalName = this.getMunicipalName();
            String rhsMunicipalName;
            rhsMunicipalName = that.getMunicipalName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "municipalName", lhsMunicipalName), LocatorUtils.property(thatLocator, "municipalName", rhsMunicipalName), lhsMunicipalName, rhsMunicipalName)) {
                return false;
            }
        }
        {
            List<SwedenMunicipalityElectionRegionData> lhsKommunvalkrets;
            lhsKommunvalkrets = (((this.kommunvalkrets!= null)&&(!this.kommunvalkrets.isEmpty()))?this.getKommunvalkrets():null);
            List<SwedenMunicipalityElectionRegionData> rhsKommunvalkrets;
            rhsKommunvalkrets = (((that.kommunvalkrets!= null)&&(!that.kommunvalkrets.isEmpty()))?that.getKommunvalkrets():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kommunvalkrets", lhsKommunvalkrets), LocatorUtils.property(thatLocator, "kommunvalkrets", rhsKommunvalkrets), lhsKommunvalkrets, rhsKommunvalkrets)) {
                return false;
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(final Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
