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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package edu.ucdenver.bios.webservice.common.domain;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * This is a wrapper for the Matrix information.
 * 
 * @author Uttara Sakhadeo
 * 
 */
public class NamedMatrix implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7392545585998026017L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The idx. */
    private int idx;

    /** The name. */
    private String name = null;

    /** The rows. */
    private int rows;

    /** The columns. */
    private int columns;

    /** The data. */
    private Blob2DArray data;
    
    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new named matrix.
     */
    public NamedMatrix() {       
    }

    /**
     * Instantiates a new named matrix.
     * 
     * @param name
     *            the name
     */
    public NamedMatrix(final String name) {
        this.name = name;
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
     * @param id
     *            the new id
     */
    public final void setIdx(final int id) {
        this.idx = id;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the new name
     */
    public final void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets the rows.
     * 
     * @return the rows
     */
    public final int getRows() {
        return rows;
    }

    /**
     * Sets the rows.
     * 
     * @param rows
     *            the new rows
     */
    public final void setRows(final int rows) {
        this.rows = rows;
    }

    /**
     * Gets the columns.
     * 
     * @return the columns
     */
    public final int getColumns() {
        return columns;
    }

    /**
     * Sets the columns.
     * 
     * @param columns
     *            the new columns
     */
    public final void setColumns(final int columns) {
        this.columns = columns;
    }

    /**
     * Gets the data.
     * 
     * @return the data
     */
    public final Blob2DArray getData() {
        return data;
    }

    /**
     * Sets the data.
     * 
     * @param data
     *            the new data
     */
    public final void setData(final Blob2DArray data) {
        this.data = data;
    }

    /*--------------------
     * Return/Store data[][]
     *--------------------*/
    /**
     * Sets the data.
     * 
     * @param data
     *            the new data
     */ 
    public final void setDataFromArray(final double[][] data) {
        if(data != null && !(data.length==0))
        {
            Blob2DArray blob = new Blob2DArray(data);
            // System.out.println(blob.getData());
            this.setData(blob);
        }
    }

    /**
     * Gets the data from blob.
     * 
     * @return the data from blob
     */
    /*
     * JSON argument exception.
     * To-Do : Need to handle it.
     */    
    /*public final double[][] getDataAsArray() {
        Blob2DArray blob = this.getData();
        double[][] value = null;
        if(blob != null)
        {
            value = blob.getData();           
        }        
        return value;       
    } */   
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
        return "NamedMatrix [idx=" + idx + ", name=" + name + ", rows=" + rows
                + ", columns=" + columns + ", data=" + data + "]";
    }
    
}
