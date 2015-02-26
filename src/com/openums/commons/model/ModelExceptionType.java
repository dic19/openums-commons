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

/**
 * The type of the model exception.
 * 
 * @author Delcio Amarillo
 */
public enum ModelExceptionType {
    
    /**
     * Exception type that represents an unexpected and/or unspecified error 
     * happened during the operation.
     */
    UNSPECIFIED_EXCEPTION,
    
    /**
     * Thrown when the operation times out.
     */
    TIME_OUT_EXCEPTION,
    
    /**
     * A given constraint has been violated when trying to perform the current 
     * operation.
     */
    CONSTRAINT_VIOLATED_EXCEPTION    
}
