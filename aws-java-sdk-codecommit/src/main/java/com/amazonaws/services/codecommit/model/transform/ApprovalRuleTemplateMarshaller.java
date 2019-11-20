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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApprovalRuleTemplateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApprovalRuleTemplateMarshaller {

    private static final MarshallingInfo<String> APPROVALRULETEMPLATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalRuleTemplateId").build();
    private static final MarshallingInfo<String> APPROVALRULETEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalRuleTemplateName").build();
    private static final MarshallingInfo<String> APPROVALRULETEMPLATEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalRuleTemplateDescription").build();
    private static final MarshallingInfo<String> APPROVALRULETEMPLATECONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalRuleTemplateContent").build();
    private static final MarshallingInfo<String> RULECONTENTSHA256_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ruleContentSha256").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTMODIFIEDUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedUser").build();

    private static final ApprovalRuleTemplateMarshaller instance = new ApprovalRuleTemplateMarshaller();

    public static ApprovalRuleTemplateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApprovalRuleTemplate approvalRuleTemplate, ProtocolMarshaller protocolMarshaller) {

        if (approvalRuleTemplate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(approvalRuleTemplate.getApprovalRuleTemplateId(), APPROVALRULETEMPLATEID_BINDING);
            protocolMarshaller.marshall(approvalRuleTemplate.getApprovalRuleTemplateName(), APPROVALRULETEMPLATENAME_BINDING);
            protocolMarshaller.marshall(approvalRuleTemplate.getApprovalRuleTemplateDescription(), APPROVALRULETEMPLATEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(approvalRuleTemplate.getApprovalRuleTemplateContent(), APPROVALRULETEMPLATECONTENT_BINDING);
            protocolMarshaller.marshall(approvalRuleTemplate.getRuleContentSha256(), RULECONTENTSHA256_BINDING);
            protocolMarshaller.marshall(approvalRuleTemplate.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(approvalRuleTemplate.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(approvalRuleTemplate.getLastModifiedUser(), LASTMODIFIEDUSER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
