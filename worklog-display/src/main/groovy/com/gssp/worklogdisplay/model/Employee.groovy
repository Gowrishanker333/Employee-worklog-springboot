package com.gssp.worklogdisplay.model

import groovy.transform.Canonical

@Canonical
class Employee {

    private String id
    private String name
    private String designation

    Employee(String id, String name, String designation) {
        this.id = id
        this.name = name
        this.designation = designation
    }

    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getDesignation() {
        return designation
    }

    void setDesignation(String designation) {
        this.designation = designation
    }
}
