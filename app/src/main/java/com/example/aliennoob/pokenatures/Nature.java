package com.example.aliennoob.pokenatures;

/**
 * Created by Aliennoob on 29/01/2018.
 */

public class Nature
{
    String EnglishName = "";
    String FrenchName = "";

    String Buff = "";
    String Debuff = "";

    public Nature(String eng, String fr, String bu, String debu)
    {
        EnglishName = eng;
        FrenchName = fr;
        Buff = bu;
        Debuff =  debu;
    }
}
