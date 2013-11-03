package com.hong.japarser;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AParser<E> {
    private String content = "";
    
    /**
     * @param myobject 
     */
    public void run(E myobject)
    {
        for (Field f : myobject.getClass().getFields())
        {
            IAParser interf = f.getAnnotation(IAParser.class);
            if (interf != null)
            {
                Pattern p = Pattern.compile(interf.expression(), interf.flag());
                Matcher m = p.matcher(content);
                if (m.find())
                {
                    
                }
            }
        }
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
}
