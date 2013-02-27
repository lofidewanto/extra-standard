/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.extrastandard.api.model.execution;

/**
 * Enum Abbildung der in der Datenbank gespeicherten Status. Muss mit
 * insert-script synchron sein.
 * 
 * @author Thorsten Vogel
 * @version $Id: PersistentStatus.java 487 2012-09-03 13:07:52Z
 *          thorstenvogel@gmail.com $
 */
public enum PersistentStatus {

	/**
	 * Initaler Status.
	 */
	INITIAL(1L),

	/**
	 * Status nach Erstellung des Umschlags.
	 */
	ENVELOPED(2L),

	/**
	 * Status nach erfolgreicher Übertragung.
	 */
	TRANSMITTED(3L),

	/**
	 * Daten sind vom Client empfangen worden, warten aber noch auf Weiterverarbeitung.
	 */
	WAIT(4L),

	/**
	 * Abgeschlossen.
	 */
	DONE(7L),

	/**
	 * FAIL.
	 */
	FAIL(8L);

	private final Long id;

	private PersistentStatus(final Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

}
