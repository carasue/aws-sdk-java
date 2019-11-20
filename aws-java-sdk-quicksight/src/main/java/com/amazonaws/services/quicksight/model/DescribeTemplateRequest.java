/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * AWS account ID that contains the template you are describing.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * An ID for the template.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * This is an optional field, when a version number is provided the corresponding version is describe, if it's not
     * provided the latest version of the template is described.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * This is an optional field, when an alias name is provided, the version referenced by the alias is described.
     * Refer to <code>CreateTemplateAlias</code> to create a template alias. <code>$PUBLISHED</code> is not supported
     * for template.
     * </p>
     */
    private String aliasName;

    /**
     * <p>
     * AWS account ID that contains the template you are describing.
     * </p>
     * 
     * @param awsAccountId
     *        AWS account ID that contains the template you are describing.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * AWS account ID that contains the template you are describing.
     * </p>
     * 
     * @return AWS account ID that contains the template you are describing.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * AWS account ID that contains the template you are describing.
     * </p>
     * 
     * @param awsAccountId
     *        AWS account ID that contains the template you are describing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * An ID for the template.
     * </p>
     * 
     * @param templateId
     *        An ID for the template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * An ID for the template.
     * </p>
     * 
     * @return An ID for the template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * An ID for the template.
     * </p>
     * 
     * @param templateId
     *        An ID for the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateRequest withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * This is an optional field, when a version number is provided the corresponding version is describe, if it's not
     * provided the latest version of the template is described.
     * </p>
     * 
     * @param versionNumber
     *        This is an optional field, when a version number is provided the corresponding version is describe, if
     *        it's not provided the latest version of the template is described.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * This is an optional field, when a version number is provided the corresponding version is describe, if it's not
     * provided the latest version of the template is described.
     * </p>
     * 
     * @return This is an optional field, when a version number is provided the corresponding version is describe, if
     *         it's not provided the latest version of the template is described.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * This is an optional field, when a version number is provided the corresponding version is describe, if it's not
     * provided the latest version of the template is described.
     * </p>
     * 
     * @param versionNumber
     *        This is an optional field, when a version number is provided the corresponding version is describe, if
     *        it's not provided the latest version of the template is described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateRequest withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * This is an optional field, when an alias name is provided, the version referenced by the alias is described.
     * Refer to <code>CreateTemplateAlias</code> to create a template alias. <code>$PUBLISHED</code> is not supported
     * for template.
     * </p>
     * 
     * @param aliasName
     *        This is an optional field, when an alias name is provided, the version referenced by the alias is
     *        described. Refer to <code>CreateTemplateAlias</code> to create a template alias. <code>$PUBLISHED</code>
     *        is not supported for template.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * This is an optional field, when an alias name is provided, the version referenced by the alias is described.
     * Refer to <code>CreateTemplateAlias</code> to create a template alias. <code>$PUBLISHED</code> is not supported
     * for template.
     * </p>
     * 
     * @return This is an optional field, when an alias name is provided, the version referenced by the alias is
     *         described. Refer to <code>CreateTemplateAlias</code> to create a template alias. <code>$PUBLISHED</code>
     *         is not supported for template.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * This is an optional field, when an alias name is provided, the version referenced by the alias is described.
     * Refer to <code>CreateTemplateAlias</code> to create a template alias. <code>$PUBLISHED</code> is not supported
     * for template.
     * </p>
     * 
     * @param aliasName
     *        This is an optional field, when an alias name is provided, the version referenced by the alias is
     *        described. Refer to <code>CreateTemplateAlias</code> to create a template alias. <code>$PUBLISHED</code>
     *        is not supported for template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateRequest withAliasName(String aliasName) {
        setAliasName(aliasName);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getAliasName() != null)
            sb.append("AliasName: ").append(getAliasName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTemplateRequest == false)
            return false;
        DescribeTemplateRequest other = (DescribeTemplateRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTemplateRequest clone() {
        return (DescribeTemplateRequest) super.clone();
    }

}
