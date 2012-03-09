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
import java.util.ArrayList;
import java.util.List;

/**
 * This is a wrapper for the BetweenParticipantFactor information.
 * @author Uttara Sakhadeo
 *
 */
public class BetweenParticipantFactor implements Serializable
{
    private static final long serialVersionUID = 3373126132690287186L;
    
    /*--------------------
	 * Member Variables
	 *--------------------*/
	private int id;
	private String predictorName = null;
	private List<Category> categoryList = null;
	/*--------------------
	 * Constructors
	 *--------------------*/
	public BetweenParticipantFactor() {}
	
	public BetweenParticipantFactor(String predictorName, List<Category> categoryList)
	{
		this.predictorName = predictorName;
		this.categoryList = categoryList;
	}		
	/*--------------------
	 * Getter/Setter Methods
	 *--------------------*/
	public String getPredictorName() 
	{
		return predictorName;
	}	
	public void setPredictorName(String predictorName) 
	{
		this.predictorName = predictorName;
	}	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}	
	/*--------------------
	 * toString()
	 *--------------------*/
	@Override
	public String toString() {
		return "BetweenParticipantFactor [id=" + id + ", predictorName="
				+ predictorName + ", categoryList=" + categoryList + "]";
	}
}
