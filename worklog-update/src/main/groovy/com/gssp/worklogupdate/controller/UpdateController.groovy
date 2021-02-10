package com.gssp.worklogupdate.controller

import com.gssp.worklogupdate.model.Login
import com.gssp.worklogupdate.model.Workdetails
import com.gssp.worklogupdate.service.UpdateService

import groovy.util.logging.Slf4j

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
@Slf4j

@RestController
class UpdateController {

    @Autowired
    UpdateService updateService

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/login")
    Boolean checkLogin(@RequestBody Login login)  {
		log.info("INSIDE CHECK LOGIN CONTRROLLER")
        return updateService.loginDetails(login)
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addDetails")
    String addEmployeeDetails(@RequestBody Workdetails worklog)  {
		log.info("INSIDE ADD EMPLOYEE DETAILS CONTROLLER")
        String message = updateService.addDetails(worklog)
        return message
    }

    @GetMapping("/viewDetails/{employee_name}")
    List<Workdetails> viewLogByName(@PathVariable("employee_name") String employeeName){
		log.info("INSIDE VIEW LOG BY NAME CONTROLLER")
        return updateService.viewLogByName(employeeName)
    }

}
