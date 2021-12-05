package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.beans.UserDetails;
@Repository
public interface UserRepository extends CrudRepository<UserDetails, Integer>  
{  
}  
