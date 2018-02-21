package com.kairos.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Basic Controller which is called for unhandled errors
 */
@RestController
public class AppErrorController implements ErrorController{

	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Number Format Exception";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
