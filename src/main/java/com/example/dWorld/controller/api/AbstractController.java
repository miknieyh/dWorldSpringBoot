package com.example.dWorld.controller.api;

import com.example.dWorld.model.Result;
import net.sf.json.JSONObject;

public class AbstractController {
    protected JSONObject returnJSONObject(Result result) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rtnCd", result.getResultCode().getRtnCd());
        jsonObject.put("rtnMsg", result.getResultCode().getRtnMsg());
        jsonObject.put("rtnObj", result.getResultObject());
        return jsonObject;
    }
}
