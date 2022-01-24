package com.example.dWorld.controller.api;

import com.example.dWorld.model.Result;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class AbstractController {
    protected JSONObject returnJSONObject(Result result) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rtnCd", result.getResultCode().getRtnCd());
        jsonObject.put("rtnMsg", result.getResultCode().getRtnMsg());
        jsonObject.put("rtnObj", result.getResultObject());
        return jsonObject;
    }

    protected Map<String, Object> returnMap(Result result) {
        Map<String, Object> map = new HashMap<>();
        map.put("rtnCd", result.getResultCode().getRtnCd());
        map.put("rtnMsg", result.getResultCode().getRtnMsg());
        map.put("rtnObj", result.getResultObject());
        return map;
    }
}
