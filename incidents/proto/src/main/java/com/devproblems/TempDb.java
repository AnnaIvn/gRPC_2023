package com.devproblems;

import java.util.ArrayList;
import java.util.List;


// temporary database to have on what to test
public class TempDb
{
    public static List<IncidentInfo> getIncidentsFromTempDb(){
        return new ArrayList<IncidentInfo>(){
            {
                add(IncidentInfo.newBuilder().setId(1).setImage("image_path1").setCoordinates("111.111.111").setReport("report1").build());
                add(IncidentInfo.newBuilder().setId(2).setImage("image_path2").setCoordinates("222.222.222").setReport("report2").build());
                add(IncidentInfo.newBuilder().setId(1).setImage("image_path3").setCoordinates("333.333.333").setReport("report3").build());
                add(IncidentInfo.newBuilder().setId(1).setImage("image_path4").setCoordinates("444.444.444").setReport("report4").build());
                add(IncidentInfo.newBuilder().setId(1).setImage("image_path5").setCoordinates("555.555.555").setReport("report5").build());
                add(IncidentInfo.newBuilder().setId(1).setImage("image_path6").setCoordinates("666.666.666").setReport("report6").build());
            }
        };
    }
}
