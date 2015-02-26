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
 * This interface models a Role that is part of a user-privilege system based
 * on a role-permission kind of relationship. The role is associated to a given
 * Module and can be associated to multiple Permissions or privileges.
 * <p/>
 * Implementations of this interface should be concrete classes holding business 
 * or domain data related to the Role, such as code, description and associated 
 * module and permissions.
 * <p/>
 * The reason this domain entity has been modeled as an interface is to allow 
 * multiple concrete implementations.
 * 
 * @author Delcio Amarillo
 */
public interface IRole {
    
    /**
     * Returns the {@code id} property. This property is based on the Relational 
     * Model used by RDBMS and it's not mandatory. With the same basis it is 
     * a read-only property and typically should not be modified.
     * 
     * @return The role's id.
     */
    public BigInteger getId();
    
    /**
     * Returns the {@code code} property. The code is a user-defined type of 
     * code to easily identify the role.
     * 
     * @return The role's code.
     */
    public String getCode();
    
    /**
     * Sets the {@code code} property for this Role. The code is a user-defined 
     * type of code to easily identify the role.
     * 
     * @param code The role's code.
     */
    public void setCode(String code);
    
    /**
     * Returns the {@code description} property. The description is a user-defined 
     * text with a brief explanation about the role.
     * 
     * @return The role's description.
     */
    public String getDescription();
    
    /**
     * Sets the {@code description} property for this Role. The description is 
     * a user-defined text with a brief explanation about the role.
     * @param description The role's description.
     */
    public void setDescription(String description);
    
    /**
     * Returns the Module associated to this Role.
     * @return The module associated with this Role.
     */
    public IModule getModule();
    
    /**
     * Sets the Module associated to this Role.
     * 
     * @param module The module associated to this role.
     */
    public void setModule(IModule module);
    
    /**
     * Adds a new {@code IRolePermission} object representing a new relationship 
     * between a given Permission and this Role.
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
     * Convenience method to associate a given Permission to this Role. The 
     * relationship must be wrapped in a {@code IRolePermission} object.
     * 
     * @param permission The Permission which will be associated to this Role.
     */
    public void addPermission(IPermission permission);
    
    /**
     * Adds a new {@code IUserRole} object representing a new relationship 
     * between a given User and this Role.
     * 
     * @param userRole 
     */
    public void addUserRole(IUserRole userRole);
    
    /**
     * Returns a list with {@code IUserRole} objects associated to this 
     * Role.
     * <br />
     * <b>Note to implementors:</b> it is recommended the returned list be immutable.
     * 
     * @return A {@code IUserRole} list.
     */
    public List<IUserRole> getUserRolesList();
    
    /**
     * Sets a list with {@code IUserRole} objects associated to this Role.
     * 
     * @param userRolesList A {@code IUserRole} list.
     */
    public void setUserRolesList(List<IUserRole> userRolesList);
    
    /**
     * Convenience method to associate a given User to this Role. The 
     * relationship must be wrapped in a {@code IUserRole} object.
     * 
     * @param user The User which will be associated to this Role.
     */
    public void addUser(IUser user);
    
}
