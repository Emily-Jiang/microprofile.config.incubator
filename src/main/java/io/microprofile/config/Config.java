/*******************************************************************************
 * Copyright (c) 2016 IBM Corporation and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Emily Jiang - newly created class
 *******************************************************************************/

package io.microprofile.config;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * <p> Resolves the property value by searching through all configured {@link ConfigSource}s. 
 * If the same property is specified in multiple {@link ConfigSource}s, the value in the {@link ConfigSource} with the 
 * highest ordinal will be used. If multiple {@link ConfigSource}s are specified with the same ordinal, non portable behaviour will occur.<p>
 * 
 * 
 * @author Emily
 *
 */
public interface Config {
	/**
	 * Return the resolved property value as a string for the specified property name
	 * @param propertyName the property name
	 * @return the property value from the {@link ConfigSource} with the highest ordinal or {@code null} if the specified property 
	 * does not exist.
	 */
	String getProperty(String propertyName);
	
	/**
	 * Return the resolved property value as a string for the specified property name
	 * @param propertyName the property name
	 * @return the property value from the {@link ConfigSource} with the highest ordinal or the defaultValue if the specified property 
	 * does not exist.
	 */
	String getProperty(String propertyName, String defaultValue);
	
	/**
	 * Set the new value of the propertyName. If the specified property exists, its value will be updated to newValue. 
	 * Otherwise, the propertyName will be created with the newValue. 
	 * @param propertyName the property name
	 * @param newValue the property value
	 */
	void setProperty(String propertyName, String newValue);
	
	/**
	 * Remove the property with the specified name. 
	 * @param propertyName 
	 * @return the value of the specified property that has been removed
	 */
	Object removeProperty(String propertyName);
	/**
	 * Return the resolved property value with the specified type for the specified property name
	 * @param propertyName 
	 * @param propertyType
	 * @return
	 */
	<T> T getProperty(String propertyName, Class<T> propertyType);
	


    /**
     * Get a boolean associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @return The associated boolean.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Boolean.
     */
    boolean getBoolean(String propertyName);

    /**
     * Get a boolean associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated boolean.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Boolean.
     */
    boolean getBoolean(String propertyName, boolean defaultValue);

    /**
     * Get a {@link Boolean} associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated boolean if propertyName is found and has valid
     *         format, default value otherwise.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Boolean.
     */
    Boolean getBoolean(String propertyName, Boolean defaultValue);

    /**
     * Get a byte associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @return The associated byte.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Byte.
     */
    byte getByte(String propertyName);

    /**
     * Get a byte associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated byte.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Byte.
     */
    byte getByte(String propertyName, byte defaultValue);

    /**
     * Get a {@link Byte} associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated byte if propertyName is found and has valid format, default
     *         value otherwise.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an object that
     *         is not a Byte.
     */
    Byte getByte(String propertyName, Byte defaultValue);

    /**
     * Get a double associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @return The associated double.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Double.
     */
    double getDouble(String propertyName);

    /**
     * Get a double associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated double.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Double.
     */
    double getDouble(String propertyName, double defaultValue);

    /**
     * Get a {@link Double} associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated double if propertyName is found and has valid
     *         format, default value otherwise.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Double.
     */
    Double getDouble(String propertyName, Double defaultValue);

    /**
     * Get a float associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @return The associated float.
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Float.
     */
    float getFloat(String propertyName);

    /**
     * Get a float associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated float.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Float.
     */
    float getFloat(String propertyName, float defaultValue);

    /**
     * Get a {@link Float} associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated float if propertyName is found and has valid
     *         format, default value otherwise.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Float.
     */
    Float getFloat(String propertyName, Float defaultValue);

    /**
     * Get a int associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @return The associated int.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Integer.
     */
    int getInt(String propertyName);

    /**
     * Get a int associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated int.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Integer.
     */
    int getInt(String propertyName, int defaultValue);

    /**
     * Get an {@link Integer} associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated int if propertyName is found and has valid format, default
     *         value otherwise.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an object that
     *         is not a Integer.
     */
    Integer getInteger(String propertyName, Integer defaultValue);

    /**
     * Get a long associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @return The associated long.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Long.
     */
    long getLong(String propertyName);

    /**
     * Get a long associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated long.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Long.
     */
    long getLong(String propertyName, long defaultValue);

    /**
     * Get a {@link Long} associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated long if propertyName is found and has valid
     * format, default value otherwise.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Long.
     */
    Long getLong(String propertyName, Long defaultValue);

    /**
     * Get a short associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @return The associated short.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Short.
     */
    short getShort(String propertyName);

    /**
     * Get a short associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated short.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Short.
     */
    short getShort(String propertyName, short defaultValue);

    /**
     * Get a {@link Short} associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated short if propertyName is found and has valid
     *         format, default value otherwise.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a Short.
     */
    Short getShort(String propertyName, Short defaultValue);

    /**
     * Get a {@link BigDecimal} associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @return The associated BigDecimal if propertyName is found and has valid format
     */
    BigDecimal getBigDecimal(String propertyName);

    /**
     * Get a {@link BigDecimal} associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName          The configuration propertyName.
     * @param defaultValue The default value.
     *
     * @return The associated BigDecimal if propertyName is found and has valid
     *         format, default value otherwise.
     */
    BigDecimal getBigDecimal(String propertyName, BigDecimal defaultValue);

    /**
     * Get a {@link BigInteger} associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     *
     * @return The associated BigInteger if propertyName is found and has valid format
     */
    BigInteger getBigInteger(String propertyName);

    /**
     * Get a {@link BigInteger} associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName          The configuration propertyName.
     * @param defaultValue The default value.
     *
     * @return The associated BigInteger if propertyName is found and has valid
     *         format, default value otherwise.
     */
    BigInteger getBigInteger(String propertyName, BigInteger defaultValue);

    /**
     * Get a string associated with the given configuration propertyName.
     *
     * @param propertyName The configuration propertyName.
     * @return The associated string.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an object that
     *         is not a String.
     */
    String getString(String propertyName);

    /**
     * Get a string associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated string if propertyName is found and has valid
     *         format, default value otherwise.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an object that
     *         is not a String.
     */
    String getString(String propertyName, String defaultValue);

    /**
     * Get an array of strings associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object an empty array is returned
     *
     * @param propertyName The configuration propertyName.
     * @return The associated string array if propertyName is found.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a String/List of Strings.
     */
    String[] getStringArray(String propertyName);

    /**
     * Get a List of strings associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object an empty List is returned.
     *
     * @param propertyName The configuration propertyName.
     * @return The associated List.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a List.
     */
    List<Object> getList(String propertyName);

    /**
     * Get a List of strings associated with the given configuration propertyName.
     * If the propertyName doesn't map to an existing object, the default value
     * is returned.
     *
     * @param propertyName The configuration propertyName.
     * @param defaultValue The default value.
     * @return The associated List of strings.
     *
     * @throws IllegalArgumentException is thrown if the propertyName maps to an
     *         object that is not a List.
     */
    List<Object> getList(String propertyName, List<Object> defaultValue);

    /**
     * Clear all the properties
     */
	void clearAll();
}
