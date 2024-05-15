package com.cloudVendorV3.services;

import com.cloudVendorV3.models.CloudVendor;

public interface CloudVendorServiceInterface {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public CloudVendor getCloudVendorById(String vendorId);
    public String deleteCloudVendor(String vendorId);
}
