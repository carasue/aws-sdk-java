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
package com.amazonaws.services.elasticache.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GlobalReplicationGroupMember StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalReplicationGroupMemberStaxUnmarshaller implements Unmarshaller<GlobalReplicationGroupMember, StaxUnmarshallerContext> {

    public GlobalReplicationGroupMember unmarshall(StaxUnmarshallerContext context) throws Exception {
        GlobalReplicationGroupMember globalReplicationGroupMember = new GlobalReplicationGroupMember();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return globalReplicationGroupMember;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ReplicationGroupId", targetDepth)) {
                    globalReplicationGroupMember.setReplicationGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReplicationGroupRegion", targetDepth)) {
                    globalReplicationGroupMember.setReplicationGroupRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Role", targetDepth)) {
                    globalReplicationGroupMember.setRole(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AutomaticFailover", targetDepth)) {
                    globalReplicationGroupMember.setAutomaticFailover(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    globalReplicationGroupMember.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return globalReplicationGroupMember;
                }
            }
        }
    }

    private static GlobalReplicationGroupMemberStaxUnmarshaller instance;

    public static GlobalReplicationGroupMemberStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GlobalReplicationGroupMemberStaxUnmarshaller();
        return instance;
    }
}
