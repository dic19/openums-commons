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

/**
 * This interface is intended to implement DAO pattern for {@code IModule} 
 * entities. The operations include create, update and retrieve objects which 
 * compliant the aforementioned interface. This interface is part of the 
 * applications' Model in a MVC architecture.
 * 
 * @author Delcio Amarillo
 * @see IModule
 */
public interface IModulesDao extends IBasicDao<IModule> {
    
    /**
     * Returns a {@code IModule} object based on a given user-defined code.
     * 
     * @param code The Module's code.
     * 
     * @return A {@code IModule} object matching the argument or {@code null} 
     * otherwise.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public IModule getModuleByCode(String code) throws ModelException;
    
}
