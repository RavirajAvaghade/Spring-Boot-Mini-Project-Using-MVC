package com.nt.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employee_db_mvc")
@Data
public class Employee implements Serializable
{
   @Id
   @SequenceGenerator(name="gen1",sequenceName="emp_id_seq",initialValue=1,allocationSize=1)
   @GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
   @Column(length=30)
   private Integer eid;
   @Column(length=30)
   private String ename;
   @Column(length=30)
   private String job;
   @Column(length=30)
   private Float salary;
   @Column(length=30)
   private int   dno;
   
}
