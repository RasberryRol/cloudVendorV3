package com.cloudVendorV3.contollers;

import com.cloudVendorV3.CloudVendorV3Application;
import com.cloudVendorV3.models.CloudVendor;
import com.cloudVendorV3.services.serviceInplementation.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    final Logger logger = LogManager.getLogger(CloudVendorV3Application.class.getName());
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    @PostMapping()
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){
        return cloudVendorService.createCloudVendor(cloudVendor);
    }

    /*the second parameter "vendorId" was not added in this version because
    * I realized that if the user know the id to pass it in the body,
    * the id from the url should not matter. So no need to compare them*/
    @PutMapping("{vendorId}")
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        return cloudVendorService.updateCloudVendor(cloudVendor);
    }

    @GetMapping("{vendorId}")
    public CloudVendor getVendorDetails(@PathVariable String vendorId){
        logger.info("Retrieving cloud vendor details...");
        return cloudVendorService.getCloudVendorById(vendorId);
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable String vendorId){
        return cloudVendorService.deleteCloudVendor(vendorId);
    }

}
