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
import java.util.List;

/**
 * This interface models a Permission that is part of a user-privilege system
 * based on a role-permission kind of relationship. The permission is associated 
 * to a given Module and can be associated to multiple Roles.
 * <p/>
 * Implementations of this interface should be concrete classes holding business 
 * or domain data related to the Permission, such as code, description and 
 * associated module and roles.
 * <p/>
 * The reason this domain entity has been modeled as an interface is to allow 
 * multiple concrete implementations.
 *
 * @author Delcio Amarillo
 */
public interface IPermission {
    
    /**
     * Returns the {@code id} property. This property is based on the Relational 
     * Model used by RDBMS and it's not mandatory. With the same basis it is 
     * a read-only property and tipically should not be modified.
     * 
     * @return The permission's id.
     */
    public BigInteger getId();
    
    /**
     * Returns the {@code code} property. The code is a user-defined type of 
     * code to easily identify the permission.
     * 
     * @return The permission's code.
     */
    public String getCode();
    
    /**
     * Sets the {@code code} property for this Role.The code is a user-defined 
     * type of code to easily identify the permission.
     * 
     * @param code The permission's code.
     */
    public void setCode(String code);
    
    /**
     * Returns the {@code description} property. The description is a user-defined 
     * text with a brief explanation about the permission.
     * 
     * @return The permission's description.
     */
    public String getDescription();
    
    /**
     * Sets the {@code description} property for this Role. The description is 
     * a user-defined text with a brief explanation about the permission.
     * 
     * @param description The permission's description.
     */
    public void setDescription(String description);
    
    /**
     * Returns the Module associated to this Permission.
     * 
     * @return The module associated to this permission.
     */
    public IModule getModule();
    
    /**
     * Sets the Module associated to this Permission.
     * 
     * @param module The module associated to this permission.
     */
    public void setModule(IModule module);
    
    /**
     * Adds a new {@code IRolePermission} object represnting a new relationship 
     * between a given Role and this Permission.
     * 
     * @param rolePermission A {@code IRolePermission} object.
     */
    public void addRolePermission(IRolePermission rolePermission);
    
    /**
     * Returns a list with {@code IRolePermission} objects associated to this 
     * Role.
     * <br />
     * <b>Note to implementors:</b> it is recommended the returned list be immutable.
     * 
     * @return A {@code IRolePermission} list.
     */
    public List<IRolePermission> getRolePermissionsList();
    
    /**
     * Sets a list with {@code IRolePermission} objects associated to this Role.
     * 
     * @param rolePermissionsList  A {@code IRolePermission} list.
     */
    public void setRolePermissionsList(List<IRolePermission> rolePermissionsList);
    
    /**
     * Convenience method to associate a given Role with this Permission. The 
     * relationship must be wrapped in a {@code IRolePermission} object.
     * 
     * @param role The Role which will be associated to this Permission.
     */
    public void addRole(IRole role);
}
