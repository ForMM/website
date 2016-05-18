package com.website.common.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;

import javax.imageio.ImageIO;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import com.website.common.content.FinVal;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;


public class ImageUtil {  
	
	 public static String uploadFile(MultipartFile file,String filename,String fileType) throws Exception{		
			InputStream is= file.getInputStream();               
	       FileUtil fileUtil = new FileUtil();
	       if(FinVal.FILE_TYPE_BP.equals(fileType)){
	       	fileUtil.saveFileToTemp(is,filename,Global.BP_FILE_PATH);              	         	        	
	       }else if(FinVal.FILE_TYPE_LICENSE.equals(fileType)){
	       	fileUtil.saveFileToTemp(is,filename,Global.LICENSE_FILE_PATH); 
	       }else if(FinVal.FILE_TYPE_LOGO.equals(fileType)){
	       	fileUtil.saveFileToTemp(is,filename,Global.LOGO_FILE_PATH); 
	       }
	       
	       return fileUtil.getLastFileName();
		}
	
	public static boolean transferImg(File fromFile, String saveToFileStr,
			String sysimgfile, String suffix, int width, int height,boolean proportion) throws Exception {
		
		// fileExtNmae是图片的格式 gif JPG 或png
		// String fileExtNmae="";
		
		if (!fromFile.isFile())
			throw new Exception(fromFile
					+ " is not image file error in CreateThumbnail!");
		
		File directory=new File(saveToFileStr);
		if(!directory.exists()){
			
			if(!directory.mkdirs()){
				throw new Exception("create path "+saveToFileStr+ " error ,please check!!!");
				
			}
		}
		Image  src = javax.imageio.ImageIO.read(fromFile);
		   int newWidth;
           int newHeight;
        // 判断是否是等比缩放
        if (proportion == true) {
         // 为等比缩放计算输出的图片宽度及高度
         double rate1 = ((double) src.getWidth(null)) / (double) width + 0.1;
         double rate2 = ((double) src.getHeight(null)) / (double) height + 0.1;
         // 根据缩放比率大的进行缩放控制
         double rate = rate1 < rate2 ? rate1 : rate2;
         newWidth = (int) (((double) src.getWidth(null)) / rate);
         newHeight = (int) (((double) src.getHeight(null)) / rate);
        } else {
         newWidth = width; // 输出的图片宽度
         newHeight = height; // 输出的图片高度
        }
        if("png".equalsIgnoreCase(suffix)){
			resizePNG(fromFile, saveToFileStr, sysimgfile, suffix, newWidth, newHeight, proportion);
		}else{
		BufferedImage tag = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);      
        //tag.getGraphics().drawImage(src,0,0,new_w,new_h,null); //绘制缩小后的图
         tag.getGraphics().drawImage(src.getScaledInstance(newWidth, newHeight,  Image.SCALE_SMOOTH), 0,0,null);
         FileOutputStream  newimage=new FileOutputStream(new File(saveToFileStr + sysimgfile + "." + suffix)); //输出到文件流 
         JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(newimage);
         JPEGEncodeParam jep=JPEGCodec.getDefaultJPEGEncodeParam(tag); 
          /* 压缩质量 */ 
         jep.setQuality((float) 1.0, true); 
         encoder.encode(tag, jep); 
         //encoder.encode(tag); //近JPEG编码 
         newimage.close(); 
		}
		return true;
	}
	  
        // TODO Auto-generated constructor stub  
     public static void resizePNG(File fromFile, String toFilePath,String toFileName,String toFileSuffix,  int width, int height,boolean proportion) {
              try {  
                

                  BufferedImage bi2 = ImageIO.read(fromFile);  
            
                  BufferedImage to = new BufferedImage(width, height,  

                          BufferedImage.TYPE_INT_RGB);  

                  Graphics2D g2d = to.createGraphics();  

                  to = g2d.getDeviceConfiguration().createCompatibleImage(width,height,  

                          Transparency.TRANSLUCENT);  

                  g2d.dispose();  

                  g2d = to.createGraphics();  

                  Image from = bi2.getScaledInstance(width, height, bi2.SCALE_AREA_AVERAGING);  
                  g2d.drawImage(from, 0, 0, null);
                  g2d.dispose();  

                  ImageIO.write(to, toFileSuffix, new File(toFilePath+File.separator+toFileName+"."+toFileSuffix));  

              } catch (IOException e) {  

                  e.printStackTrace();  
                   
              }  

          }  

          public static void main(String[] args) throws Exception {  

              System.out.println("Start");  

              transferImg(new File("E:\\xxxx\\test.png"), "E:\\xxxx\\abc","a","png",800, 100,true);  

              System.out.println("OK");  

          } 
}

