/**
 * Copyright 2016 Novartis Institutes for BioMedical Research Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.novartis.opensource.yada.format;

import com.novartis.opensource.yada.YADAException;

/**
 * Thrown when a yada {@code Converter} implementation catches an error.
 * @author David Varon
 *
 */
public class YADAConverterException extends YADAException {

	/**
	 * Support for serialization
	 */
	private static final long serialVersionUID = -4289110005481744762L;

	/**
	 * Constructs a new exception with a null message.
	 */
	public YADAConverterException() {
		super();
	}

	/**
	 * Constructs a new exception with a specified message
	 * @param message the message to report using {@link #getMessage()}
	 */
	public YADAConverterException(String message) {
		super(message);
	}

	/**
	 * Constructs a new exception with a speificed cause
	 * @param cause the {@link Throwable} that led to this exception
	 */
	public YADAConverterException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructs a new exception with a speificed cause and message
	 * @param message message the message to report using {@link #getMessage()}
	 * @param cause the {@link Throwable} that led to this exception 
	 */
	public YADAConverterException(String message, Throwable cause) {
		super(message, cause);
		this.cause  = cause;
	}

}
