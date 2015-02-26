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

import java.math.BigInteger;
import java.util.List;

/**
 * Generic base interface to implement DAO pattern with specific classes. 
 * 
 * @param <T> The class managed by this interface.
 * @author Delcio Amarillo
 */
public interface IBasicDao<T> {
    
    /**
     * Insets a new {@code T} object. The contract foresees the use of a 
     * preventive copy mechanism in order to keep the {@code dataObject} 
     * argument unmodified in case of failure during the insert operation.
     * 
     * @param dataObject The new data object.
     * 
     * @return A {@code T} object. If the insert operation has failed then the 
     * same {@code dataObject} that is the argument of this method is returned.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public T insert(T dataObject) throws ModelException;
    
    /**
     * Updates a given {@code T} object. The contract foresees the use of a 
     * preventive copy mechanism in order to keep the {@code dataObject} 
     * argument unmodified in case of failure during the insert operation.
     * 
     * @param dataObject The data object to be modified.
     * 
     * @return A {@code T} object. If the insert operation has failed then the 
     * same {@code dataObject} that is the argument of this method is returned.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public T update(T dataObject) throws ModelException;
    
    /**
     * Removes a given {@code T} object.
     * 
     * @param dataObject The data object to be removed.
     * 
     * @return {@code true} if the data object was correctly removed, 
     * {@code false} otherwise.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public Boolean delete(T dataObject) throws ModelException;
    
    /**
     * Returns a {@code T} object based on a given identifier. This method is
     * based in the numeric primary key {@code id} concept that is part of the 
     * Relational Model. Consequently it may not be implemented if the back-end 
     * storage system is not based on the Relational Model.
     * 
     * @param dataObjectId The data object's primary key.
     * 
     * @return A {@code T} object matching the argument or {@code null} if 
     * there's no match.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public T getUnique(BigInteger dataObjectId) throws ModelException;
    
    /**
     * Returns a list containing all the {@code T} objects.
     * 
     * @return A list with {@code T} objects.
     * 
     * @throws ModelException When an error occurred during the request 
     * processing.
     */
    public List<T> getAll() throws ModelException;
    
}
