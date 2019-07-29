/**
 * 
 */
package com.example.demo.service;

import java.io.ByteArrayOutputStream;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author sumverma
 *
 */
public interface S3Services {
	
	public ByteArrayOutputStream downloadFile(String keyName);
	public void uploadFile(String keyName, MultipartFile file);

}
