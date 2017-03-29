package com.controller;

import com.domain.Product;
import com.form.ProductForm;
import com.validator.ProductValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by elaine on 2017/3/29.
 */
public class SaveProductController implements Controller {

    public String handleRequest(HttpServletRequest request, HttpServletResponse response){
        ProductForm productForm = new ProductForm();
        productForm.setName(request.getParameter("name"));
        productForm.setDescription(request.getParameter("description"));
        productForm.setPrice(request.getParameter("price"));

        // 验证
        ProductValidator productValidator = new ProductValidator();
        List<String> errors = productValidator.validate(productForm);
        if(errors.isEmpty()) {
            Product product = new Product();
            product.setName(productForm.getName());
            product.setDescription(productForm.getDescription());
            product.setPrice(Float.parseFloat(productForm.getPrice()));

            request.setAttribute("product", product);
            return "/WEB-INF/jsp/ProductDetails.jsp";
        }else{
            request.setAttribute("errors",errors);
            request.setAttribute("form",productForm);
            return "/WEB-INF/jsp/ProductForm.jsp";
        }

    }
}
