package org.zcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.zcn.service.PictureUploadService;
import org.zcn.utils.PictureResult;

@Controller
public class PictureUploadController {

	@Autowired
	private PictureUploadService pictureUploadService;
	
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public PictureResult pictureUpload(MultipartFile uploadFile){
		//这么去处理图片？放到ftp?
		PictureResult pictureUpload = pictureUploadService.pictureUpload(uploadFile);
		return pictureUpload;
	}
}
