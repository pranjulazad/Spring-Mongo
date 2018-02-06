package com.o4s.controller;

public class webInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{o4sConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
