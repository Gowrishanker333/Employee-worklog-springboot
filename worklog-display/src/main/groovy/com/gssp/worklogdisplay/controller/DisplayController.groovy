package com.gssp.worklogdisplay.controller

import com.gssp.worklogdisplay.model.Employee
import com.gssp.worklogdisplay.model.Workdetails
import com.gssp.worklogdisplay.service.DisplayService

import groovy.util.logging.Slf4j

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
@Slf4j
@RefreshScope
@RestController
class DisplayController {

    @Autowired
    DisplayService displayService

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/viewEmployees")
    List<Employee> getEmployeeDetails() {
		log.info("INSIDE GET EMPLOYEE DETAILS CONTROLLER")
        return displayService.getEmployeeDetails()
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/viewDetails/{employee_name}")
    List<Workdetails> getByName(@PathVariable("employee_name") String employeeName){
		log.info("INSIDE GET BY NAME CONTROLLER")
        return displayService.viewLogByName(employeeName)
    }

}
