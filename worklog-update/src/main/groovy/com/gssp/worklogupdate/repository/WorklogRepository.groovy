package com.gssp.worklogupdate.repository

import com.gssp.worklogupdate.model.Workdetails
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface WorklogRepository extends  MongoRepository<Workdetails, String> {

    List<Workdetails> findByEmployeeName(String employeeName)

}
