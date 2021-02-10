package com.gssp.worklogupdate.service

import com.gssp.worklogupdate.model.Login
import com.gssp.worklogupdate.model.Workdetails

interface UpdateService {

    Boolean loginDetails(Login login)

    String addDetails(Workdetails worklog)

    List<Workdetails> viewLogByName(String employeeName)

}
