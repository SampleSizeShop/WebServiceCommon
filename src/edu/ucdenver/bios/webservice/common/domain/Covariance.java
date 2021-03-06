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
import java.util.List;

import edu.ucdenver.bios.webservice.common.enums.CovarianceTypeEnum;
import edu.ucdenver.bios.webservice.common.enums.HypothesisTypeEnum;

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
    /** The idx. */
    private int idx;

    /** The type. */
    private CovarianceTypeEnum type;

    /** The name. */
    private String name = null;

    /** The standard deviation list. */
    private List<StandardDeviation> standardDeviationList = null;

    /** The rho. */
    private double rho = -2;

    /** The delta. */
    private double delta = -1;

    /** The scale. */
    private boolean scale = false;

    /** The rows. */
    private int rows = -1;

    /** The columns. */
    private int columns = -1;

    /** The blob. */
    private Blob2DArray blob = null;
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
    public int getIdx() {
        return idx;
    }

    /**
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public void setIdx(int id) {
        this.idx = id;
    }

    /**
     * Get the type of covariance described.
     * @return covariance type
     */
    public CovarianceTypeEnum getType() {
        return type;
    }

    /**
     * Set the covariance type.
     * @param type covariance type.
     */
    public void setType(CovarianceTypeEnum type) {
        this.type = type;
    }

    /**
     * Gets the rho.
     *
     * @return the rho
     */
    public double getRho() {
        return rho;
    }

    /**
     * Sets the rho.
     *
     * @param rho
     *            the new rho
     */
    public void setRho(double rho) {
        this.rho = rho;
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
     * Gets the scale.
     *
     * @return the scale
     */
    public boolean getScale() {
        return scale;
    }

    /**
     * Sets the scale.
     *
     * @param scale
     *            the new scale
     */
    public void setScale(boolean scale) {
        this.scale = scale;
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

    /**
     * Gets the standard deviation list.
     *
     * @return the standard deviation list
     */
    public List<StandardDeviation> getStandardDeviationList() {
        return standardDeviationList;
    }

    /**
     * Sets the standard deviation list.
     *
     * @param standardDeviationList
     *            the new standard deviation list
     */
    public void setStandardDeviationList(
            List<StandardDeviation> standardDeviationList) {
        this.standardDeviationList = standardDeviationList;
    }

    /*--------------------
     * Return/Store data[]
     *--------------------*/
    /**
     * Sets the standard deviation list from array.
     *
     * @param data the new standard deviation list from array
     */

    public void setStandardDeviationListFromArray(double[] data)
    {
        if(data != null)
        {
            /*this.standardDeviationList = new ArrayList<StandardDeviation>(data.length);
            for(int i = 0;i < data.length; i++)
            {
                this.standardDeviationList.add(new StandardDeviation(data[i]));
            }*/

            List<StandardDeviation> list = this.getStandardDeviationList();
            if(list != null && !list.isEmpty())
            {
                for (double value : data) {
                    list.add(new StandardDeviation(value));
                }
                this.setStandardDeviationList(list);
            }
        }
    }

    /**
     * Gets the standard deviation list from array.
     *
     * @return the standard deviation list from array
     */
    /*
     * JSON argument exception.
     * To-Do : Need to handle it.
     */
    /*public double[] getStandardDeviationFromArray()
    {
        List<StandardDeviation> list = this.getStandardDeviationList();
        double[] data = null;
        if(list != null && !list.isEmpty())
        {
            data = new double[list.size()];
            int i = 0;
            for(StandardDeviation sd : list)
            {
                data[i++] = sd.getValue();
            }
        }
        return data;
    }*/

    /*--------------------
     * Return/Store data[][]
     *--------------------*/
    /**
     * Sets the blob.
     *
     * @param data
     *            the new blob
     */
    public void setBlobFromArray(double[][] data) {
        if(data != null)
        {
            Blob2DArray blob = new Blob2DArray(data);
            this.setBlob(blob);
        }
    }

    /**
     * Gets the double array from blob.
     *
     * @return the double array from blob
     */
    /*
     * JSON argument exception.
     * To-Do : Need to handle it.
     */
    /*public double[][] getBlobAsArray() {
        Blob2DArray blob = this.getBlob();
        double[][] data = null;
        if(blob != null)
        {
            data = blob.getData();
        }
        return data;
    }*/

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
    public String toString() {
        return "Covariance [idx=" + idx + ", name=" + name
                + ", standardDeviationList=" + standardDeviationList + ", rho="
                + rho + ", delta=" + delta + ", scale=" + scale + ", rows=" + rows + ", columns="
                + columns + ", blob=" + blob + "]";
    }

}
