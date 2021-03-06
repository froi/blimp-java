/**********************************************************************************************************************
 * Copyright 2014 Froilan Irizarry                                                                                    *
 * http://froilanirizarry.me                                                                                          *
 * https://github.com/froi                                                                                            *
 *                                                                                                                    *
 * Code can be downloaded, forked, or revied at:                                                                      *
 * 	https://github.com/froi/blimp-java                                                                                *
 *                                                                                                                    *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not                                        *
 * use this file except in compliance with the License. You may obtain a copy of                                      *
 * the License at:                                                                                                    *
 * 	http://www.apache.org/licenses/LICENSE-2.0                                                                        *
 * Unless required by applicable law or agreed to in writing, software                                                *
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT                                          *
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the                                           *
 * License for the specific language governing permissions and limitations under                                      *
 * the License.                                                                                                       *
 **********************************************************************************************************************/

package test.java;

import com.getblimp.api.beans.BlimpObject;
import com.getblimp.api.client.Blimp;
import com.getblimp.api.utils.BlimpResources;
import com.google.gson.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-5
 * Time: 12:56
 * To change this template use File | Settings | File Templates.
 */
public class BlimpTest {
    String appId = null;
    String appSecret = null;
    String userApiKey = null;

    // Put your credentials here.
    @BeforeClass
    public void setUp() {
        String appId = "";
        String appSecret = "";
        String userApiKey = "";
    }

    /**
     * Test will go through all Blimp resources and preform a get request.
     * @throws Exception
     */
    @Test
    public void testGet() throws Exception {
        for(BlimpResources resource : BlimpResources.values()) {
            if(resource.equals(BlimpResources.ENDPOINT) || resource.equals(BlimpResources.SCHEMA)) {
                continue;
            }
            System.out.println("Blimp Project resource: " + resource.toString());
            String blimpJsonResponse = getBlimpResponse(resource);
            iterateBlimpObjs(parseBlimpJsonResoponse(blimpJsonResponse, resource));
            System.out.println("*****************************************************************************************");
        }

    }
    @Test
    public void testGetSchema() throws Exception {
        Blimp blimp = new Blimp("froi", userApiKey, appId, appSecret);
        String project = blimp.getSchema(BlimpResources.PROJECT);
        System.out.println(project);
    }

    /*******************************************************************************************
        Helper methods
     *******************************************************************************************/
    private String getBlimpResponse(BlimpResources resource){
        Blimp blimp = new Blimp("froi", userApiKey, appId, appSecret);
        return blimp.get(resource);
    }
    private List<BlimpObject> parseBlimpJsonResoponse(String blimpJsonResponse, BlimpResources resource)  throws Exception {
        List<BlimpObject> tmpList = new ArrayList<BlimpObject>();

        Gson gson = new Gson();
        JsonElement jsonElement = new JsonParser().parse(blimpJsonResponse);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonArray jsonArray = jsonObject.getAsJsonArray("objects");
        Iterator<JsonElement> it = jsonArray.iterator();
        BlimpObject obj = BlimpObject.getInstance(resource);

        while (it.hasNext()) {
            JsonElement tmpJsonElement = it.next();
            tmpList.add(gson.fromJson(tmpJsonElement.toString(), obj.getClass()));
        }
        return tmpList;
    }
    private void iterateBlimpObjs(List<BlimpObject> objs) {
        for (BlimpObject blimpProject : objs) {
            System.out.println(blimpProject.toJson());
        }
    }

}
