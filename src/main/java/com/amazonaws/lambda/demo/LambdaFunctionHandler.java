package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import org.json.simple.*;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<Object, JSONObject> {

    @Override
    public JSONObject handleRequest(Object input, Context context) {
        context.getLogger().log("Input: " + input);
        JSONObject sendJSON = seoul_list.seoulKeyboard();

        // TODO: implement your handler
        return sendJSON;
    }

}
