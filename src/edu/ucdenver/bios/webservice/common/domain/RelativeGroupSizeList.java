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

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * List of relative group size objects to work around Jackson serializaiton
 * issues.
 *
 * @author Uttara Sakhadeo
 *
 */
public class RelativeGroupSizeList {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;
    
    /** The relative group size list. */
    private List<RelativeGroupSize> relativeGroupSizeList = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new relative group size list.
     */
    public RelativeGroupSizeList() {

    }
    
    /**
     * Instantiates a new relative group size list.
     *
     * @param uuid the uuid
     */
    public RelativeGroupSizeList(final byte[] uuid) {
        this.uuid = uuid;
    }
    
    /**
     * Instantiates a new relative group size list.
     *
     * @param uuid the uuid
     * @param list the list
     */
    public RelativeGroupSizeList(final byte[] uuid,
        final List<RelativeGroupSize> list) {
        this.uuid = uuid;
        this.relativeGroupSizeList = list;
    }

    /**
     * Instantiates a new relative group size list.
     *
     * @param size
     *            the size
     */
    public RelativeGroupSizeList(final int size) {
        this.relativeGroupSizeList = new ArrayList<RelativeGroupSize>(size);
    }

    /**
     * Instantiates a new relative group size list.
     *
     * @param list
     *            the list
     */
    public RelativeGroupSizeList(final List<RelativeGroupSize> list) {
        this.relativeGroupSizeList = list;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the uuid.
     *
     * @return the uuid
     */
    public final byte[] getUuid() {
        return uuid;
    }

    /**
     * Sets the uuid.
     *
     * @param uuid
     *            the new uuid
     */
    public final void setUuid(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Gets the relative group size list.
     *
     * @return the relative group size list
     */
    public final List<RelativeGroupSize> getRelativeGroupSizeList() {
        return relativeGroupSizeList;
    }

    /**
     * Sets the relative group size list.
     *
     * @param relativeGroupSizeList the new relative group size list
     */
    public final void setRelativeGroupSizeList(
            final List<RelativeGroupSize> relativeGroupSizeList) {
        this.relativeGroupSizeList = relativeGroupSizeList;
    }
        
}
