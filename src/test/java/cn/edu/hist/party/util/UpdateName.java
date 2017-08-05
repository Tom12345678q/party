package cn.edu.hist.party.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;


//获得文件夹下所有文件并把它的名字改了
public class UpdateName {
	
	public static void main(String[] args) throws IOException {
		String path = "E:/java/workspace/party/src/main/java/cn/edu/hist/party/service/impl";
		File file = new File(path);
		System.out.println(file);
		
		File[] filelist = file.listFiles();
		
		
		for(int i = 0; i<filelist.length; i++){
			String temp = filelist[i].getName().substring(0,filelist[i].getName().length()-5 );
			System.out.println(temp);
			String newFilePath = filelist[i].toString().replaceFirst("Service", "ServiceImpl");
			System.out.println(newFilePath);
			if(filelist[i].renameTo(new File(newFilePath))){
				autoReplace(newFilePath , newFilePath,temp);
			}
		}
	}
	
	/**
	 * 读取一个文件并更改内容
	 * @param filePath 源文件
	 * @param outPath 目标文件
	 * @throws IOException
	 */
	private static void autoReplace(String filePath,String outPath , String temp) throws IOException{
		  File file=new File(filePath);
		  Long fileLength=file.length();
		  byte[] fileContext=new byte[fileLength.intValue()];
		  FileInputStream in=new FileInputStream(filePath);
		  in.read(fileContext);
		  in.close();
		  String str=new String(fileContext);
		  
		  str=str.replaceFirst("service","service.impl");
		  str=str.replaceFirst("Service","ServiceImpl implements "+temp);
		  str=str.replaceFirst("interface", "class");
		  
		  PrintWriter out=new PrintWriter(outPath);
		  out.write(str.toCharArray());
		  out.flush();
		  out.close();
		 } 
	

}
