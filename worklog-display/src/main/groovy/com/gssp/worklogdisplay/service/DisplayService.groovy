package com.gssp.worklogdisplay.service

import com.gssp.worklogdisplay.model.Employee
import com.gssp.worklogdisplay.model.Workdetails

interface DisplayService {

    List<Employee> getEmployeeDetails()

    List<Workdetails> viewLogByName(String employeeName)

}
