package com.colo.helloworld;

public class StrBuilder {

    public static void main(String[]) args){

        //el uso del  operador + para concatenar string
        penaliza mucho en terminos de redicmiento

                sobre todo cuando estamos en un bulce

                se recomienda el uso del "aparato" que se llama StringBuilder

                StringBuilder sb = new StringBuilder();

        sb.append("esto")
                .append(" es un ejemplo")
                .append(" tipico del uso de string builder");


    }
}
