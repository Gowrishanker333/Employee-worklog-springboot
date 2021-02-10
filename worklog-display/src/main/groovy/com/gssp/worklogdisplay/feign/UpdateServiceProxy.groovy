package com.gssp.worklogdisplay.feign

import com.gssp.worklogdisplay.model.Workdetails
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = '${update.feign.name}', url = '${update.feign.url}')
interface UpdateServiceProxy {

    @GetMapping("/viewDetails/{employee_name}")
    List<Workdetails> viewLogByName(@PathVariable("employee_name") String employeeName)

}
