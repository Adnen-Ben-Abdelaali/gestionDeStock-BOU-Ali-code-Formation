package com.bouali.gestiondestock.interceptor;

import org.hibernate.*;
import org.springframework.util.*;
import org.slf4j.*;

public class Interceptor extends EmptyInterceptor
{
    public String onPrepareStatement(String sql) {
        if (StringUtils.hasLength(sql) && sql.toLowerCase().startsWith("select")) {
            final String entityName = sql.substring(7, sql.indexOf("."));
            final String idEntreprise = MDC.get("idEntreprise");
            if (StringUtils.hasLength(entityName) && !entityName.toLowerCase().contains("entreprise") && !entityName.toLowerCase().contains("roles") && StringUtils.hasLength(idEntreprise)) {
                if (sql.contains("where")) {
                    sql = invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;, sql, entityName, idEntreprise);
                }
                else {
                    sql = invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;, sql, entityName, idEntreprise);
                }
            }
        }
        return super.onPrepareStatement(sql);
    }
}