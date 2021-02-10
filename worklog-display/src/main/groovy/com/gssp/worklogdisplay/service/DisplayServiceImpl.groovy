package com.gssp.worklogdisplay.service

import com.gssp.worklogdisplay.feign.UpdateServiceProxy
import com.gssp.worklogdisplay.model.Employee
import com.gssp.worklogdisplay.model.Workdetails

import groovy.util.logging.Slf4j

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
@Slf4j
@Service
class DisplayServiceImpl implements DisplayService {

    @Autowired
    UpdateServiceProxy updateServiceProxy

    @Override
    List<Employee> getEmployeeDetails() {
		log.info("INSIDE GET EMPLOYEE DETAILS SERIVCE")
        List<Employee> employeeList = new ArrayList<>()
        employeeList.add(new Employee('deepak', 'Deepak', 'Programmer Analyst Trainee'))
        employeeList.add(new Employee('gowri', 'Gowri', 'Programmer Analyst Trainee'))
        employeeList.add(new Employee('janet', 'Janet', 'Programmer Analyst Trainee'))
        employeeList.add(new Employee('thripura', 'Thripura', 'Programmer Analyst Trainee'))
        employeeList.add(new Employee('rohith', 'Rohith', 'Programmer Analyst Trainee'))
        employeeList.add(new Employee('gowshik', 'Gowshik', 'Programmer Analyst Trainee'))
        employeeList.add(new Employee('siva', 'Siva', 'Programmer Analyst Trainee'))
        employeeList.add(new Employee('barath', 'Barath', 'Programmer Analyst Trainee'))
        employeeList.add(new Employee('murali', 'Murali', 'Programmer Analyst Trainee'))
        employeeList.add(new Employee('nagarjun', 'Nagarjun', 'Programmer Analyst Trainee'))
        return employeeList
    }

    @Override
    List<Workdetails> viewLogByName(String employeeName) {
		log.info("INSIDE VIEW LOG BY NAME SERVICE")
        return updateServiceProxy.viewLogByName(employeeName)
    }

}
