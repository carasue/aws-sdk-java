/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.xray.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ServiceStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceStatisticsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ServiceStatistics serviceStatistics, StructuredJsonGenerator jsonGenerator) {

        if (serviceStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (serviceStatistics.getOkCount() != null) {
                jsonGenerator.writeFieldName("OkCount").writeValue(serviceStatistics.getOkCount());
            }
            if (serviceStatistics.getErrorStatistics() != null) {
                jsonGenerator.writeFieldName("ErrorStatistics");
                ErrorStatisticsJsonMarshaller.getInstance().marshall(serviceStatistics.getErrorStatistics(), jsonGenerator);
            }
            if (serviceStatistics.getFaultStatistics() != null) {
                jsonGenerator.writeFieldName("FaultStatistics");
                FaultStatisticsJsonMarshaller.getInstance().marshall(serviceStatistics.getFaultStatistics(), jsonGenerator);
            }
            if (serviceStatistics.getTotalCount() != null) {
                jsonGenerator.writeFieldName("TotalCount").writeValue(serviceStatistics.getTotalCount());
            }
            if (serviceStatistics.getTotalResponseTime() != null) {
                jsonGenerator.writeFieldName("TotalResponseTime").writeValue(serviceStatistics.getTotalResponseTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ServiceStatisticsJsonMarshaller instance;

    public static ServiceStatisticsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceStatisticsJsonMarshaller();
        return instance;
    }

}