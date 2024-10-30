package com.ihsan.rest_app.service;

import com.ihsan.rest_app.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor (CloudVendor cloudVendor);
    public String updateCloudVendor (CloudVendor cloudVendor);
    public String deleteCloudVendor (String CloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
    public List<CloudVendor> getByVendorName(String VendorName);
}
