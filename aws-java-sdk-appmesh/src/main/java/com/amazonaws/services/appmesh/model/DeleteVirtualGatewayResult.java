/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVirtualGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The virtual gateway that was deleted.
     * </p>
     */
    private VirtualGatewayData virtualGateway;

    /**
     * <p>
     * The virtual gateway that was deleted.
     * </p>
     * 
     * @param virtualGateway
     *        The virtual gateway that was deleted.
     */

    public void setVirtualGateway(VirtualGatewayData virtualGateway) {
        this.virtualGateway = virtualGateway;
    }

    /**
     * <p>
     * The virtual gateway that was deleted.
     * </p>
     * 
     * @return The virtual gateway that was deleted.
     */

    public VirtualGatewayData getVirtualGateway() {
        return this.virtualGateway;
    }

    /**
     * <p>
     * The virtual gateway that was deleted.
     * </p>
     * 
     * @param virtualGateway
     *        The virtual gateway that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVirtualGatewayResult withVirtualGateway(VirtualGatewayData virtualGateway) {
        setVirtualGateway(virtualGateway);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVirtualGateway() != null)
            sb.append("VirtualGateway: ").append(getVirtualGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVirtualGatewayResult == false)
            return false;
        DeleteVirtualGatewayResult other = (DeleteVirtualGatewayResult) obj;
        if (other.getVirtualGateway() == null ^ this.getVirtualGateway() == null)
            return false;
        if (other.getVirtualGateway() != null && other.getVirtualGateway().equals(this.getVirtualGateway()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualGateway() == null) ? 0 : getVirtualGateway().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVirtualGatewayResult clone() {
        try {
            return (DeleteVirtualGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
