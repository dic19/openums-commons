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
 * Exception thrown while some error happens during an operation processing. 
 * This kind of exception are raised from the model or persistence layer to
 * notify the top layers that something didn't went as expected.
 * 
 * @author Delcio Amarillo
 */
public class ModelException extends Exception {
    
    private final ModelExceptionType exceptionType;

    /**
     * Creates a new {@code ModelException} with a given type, message text and 
     * the cause of this exception.
     * 
     * @param exceptionType The exception type. Can be retrieved later through 
     * {@code ggetExceptionType()} method.
     * 
     * @param message A detailed message about the exception. Can be retrieved 
     * later through {@code getMessage()} method.
     * 
     * @param cause The exception cause. Can be retrieved later through 
     * {@code getCause()} method.
     */
    public ModelException(ModelExceptionType exceptionType, String message
            , Throwable cause) {
        super(message, cause);
        this.exceptionType = exceptionType;
    }
    
    /**
     * Creates a new {@code ModelException} with a given type and message text. 
     * The cause of the exception is {@code null} which means an unexistent or 
     * unknown cause.
     * 
     * @param exceptionType The exception type. Can be retrieved later through 
     * {@code ggetExceptionType()} method.
     * 
     * @param message A detailed message about the exception. Can be retrieved 
     * later through {@code getMessage()} method.
     */
    public ModelException(ModelExceptionType exceptionType, String message) {
        this(exceptionType, message, null);
    }
    
    /**
     * Creates a new {@code ModelException} with a given type, an empty message 
     * text and the cause of this exception.
     * 
     * @param exceptionType The exception type. Can be retrieved later through 
     * {@code ggetExceptionType()} method.
     * 
     * @param cause The exception cause. Can be retrieved later through 
     * {@code getCause()} method.
     */
    public ModelException(ModelExceptionType exceptionType, Throwable cause) {
        this(exceptionType, "", cause);
    }
    
    /**
     * Returns the exception type.
     * 
     * @return The exception type.
     */
    public ModelExceptionType getExceptionType() {
        return exceptionType;
    }
}
