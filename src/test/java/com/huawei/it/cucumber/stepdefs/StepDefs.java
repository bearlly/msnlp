package com.huawei.it.cucumber.stepdefs;

import com.huawei.it.MsnlpApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MsnlpApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
