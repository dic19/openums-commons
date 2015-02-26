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

import com.openums.commons.domain.IRole;
import com.openums.commons.domain.IUser;
import java.math.BigInteger;
import java.util.List;

/**
 * This interface is intended to implement DAO pattern for {@code IUser} 
 * entities. The operations include create, update and retrieve objects which 
 * compliant the aforementioned interface. This interface is part of the 
 * applications' Model in a MVC architecture.
 *
 * @author Delcio Amarillo
 * @see IUser
 */
public interface IUsersDao extends IBasicDao<IUser> {
    
    /**
     * Returns a {@code IUser} object based on the user's name.
     * 
     * @param userName The user's name.
     * 
     * @return A {@code IUser} object matching the argument or {@code null} 
     * otherwise.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public IUser getUserByName(String userName) throws ModelException;
    
    /**
     * Returns a list of {@code IUser} objects whose status is {@code active}.
     * 
     * @return A list of {@code IUser} objects.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public List<IUser> getActiveUsers() throws ModelException;
    
    /**
     * Returns a list of {@code IUser} objects whose status is @code inactive}.
     * 
     * @return A list of {@code IUser} objects.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public List<IUser> getInactiveUsers() throws ModelException;
    
    /**
     * Returns a list of {@code IUser} objects whose status is {@code locked}.
     * 
     * @return A list of {@code IUser} objects.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public List<IUser> getLockedUsers() throws ModelException;
    
    /**
     * Returns a list of {@code IUser} objects whose status is {@code unlocked}.
     * 
     * @return A list of {@code IUser} objects.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public List<IUser> getUnlockedUsers() throws ModelException;
    
    /**
     * Returns a list of {@code IUser} objects associated to a given Role. 
     * The {@code idRole} argument is based on the numeric foreign key concept 
     * that is part of the Relational Model. Consequently this method may not 
     * be implemented if the back-end storage system is not based on the 
     * Relational Model.
     * 
     * @param idRole The Role's primary key.
     * 
     * @return A list of {@code IUser} objects that match the argument.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public List<IUser> getUsersByRole(BigInteger idRole) throws ModelException;
    
    /**
     * 
     * 
     * @param role The Role to which the Users are associated with.
     * 
     * @return A list of {@code IUser} objects that match the argument.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public List<IUser> getUsersByRole(IRole role) throws ModelException;
    
}
