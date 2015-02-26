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
 * This interface models the relationship between a given User and a Role, as 
 * part of a role-user and role-permission based system.
 * <p/>
 * Implementations of this interface should be concrete classes holding business 
 * or domain data related to the User-Role relationship, basically the involved 
 * entities.
 * <p/>
 * The reason this domain entity has been modeled as an interface is to allow 
 * multiple concrete implementations.
 * 
 * @author Delcio Amarillo
 */
public interface IUserRole {
    
    /**
     * Returns the {@code id} property. This property is based on the Relational 
     * Model used by RDBMS and it's not mandatory. With the same basis it is 
     * a read-only property and tipically should not be modified.
     * 
     * @return The user-role relationship id.
     */
    public BigInteger getId();
    
    /**
     * Returns the Role involved in the user-role relationship.
     * 
     * @return A {@code IRole} object.
     */
    public IRole getRole();
    
    /**
     * Sets the Role involved in the user-role relationship.
     * 
     * @param role A {@code IRole} object.
     */
    public void setRole(IRole role);
    
    /**
     * Returns the User involved in the user-role relationship.
     * 
     * @return A {@code IUser} object.
     */
    public IUser getUser();
    
    /**
     * Sets the User involved in the user-role relationship.
     * 
     * @param user A {@code IUser} object.
     */
    public void setUser(IUser user);
    
}
