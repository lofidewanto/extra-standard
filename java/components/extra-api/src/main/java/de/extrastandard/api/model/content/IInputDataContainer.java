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
package de.extrastandard.api.model.content;

import java.util.List;

import de.extrastandard.api.util.IImplementor;

/**
 * <pre>
 * Beinhaltet die InputDaten für das Extra Klient.
 * In der Phase 1 sind die InputData plugins DataRequestId relevant 
 * In der Phase 2 requestID
 * TODO Refactor
 * </pre>
 * 
 * @author DPRS
 * @version $Id$
 */
public interface IInputDataContainer extends IImplementor {

	/**
	 * Liefert Daten Verschlüsselung, Transformation usw Beschreibung.
	 * 
	 * @return
	 */
	List<IInputDataPluginDescription> getPlugins();

	/**
	 * Liefert eine Identifizierung der InputDaten In der Phase 1 DataRequestId
	 * In derPhase 2 responseId
	 * 
	 * @return
	 */
	String getInputIdentification();

	/**
	 * Liefert RequestId, für die eindeutige Identifizierung in der XmlMessage
	 * 
	 * @return
	 */
	String getRequestId();

	/**
	 * @param requestId
	 *            Setzt RequestId für die eindeutige Identifizierung in der
	 *            XmlMesage
	 */
	public void setRequestId(final String requestId);
}