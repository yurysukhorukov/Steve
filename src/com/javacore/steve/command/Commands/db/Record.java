package com.javacore.steve.command.Commands.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Record {

    List<String> values;
    List<String> columns;

    {
        values = new ArrayList<>();

    }

    //public Record(List<String> values) {this.values = values;}
    public Record(Table table) {
        columns = table.getColumns();
    }

    public void setValues(String[] values){
        this.values.clear();
        this.values = Arrays.asList(values);
    }

    public int getInt(String fieldName) throws FieldNotFoundException{
        int index =columns.indexOf(fieldName);

        if (index == -1){
            throw new FieldNotFoundException("FIELD NOT FOUND: " + fieldName);
        }
        /*try{
            //dangerous code

        } catch (Exception e) {

        } finally {
            //
        }*/
        return Integer.parseInt(values.get(index));
    }

    public class FieldNotFoundException extends Exception {
        public FieldNotFoundException(String msg){
            super(msg);
        }
    }
}
