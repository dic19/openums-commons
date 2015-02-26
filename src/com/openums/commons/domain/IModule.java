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
 * This interface models a given application's Module.
 * <p/>
 * Implementations of this interface should be concrete classes holding business
 * or domain data related to the Module, such as code, description, roles and 
 * permissions associated to this module.
 * <p/>
 * The reason this domain entity has been modeled as an interface is to allow 
 * multiple concrete implementations.
 *
 * @author Delcio Amarillo
 */
public interface IModule {
    
    /**
     * Returns the {@code id} property. This property is based on the Relational 
     * Model used by RDBMS and it's not mandatory. With the same basis it is 
     * a read-only property and tipically should not be modified.
     * 
     * @return The module's id.
     */
    public BigInteger getId();
    
    /**
     * Returns the {@code code} property. The code is a user-defined type of 
     * code to easily identify a Module.
     * 
     * @return The module's code.
     */
    public String getCode();
    
    /**
     * Sets the {@code code} property for this Module.The code is a user-defined 
     * type of code to easily identify the module.
     * 
     * @param code The module's code.
     */
    public void setCode(String code);
    
    /**
     * Returns the {@code description} property. The description is a user-defined 
     * text with a brief explanation about the module.
     * 
     * @return The module's description.
     */
    public String getDescription();
    
    /**
     * Sets the {@code description} property for this Module. The description is 
     * a user-defined text with a brief explanation about the module.
     * 
     * @param description The module's description.
     */
    public void setDescription(String description);
    
    /**
     * Adds a new Role associated to this Module.
     * 
     * @param role The new role.
     */
    public void addRole(IRole role);
    
    /**
     * Returns a list with the Roles associated to this Module.
     * 
     * @return A list of {@code IRole} objects.
     */
    public List<IRole> getRolesList();
    
    /**
     * Sets the list of Roles associated to this Module.
     * 
     * @param roles A list of {@code IRole} objects.
     */
    public void setRolesList(List<IRole> roles);
    
    /**
     * Adds a new Permission associated to this Module.
     * 
     * @param permission The new permission.
     */    
    public void addPermission(IPermission permission);
    
    /**
     * Returns a list containing the Permissions associated to this Module.
     * 
     * @return A list of {@code IPermission} objects.
     */
    public List<IPermission> getPermissionsList();
    
    /**
     * Sets the list of Permissions associated to this Module.
     * 
     * @param permissions A list of {@code IPermission} objects.
     */
    public void setPermissionsList(List<IPermission> permissions);
}
