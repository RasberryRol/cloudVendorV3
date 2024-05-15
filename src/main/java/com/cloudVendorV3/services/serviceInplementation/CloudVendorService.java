package com.cloudVendorV3.services.serviceInplementation;

import com.cloudVendorV3.models.CloudVendor;
import com.cloudVendorV3.repositories.CloudVendorRepository;
import com.cloudVendorV3.services.CloudVendorServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class CloudVendorService implements CloudVendorServiceInterface {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorService(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        if(cloudVendorRepository.existsById(cloudVendor.getVendorId())){
            return "Cloud vendor already exist.";
        }else{
            cloudVendorRepository.save(cloudVendor);
            return "Cloud vendor created successfully!";
        }
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        if(cloudVendorRepository.existsById(cloudVendor.getVendorId())){
            cloudVendorRepository.save(cloudVendor);
            return "Cloud vendor updated successfully!";
        }else{
            return "Cloud vendor does not exist.";
        }
    }

    @Override
    public CloudVendor getCloudVendorById(String vendorId) {
        if(cloudVendorRepository.findById(vendorId).isEmpty())
            throw new RuntimeException("Cloud vendor not found!");
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        if (cloudVendorRepository.existsById(vendorId)) {
            cloudVendorRepository.deleteById(vendorId);
            return "Cloud vendor deleted successfully!";
        } else {
            return "Cloud vendor details not found!";
        }
    }
}
