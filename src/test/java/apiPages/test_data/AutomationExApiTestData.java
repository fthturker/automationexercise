package apiPages.test_data;

import java.util.HashMap;

public class AutomationExApiTestData {

    /*
    {
            "id": 1,
            "name": "Blue Top",
            "price": "Rs. 500",
            "brand": "Polo",
            "category": {
                "usertype": {
                    "usertype": "Women"
                },
                "category": "Tops"
            }
        }
     */

    public HashMap<String ,Object>autoMationxeIlkPost(){

        HashMap<String,Object> userType=new HashMap<>();
        userType.put("usertype","Women");

        HashMap<String,Object> catogory=new HashMap<>();
        catogory.put("usertype",userType);
        catogory.put("category","Tops");

        HashMap<String,Object>expectedData=new HashMap<>();

        expectedData.put("id",1);
        expectedData.put("name","Yellow Top");
        expectedData.put("price","RS.250");
        expectedData.put("brand","Polo");
        expectedData.put("category",catogory);


        return expectedData;

    }
}
