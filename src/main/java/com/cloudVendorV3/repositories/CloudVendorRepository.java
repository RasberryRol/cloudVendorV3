package com.cloudVendorV3.repositories;

import com.cloudVendorV3.models.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{

}
