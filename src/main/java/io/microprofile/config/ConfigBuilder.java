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

/**
 * The builder for creating an instance of a {@code Config} by adding a number of config sources
 * @author Emily
 *
 */
public interface ConfigBuilder {
   
	/**
	 * Ignore the default config sources including:
	 * <ol> 
	 * <li>System properties</li>
	 * <li>Environment properties</li>
	 * <li>/META-INF/config.properties</li>
	 * <li>/META-INF/config.xml</li>
	 * <li>/META-INF/config.json</li>
	 * </ol>
	 * @return the ConfigBuilder without the default config sources
	 */
     ConfigBuilder ignoreDefaultSources();
     /**
      * Add the specified {@link ConfigSource} to the builder
      * @param source the {@link ConfigSource}
      * @return the builder
      */
     ConfigBuilder withSource(ConfigSource source);  
    
     /**
      * Add the {@link ConfigSource}s to the builder
      * @param sources
      * @return
      */
     ConfigBuilder withSources(ConfigSource... sources);  
    
     Config build();
    
}
