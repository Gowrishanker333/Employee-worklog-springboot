package com.gssp.worklogupdate.service

import com.gssp.worklogupdate.model.Login
import com.gssp.worklogupdate.model.Workdetails
import com.gssp.worklogupdate.repository.WorklogRepository

import groovy.util.logging.Slf4j

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
@Slf4j
@Service
class UpdateServiceImpl implements UpdateService {

    @Autowired
    WorklogRepository worklogRepository

    @Override
    Boolean loginDetails(Login login) {
		log.info("INSIDE LOGIN DETAILS SERVICE")
        if(login.getUserName().equals('admin@mail.com') && login.getPassword().equals('admin')) {
            return true
        }
        else {
            return false
        }
    }

    @Override
    String addDetails(Workdetails worklog) {
		log.info("INSIDE ADD DETAILS SERVICE")
        worklog.setLoggedDate(new Date())
        worklogRepository.save(worklog)
        return "Log added successfully."
    }

    @Override
    List<Workdetails> viewLogByName(String employeeName) {
		log.info("INSIDE VIEW LOG BY NAME SERVICE")
        return worklogRepository.findByEmployeeName(employeeName)
    }
}
