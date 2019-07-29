/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.service.S3Services;

/**
 * @author sumverma
 *
 */
@RestController
public class UploadFileController {
	
		@Autowired
	  S3Services s3Services;
	  
	    @PostMapping("/api/file/upload")
	    public String uploadMultipartFile(@RequestParam("keyname") String keyName, @RequestParam("uploadfile") MultipartFile file) {
	    s3Services.uploadFile(keyName, file);
	    return "Upload Successfully. -> KeyName = " + keyName;
	    } 

}
