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
 * This is a wrapper for the Covariance information.
 * 
 * @author Uttara Sakhadeo
 * 
 */
public class Covariance implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The id. */
    private int id;

    /** The name. */
    private String name;

    /** The sd. */
    private double sd;

    /** The roh. */
    private double roh;

    /** The delta. */
    private double delta;

    /** The rows. */
    private int rows;

    /** The columns. */
    private int columns;

    /** The blob. */
    private Blob2DArray blob;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new covariance.
     */
    public Covariance() {
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the id.
     * 
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the sd.
     * 
     * @return the sd
     */
    public double getSd() {
        return sd;
    }

    /**
     * Sets the sd.
     * 
     * @param sd
     *            the new sd
     */
    public void setSd(double sd) {
        this.sd = sd;
    }

    /**
     * Gets the roh.
     * 
     * @return the roh
     */
    public double getRoh() {
        return roh;
    }

    /**
     * Sets the roh.
     * 
     * @param roh
     *            the new roh
     */
    public void setRoh(double roh) {
        this.roh = roh;
    }

    /**
     * Gets the delta.
     * 
     * @return the delta
     */
    public double getDelta() {
        return delta;
    }

    /**
     * Sets the delta.
     * 
     * @param delta
     *            the new delta
     */
    public void setDelta(double delta) {
        this.delta = delta;
    }

    /**
     * Gets the rows.
     * 
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * Sets the rows.
     * 
     * @param rows
     *            the new rows
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * Gets the columns.
     * 
     * @return the columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Sets the columns.
     * 
     * @param columns
     *            the new columns
     */
    public void setColumns(int columns) {
        this.columns = columns;
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the blob.
     * 
     * @return the blob
     */
    public Blob2DArray getBlob() {
        return blob;
    }

    /**
     * Sets the blob.
     * 
     * @param blob
     *            the new blob
     */
    public void setBlob(Blob2DArray blob) {
        this.blob = blob;
    }

    /*--------------------
     * Return/Store data[][]
     *--------------------*/
    /**
     * Sets the blob.
     * 
     * @param data
     *            the new blob
     */
    public void setBlob(double[][] data) {
        Blob2DArray blob = new Blob2DArray(data);
        setBlob(blob);
    }

    /**
     * Gets the double array from blob.
     * 
     * @return the double array from blob
     */
    public double[][] getDoubleArrayFromBlob() {
        return blob.getData();
    }

    /*--------------------
     * toString()
     *--------------------*/
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Covariance [id=" + id + ", name=" + name + ", sd=" + sd
                + ", roh=" + roh + ", delta=" + delta + ", rows=" + rows
                + ", columns=" + columns + ", blob=" + blob + "]";
    }
}
