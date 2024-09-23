package com.zajdsky.typesCounters.Templates;

public class TypeImages {
    private String type1;
    private String type2;

    public String getType2() {
        return type2;
    }
    public String getType1() {
        return type1;
    }
    @Override
    public String toString() {
        return "SelectedTypes{" +
                "select1='" + type1 + '\'' +
                ", select2='" + type2 + '\'' +
                '}';
    }
}
