/*
 * Copyright 2017 Kentico s.r.o. and Richard Sustek
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.kentico.delivery.core.utils;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.kentico.delivery.core.models.common.CommonCloudResponses;
import com.kentico.delivery.core.models.exceptions.KenticoCloudException;

import org.json.JSONObject;

import java.io.IOException;

public class ErrorHelper {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static CommonCloudResponses.DeliveryErrorRaw getDeliveryError(JSONObject jsonObject){
        if (jsonObject == null){
            throw new KenticoCloudException("Cannot map error response because the json is invalid", null);
        }

        CommonCloudResponses.DeliveryErrorRaw errorResponse;

        try {
            errorResponse = objectMapper.readValue(jsonObject.toString(), CommonCloudResponses.DeliveryErrorRaw.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new KenticoCloudException("Mapping json error failed", e);
        }

        return errorResponse;
    }
}
