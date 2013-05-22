/* Chronos - Game Development Toolkit for Java game developers. The
 * original source remains:
 * 
 * Copyright (c) 2013 Miguel Gonzalez http://my-reality.de
 * 
 * This source is provided under the terms of the BSD License.
 * 
 * Copyright (c) 2013, Chronos
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or 
 * without modification, are permitted provided that the following 
 * conditions are met:
 * 
 *  * Redistributions of source code must retain the above 
 *    copyright notice, this list of conditions and the 
 *    following disclaimer.
 *  * Redistributions in binary form must reproduce the above 
 *    copyright notice, this list of conditions and the following 
 *    disclaimer in the documentation and/or other materials provided 
 *    with the distribution.
 *  * Neither the name of the Chronos/my Reality Development nor the names of 
 *    its contributors may be used to endorse or promote products 
 *    derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND 
 * CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, 
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF 
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE 
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS 
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, 
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY 
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR 
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT 
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY 
 * OF SUCH DAMAGE.
 */
package de.myreality.chronos.util;

import java.io.Serializable;

/**
 * Declares a basic vector class for graphical calculations
 *
 * @author Miguel Gonzalez <miguel-gonzalez@gmx.de>
 * @since 0.8alpha
 * @version 0.8alpha
 */
public interface ROVector3f extends Serializable {
	
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * Returns the length of the current vector
	 * 
	 * @return Length of the vector
	 */
	double getLength();
	
	/**
	 * Returns the multiplication of this and another vector
	 * 
	 * @param other other vector to multiply with
	 * @return scalar result
	 */
	float getScalar(ROVector3f other);
	
	/**
	 * Creates a new vector with length = 1f
	 * 
	 * @return normalized vector
	 */
	ROVector3f normalize();
	
	/**
	 * Getter for the x position value
	 * 
	 * @return x position value
	 */
	float getX();
	
	/**
	 * Getter for the y position value
	 * 
	 * @return y position value
	 */
	float getY();
	
	/**
	 * Creates a copy of this vector object
	 */
	ROVector3f copy();
	
	/**
	 * Getter for the z position value
	 * 
	 * @return z position value
	 */
	float getZ();
	
	/**
	 * Sets a new x position
	 * 
	 * @param x new x-position
	 */
	void setX(float x);
	
	/**
	 * Sets a new y position
	 * 
	 * @param y new y-position
	 */
	void setY(float y);
	
	/**
	 * Sets a new z position
	 * 
	 * @param z new z-position
	 */
	void setZ(float z);
}
