package com.infinite.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

import com.infinite.demo.model.File;
@Repository
public interface FileRepository  extends JpaRepository<File,Integer>{

}
