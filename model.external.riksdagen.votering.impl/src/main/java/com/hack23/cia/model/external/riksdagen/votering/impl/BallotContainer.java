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
// Generated on: 2019.02.24 at 11:40:13 PM CET 
//


package com.hack23.cia.model.external.riksdagen.votering.impl;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class BallotContainer.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BallotContainer", propOrder = {
    "ballotDocumentData",
    "ballotDocumentElement"
})
@Entity(name = "BallotContainer")
@Table(name = "BALLOT_CONTAINER")
@Inheritance(strategy = InheritanceType.JOINED)
public class BallotContainer
    implements ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The ballot document data. */
    @XmlElement(name = "dokvotering", required = true)
    protected BallotDocumentData ballotDocumentData;
    
    /** The ballot document element. */
    @XmlElement(name = "dokument", required = true)
    protected BallotDocumentElement ballotDocumentElement;
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the ballot document data.
	 *
	 * @return the ballot document data
	 */
    @ManyToOne(targetEntity = BallotDocumentData.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "BALLOT_DOCUMENT_DATA_BALLOT__0")
    public BallotDocumentData getBallotDocumentData() {
        return ballotDocumentData;
    }

    /**
	 * Sets the ballot document data.
	 *
	 * @param value the new ballot document data
	 */
    public void setBallotDocumentData(final BallotDocumentData value) {
        this.ballotDocumentData = value;
    }

    /**
	 * Gets the ballot document element.
	 *
	 * @return the ballot document element
	 */
    @ManyToOne(targetEntity = BallotDocumentElement.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "BALLOT_DOCUMENT_ELEMENT_BALL_0")
    public BallotDocumentElement getBallotDocumentElement() {
        return ballotDocumentElement;
    }

    /**
	 * Sets the ballot document element.
	 *
	 * @param value the new ballot document element
	 */
    public void setBallotDocumentElement(final BallotDocumentElement value) {
        this.ballotDocumentElement = value;
    }

    /**
	 * With ballot document data.
	 *
	 * @param value the value
	 * @return the ballot container
	 */
    public BallotContainer withBallotDocumentData(final BallotDocumentData value) {
        setBallotDocumentData(value);
        return this;
    }

    /**
	 * With ballot document element.
	 *
	 * @param value the value
	 * @return the ballot container
	 */
    public BallotContainer withBallotDocumentElement(final BallotDocumentElement value) {
        setBallotDocumentElement(value);
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
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
        final BallotContainer that = ((BallotContainer) object);
        {
            BallotDocumentData lhsBallotDocumentData;
            lhsBallotDocumentData = this.getBallotDocumentData();
            BallotDocumentData rhsBallotDocumentData;
            rhsBallotDocumentData = that.getBallotDocumentData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ballotDocumentData", lhsBallotDocumentData), LocatorUtils.property(thatLocator, "ballotDocumentData", rhsBallotDocumentData), lhsBallotDocumentData, rhsBallotDocumentData)) {
                return false;
            }
        }
        {
            BallotDocumentElement lhsBallotDocumentElement;
            lhsBallotDocumentElement = this.getBallotDocumentElement();
            BallotDocumentElement rhsBallotDocumentElement;
            rhsBallotDocumentElement = that.getBallotDocumentElement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ballotDocumentElement", lhsBallotDocumentElement), LocatorUtils.property(thatLocator, "ballotDocumentElement", rhsBallotDocumentElement), lhsBallotDocumentElement, rhsBallotDocumentElement)) {
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
