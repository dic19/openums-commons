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
import java.util.Date;
import java.util.List;

/**
 * This interface models an application's User which is associated to several 
 * Roles and thus have certain privileges or Permissions to work in a given 
 * Module.
 * <p/>
 * Implementations of this interface should be concrete classes holding business 
 * or domain data related to the User, such as personal info (name, last name, 
 * date of birth, gender), contact info (email), login info (user name and 
 * password, active, unlocked), and roles associated to the user. Regarding this 
 * last point while users may have assoiciated different Roles in different 
 * Modules, they should have assigned a single Role per Module.
 * <p/>
 * The reason this domain entity has been modeled as an interface is to allow 
 * multiple concrete implementations.
 * 
 * @author Delcio Amarillo
 */
public interface IUser {
    
    /**
     * Returns the {@code id} property. This property is based on the Relational 
     * Model used by RDBMS and it's not mandatory. With the same basis it is 
     * a read-only property and typically should not be modified.
     * 
     * @return The user's id.
     */
    public BigInteger getId();
    
    /**
     * Returns the {@code name} proeprty. The name is the user's first name 
     * (i.e.: John).
     * 
     * @return The user's first name.
     */
    public String getName();
    
    /**
     * Sets the {@code name} property. The name is the user's first name 
     * (i.e.: John).
     * 
     * @param name The user's first name.
     */
    public void setName(String name);
    
    /**
     * Returns the {@code lastName} property. The last name is the user's surname
     * (i.e.: Doe).
     * 
     * @return The user's surname.
     */
    public String getLastName();
    
    /**
     * Sets the {@code lastName} property. The last name is the user's surname
     * (i.e.: Doe).
     * 
     * @param lastName The user's surname.
     */
    public void setLastName(String lastName);
    
    /**
     * Returns the {@code gender} property. Typically the gender is one of 
     * Male-Female, M-F, Man-Woman, M-W kind of possible values, but it's left 
     * to the implementors to decide the best combination that suits their 
     * requirements.
     * 
     * @return The user's gender.
     */
    public String getGender();
    
    /**
     * Sets the {@code gender} property. Typically the gender is one of 
     * Male-Female, M-F, Man-Woman, M-W kind of possible values, but it's left 
     * to the implementors to decide the best combination that suits their 
     * requirements.
     * 
     * @param gender The user's gender.
     */
    public void setGender(String gender);
    
    /**
     * Returns the {@code dateOfBirth} property. This is the date in which the 
     * user was born and it may or may not be relevant to grant access to an 
     * application (i.e.: the suer must be 18+ years old).
     * 
     * @return The user's date of birth.
     */
    public Date getDateOfBirth();
    
    /**
     * Sets the {@code dateOfBirth} property. This is the date in which the 
     * user was born and it may or may not be relevant to grant access to an 
     * application (i.e.: the suer must be 18+ years old).
     * 
     * @param dateOfBirth The user's date of birth.
     */
    public void setDateOfBirth(Date dateOfBirth);
    
    /**
     * Returns the {@code email} property. This is the primary email used to 
     * contact the user when needed.
     * 
     * @return The user's contact email.
     */
    public String getEmail();
    
    /**
     * Sets the {@code email} property. This is the primary email used to 
     * contact the user when needed.
     * 
     * @param email The user's contact email.
     */
    public void setEmail(String email);
    
    /**
     * Returns the {@code userName} property. This is the name or identifier 
     * used by the user to login into the application (i.e.: john.doe)
     * 
     * @return The user's identifier to login into the application.
     */
    public String getUserName();
    
    /**
     * Sets the {@code userName} property. This is the name or identifier used 
     * by the user to login into the application (i.e.: john.doe)
     * 
     * @param userName The user's identifier to login into the application.
     */
    public void setUserName(String userName);
    
    /**
     * Returns the {@code password} property. This is the user's password to 
     * login into the application. Typically this password should be hashed or 
     * encrypted due to security reasons but this is up to the implementation.
     * 
     * @return The user's password.
     */
    public String getPassword();
    
    /**
     * Returns the {@code password} property. This is the user's password to 
     * login into the application. Typically this password should be hashed or 
     * encrypted due to security reasons but this is up to the implementation.
     * 
     * @param password The user's password.
     */
    public void setPassword(String password);
    
    /**
     * Returns the {@code active} property. This property indicates whether the 
     * user is or not an active user that can login into the application.
     * 
     * @return {@code true} if the user is active, {@code false} otherwise.
     */
    public Boolean isActive();
    
    /**
     * Sets the {@code active} property. This property indicates whether the 
     * user is or not an active user that can login into the application.
     * 
     * @param active {@code true} if the user is active, {@code false} otherwise.
     */
    public void setActive(Boolean active);
    
    /**
     * Returns the {@code unlocked} property. This property indicates whether 
     * the user is enabled (unlocked) to login into the application. While a 
     * user can be 'active' they could be in 'locked' status and thus won't be 
     * able to login (i.e.: on a certain number of failed login attempts the user 
     * might be locked due to account security reasons).
     * 
     * @return {@code true} if the user is unlocked, {@code false} otherwise.
     */
    public Boolean isUnlocked();
    
    /**
     * Sets the {@code unlocked} property. This property indicates whether 
     * the user is enabled (unlocked) to login into the application. While a 
     * user can be 'active' they could be in 'locked' status and thus won't be 
     * able to login (i.e.: on a certain number of failed login attempts the user 
     * might be locked due to account security reasons).
     * 
     * @param unlocked {@code true} if the user is unlocked, {@code false} otherwise.
     */
    public void setUnlocked(Boolean unlocked);
    
    /**
     * Adds a new {@code IUserRole} object representing a new relationship 
     * between a given Role and this User.
     * 
     * @param userRole 
     */
    public void addUserRole(IUserRole userRole);
    
    /**
     * Returns a list with {@code IUserRole} objects associated to this 
     * User.
     * <br />
     * <b>Note to implementors:</b> it is recommended the returned list be immutable.
     * 
     * @return A {@code IUserRole} list.
     */
    public List<IUserRole> getUserRolesList();
    
    /**
     * Sets a list with {@code IUserRole} objects associated to this User.
     * 
     * @param userRolesList A {@code IUserRole} list.
     */
    public void setUserRolesList(List<IUserRole> userRolesList);
    
    /**
     * Convenience method to associate a given Role to this User. The 
     * relationship must be wrapped in a {@code IUserRole} object.
     * 
     * @param role The Role which will be associated to this User.
     */
    public void addRole(IRole role);
    
}
