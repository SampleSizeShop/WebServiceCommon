/*
 * Web service utility functions for managing hibernate, json, etc.
 *
 * Copyright (C) 2010 Regents of the University of Colorado.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301, USA.
 */
package edu.ucdenver.bios.webservice.common.domain;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * This is a wrapper for the BetaScale information.
 * 
 * @author Uttara Sakhadeo
 * 
 */
public class BetaScale implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2759158339433707691L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The idx. */
    private int idx;

    /** The value. */
    private double value;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new beta scale.
     */
    public BetaScale() {
    }

    /**
     * Instantiates a new beta scale.
     * 
     * @param dataValue
     *            the value
     */
    public BetaScale(final double dataValue) {
        super();
        this.value = dataValue;
    }

    /**
     * Instantiates a new beta scale.
     * 
     * @param idValue
     *            the id
     * @param dataValue
     *            the value
     */
    public BetaScale(final int idValue, final double dataValue) {
        super();
        this.idx = idValue;
        this.value = dataValue;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the id.
     * 
     * @return the id
     */
    public final int getIdx() {
        return idx;
    }

    /**
     * Sets the id.
     * 
     * @param idValue
     *            the new id
     */
    public final void setIdx(final int idValue) {
        this.idx = idValue;
    }

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public final double getValue() {
        return value;
    }

    /**
     * Sets the value.
     * 
     * @param dataValue
     *            the new value
     */
    public final void setValue(final double dataValue) {
        this.value = dataValue;
    }

    /*--------------------
     * toString()
     *--------------------*/
    /**
     * Intended only for debugging.
     * 
     * <P>
     * Here, a generic implementation uses reflection to print names and values
     * of all fields <em>declared in this class</em>. Note that superclass
     * fields are left out of this implementation.
     * 
     * @return the string
     */
    @Override
    public final String toString() {
        return "BetaScale [idx=" + idx + ", value=" + value + "]";
    }
}
