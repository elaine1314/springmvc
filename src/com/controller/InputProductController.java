package com.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by elaine on 2017/3/29.
 */
public class InputProductController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response){

        return "/WEB-INF/jsp/ProductForm.jsp";

    }

}
