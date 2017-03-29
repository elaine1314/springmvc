package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by elaine on 2017/3/29.
 */
public interface Controller {

    String handleRequest(HttpServletRequest request, HttpServletResponse response);
}
