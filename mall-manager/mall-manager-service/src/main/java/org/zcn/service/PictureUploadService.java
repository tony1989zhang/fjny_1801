package org.zcn.service;

import org.springframework.web.multipart.MultipartFile;
import org.zcn.utils.PictureResult;

public interface PictureUploadService {
	public PictureResult pictureUpload(MultipartFile fileName);
}
