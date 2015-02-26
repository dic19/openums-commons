/*
 * Copyright (C) 2015 Delcio Amarillo.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.openums.commons.domain;

import java.math.BigInteger;

/**
 * This interface models the relationship between a given Role and a Permission, 
 * related both to the same Module, as part of a role-permission based system.
 * <p/>
 * Implementations of this interface should be concrete classes holding business 
 * or domain data related to the Role-Permission relationship, such as the 
 * involved entities and the status (enabled/disabled) of the relationship.
 * <p/>
 * The reason this domain entity has been modeled as an interface is to allow 
 * multiple concrete implementations.
 *
 * @author Delcio Amarillo.
 */
public interface IRolePermission {
    
    /**
     * Returns the {@code id} property. This property is based on the Relational 
     * Model used by RDBMS and it's not mandatory. With the same basis it is 
     * a read-only property and tipically should not be modified.
     * 
     * @return The role-permission relationship id.
     */
    public BigInteger getId();
    
    /**
     * Returs the {@code enabled} property.
     * @return 
     *  {@code true} if the role-permission relationship is enabled, 
     *  {@code false} otherwise.
     */
    public Boolean isEnabled();
    
    /**
     * Sets the {@code enabled} property.
     * 
     * @param enabled 
     *  {@code true} if the role-permission relationship is enabled, 
     *  {@code false} otherwise.
     */
    public void setEnabled(Boolean enabled);
    
    /**
     * Returns the Role involved in the role-permission relationship.
     * 
     * @return A {@code IRole} object.
     */
    public IRole getRole();
    
    /**
     * Sets the Role involved in the role-permission relationship.
     * 
     * @param role A {@code IRole} object.
     */
    public void setRole(IRole role);
    
    /**
     * Returns Permission involved in the role-permission relationship.
     * 
     * @return A {@code IPermission} object.
     */
    public IPermission getPermission();
    
    /**
     * Sets the Permission involved in the role-permission relationship.
     * 
     * @param permission A {@code IPermission} object.
     */
    public void setPermission(IPermission permission);
}
