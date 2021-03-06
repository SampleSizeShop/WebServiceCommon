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
import java.util.ArrayList;
import java.util.List;

import edu.ucdenver.bios.webservice.common.enums.RepeatedMeasuresDimensionType;

/**
 * This is a wrapper for the repeated measures information.
 *
 * @author Uttara Sakhadeo
 *
 */
public class RepeatedMeasuresNode implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -714204384820498167L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The idx. */
    private int idx;

    /** The dimension. */
    private String dimension = null;

    /** The repeated measures dimension type. */
    private RepeatedMeasuresDimensionType repeatedMeasuresDimensionType = null;

    /** The number of measurements. */
    private Integer numberOfMeasurements = null;

    /** The node. */
    private int node;

    /** The parent. */
    private Integer parent;

    /** The spacing list. */
    private List<Spacing> spacingList = null;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new repeated measures node.
     */
    public RepeatedMeasuresNode() {
        // spacingList = new Spacing();
    }

    /**
     * Instantiates a new repeated measures node.
     *
     * @param name
     *            the name
     */
    public RepeatedMeasuresNode(final String name) {
        // super();
        this.dimension = name;
    }

    /**
     * Instantiates a new repeated measures node.
     *
     * @param name
     *            the name
     * @param type
     *            the type
     * @param count
     *            the count
     * @param node
     *            the node
     * @param parent
     *            the parent
     */
    public RepeatedMeasuresNode(final String name,
            final RepeatedMeasuresDimensionType type, final Integer count,
            final int node, final int parent) {
        // super();
        this.dimension = name;
        this.repeatedMeasuresDimensionType = type;
        this.numberOfMeasurements = count;
        this.node = node;
        this.parent = parent;
    }

    /**
     * Instantiates a new repeated measures node.
     *
     * @param name
     *            the name
     * @param type
     *            the type
     * @param count
     *            the count
     * @param spacingList
     *            the spacing list
     * @param node
     *            the node
     * @param parent
     *            the parent
     */
    public RepeatedMeasuresNode(final String name,
            final RepeatedMeasuresDimensionType type, final Integer count,
            final List<Spacing> spacingList, int node, int parent) {
        // super();
        this.dimension = name;
        this.repeatedMeasuresDimensionType = type;
        this.numberOfMeasurements = count;
        this.node = node;
        this.parent = parent;
        this.spacingList = spacingList;
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
     * Gets the dimension.
     *
     * @return the dimension
     */
    public final String getDimension() {
        return dimension;
    }

    /**
     * Sets the dimension.
     *
     * @param dimension
     *            the new dimension
     */
    public final void setDimension(final String dimension) {
        this.dimension = dimension;
    }

    /**
     * Gets the number of measurements.
     *
     * @return the number of measurements
     */
    public final Integer getNumberOfMeasurements() {
        return numberOfMeasurements;
    }

    /**
     * Sets the number of measurements.
     *
     * @param numberOfMeasurements
     *            the new number of measurements
     */
    public final void setNumberOfMeasurements(final Integer numberOfMeasurements) {
        this.numberOfMeasurements = numberOfMeasurements;
    }

    /**
     * Gets the node.
     *
     * @return the node
     */
    public final int getNode() {
        return node;
    }

    /**
     * Sets the node.
     *
     * @param node
     *            the new node
     */
    public final void setNode(final int node) {
        this.node = node;
    }

    /**
     * Gets the parent.
     *
     * @return the parent
     */
    public final Integer getParent() {
        return parent;
    }

    /**
     * Sets the parent.
     *
     * @param parent
     *            the new parent
     */
    public final void setParent(final Integer parent) {
        this.parent = parent;
    }

    /**
     * Gets the spacing list.
     *
     * @return the spacing list
     */
    public final List<Spacing> getSpacingList() {
        return spacingList;
    }

    /**
     * Sets the spacing list.
     *
     * @param spacingList
     *            the new spacing list
     */
    public final void setSpacingList(final List<Spacing> spacingList) {
        this.spacingList = spacingList;
    }

    /**
     * Gets the repeated measures dimension type.
     * 
     * @return the repeated measures dimension type
     */
    public final RepeatedMeasuresDimensionType getRepeatedMeasuresDimensionType() {
        return repeatedMeasuresDimensionType;
    }

    /**
     * Sets the repeated measures dimension type.
     * 
     * @param repeatedMeasuresDimensionType
     *            the new repeated measures dimension type
     */
    public final void setRepeatedMeasuresDimensionType(
            final RepeatedMeasuresDimensionType repeatedMeasuresDimensionType) {
        this.repeatedMeasuresDimensionType = repeatedMeasuresDimensionType;
    }

    /*--------------------
     * toString()
     *--------------------*/
    /**
     * Intended only for debugging.
     *
     * <P>Here, a generic implementation uses reflection to print
     * names and values of all fields <em>declared in this class</em>. Note that
     * superclass fields are left out of this implementation.
     */
    @Override
    public final String toString() {
        return "RepeatedMeasuresNode [idx=" + idx + ", dimension=" + dimension
                + ", repeatedMeasuresDimensionType="
                + repeatedMeasuresDimensionType + ", numberOfMeasurements="
                + numberOfMeasurements + ", node=" + node + ", parent="
                + parent + ", spacingList=" + spacingList + "]";
    }
}
