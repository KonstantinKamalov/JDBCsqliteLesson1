package org.database;

public class Queries {
    public static String createTable(String baseName, String... fullFields){
        String query = "CREATE TABLE if not exist \'" + baseName +"\' (";
        for (int i = 0; i < fullFields.length; i++) {
            if (i==fullFields.length-1){
                query = query.concat(fullFields[i]);
            }else {
                query = query.concat(fullFields[i] + ", ");
            }
        }
        query = query.concat(");");
        return query;
    }
}
