package com.example.rest.repositories;

import com.example.rest.entities.Employee;
import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.converter.json.GsonBuilderUtils;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
