package com.st.s3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;

public class S3Main {
	/**
	 * Get Basic AWS Credentials
	 * 
	 * @param accesskey
	 * @param secretkey
	 * @return
	 */
	public AWSCredentials getBasicAWSCredentials(String accesskey, String secretkey) {
		return new BasicAWSCredentials(accesskey, secretkey);
	}

	/**
	 * get AmazonS3
	 * 
	 * @return
	 */
	public AmazonS3 getAmazonS3() {
		return AmazonS3ClientBuilder.standard()
				.withCredentials(new AWSStaticCredentialsProvider(
						getBasicAWSCredentials(KeyContant.ACCESS_KEY, KeyContant.SECRET_KEY)))
				.withRegion(Regions.US_EAST_1).build();
	}

	/**
	 * upload On S3
	 * 
	 * @param bucketName
	 * @param fileName
	 * @param file
	 * @return
	 */
	public PutObjectResult uploadOnS3(String bucketName, String fileName, InputStream file) {
		return getAmazonS3().putObject(bucketName, fileName, file, null);
	}

	/**
	 * get All Objects
	 * 
	 * @param bucketName
	 * @return
	 */
	public ObjectListing getAllObjects(String bucketName) {
		return getAmazonS3().listObjects(bucketName);
	}

	/**
	 * download Object
	 * 
	 * @param bucketName
	 * @param fileName
	 * @return
	 */
	public S3Object downloadObject(String bucketName, String fileName) {
		return getAmazonS3().getObject(bucketName, fileName);
	}

	/**
	 * Delete Object
	 * 
	 * @param bucketName
	 * @param fileName
	 */
	public void deleteObject(String bucketName, String fileName) {
		getAmazonS3().deleteObject(bucketName, fileName);
	}

	/**
	 * Delete Multiple file
	 * 
	 * @param bucketName
	 * @param fileNames
	 */
	public void deleteMultipleObjects(String bucketName, String[] fileNames) {
		DeleteObjectsRequest delObjReq = new DeleteObjectsRequest(bucketName).withKeys(fileNames);
		getAmazonS3().deleteObjects(delObjReq);

	}

	@Asynchronous
	public void moveAndRename(S3ObjectInfo source, S3ObjectInfo destination) {
		List<CopyObjectRequest> list = new ArrayList<>();
		CopyObjectRequest copyObjectRequest = new CopyObjectRequest("", "", "", "");
		list.add(copyObjectRequest);
		getAmazonS3().copyObject(list);
		getAmazonS3().copyObject(source.getBucketName(), source.getKey(), destination.getBucketName(),
				destination.getKey());

	}

	public String getPath(String path) {
		return path;
	}

	public static void main(String[] args) throws IOException {
		S3Main s3Main = new S3Main();
		String bucketName = KeyContant.BUCKET_NAME;
		// Get All Object On S3

		/*ObjectListing objectListing = s3Main.getAllObjects(bucketName);
		for (S3ObjectSummary os : objectListing.getObjectSummaries()) {
			System.out.println(os.getKey());
		}*/

		// Uplaod File
		
		  File initialFile = new File("C:\\Users\\13615\\Downloads\\qq.jpeg");
		  InputStream targetStream = new FileInputStream(initialFile); 
		  PutObjectResult
		  result = s3Main.uploadOnS3(bucketName, initialFile.getName(),
		  targetStream); System.out.println(result.getContentMd5());
		  targetStream.close();
		 
		// Download Object
		/*
		 * S3Object s3object = s3Main.downloadObject(bucketName, path + "qq.jpeg");
		 * S3ObjectInputStream inputStream = s3object.getObjectContent();
		 * FileUtils.copyInputStreamToFile(inputStream, new
		 * File("E:\\ImageStore\\hello.jpeg"));
		 */

		// Delete Object
		/* s3Main.deleteObject(bucketName, path + "qq.jpeg"); */

		// Delete Multiple File
		/*
		 * String fileNames[] = {"<<filename1>>","<<filename2>>"};
		 * s3Main.deleteMultipleObjects(bucketName, fileNames);
		 */

	}

}
