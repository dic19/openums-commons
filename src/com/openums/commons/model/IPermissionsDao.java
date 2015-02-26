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

package com.openums.commons.model;

import com.openums.commons.domain.IModule;
import com.openums.commons.domain.IPermission;
import java.math.BigInteger;
import java.util.List;

/**
 * This interface is intended to implement DAO pattern for {@code IPermission} 
 * entities. The operations include create, update and retrieve objects which 
 * compliant the aforementioned interface.
 * 
 * @author Delcio Amarillo.
 */
public interface IPermissionsDao extends IBasicDao<IPermission> {
    
    /**
     * Returns a {@code IPermission} object based on a given user-defined code.
     * The code is supposed to be an easy-to-remember text that identifies the 
     * Role univocally.
     * 
     * @param code The Permission's code.
     * 
     * @return A {@code IPermission} object matching the argument or {@code null} 
     * otherwise.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public IPermission getPermissionByCode(String code) throws ModelException;
    
    /**
     * Returns a list of {@code IPermisison} objects associated to a given 
     * Module. The {@code idModule} argument is based on the numeric foreign key 
     * concept that is part of the Relational Model. Consequently this method 
     * may not be implemented if the back-end storage system is not based on 
     * the Relational Model.
     * 
     * @param idModule The Module's primary key that is also a foreign key to 
     * this Permission.
     * 
     * @return A {@code IPermission} list that match the argument.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public List<IPermission> getPermissionsByModule(BigInteger idModule) 
            throws ModelException;
    
    /**
     * Returns a list of {@code IPermission} objects associated to a given 
     * Module.
     * 
     * @param module The Module.
     * 
     * @return A {@code IPermission} list that match the argument.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public List<IPermission> getPermissionsByModule(IModule module) 
            throws ModelException;    
}
